package JavaTutForSelenium;

public class Class {

	static void getBody() {
		System.out.println("this is inside getBody()");

	}

	private int account_number;
	private int account_balance;
	int a;

	public static void main(String[] args) {

		Class cl = new Class();
		int a = cl.a;
		System.out.println("hiii");

		while (true) {
			a = cl.account_balance = 200;
			cl.account_number = 20;
		}
	}

}
