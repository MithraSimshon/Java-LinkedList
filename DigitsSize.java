import java.util.*;

public class DigitsSize {
   public static void main(String args[])
   {
    Scanner s=new Scanner(System.in);
    System.out.println("Enter the Elements:");
    int n=s.nextInt();
    String st=Integer.toString(n);
    System.out.println(st.length());
    s.close();
   } 
}

/* Output:

Enter the Elements:
234560
6

*/