package day2.methods;

public class Example6 {

	//method with array as parameter
	public void displayName(String[] names) {
		for(String s:names)
		{
			System.out.println("Name: "+s);
		}
	}
		
		public String[] getArrayOfNames() {
			String[] name= {"a","b","c"}; 
		return name;
		}
	}

