package popups.view;

import javax.swing.JOptionPane;

public class PopupsViewer
{

	/**
	 *  Makes a popup window to display the supplied message.
	 * @param message The message to be placed in the popup.
	 */
	
	
	
	public void displayMessage(String message)
	{
		JOptionPane.showMessageDialog(null, message);
	}
}
