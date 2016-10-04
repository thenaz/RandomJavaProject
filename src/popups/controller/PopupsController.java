package popups.controller;

import popups.view.PopupsViewer;
import popups.model.Thingy;
import java.util.List;
import java.util.ArrayList;

public class PopupsController
{
	
	private PopupsViewer display;
	private List<Thingy> thingyList;
	
	public PopupsController()
	{
		display = new PopupsViewer();
	}
	
	public void start()
	{
		String answer = "sample";
		while(answer != null && ! isDouble(answer));
	}
	
	{
		display.displayMessage("Hi there :D");
		String answer = display.collectResponse("What is going on?");
		display.displayMessage(answer + "You need to type in a number!!!!!");
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
	
	private boolean isInteger(String potentialNumber)
	{
		boolean isParseable = false;
		
		try
		{
			int test = Integer.parseInt(potentialNumber);
			isParseable = true;
		}
		catch(NumberFormatException notInt)
		{
			display.displayMessage(notInt.getMessage());
			display.displayMessage("Type in an integer next time!");
		}
		
		return isParseable;
	}
	
	private void learnLists()
	{
		display.displayMessage(opupsthingyList.size() + " is the size of the list.");
		popupsThingy testThingy = new popupsThingy();
		popupsthingyList.add(testThingy);
		display.displayMessage(popupsthingyList.size() + " is the size of the list.");
		
		for (int index = 0; index < 5; index++)
			
		{
			Thingy addThingy = new Thingy();
			thingyList.add(addThingy);
		}
	}
}
