package popups.view;

import javax.swing.JOptionPane;

/**
 * Popup Viewer class
 * @author ammar.nazir
 * @version September 27, 2016.
 */



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
	
	/**
	 * Creates an input poput to collect a response from the user as a String.
	 * @param question The question being asked to the user.
	 * @return The user's response.
	 */
	
	public String collectResponse(String question)
	{
		String response = "";
		
		response = JOptionPane.showInputDialog(null, question);
		
		return response;
	}
	
	
	/**
	 * Creates a popup to ask a yes/no/cancel type question.
	 * @param question The question being asked the user.
	 * @return The constant value from JOptionPane for y/n/c.
	 */
	
	public int collectUserOption(String question)
	{
		int response = 0;
		
		response = JOptionPane.showOptionDialog(null, question);
		
		return response;
	}
}
