// Bavin Kawa
package main;

import java.util.Scanner;
public class Employee {
    private String firstName;
     private String lastName;
     private double monthlySalary;
     
      Scanner input=new Scanner(System.in);
     
     Employee(String firstName,String lastName,double monthlySalary){
     this.firstName=firstName;
     this.lastName=lastName;
     this.monthlySalary=monthlySalary;
     
     }
     Employee(){
     }
     
     
     
     public String getFirstName(){
     return firstName;
     }
     public String getLastName(){
     return lastName;
     }
     public double getMonthlySalary(){
     return monthlySalary;
     }
     public void setFirstName(String firstName){
     this.firstName=firstName;
     
     }
     public void setLastName(String lastName){
     this.lastName=lastName;
     
     }
     public void setMonthlySalary(double monthlySalary){
         System.out.println("enter a postive number for the salary of employee ");
         while(true){
             try{
             
                monthlySalary=input.nextDouble();
            if(monthlySalary>0){
                System.out.println("the salary entered! ");
                break;}
                else{
                System.out.println("please enter a postive numbers! ");}
            }
             
                catch(Exception e){
                 System.out.println("somthing went wrong! ");
                input.next(); 
                }
     }
         
                this.monthlySalary=monthlySalary*12;
}
     public void setRaize(double percent){
         
     monthlySalary+=monthlySalary*(percent/100);
     
     }
     }

