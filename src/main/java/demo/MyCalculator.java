package demo;

public class MyCalculator {
	public int sum(int a ,int b) {
		return a+b;
	}
	public static void main (String[] args){
		MyCalculator calc = new MyCalculator();
		System.out.println("Sum is"+calc.sum(20, 10));
	}
}
