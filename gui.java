import java.awt.*;
import java.awt.event.*;

public class gui extends Frame 
	implements WindowListener {

	//Removes warning considering serializable class Frame
	private static final long serialVersionUID = 1239428184;
	public gui () {
		addWindowListener(this);

		setTitle("Trainer");
		setSize(1000,600);
		setVisible(true);

	}
	//Activates normal quit (X-button):
	@Override
	public void windowClosing(WindowEvent evt) {
		System.exit(0);
	}
	//Shitty "implements WindowListener" needs all overrides...
	@Override public void windowOpened(WindowEvent evt) {}
	@Override public void windowClosed(WindowEvent evt) {}
	@Override public void windowIconified(WindowEvent evt) {}
	@Override public void windowDeiconified(WindowEvent evt) {}
	@Override public void windowActivated(WindowEvent evt) {}
	@Override public void windowDeactivated(WindowEvent evt) {}

}
