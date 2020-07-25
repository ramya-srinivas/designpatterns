package CompositePattern_Structural;
public class CompositeDemo {
    public static void main(String args[]){
        Employee emp1=new Accountant(101,"Sohan Kumar", 20000.0);
        Employee emp2=new Accountant(102,"Mohan Kumar", 25000.0);
        Employee emp3=new Accountant(103,"Seema Mahiwal", 30000.0);
        Employee manager1=new BankManager(100,"Ashwani Rajput",100000.0);

        manager1.add(emp1);
        manager1.add(emp2);
        manager1.add(emp3);
        System.out.println("Details of Employee are: ");
        manager1.print();
        manager1.remove(emp2);
        System.out.println("After removing details of Employee");
        manager1.print();

    }
}