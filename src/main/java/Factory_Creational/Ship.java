package Factory_Creational;

public class Ship implements Delivery {
    public String delivery(int amount){
        System.out.println("Enter in to a ship to delivery() method");
        System.out.println("exit ship from delivery() method");
        return "Delivery in the ship amount of "+String.valueOf(amount)+"Items";
    }
}
