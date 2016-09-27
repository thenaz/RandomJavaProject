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
		display.displayMessage("Hi there :D");
		String answer = display.collectResponse("What is going on?");
		display.displayMessage(answer + "is what you said.");
	}
}
