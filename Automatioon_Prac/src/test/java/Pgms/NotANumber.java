package Pgms;

public class NotANumber {
public static void main(String[] args) {
	//NAN - Not a no is produced in floating point operation as a input parameter
	// System.out.println(9/0); //arithmetic expression
	 System.out.println(9.0/0.0);
	 System.out.println(0.0/0.0);
	 System.out.println(Math.sqrt(-1));
	 System.out.println(Float.NaN == Float.NaN);
	 System.out.println(Float.NaN != Float.NaN);
	 double nan = 9.1 % 0;
	 System.out.println((9.1 % 0) == nan);
	 System.out.println(nan == nan); //false because NAN is undefined no
}
}
