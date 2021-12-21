package intro;

import config.Assets;
import de.ur.mi.oop.events.KeyPressedEvent;
import scene.Scene;
import scene.SceneListener;

public class IntroScene extends Scene {

    public IntroScene(SceneListener listener) {
        super("Intro", Assets.INTRO_CARD, listener);
    }

    @Override
    public void handleKeyPressedEvent(KeyPressedEvent event) {
        super.handleKeyPressedEvent(event);
        if (event.getKeyCode() == KeyPressedEvent.VK_SPACE) {
            getListener().onSceneCompleted(this);
        }
    }
}
