package Pgms;

public class DvdBy0 {
public static void main(String[] args) {
// Arithmetic exception comes only with integers but not double n float
	//System.out.println(0/0); //------->arithmetic exception
	System.out.println(9.0/0); // ----------->infinity
	System.out.println(9.0/0.0); // ----------->infinity
	System.out.println(12.33f/0); // ----------->infinity
	System.out.println(10/0.0);// ----------->infinity
	System.out.println(19.99999d/0); // ----------->infinity
	System.out.println(12.33f/0); // ----------->infinity
	System.out.println(12.33/00.00); // ----------->infinity
	System.out.println(0.0/0); //nan--- not a no // ----------->infinity
	System.out.println(0.0/0.0);//nan-def in double class just like infinity simply null value in double cls


}
}
