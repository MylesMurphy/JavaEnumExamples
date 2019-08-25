package enumExamples;

public class Main {

	public static void main(String[] args) {
		
		BasicEnum.printEnum();
		System.out.println(Website.MYWEBSITE.url());
		double result = Operation.PLUS.calculate(1, 2);
		System.out.println(result);
	}

}
