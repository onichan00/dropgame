package com.badlogix.drop;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.audio.Music;
import com.badlogic.gdx.audio.Sound;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.utils.ScreenUtils;

public class Drop extends ApplicationAdapter {
	SpriteBatch batch;
	Texture img;
	private Texture dropImage;
	private Texture bucketImage;
	private Sound dropSound;
	private Music rainMusic;

	
	@Override
	public void create () {
		batch = new SpriteBatch();
		img = new Texture("badlogic.jpg");

		dropImage = new Texture(Gdx.files.internal("img/drop.png"));
		bucketImage = new Texture(Gdx.files.internal("img/bucket.png"));

		dropSound = Gdx.audio.newSound(Gdx.files.internal("sound/drop.wav"));
		rainMusic = Gdx.audio.newMusic(Gdx.files.internal("sound/rain.mp3"));

		rainMusic.setLooping(true);
		rainMusic.play();
	}

	@Override
	public void render () {
		ScreenUtils.clear(1, 0, 0, 1);
		batch.begin();
		batch.draw(img, 0, 0);
		batch.end();
	}
	
	@Override
	public void dispose () {
		batch.dispose();
		img.dispose();
	}
}
