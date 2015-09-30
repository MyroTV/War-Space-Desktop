package com.me.gdxtestgame;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.backends.lwjgl.LwjglApplication;
import com.badlogic.gdx.backends.lwjgl.LwjglApplicationConfiguration;

public class Main {
	public static void main(String[] args) {
		LwjglApplicationConfiguration cfg = new LwjglApplicationConfiguration();
		cfg.title = "gdx-test-game";
		cfg.useGL20 = false;
		cfg.width = 1680;
		cfg.height = 1020;
		
		new LwjglApplication(new MyGame(), cfg);
	}
}
