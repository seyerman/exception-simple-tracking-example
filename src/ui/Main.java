package ui;

public class Main {
	public static int division1(int a, int b) {
		int x;
		x = a / b;
		return x;
	}
	
	public static int division2(int a, int b) {
		int x = 0;
		try {
			x = a / b;
		}catch (ArithmeticException e) {
			System.out.println(":(");
		}
		return x;
	}
	
	public static void main(String[] args) {
		int z = 4;
		int y = 0;
		
		System.out.println(division2(z,y));
		try {
			System.out.println(division1(z,y));
		}catch(ArithmeticException ae) {
			System.out.println(":'(");
		}
		System.out.println(division1(z,y));
	}

}
