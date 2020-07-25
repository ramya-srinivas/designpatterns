package Mediator_Behavioral;

public class User {
    protected String name;
    protected MessageMediator msgmed;
    public User(String name,MessageMediator msgmed){
        this.name=name;
        this.msgmed=msgmed;
    }
    public String getName(){
        return this.name;
    }
    public void send(String message){
        this.msgmed.showMessage(this,message);
    }
}