package popups.model;

public class PopupsThingy
{
	private int number;
	private double value;
    private String words;
    private boolean isValid;
    
    public String getWords;
    public int getNumber()
    {
    	return number;
    }
    public double getValue()
    {
    	return value;
    }
    public boolean isValid()
    {
    	return isValid;
    }
    
    public void setWords(String words)
    {
    	this.words = words;
    }
    public void setNumber(int number)
    {
    	this.number = number;
    }
    public void setValue(double value)
    {
    	this.value = value;
    }
    public void setValid(boolean isValid)
    {
    	this.isValid = isValid;
    }
}
