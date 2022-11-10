public class CheckNumAndLength {
    String intake;

    public CheckNumAndLength(String intake)
    {
        this.intake=intake;
    }

    public boolean checkLength() 
    {
        return intake.length()>=15;
    }

    public boolean checkNum() 
    {
        try
        {
            Double.parseDouble(intake);
            return true;
        }
        catch(NumberFormatException e)
        {
            return false;
        }
    }

}
