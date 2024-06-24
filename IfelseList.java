import java.util.LinkedList;
public class IfelseList {
  public static void main(String args[])
  {
    LinkedList<String>technology=new LinkedList<>();
    technology.add("c,c++");
    technology.add("Java");
    technology.add("SQL");
    technology.add("React");
    technology.add("Angular");
    System.out.println(technology);
    if(technology.contains("PHP"))
    {
        System.out.println("PHP is listed in our technology");
    }
    else if(technology.contains("SQL"))
    {
        System.out.println("SQL is listed in our technology");
    }
    else
    {
        System.out.println("SQL is not listed in our technology");
    }
  } 
}


//Output:
/*[c,c++, Java, SQL, React, Angular]
SQL is listed in our technology*/