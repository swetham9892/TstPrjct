package Pgms;

public class Cmpr2Int {
public static void main(String[] args) {
	/*integer caching- bth nos will be autoboxed and compare  , range of integer caching is -128 to 127*/
	Integer num1 = 190;// num1 num2 is ref,Ineger is wrapper cls
	Integer num2 = 190;
	if (num1 == num2)
	{
		System.out.println("bth r eql");
	}
	else
	{
		System.out.println("bth r not eql");
	}
	
}
}
