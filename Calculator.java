package week2.day4;

public class Calculator {
	public void addTwoNumber(int a, int b) {
		int c = a+b;
		System.out.println(c);
	}
		public void subTwoNumber(int e, int f) {
			int g = e-f;
			System.out.println(g);
		}
		public void multiTwoNumber(double i, double j) {
		   double k = i*j;
	       System.out.println(k);
			}
		public void divideTwoNumber(float x, float y) {
			   float z = x/y;
		       System.out.println(z);
				}
public static void main(String[] args) {
	Calculator calc=new Calculator();
	calc.addTwoNumber(12, 34);
	calc.subTwoNumber(20, 10);
	calc.multiTwoNumber(23.23, 22.22);
	calc.divideTwoNumber(1002.33f, 1024.32f);
}	
}


