package Pgms;

public class DblMinVlueFloat {
public static void main(String[] args) {
   /*what is the value of double Min_Value  is +ve no
   which 1 is bigger ---> double Min_Value or 0.0d ie double min value
   which 1 is bigger ---> double Min_Value or negative infinity*/
   System.out.println(Double.MIN_VALUE); //+ve no
   System.out.println(Long.MIN_VALUE); //-ve no
   System.out.println(Integer.MIN_VALUE); //-ve no
   System.out.println(Math.min(Double.MIN_VALUE, 0.0d));
   System.out.println(Math.min(Integer.MIN_VALUE, 0));
   System.out.println(Float.MIN_VALUE); //+ve no
   System.out.println(Math.min(Float.MIN_VALUE, 0.0f));
   System.out.println(Math.min(Double.MIN_VALUE, Double.NEGATIVE_INFINITY));
   
   
   
   
   
   
   
   
   
   
   
   
   



}
}
