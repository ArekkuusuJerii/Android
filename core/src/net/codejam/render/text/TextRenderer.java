package net.codejam.render.text;

import net.codejam.util.math.ScreenPos;

/**
 * This file was created by Snack on 21/01/2017. It's distributed as part of MindFlex.
 * Get the source code in GitHub: https://github.com/ArekkuusuJerii/MindFlex
 * MidFlex is open source, and is distributed under the MIT licence.
 */

public final class TextRenderer {

    private TextRenderer(){}

    /**
     * Draws the text into the screen, it returns the {@link Text} object for convenience
     * @param text The Text to render
     * @param pos The position on the screen
     * @return The Text
     */
    public static Text drawNormal(Text text, ScreenPos pos) {
        text.drawNormal(pos);
        return text;
    }
}
