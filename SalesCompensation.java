/*
*Program Code By: Nicholas Slezak
*Class: PRG/420
*Professor: Manuael  
*
*/
package salespersonapp;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;
import static salespersonapp.SalesPersonApp.commission;
import static salespersonapp.SalesPersonApp.salary;
import static salespersonapp.SalesPersonComparison.anArrayOfStrings;
import static salespersonapp.SalesPersonComparison.salesArray;

public class SalesCompensation {
    protected static double salesNumber;
    private static double salesIncentive;
    protected static double salesTarget;
    private static double newCompensation;
    private static double newTotalCompensation;
    private static double newAdjustedGrossIncome;
    private static double totalCommission;
    private static double totalGrossIncome;
    ArrayList<Double> list = new ArrayList<Double>();
    private final int index = 0;
    protected static String Name;
    protected static String str;
    public static int i;
    public static int i2;
    
    public static void SalesCompensation(){
        
    }
    public void Calculate()throws InputMismatchException{
        
        anArrayOfStrings = new String[10];
        salesArray = new double[10];
        /*System input from user until sc.close()is invoked*/
        Scanner sc = new Scanner(System.in);
        
         /*Code here outside of the do-while loop,only need to run it once.*/
         System.out.println("Welcome to the Sales Associate Calculator!");
         System.out.print(SalesPersonApp.salesP);
         Name = sc.next();
         anArrayOfStrings[i++]=Name;
         SalesPersonComparison.anArray(anArrayOfStrings);
         System.out.print("Enter "+Name+"'s"+" Total Annual Sales: $");
         
            do{
                /*Do while loop start, salesNumber stores the User Input*/
                
                double salesNumber = sc.nextDouble();
                salesArray[i2++]=salesNumber;
                SalesPersonComparison.numbrArray(salesArray);
                
                salesTarget = 120000.00;
                salesIncentive = 0.80*salesTarget;
                totalCommission = salesNumber*commission;
                totalGrossIncome = salary+totalCommission;
                
                /*Choosing to break out of the loop here if the user has no more input and wishes to
                end the program by entering 1.*/ 
                    
                if(salesNumber == 1 ){    
                   break;
                }  
                
                /*A conditional if/else statement to check if sales meets 80% of goal.*/
                if(salesNumber <= salesIncentive ){
                    System.out.println("\n"+"Your Sales Did Not Meet Sales Target For Incentive. You Will Not Receive Compensation Pay In Addition To Your Salary. "
                                       +"\n"+"Continue Pushing Hard!"+"\n");
                    System.out.print("Enter Next Associates Name:");
                    Name = sc.next();
                    anArrayOfStrings[i++]=Name;
                    SalesPersonComparison.anArray(anArrayOfStrings);
                    System.out.print("Enter "+Name+"'s"+" Total Annual Sales (Enter '1' to Close): $");
                    sc.hasNextDouble();
                    salesArray[i2]=salesNumber;
                    SalesPersonComparison.numbrArray(salesArray);
                }
                    
                else{
                    /*Second condition if sales are over the target goal to accelerate commission
                    @ 1.25*25% rate.*/
                    if(salesNumber > salesTarget){
                        newCompensation = commission*1.25;
                        newTotalCompensation = newCompensation*salesNumber;
                        newAdjustedGrossIncome = salary+newTotalCompensation;  
                        System.out.println("Your Total Commission is: $" + newTotalCompensation + " ");
                        System.out.println("Your Total Annual Compensation (Including Salary and Incentive) is: $" + newAdjustedGrossIncome + " \n");
                        System.out.println("Below You Will Find Your Higher Potential Earnings:"+"\n");
                        System.out.println("Potential"+"          "+"Potential"+"\n"+"Sales"+"              "+"Income"+"\n");           //Preparation for the FOR loop data
                                for(double potSales = (salesNumber+5000);potSales < (salesNumber*1.5);potSales = (potSales + 5000)){ //FOR loop start
                                        list.add(index, potSales);                                                                   //adding the loop data to the arraylist
                                        
                                        System.out.println(potSales+"           "+((potSales*newCompensation)+salary));              /*Decided it was easier to do math here 
                                                                                                                                     and then add salary back in*/
                                }
                        System.out.println("\n"+"Congratulations On Your Sales Numbers This Year!"+"\n"+"We Have Generously Awarded You With Accelerated Commision"
                                           +"\n"+"Your Name And Sales Amount Will Be Added To Our Hall Of Fame"+"\n"+"We Should All Aspire To Be Like You!"+"\n");
                        System.out.print("Enter Next Associates Name:");
                        Name = sc.next();
                        anArrayOfStrings[i++]=Name;
                        SalesPersonComparison.anArray(anArrayOfStrings);
                        System.out.print("Enter "+Name+"'s"+" Total Annual Sales (Enter '1' to Close): $");
                        
                    }
                    
                    else{
                        /*Third condition: if first two are not true, then third has to be true.
                        Regular commission is received.*/
                        System.out.println("Your Total Commission is: $" +totalCommission + " ");
                        System.out.println("Your Total Annual Compensation (Including Salary without Incentive) is: $" +totalGrossIncome+ " \n");
                        System.out.println("Below You Will Find Your Higher Potential Earnings:"+"\n");
                        System.out.println("Potential"+"          "+"Potential"+"\n"+"Sales"+"              "+"Income"+"\n");
                                for(double potSales = (salesNumber+5000);potSales < (salesNumber*1.5) && potSales < 130000;potSales = (potSales + 5000)){//Second FOR loop start
                                        list.add(index, potSales);                                                                  //Loop data added to arraylist
                                        System.out.println(potSales+"           "+(salary+(commission*potSales)));                  //Printing out to console w/Math to change potential income value
                                        
                                }
                        System.out.println("\n"+"After Your Sales Pass $130,000 You Will Earn An Accelerated Commission "+"\n"+"Rate of 1.25% In Addition To Your Standard Commission Rate of 25%"+"\n");
                        System.out.print("Enter Next Associates Name:");
                        Name = sc.next();                   //the next() method used by scanner stored in  "Name"
                        anArrayOfStrings[i++]=Name;         // and put into the array variable here
                        SalesPersonComparison.anArray(anArrayOfStrings); //Method call for string[] to store an index of newly instanced variable
                        System.out.print("Enter "+Name+"'s"+" Total Annual Sales (Enter '1' to Close): $");
                        salesArray[i2]=salesNumber;
                        SalesPersonComparison.numbrArray(salesArray);
                    }
                    }
               }
           /*Note: hasNextDouble Method below only needs to run once.*/
           
            while(sc.hasNext() || sc.hasNextDouble());
                System.out.println("\n"+"Employee Sales Comparison List"+"\n");
                System.out.println("Employees:"+"\t"+Arrays.toString(anArrayOfStrings)+"\n");
                System.out.println("Sales Numbers:"+"\t"+Arrays.toString(salesArray)+"\n");
                System.out.println("Name"+"\t"+"Sales"+"\n"+anArrayOfStrings[1]+"\t"+salesArray[1]
                                    +"\n"+anArrayOfStrings[3]+"\t"+salesArray[3]);
        /*Scanner closes so as not to continue using system resources*/
        sc.close();
    }
}