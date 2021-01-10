package day3.amrutaExamples;

public class classAttributesTest {
	public static void main(String[] args) {
		
		classAttributes example1 = new classAttributes();
		
		example1.setAcc_no(101);
		example1.setAcc_type("Savings");
		example1.setAmount(10000);
		
		System.out.println("Account number: "+example1.getAcc_no());
		System.out.println("Account type: "+example1.getAcc_type());
		System.out.println("Amount: "+example1.getAmount());
		
	}

}
