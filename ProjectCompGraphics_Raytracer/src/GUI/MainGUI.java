
package GUI;

import java.awt.Dimension;

import javax.swing.JFrame;

import objects.Sphere;
import scene.MaterialScene;
import scene.Scene;

public class MainGUI extends JFrame
{

	public static void main(String[] args){
		MainGUI GUI = new MainGUI();
	}
	public MainGUI()
	{
		super("Ray-tracing Render Engine");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Sphere s = new Sphere();
		Scene scn = new MaterialScene(s);
		ScenePanel sp = new ScenePanel(scn);
		this.setMinimumSize(new Dimension(700, 700));
		add(sp);
		pack();
		setVisible(true);
	}
}
