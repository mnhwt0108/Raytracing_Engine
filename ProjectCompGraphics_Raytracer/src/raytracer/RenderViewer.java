package raytracer;

import java.awt.image.BufferedImage;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;


/**
 * A simple frame renderer for BufferedImages as output from the raytracer.
 */
public class RenderViewer extends JFrame
{

	private static final long serialVersionUID = 1L;

	static boolean looping = true;

	public static void main(String[] args)
	{
		RenderViewer r = new RenderViewer();

	}
	
	public RenderViewer(boolean exitOnClose)
	{
		super("Basic Graphical Rendering");
		if (exitOnClose){
			setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		}
	}

	public RenderViewer()
	{
		this(false);
	}

	public RenderViewer(BufferedImage bi)
	{
		this();
		JPanel j = new JPanel();
		ImageIcon i = new ImageIcon();
		i.setImage(bi);
		JLabel l = new JLabel(i);
		j.add(l);
		add(j);
		setVisible(true);
		pack();
	}

}
