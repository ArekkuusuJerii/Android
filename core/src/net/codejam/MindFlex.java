package net.codejam;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.Gdx;

import net.codejam.game.IGameState;
import net.codejam.game.Ready;
import net.codejam.game.Starting;
import net.codejam.game.Waiting;

import static net.codejam.MindFlex.State.*;


/**
 * This file was created by Snack on 21/01/2017. It's distributed as part of MindFlex.
 * Get the source code in GitHub: https://github.com/ArekkuusuJerii/MindFlex
 * MidFlex is open source, and is distributed under the MIT licence.
 */

public class MindFlex extends ApplicationAdapter {

    /**
     * Los diferentes estados del juego
     */
    enum State {
        STARTING,
        READY,
        WAITING,
        PLAYING,
        CLOSED
    }
    /*El estado del juego actual*/
    public static State GAME_STATE;
    private IGameState state;
    /*El tiempo en el juego*/
    public static float GAME_TIME;

    @Override
    public void create() {
        GAME_STATE = STARTING;
        state = new Starting();
    }

    @Override
    public void resize(int width, int height) {
    }

    @Override
    public void render() {
        GAME_TIME += Gdx.graphics.getDeltaTime();
        switch (GAME_STATE) {
            case STARTING:
                state.play();
                if (GAME_TIME > 20) {
                    state.stop();
                    GAME_STATE = READY;
                    state = new Ready();
                }
                break;
            case READY:
                state.play();
                if (GAME_TIME > 25.2) {
                    state.stop();
                    GAME_STATE = WAITING;
                    state = new Waiting();
                }
                break;
            case WAITING:
                state.play();
                break;
        }
    }

    @Override
    public void pause() {
    }

    @Override
    public void resume() {
    }

    @Override
    public void dispose() {
        state.stop();
        GAME_STATE = State.CLOSED;
    }
}
