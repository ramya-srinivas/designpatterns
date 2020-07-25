package Factory_Creational;

public class Main {
    public static void main(String args[]){
        Delivery vehical = new Ship();
        System.out.println(vehical.delivery(70));
        vehical = new Truck();
        System.out.println(vehical.delivery(30));

    }
}