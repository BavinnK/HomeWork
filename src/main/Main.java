// Bavin Kawa
package main;

import java.util.Scanner;


public class Main {

   
    public static void main(String[] args) {
        Employee obj=new Employee();
        Employee obj1=new Employee();
        Scanner input=new Scanner(System.in);
        System.out.println("enter the first name of employee N1");
        String FN=input.next();
        obj.setFirstName(FN);
         System.out.println("enter  last name of employee N1 ");
        String LN=input.next();
        obj.setLastName(LN);
        obj.setMonthlySalary(0);
        System.out.println("enter the first name of employee N2");
        String FN1=input.next();
        obj1.setFirstName(FN1);
         System.out.println("enter  last name of employee N2 ");
        String LN1=input.next();
        obj1.setLastName(LN1);
        obj1.setMonthlySalary(0);
        System.out.println("------------------------------------");
        System.out.println("NAME\t\t  SALARY");
        System.out.println("-----\t\t  --------");
        System.out.println(obj.getFirstName()+" "+obj.getLastName()+"\t  "+obj.getMonthlySalary());
        System.out.println(obj1.getFirstName()+" "+obj1.getLastName()+"\t  "+obj1.getMonthlySalary());
        System.out.println("guess what!!! a 10 percent raise yoooooooooooo :)");
        obj.setRaize(10);
        obj1.setRaize(10);
        System.out.println("------------------------------------");
        System.out.println("NAME\t\t  SALARY");
         System.out.println("-----\t\t  --------");
        System.out.println(obj.getFirstName()+" "+obj.getLastName()+"\t  "+obj.getMonthlySalary());
        System.out.println(obj1.getFirstName()+" "+obj1.getLastName()+"\t  "+obj1.getMonthlySalary());
        
    }
    
}
