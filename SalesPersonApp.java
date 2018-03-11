/*
*Program Code By: Nicholas Slezak
*Class: PRG/420
*Professor: Manuel 
*
*/

package salespersonapp;

import static salespersonapp.SalesCompensation.str;

public class SalesPersonApp {
    /*initializers and fields run after constructor
    loads class. Objects here inherited by SalesCompensation class*/
    public static int salary = 75000;
    public static double commission = 0.25f; //floating point used here for this variable due to it's size
    
    // Something for the constructor to do
    public static String salesP = "Enter Associate Name:"; 
  public void SalesPersonApp (String salesP){
     
  }
    public static void main(String[] args) {
       
        /*The call to the constructor to load a copy 
        of the class into the jvm first*/
       SalesPersonApp salesP = new SalesPersonApp();
       
       /*Class Object*/
       SalesCompensation salesCompObj = new SalesCompensation();
       
       SalesPersonComparison salesComparisonobj = new SalesPersonComparison();
     
       /*Sales Compensation Calculation Method in SalesComp Class*/
       salesCompObj.Calculate();
    }
}
