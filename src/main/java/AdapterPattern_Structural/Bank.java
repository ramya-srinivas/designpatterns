package AdapterPattern_Structural;

class Main {
    public static void main(String args[]){
        CreditCard targetInterface=new Customer();
        targetInterface.giveBankDetails();
        System.out.print(targetInterface.getCreditCard());
    }
}