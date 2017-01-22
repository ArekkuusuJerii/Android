package net.codejam.util.math;

/**
 * Created by Snack on 21/01/2017.
 */

public class ScreenPos {

    private int x, y;

    public ScreenPos(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public ScreenPos add(int x, int y) {
        this.x += x;
        this.y += y;
        return this;
    }

    public ScreenPos offSet(int off) {
        this.x += off;
        this.y += off;
        return this;
    }

    public ScreenPos copy() {
        return new ScreenPos(x, y);
    }
}
