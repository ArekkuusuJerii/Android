package net.codejam.render.text;

import com.badlogic.gdx.graphics.Color;
import com.badlogic.gdx.graphics.g2d.BitmapFont;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.utils.Align;

import net.codejam.util.math.ScreenPos;

/**
 * This file was created by Snack on 21/01/2017. It's distributed as part of MindFlex.
 * Get the source code in GitHub: https://github.com/ArekkuusuJerii/MindFlex
 * MidFlex is open source, and is distributed under the MIT licence.
 */

public final class Text {

    private SpriteBatch spriteBatch;
    private BitmapFont bitmapFont;
    /* El texto que se va a renderizar */
    private String text;
    /* El texto que se agrega después de este texto */
    private String truncate;
    /* El alineamiento del texto */
    private int align;
    /* El espacio de confinamiento del texto */
    private int wrap;

    public Text(String text) {
        this.spriteBatch = new SpriteBatch();
        this.bitmapFont = new BitmapFont();
        this.bitmapFont.setColor(Color.BLACK);
        this.text = text;
    }

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

    /**
     * @param text
     * @return This object
     */
    public Text setText(String text) {
        this.text = text;
        return this;
    }

    public String getText() {
        return text;
    }

    /**
     * @param truncate String a añadir
     * @return This object
     */
    public Text setTruncate(String truncate) {
        this.truncate = truncate;
        return this;
    }

    public String getTruncate() {
        return truncate;
    }

    /**
     * Da un {@link Color} al texto
     *
     * @param color A color
     * @return This object
     */
    public Text setColor(Color color) {
        this.bitmapFont.setColor(color);
        return this;
    }

    public Color getColor(Color color) {
        return bitmapFont.getColor();
    }

    /**
     * Da un {@link Align} al texto
     *
     * @param align
     * @return
     */
    public Text setAlign(int align) {
        this.align = align;
        return this;
    }

    public int getAlign() {
        return align;
    }

    /**
     * Da un espacio de confinamiento al texto
     *
     * @param width Tamaño del confinamiento
     * @return This object
     */
    public Text setWrap(int width) {
        wrap = width;
        return this;
    }

    public int getWrap() {
        return wrap;
    }

    /**
     * Escala el texto a un nuevo tamaño
     *
     * @param scale Escala 'x' y 'y'
     * @return This object
     */
    public Text scaleXy(float scale) {
        return scale(scale, scale);
    }

    /**
     * Escala el texto a un nuevo tamaño
     *
     * @param x Escala 'x'
     * @param y Escala 'y'
     * @return This object
     */
    public Text scale(float x, float y) {
        this.bitmapFont.getData().setScale(x, y);
        return this;
    }

    /**
     * Dibuja el Sting en la {@link ScreenPos}
     *
     * @param pos The position on the screen
     * @return This object
     */
    public Text drawNormal(ScreenPos pos) {
        this.spriteBatch.begin();
        this.bitmapFont.draw(spriteBatch, text, pos.getX(), pos.getY(), 0, text.length(), wrap, align, wrap > 0, truncate);
        this.spriteBatch.end();
        return this;
    }

    /**
     * Remueve a {@link SpriteBatch} y {@link BitmapFont} de la memoria. Es necesario llamar este
     * método al eliminar el objeto, de lo contrario la memoria se vería afectada con basura
     */
    public void end() {
        this.spriteBatch.dispose();
        this.bitmapFont.dispose();
        this.text = null;
    }
}
