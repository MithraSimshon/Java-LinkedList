import java.util.LinkedList;
public class Set {
 public static void main(String args[])
 {
   LinkedList<String>Marklist=new LinkedList<>();
   Marklist.add("English");
   Marklist.add("Network security");
   Marklist.add("VLSI");
   Marklist.add("Satellite Communication");
   Marklist.add("Digital System and Design");
   Marklist.set(3,"Wireless Communication");
   System.out.println(Marklist); 
 }   
}


//Output:
/* [English, Network security, VLSI, Wireless Communication, Digital System and Design]*/