import java.util.LinkedList;
public class Clear {
    public static void main(String args[])
    {
        LinkedList<String>vehicle=new LinkedList<>();
        vehicle.add("Scooty");
        vehicle.add("Bike");
        vehicle.add("car");
        System.out.println(vehicle);
       
        System.out.println("After clearing the elements:");
        vehicle.clear();
        vehicle.add("Airplane");
        vehicle.add("Train");
        vehicle.add("Bus");
        System.out.println("After adding the new elements:"+vehicle);
    }
}

//Output:
/*[Scooty, Bike, car]
After clearing the elements:
After adding the new elements:[Airplane, Train, Bus]*/