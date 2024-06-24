import java.util.LinkedList;
public class AddLast {
    public static void main(String args[])
    {
        LinkedList<String>name=new LinkedList<>();
        name.add("Aari");
        name.add("Rohit Sharma");
        name.add("Surya");
        name.add("Cricket");
        name.addLast("Sports");
        System.out.println(name);
    }
}
