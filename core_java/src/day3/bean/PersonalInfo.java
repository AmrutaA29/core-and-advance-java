package day3.bean;

import java.util.Arrays;

public class PersonalInfo {
	
		
		private String name;
		private int contact_number;
		private String maritial_status;
		
		public PersonalInfo() {
			
		}

		public PersonalInfo(String name, int contact_number, String maritial_status) {
			super();
			this.name = name;
			this.contact_number = contact_number;
			this.maritial_status = maritial_status;
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public int getContact_number() {
			return contact_number;
		}

		public void setContact_number(int contact_number) {
			this.contact_number = contact_number;
		}

		public String getMaritial_status() {
			return maritial_status;
		}

		public void setMaritial_status(String maritial_status) {
			this.maritial_status = maritial_status;
		}

		@Override
		public String toString() {
			return "PersonalInfo [name=" + name + ", contact_number=" + contact_number + ", maritial_status="
					+ maritial_status + "]";
		}

		
				
}
