package Mediator_Behavioral;
import java.text.SimpleDateFormat;
import java.util.Date;

public class MessageBox  implements MessageMediator{

    public void showMessage(User user,String message){
        SimpleDateFormat sd = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        Date date = new Date();
        System.out.println(sd.format(date)+" "+message);
    }

}