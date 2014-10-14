package net.WookiePaw.EnDob;

import com.cubes.BlockChunkControl;
import com.cubes.BlockChunkListener;
import com.cubes.BlockTerrainControl;
import com.cubes.Vector3Int;
import com.cubes.test.CubesTestAssets;
import com.cubes.test.blocks.Block_Grass;
import com.cubes.test.blocks.Block_Water;
import com.cubes.test.blocks.Block_Wood;
import com.jme3.app.SimpleApplication;
import com.jme3.bullet.BulletAppState;
import com.jme3.bullet.collision.shapes.CapsuleCollisionShape;
import com.jme3.bullet.collision.shapes.MeshCollisionShape;
import com.jme3.bullet.control.CharacterControl;
import com.jme3.bullet.control.RigidBodyControl;
import com.jme3.input.KeyInput;
import com.jme3.input.controls.ActionListener;
import com.jme3.input.controls.KeyTrigger;
import com.jme3.math.ColorRGBA;
import com.jme3.math.Vector3f;
import com.jme3.renderer.RenderManager;
import com.jme3.scene.Geometry;
import com.jme3.scene.Node;
import com.jme3.system.AppSettings;
import java.util.logging.Level;
import java.util.logging.Logger;
import net.WookiePaw.EnDob.Blocks.BlockHelper;
import net.WookiePaw.EnDob.Blocks.DirtBlock;
import net.WookiePaw.EnDob.Blocks.GrassBlock;
import net.WookiePaw.EnDob.Blocks.StoneBlock;
import net.WookiePaw.EnDob.Blocks.WaterBlock;
import net.WookiePaw.EnDob.Listener.ChunkCollisionListener;
import net.WookiePaw.EnDob.Location.Location;
import net.WookiePaw.EnDob.Location.World;

public class EnDob extends SimpleApplication implements ActionListener
{
    // Global consts
    private static final float PLAYER_HEIGHT = 6f;
 
    private BulletAppState bulletAppState;
    private CharacterControl player;
    private Vector3f walkDirection = new Vector3f();
    private boolean left = false, right = false, up = false, down = false;
    private BlockTerrainControl terrainControl;
    private ChunkCollisionListener chunkCollisionListener;
    public static EnDob game;
    
    public EnDob()
    {
        settings = new AppSettings(true);
        settings.setWidth(1280);
        settings.setHeight(720);
        settings.setTitle("EnDob");
        settings.setFullscreen(true);
    }
 
    public static void main(String[] args)
    {
        Logger.getLogger("").setLevel(Level.WARNING);

        game = new EnDob();
        game.start();
    }
 
    @Override
    public void simpleInitApp()
    {
        // Setup physics
        bulletAppState = new BulletAppState();
        stateManager.attach(bulletAppState);
 
        // Create our sky
        viewPort.setBackgroundColor(new ColorRGBA(0.7f, 0.8f, 1f, 1f));
 
        BlockHelper helper = new BlockHelper();
        helper.registerBlocks();
        
        CubesTestAssets.registerBlocks();

        World testWorld = new World("test");
        testWorld.setBlock(new Vector3Int(1, 1, 5), WaterBlock.class);
        
        //terrainControl = new BlockTerrainControl(CubesTestAssets.getSettings(this), new Vector3Int(2, 2, 2));

        
        for (int x = 0; x < 200; x++)
        {
            for (int z = 0; z < 200; z++)
            {
                testWorld.setBlock(new Location(x, 0, z), StoneBlock.class); 
            }
        }
 
 
        flyCam.setMoveSpeed(15);
        
        terrainControl = testWorld.getTerrainControl();
        
        Node worldTerrainNode = new Node();
        worldTerrainNode.addControl(terrainControl);
        worldTerrainNode.addControl(new RigidBodyControl(0));
        rootNode.attachChild(worldTerrainNode);
 
        // Create and setup player model
        CapsuleCollisionShape capsuleShape = new CapsuleCollisionShape(1.5f, PLAYER_HEIGHT, 1);
        player = new CharacterControl(capsuleShape, 0.05f);
        player.setJumpSpeed(20);
        player.setFallSpeed(20);
        player.setGravity(10);
        player.setPhysicsLocation(new Vector3f(10, 10, 50));
 
        
        chunkCollisionListener = new ChunkCollisionListener(terrainControl, bulletAppState); 
        
        // Setup physics
        bulletAppState.getPhysicsSpace().add(player);
        bulletAppState.getPhysicsSpace().addAll(worldTerrainNode);
 
        // Setup our keys
        inputManager.addMapping("Left", new KeyTrigger(KeyInput.KEY_A));
        inputManager.addMapping("Right", new KeyTrigger(KeyInput.KEY_D));
        inputManager.addMapping("Up", new KeyTrigger(KeyInput.KEY_W));
        inputManager.addMapping("Down", new KeyTrigger(KeyInput.KEY_S));
        inputManager.addMapping("Jump", new KeyTrigger(KeyInput.KEY_SPACE));
        inputManager.addListener(this, "Left");
        inputManager.addListener(this, "Right");
        inputManager.addListener(this, "Up");
        inputManager.addListener(this, "Down");
        inputManager.addListener(this, "Jump");
    }
 
    public void onAction(String binding, boolean value, float tpf)
    {
        if (binding.equals("Left"))
        {
          left = value;
        }
        else if (binding.equals("Right"))
        {
          right = value;
        }
        else if (binding.equals("Up"))
        {
          up = value;
        }
        else if (binding.equals("Down"))
        {
          down = value;
        }
        else if (binding.equals("Jump"))
        {
          player.jump();
        }
    }
 
    @Override
    public void simpleUpdate(float tpf)
    {
        Vector3f camDir = cam.getDirection().clone().multLocal(0.6f);
        Vector3f camLeft = cam.getLeft().clone().multLocal(0.4f);
        walkDirection.set(0, 0, 0);
        if (left){ 
            walkDirection.addLocal(camLeft);
        }
        if (right){ 
            walkDirection.addLocal(camLeft.negate()); 
        }
        if (up){ 
            walkDirection.addLocal(camDir); 
        }
        if (down){
            walkDirection.addLocal(camDir.negate()); 
        }
        
        player.setWalkDirection(walkDirection);
        cam.setLocation(player.getPhysicsLocation());
    }
 
    @Override
    public void simpleRender(RenderManager rm)
    {
        //TODO: add render code
    }

    public BlockTerrainControl getBlockTerrainControl() {
        return terrainControl;
    }
    
    public BulletAppState getPhysics(){
        return bulletAppState;
    }
}