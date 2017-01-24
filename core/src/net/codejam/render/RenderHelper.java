package net.codejam.render;

import com.badlogic.gdx.graphics.GL20;

import static com.badlogic.gdx.Gdx.gl;

/**
 * This file was created by Snack on 21/01/2017. It's distributed as part of MindFlex.
 * Get the source code in GitHub: https://github.com/ArekkuusuJerii/MindFlex
 * MidFlex is open source, and is distributed under the MIT licence.
 */

public final class RenderHelper {

    private RenderHelper(){}

    /**
     * Limpia la pantalla de cualquier artefacto restante. Es utilizado para limpiar la pantalla y
     * dejar lugar para el siguiente frame
     */
    public static void clearScreen() {
        gl.glClearColor(1, 1, 1, 1);
        gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
    }
}
