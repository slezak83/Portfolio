/*
 *Nicholas Slezak
 *PRG/420
 *
 */
package salespersonapp;
import java.util.Arrays;
import java.util.Scanner;

public class SalesPersonComparison extends SalesCompensation {
    public static String[] anArrayOfStrings;
    public static double[] salesArray;
    public static int i;
    public static int i2;
    public static Scanner sc;
    
    public static String[] anArray(String[] anArrayOfStrings){
        
            for(int i = 0;i < 10;i++){
                anArrayOfStrings[0]= Name;//When this function happens the system input is stored at the zero index and incremented by 1
            }
            return anArrayOfStrings;
    }
    public static double[] numbrArray(double[] salesArray){
  
        for(int i2 = 0;i2 < 10;i2++){
            salesArray[0]=salesNumber;
            
        } 
        return salesArray;
    }
}
