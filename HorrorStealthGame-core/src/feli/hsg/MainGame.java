package feli.hsg;

import com.badlogic.gdx.Game;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Input.Keys;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;

public class MainGame extends Game {

	SpriteBatch batch;
	
	@Override
	public void create () {
		this.create();
		batch = new SpriteBatch();

	}

	@Override
	public void render () {
		this.render();



	}
	
	@Override
	public void dispose () {
		batch.dispose();
		img.dispose();
	}
}
