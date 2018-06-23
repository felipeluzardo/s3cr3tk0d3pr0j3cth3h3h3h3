package screens;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Screen;
import com.badlogic.gdx.Input.Keys;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;

import feli.hsg.Constants;
import feli.hsg.MainGame;

public class GameScreen implements Screen{


	Texture img;
	float x,
		  y;
	float moveSpeed = Constants.BASE_MOVE_SPEED * Gdx.graphics.getDeltaTime();
	MainGame game;
	@Override
	public void show() {
		img = new Texture("badlogic.jpg");
	}

	@Override
	public void render(float delta) {
		
		
		if (Gdx.input.isKeyPressed(Keys.UP)){
			y += moveSpeed;
		}
		if (Gdx.input.isKeyPressed(Keys.DOWN)){
			y -= moveSpeed;
		}
		if (Gdx.input.isKeyPressed(Keys.LEFT)){
			x -= moveSpeed;
		}
		if (Gdx.input.isKeyPressed(Keys.RIGHT)){
			x += moveSpeed;
		}
		batch.begin();
		
		Gdx.gl.glClearColor(1, 0, 0, 1);
		Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
		
		batch.draw(img, x, y);
		batch.end();
	}

	@Override
	public void resize(int width, int height) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void pause() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void resume() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void hide() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void dispose() {
		// TODO Auto-generated method stub
		
	}

}
