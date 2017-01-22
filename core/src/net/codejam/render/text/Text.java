package net.codejam.render.text;

import com.badlogic.gdx.graphics.Color;
import com.badlogic.gdx.graphics.g2d.BitmapFont;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;

import net.codejam.util.math.ScreenPos;

/**
 * Created by Snack on 21/01/2017.
 */

public final class Text {

    private SpriteBatch spriteBatch;
    private BitmapFont bitmapFont;
    private String text;

    private String truncate;
    private ScreenPos pos;
    private int align;
    private int wrap;

    public Text() {
        this.spriteBatch = new SpriteBatch();
        this.bitmapFont = new BitmapFont();
        this.bitmapFont.setColor(Color.BLACK);
    }

    public void setSpriteBatch(SpriteBatch spriteBatch) {
        this.spriteBatch = spriteBatch;
    }

    public SpriteBatch getSpriteBatch() {
        return spriteBatch;
    }

    public void setBitmapFont(BitmapFont bitmapFont) {
        this.bitmapFont = bitmapFont;
    }

    public BitmapFont getBitmapFont() {
        return bitmapFont;
    }

    public Text setText(String text) {
        this.text = text;
        return this;
    }

    public Text setTruncate(String truncate){
        this.truncate = truncate;
        return this;
    }

    public void setPos(ScreenPos pos) {
        this.pos = pos;
    }

    public Text setColor(Color color) {
        this.bitmapFont.setColor(color);
        return this;
    }

    public Text setAlignment(int align) {
        this.align = align;
        return this;
    }

    public Text setWrap(int width) {
        wrap = width;
        return this;
    }

    public Text scaleXy(float scale) {
        return scale(scale, scale);
    }

    public Text scale(float x, float y) {
        this.bitmapFont.getData().setScale(x, y);
        return this;
    }

    public Text drawNormal(ScreenPos pos) {
        this.spriteBatch.begin();
        this.bitmapFont.draw(spriteBatch, text, pos.getX(), pos.getY(), 0, text.length(), wrap, align, wrap > 0, truncate);
        this.spriteBatch.end();
        return this;
    }

    public void end() {
        this.spriteBatch.dispose();
        this.bitmapFont.dispose();
        this.text = null;
    }
}
