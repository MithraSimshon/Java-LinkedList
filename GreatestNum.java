import java.util.*;

public class GreatestNum {
 public static void main(String args[])
 {
    Scanner s=new Scanner(System.in);
    System.out.println("Enter a:");
    int a=s.nextInt();
    System.out.println("Enter b:");
    int b=s.nextInt();
    System.out.println("Enter c:");
    int c=s.nextInt();
    System.out.println("The Greatest Number is:");
    if(a>b&&a>c)
    {
        System.out.println(a);
    }
    else if(b>a&&b>c)
    {
        System.out.println(b);
    }
    else
    {
        System.out.println(c);
    }
    s.close();
 }    
}


//Output:
/* Enter a:
38
Enter b:
49
Enter c:
20
The Greatest Number is:
49*/