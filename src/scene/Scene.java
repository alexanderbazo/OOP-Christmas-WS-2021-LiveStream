package scene;

import de.ur.mi.oop.events.KeyPressedEvent;
import de.ur.mi.oop.graphics.Image;

public abstract class Scene {

    private final String tag;
    private final Image backgroundImage;
    private final SceneListener listener;

    public Scene(String tag, String backgroundImagePath, SceneListener listener) {
        this.tag = tag;
        this.listener = listener;
        this.backgroundImage = new Image(0, 0, backgroundImagePath);
    }

    public SceneListener getListener() {
        return this.listener;
    }

    public String getTag() {
        return this.tag;
    }

    public void handleKeyPressedEvent(KeyPressedEvent event) {

    }

    public void initialize() {
        listener.onSceneInitialized(this);
    }

    /** Updates all objects in scene */
    public void update() {

    }

    /** Draws current state on screen */
    public void draw() {
        this.backgroundImage.draw();
    }

}
