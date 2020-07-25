package ChainruleResponsibility_Behavioral;

public class Main {
    public static void main( String[] args )
    {
        SeqObjects kiosk = new SeqObjects();

        System.out.println("\n ----------------Paid Amount 1755-----------------------\n");

        kiosk.payment(1755);

        System.out.println("\n ----------------Paid Amount 2275-----------------------\n");

        kiosk.payment(2275);
    }
}
