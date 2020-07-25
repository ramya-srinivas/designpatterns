package Factory_Creational;

public class Truck implements Delivery {
    public String delivery(int amount){
        System.out.println("Enter in to a truck to delivery() method");
        System.out.println("exit truck from delivery() method");
        return "Delivery in the truck amount of "+String.valueOf(amount)+"Items";
    }

}