package net.codejam.render.text;

import net.codejam.util.math.ScreenPos;

/**
 * Created by Snack on 21/01/2017.
 */

public final class TextRenderer {

    private TextRenderer(){}

    public static void drawNormal(Text text, ScreenPos pos) {
        text.drawNormal(pos).end();
    }
}
