import java.util.LinkedList;
public class SizeOfEle {
  public static void main(String args[])
  {
    LinkedList<String>Colors=new LinkedList<>();
    Colors.add("Black");
    Colors.add("Blue");
    Colors.add("Green");
    Colors.add("Yellow");
    Colors.add("Pink");
    System.out.println(Colors);
    Colors.clear();
    System.out.println(Colors);
    Colors.add("Brown");
    Colors.add("Red");
    System.out.println(Colors);
    System.out.println(Colors.size());
  }  
}


//Output:
/* [Black, Blue, Green, Yellow, Pink]
[]
[Brown, Red]
2 */