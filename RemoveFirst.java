import java.util.LinkedList;
public class RemoveFirst {
    public static void main(String args[])
    {
        LinkedList<String>name=new LinkedList<>();
        name.add("Ajay");
        name.add("Abi");
        name.add("Mithu");
        name.add("Vaishali");
        name.add("Priya");
        name.removeFirst();
        System.out.println(name);
        System.out.println("After removing 1st element:");
        System.out.println(name.removeFirst());
    }
}


//Output:
/*[Abi, Mithu, Vaishali, Priya]
After removing 1st element:
Abi*/