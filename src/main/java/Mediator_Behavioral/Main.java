package Mediator_Behavioral;

public class Main {
    public static void main(String args[]){
        MessageMediator m = new MessageBox();
        User sahithi = new User("Sahithi",m);
        User krish = new User("Anand",m);
        sahithi.send("Hi Krish");
        krish.send("Hi Sahithi");
        sahithi.send("How are U");
        krish.send("Ya, I am fine.");

    }
}