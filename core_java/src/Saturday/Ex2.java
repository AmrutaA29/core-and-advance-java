package Saturday;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Ex2 {
	public static void main(String[] args) {
		Set<String> cars = new HashSet<String>();
		cars.add("Honda");
		cars.add("Hyundai");
		cars.add("Renault");
		cars.add("Kia");

		List<String> listOfCars = new ArrayList<String>(cars);
		displayList(listOfCars);


}

	public static void displayList(List<String>list1)
	{
		for(String x:list1)
		{
			System.out.println(x);
		}
	}
	
}