package popups.controller;

import popups.view.PopupsViewer;

public class PopupsController
{
	
	private PopupsViewer display;
	
	public PopupsController()
	{
		display = new PopupsViewer();
	}
	
	public void start()
	{
		String answer = "sample";
		while(answer != null && !answer.equals(""));
	}
	
	{
		display.displayMessage("Hi there :D");
		String answer = display.collectResponse("What is going on?");
		display.displayMessage(answer + "is what you said.");
	}

	
	/**
	 * Checks if the supplied String can be parsed to a double value.
	 * @param potentialValue The string to test.
	 * @return Whether the value could be parsed; true if it can be parsed, false otherwise.
	 */
	private boolean isDouble(String potentialValue)
	{
	boolean isParseable = false;
	
	try
	{
		double test = Double.parseDouble(potentialValue);
		isParseable = true;
	}
	catch(NumberFormatException notDouble)
	{
		display.displayMessge("This is not a double value =:<");
	}
	
	return isParseable;
	}
}
