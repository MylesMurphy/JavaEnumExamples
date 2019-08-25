package enumExamples;

public class Main {

	public static void main(String[] args) {
		System.out.println("1. Basic Enum");
		System.out.println("*****************************************");
		BasicEnum.printEnum();
		System.out.println("");
		System.out.println("2. Enum + Instance field");
		System.out.println("*****************************************");
		System.out.println(Website.MYWEBSITE.url());
		System.out.println("");
		System.out.println("3. Enum + Method + Some logic");
		System.out.println("*****************************************");
		double result = Operation.PLUS.calculate(1, 2);
		System.out.println(result);
		System.out.println("");
		System.out.println("4. How to use Enum");
		System.out.println("*****************************************");
        for (UserStatus status : UserStatus.values()) {
            System.out.println(status);
        }
        Website webSite = Website.MYWEBSITE;
        if(webSite == Website.MYWEBSITE) {
            System.out.println("This is MYWEBSITE : " + webSite.url());
        }
        Operation op = Operation.valueOf("times".toUpperCase());
        System.out.println(op.calculate(10, 5));
		
	}

}
