package net.codejam.game;

import com.badlogic.gdx.graphics.Color;
import com.badlogic.gdx.utils.Align;

import net.codejam.render.RenderHelper;
import net.codejam.render.text.Text;
import net.codejam.render.text.TextRenderer;
import net.codejam.util.math.ScreenPos;

/**
 * This file was created by Snack on 23/01/2017. It's distributed as part of MindFlex.
 * Get the source code in GitHub: https://github.com/ArekkuusuJerii/MindFlex
 * MidFlex is open source, and is distributed under the MIT licence.
 */

public class Ready implements IGameState {

    private boolean scaleDown;
    private float blur;

    @Override
    public void play() {
        RenderHelper.clearScreen();
        Color color = new Color(Color.SCARLET);
        if (!scaleDown) {
            if (blur < 1)
                blur += 0.01;
            else scaleDown = true;
        }
        else {
            if (blur > 0)
                blur -= 0.01;
        }
        color.mul(blur);
        Text ready = new Text("Welcome to MindFlex").setColor(color).setAlign(Align.center).scaleXy(5);
        TextRenderer.drawNormal(ready, new ScreenPos(450, 300)).end(); //450,300
    }

    @Override
    public void stop() {

    }
}
