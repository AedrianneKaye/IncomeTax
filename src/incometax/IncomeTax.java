/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package incometax;
import java.util.Scanner;
/**
 *
 * @author aemal4075
 */
public class IncomeTax {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner keyedInput = new Scanner(System.in);
        
        long salary;
        double income;
        double tax1 = 0.15;
        double tax2 = 2.05;
        double tax3 = 2.6;
        double tax4 = 2.9;
        double tax5 = 3.3;
        
        
        System.out.println("Enter the value of your salary ");
        salary = keyedInput.nextLong(); 
        
        if (salary <= 46605){
            income = salary * tax1;
    System.out.println("Your taxable income is $" + income + ".");  
    }
        
        if (salary > 46605 && salary < 93208){
            income = salary * tax2;
        System.out.println("Your taxable income is $" + income + ".");   
        }
        
        if (salary > 93208 && salary < 144489){
            income = salary * tax3;
        System.out.println("Your taxable income is $" + income + ".");    
        }
        
        if (salary > 144489 && salary < 205842){
            income = salary * tax4;
        System.out.println("Your taxable income is $" + income + ".");    
        }
        
        if (salary > 205842){
            income = salary * tax5;
        System.out.println("Your taxable income is $" + income + ".");    
        }
        // TODO code application logic here
    }
    
}
