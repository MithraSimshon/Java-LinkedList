import java.util.LinkedList;
public class Technology {
  public static void main(String args[])
  {
    LinkedList<String>Tech=new LinkedList<>();
    Tech.add("c,c++");
    Tech.add("Java");
    Tech.add("SQL");
    Tech.add("React");
    Tech.add("Angular");
    System.out.println(Tech);
    if(Tech.contains("Java"))
    {
        System.out.println("Java is listed in our Technology");
    }
    else
    {
        System.out.println("Java is not listed in our Technology");
    }
    if(Tech.contains("Ruby"))
    {
        System.out.println("Ruby is listed in our Technology");
    }
    else
    {
        System.out.println("Ruby is not listed in our Technology");
    }
  }  
}

//Output:
/*[c,c++, Java, SQL, React, Angular]
Java is listed in our Technology
Ruby is not listed in our Technology*/