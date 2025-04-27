package io.github.some_example_name;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Input;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.glutils.ShapeRenderer;

public class Main extends ApplicationAdapter {
    ShapeRenderer shapeRenderer;
    float x = 100, y = 100, size = 50, speed = 200;
    @Override
    public void create() {
        shapeRenderer = new ShapeRenderer();
    }
    @Override
    public void render() {
        handleInput();

        Gdx.gl.glClearColor(0.1f, 0.1f, 0.1f, 1);
        Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);

        shapeRenderer.begin(ShapeRenderer.ShapeType.Filled);
        shapeRenderer.setColor(1, 0.5f, 0, 1);
        shapeRenderer.rect(x, y, size, size);
        shapeRenderer.end();
    }
    private void handleInput() {
        float delta = Gdx.graphics.getDeltaTime();
        if (Gdx.input.isKeyPressed(Input.Keys.LEFT)) x -= speed * delta;
        if (Gdx.input.isKeyPressed(Input.Keys.RIGHT)) x += speed * delta;
        if (Gdx.input.isKeyPressed(Input.Keys.UP)) y += speed * delta;
        if (Gdx.input.isKeyPressed(Input.Keys.DOWN)) y -= speed * delta;
    }
    @Override
    public void dispose() {
        shapeRenderer.dispose();
    }
}

