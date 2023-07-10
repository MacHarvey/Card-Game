package src;

public class Card 
{

    // instance variables 

    private String face;
    private int number;
    private String value;


    public Card()
    {
        this.value = "Joker";
        this.face = "none";
        this.number = 0;
    }

    public Card(String value, String face, int number)
    {
        this.value  = value;
        this.face = face;
        this.number = number;
    }

    // Accessors 

    public String getFace()
    {
        return face;
    }

    public int getNumber()
    {
        return number;
    }

    public String getValue()
    {
        return value;
    }

    // Mutators

    public void setFace(String newFace)
    {
        this.face = newFace;
    }

    public void setNumber(int newNumber)
    {
        this.number = newNumber;
    }

    public void setValue(String newValue)
    {
        this.value = newValue;
    }

    public String toString()
    {
        return value + " of " + face;
    }


    public boolean isHigher(Card otherCard)
    {
        if (this.number < otherCard.getNumber()) {
            return false;
        }

        else
        {
            return true;
        }
    }


}
