import config.GameConfig;
import de.ur.mi.oop.app.GraphicsApp;
import de.ur.mi.oop.colors.Colors;
import de.ur.mi.oop.events.KeyPressedEvent;
import de.ur.mi.oop.launcher.GraphicsAppLauncher;
import game.GameScene;
import intro.IntroScene;
import scene.Scene;
import scene.SceneListener;

public class SnowballFight extends GraphicsApp implements SceneListener {

    private Scene[] scenes;
    private Scene activeScene;

    @Override
    public void initialize() {
        setFrameRate(GameConfig.TARGET_FPS);
        setCanvasSize(GameConfig.SCREEN_WIDTH, GameConfig.SCREEN_HEIGHT);
        initScenes();
        setScene("Intro");
    }

    private void initScenes() {
        scenes = new Scene[2];
        scenes[0] = new IntroScene(this);
        scenes[1] = new GameScene(this);
    }

    private void setScene(String tag) {
       for(Scene scene: scenes) {
           if(scene.getTag().equals(tag)) {
               activeScene = scene;
               break;
           }
       }
    }

    @Override
    public void onSceneInitialized(Scene scene) {

    }

    public void onSceneCompleted(Scene scene) {
        setScene("Game");
    }

    @Override
    public void onKeyPressed(KeyPressedEvent event) {
        super.onKeyPressed(event);
        activeScene.handleKeyPressedEvent(event);
    }

    @Override
    public void draw() {
        drawBackground(Colors.WHITE);
        activeScene.update();
        activeScene.draw();
    }

    public static void main(String[] args) {
        GraphicsAppLauncher.launch("SnowballFight");
    }
}
