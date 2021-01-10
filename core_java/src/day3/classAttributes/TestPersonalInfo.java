package day3.classAttributes;

import day3.bean.PersonalInfo;
import day3.bean.Student;

public class TestPersonalInfo {
	public static void main(String[] args) {
		PersonalInfo personal1 = new PersonalInfo("Amruta",1234567890,"Single");
		PersonalInfo personal2 = new PersonalInfo("Amr",1234567890,"Single");
		PersonalInfo personal3 = new PersonalInfo("Amru",1234567890,"Single");
		PersonalInfo personal4 = new PersonalInfo("Amrut",1234567890,"Single");
		
		PersonalInfo[] personalInfo = {personal1,personal2,personal3,personal4};
		
		TestPersonalInfo testInfo = new TestPersonalInfo();
		testInfo.display(personalInfo);
	}
	
	public void display(PersonalInfo[] personalInfo) {
		for(PersonalInfo per:personalInfo) {
			System.out.println(per);
		}

}
}
