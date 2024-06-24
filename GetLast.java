import java.util.LinkedList;
public class GetLast {
    public static void main(String args[])
    {
        LinkedList<String>Colors=new LinkedList<>();
        Colors.add("Blue");
        Colors.add("Yellow");
        Colors.add("Green");
        Colors.add("Pink");
        Colors.add("Black");
        System.out.println(Colors.getLast());
    }
    
}

//Output:
//Black