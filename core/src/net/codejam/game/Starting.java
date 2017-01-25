package net.codejam.game;

import com.badlogic.gdx.utils.Align;

import net.codejam.MindFlex;
import net.codejam.render.RenderHelper;
import net.codejam.render.text.Text;
import net.codejam.render.text.TextRenderer;
import net.codejam.util.math.MathHelper;
import net.codejam.util.math.ScreenPos;

import static net.codejam.MindFlex.GAME_TIME;

/**
 * This file was created by Snack on 23/01/2017. It's distributed as part of MindFlex.
 * Get the source code in GitHub: https://github.com/ArekkuusuJerii/MindFlex
 * MidFlex is open source, and is distributed under the MIT licence.
 */

public class Starting implements IGameState {

    public void play() {
        RenderHelper.clearScreen();
        ScreenPos pos = new ScreenPos(450, 300).add(0, MathHelper.cosAngleModifier(50F, 25F, 0F, GAME_TIME));//450,300
        Text welcome = new Text("Cargando...").setAlign(Align.center).scaleXy(5);
        TextRenderer.drawNormal(welcome, pos).end();
    }

    @Override
    public void stop() {

    }
}
