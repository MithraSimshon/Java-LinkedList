import java.util.LinkedList;
public class RemoveOccurrence {
  public static void main(String args[])
  {
    LinkedList<String>name=new LinkedList<>();
    name.add("Abi");
    name.add("Maya");
    name.add("Surya");
    name.add("Bala");
    name.add("Mithu");
    name.removeFirstOccurrence("Maya");
    System.out.println(name);
  }  
}


//Output
//[Abi, Surya, Bala, Mithu]