package ChainruleResponsibility_Behavioral;

public class SeqObjects
{
    private static FiveHundredRupeesHandler fivehundredRupeesHandler = new FiveHundredRupeesHandler();
    private static HundredRupeesHandler hundredRupeesHandler = new HundredRupeesHandler();
    private static FiftyRupeesHandler   fiftyRupeesHandler   = new FiftyRupeesHandler();
    private static FiveRupeesHandler    fiveRupeesHandler    = new FiveRupeesHandler();

    static
    {
        // Construct the chain of Rupees Handlers
        fivehundredRupeesHandler.nextHandler(hundredRupeesHandler);
        hundredRupeesHandler.nextHandler(fiftyRupeesHandler);
        fiftyRupeesHandler.nextHandler(fiveRupeesHandler);
    }

    public void payment( long givenAmount )
    {

        fivehundredRupeesHandler.fetchRupees(givenAmount);
    }
}