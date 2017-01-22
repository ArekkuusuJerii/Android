package net.codejam;

import com.badlogic.gdx.ApplicationAdapter;

import net.codejam.render.RenderHelper;
import net.codejam.render.text.Text;
import net.codejam.util.math.ScreenPos;

public class Main extends ApplicationAdapter {

	@Override
	public void create () {
	}

	@Override
	public void render () {
        RenderHelper.clearScreen();

        Text welcome = new Text().setText("Bienvenido a MindFlex!").scaleXy(15);

        RenderHelper.TEXT.drawNormal(welcome, new ScreenPos(200, 200));
    }

	@Override
	public void dispose() {
	}
}
