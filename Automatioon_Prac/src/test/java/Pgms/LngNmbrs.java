package Pgms;

public class LngNmbrs {
public static void main(String[] args) {
	long lngNoWthoutL = 1000*60*60*24*365;
	long lngNoWthL = 1000*60*60*24*365L;  
	System.out.println(lngNoWthoutL);//1471228928 ----considered as int
	System.out.println("L means Long");
	System.out.println(lngNoWthL);//31536000000-----36 bit------considered as long long = 8bytes =36 bits
	//11101010111101100010010110000000000 when decimal cnvrtd to binary
	//bt int limi is 32 bit only then java truncates 1st 4 digits (36-34=4) to make it 32 bit ie
	//1010111101100010010110000000000 ---> 1471228928
	
	
	//to get exact number in longnumbers we have to put "L" at last
	
	
	
}
}
