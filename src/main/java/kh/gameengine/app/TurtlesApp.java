package kh.gameengine.app;

import kh.gameengine.GameFrame;
import kh.gameengine.ui.TurtlesGameCanvas;

/**
 * Main app entry point for 2d game, Turtles.
 * 
 * @author kevinhooke
 *
 */
public class TurtlesApp extends GameFrame {

	public TurtlesApp(int width, int height) {
		super(width, height);
	}

	public static void main(String[] args)
	{
		//pass width of frame
		new TurtlesApp(550, 440).startUp( new TurtlesGameCanvas() );
	}
}
