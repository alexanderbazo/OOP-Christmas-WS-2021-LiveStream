package game;

import config.Assets;
import scene.Scene;
import scene.SceneListener;

public class GameScene extends Scene {

    public GameScene(SceneListener listener) {
        super("Game", Assets.BACKGROUND_IMAGE_PATH, listener);
    }

}
