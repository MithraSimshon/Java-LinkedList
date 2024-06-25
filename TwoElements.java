import java.util.Scanner;
import java.util.LinkedList;
public class TwoElements {
    public static void main(String args[])
    {
        LinkedList<Integer>list=new LinkedList<>();
        Scanner s=new Scanner(System.in);
        System.out.println("Enter a:");
        list.add(s.nextInt());
        System.out.println("Enter b:");
        list.add(s.nextInt());
        int count=0;
        for(int val:list)
        {
            count+=val;
        }
        System.out.println("Add of a and b:"+count);
    }
}


/* OutPut:

Enter a:
45
Enter b:
50
Add of a and b:95

*/