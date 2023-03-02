package io.kraksy.ratan;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.graphics.glutils.ShapeRenderer;
import com.badlogic.gdx.utils.ScreenUtils;

public class roguelike extends ApplicationAdapter {
	SpriteBatch batch;
	Texture img;
	ShapeRenderer shapeRenderer;

	static int width = 1024;
	static int height = 1024;

	static int tile = 32;


	//  start of the code

	@Override
	public void create () {

		shapeRenderer = new ShapeRenderer();

	}

	// updates every frame

	@Override
	public void render () {

		Gdx.gl.glClearColor(.25f, .25f, .25f, 1);
		Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);

		shapeRenderer.begin(ShapeRenderer.ShapeType.Filled);
		shapeRenderer.rect(200, 200 , 40 , 40);

		shapeRenderer.setColor(0, 1, 0, 1);

		for (int i = 32 ; i < 1024 ;  i++) {

			shapeRenderer.line( i, width , 0 , 0);

		}

		shapeRenderer.end();

	}

	// closing window

	@Override
	public void dispose () {

		shapeRenderer.dispose();

	}
}
