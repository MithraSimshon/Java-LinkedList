import java.util.LinkedList;
public class RemoveLast {
  public static void main(String args[])
  {
    LinkedList<String>Sports=new LinkedList<>();
    Sports.add("Cricket");
    Sports.add("Football");
    Sports.add("Atheletics");
    Sports.add("Volleyball");
    Sports.add("Olymbics");
    Sports.add("Bike race");
    System.out.println("Before removing:"+Sports);
    Sports.removeLast();
    System.out.println("After removing last element:"+Sports);
  }  
}


//Output:
/*Before removing:[Cricket, Football, Atheletics, Volleyball, Olymbics, Bike race]
After removing last element:[Cricket, Football, Atheletics, Volleyball, Olymbics]*/