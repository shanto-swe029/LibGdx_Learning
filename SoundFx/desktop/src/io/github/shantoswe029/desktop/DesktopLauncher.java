package io.github.shantoswe029.desktop;

import com.badlogic.gdx.backends.lwjgl.LwjglApplication;
import com.badlogic.gdx.backends.lwjgl.LwjglApplicationConfiguration;
import io.github.shantoswe029.Main;

public class DesktopLauncher {
	public static void main (String[] arg) {
		LwjglApplicationConfiguration config = new LwjglApplicationConfiguration();
		config.title = "SoundFx";
		config.width = 400;
		config.height = 400;
		config.resizable = false;
		new LwjglApplication(new Main(), config);
	}
}