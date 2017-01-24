package net.codejam.util.math;

/**
 * This file was created by Snack on 21/01/2017. It's distributed as part of MindFlex.
 * Get the source code in GitHub: https://github.com/ArekkuusuJerii/MindFlex
 * MidFlex is open source, and is distributed under the licence MIT.
 */

public class ScreenPos {

    private float x, y;

    public ScreenPos(float x, float y) {
        this.x = x;
        this.y = y;
    }

    public void setX(float x) {
        this.x = x;
    }

    public void setY(float y) {
        this.y = y;
    }

    public float getX() {
        return x;
    }

    public float getY() {
        return y;
    }

    /**
     * A
     * @param x
     * @param y
     * @return
     */
    public ScreenPos add(float x, float y) {
        this.x += x;
        this.y += y;
        return this;
    }

    public ScreenPos offSet(float off) {
        this.x += off;
        this.y += off;
        return this;
    }

    public ScreenPos copy() {
        return new ScreenPos(x, y);
    }
}
