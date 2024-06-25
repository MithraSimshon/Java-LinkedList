import java.util.LinkedList;
public class ReverseList {
  public static void main(String args[])
  {
    LinkedList<String>list=new LinkedList<>();
    list.add("HP");
    list.add("Acer");
    list.add("Lenovo");
    list.add("Dell");
    list.add("Apple");
    System.out.println(list);
    list.reversed();
    System.out.println("After reversing an elements:"+list);
  }  
}

//Output:
/*[HP, Acer, Lenovo, Dell, Apple]
After reversing an elements:[HP, Acer, Lenovo, Dell, Apple]*/