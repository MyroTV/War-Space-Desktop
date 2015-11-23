package com.me.gdxtestgame;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.backends.lwjgl.LwjglApplication;
import com.badlogic.gdx.backends.lwjgl.LwjglApplicationConfiguration;

public class Main {
	public static void main(String[] args) {
		LwjglApplicationConfiguration cfg = new LwjglApplicationConfiguration();
		System.setProperty("org.lwjgl.opengl.Display.allowSoftwareOpenGL", "true");
		cfg.title = "gdx-test-game";
		cfg.useGL20 = true;
		cfg.width = 1020;
		cfg.height = 1020;
		
		new LwjglApplication(new MyGame(), cfg);
	}
}
