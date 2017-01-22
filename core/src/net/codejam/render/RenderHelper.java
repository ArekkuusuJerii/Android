package net.codejam.render;

import com.badlogic.gdx.graphics.GL20;

import net.codejam.render.text.TextRenderer;

import static com.badlogic.gdx.Gdx.gl;

/**
 * Created by Snack on 21/01/2017.
 */

public final class RenderHelper {

    public static TextRenderer TEXT;

    private RenderHelper(){}

    public static void clearScreen() {
        gl.glClearColor(1, 1, 1, 1);
        gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
    }
}
