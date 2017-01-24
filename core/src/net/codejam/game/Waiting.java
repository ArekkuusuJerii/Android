package net.codejam.game;

import net.codejam.render.RenderHelper;

/**
 * This file was created by Snack on 23/01/2017. It's distributed as part of MindFlex.
 * Get the source code in GitHub: https://github.com/ArekkuusuJerii/MindFlex
 * MidFlex is open source, and is distributed under the MIT licence.
 */

public class Waiting implements IGameState {
    @Override
    public void play() {
        RenderHelper.clearScreen();
    }

    @Override
    public void stop() {

    }
}
