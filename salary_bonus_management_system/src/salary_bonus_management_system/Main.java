
package salary_bonus_management_system;

import java.util.ArrayList;


public class Main {

   
 
    public static void main(String[] args) {
       
       MaleManager mm1= new MaleManager("Faruk",1000,"bashir_7@gmail.com","12/2Dhaka",0134534567,9,13,60000);
        System.out.println("Male managers salary is: "+mm1.salary);
       mm1.bonusSalary1();
        System.out.println("And yearly savings is>>");
        mm1.depositSalary();
        mm1.Message(25);
        System.out.println("");
        
       FemaleManager fm1= new FemaleManager("Shijuka",1000,"shijuka_7@gmail.com","11/2Dhaka",01345345,8,12,40000);
       System.out.println("Female managers salary is: "+fm1.salary);
        fm1.bonusSalary1();
        System.out.println("And yearly savings is>>");
        fm1.depositSalary();
        fm1.Message(24);
             System.out.println("");
           
        FoodManufacturers fm = new FoodManufacturers ("Farhan", 264, "farhan_34@gmail.com","9/2Dhaka",0134564567,9,12,10000);
        System.out.println("Food Manufacturers  salary is: "+fm.salary);
        fm.bonusSalary1();
        System.out.println("");
        
        CanningManufacturers cm = new CanningManufacturers ("Farawi", 284, "farawi_34@gmail.com","18/2Dhaka",0134534167,9,12,9000);
        System.out.println("Canning Manufacturers  salary is: "+cm.salary);
         cm.bonusSalary1();
         System.out.println("");
         
        Advertisers a1 = new Advertisers("Bashir", 254, "bashir_7@gmail.com","15/2Dhaka",013454567,9,12,10000);
         System.out.println("Advertisers salary is: "+a1.salary);
        a1.bonusSalary1();
        System.out.println("And yearly savings is>>");
        a1.depositSalary();
        a1.Message(21);
        System.out.println("");
 
        Salesman s1 = new Salesman("Ettfaq", 294, "ittefaq_74@gmail.com","7/2Dhaka",0134534767,7,11,8000);
        System.out.println("Salesman salary is: "+s1.salary);
        s1.bonusSalary1();
        s1.Message(25);
        System.out.println("And yearly savings is>>");
        s1.depositSalary();
        System.out.println("");
        
       
 PartTimeLabour pt1= new PartTimeLabour("shajahan", 24,"31/2Dhaka",0124534767,2,5,5000,18);   
 PartTimeLabour pt2= new PartTimeLabour("nurjahan", 22,"38/2Dhaka",0145347617,3,6,5000,15);
 ArrayList <PartTimeLabour> p =new ArrayList<>();
 p.add(pt1);
 p.add(pt2);

 System.out.println("PartTime Labours salary is: "+pt1.salary);
 pt1.bonusSalary1();
        System.out.println("");
         mm1.CheckLeave(p);
        System.out.println("2nd PartTime Labours salary is: "+pt2.salary);
        pt2.bonusSalary1();
        System.out.println("");
        FullTimeLabour ft1= new FullTimeLabour("Abdul Hai", 244,"/2Dhaka",0134534767,9,13,11000);
        System.out.println("FullTime Labours salary is: "+ft1.salary);
        ft1.bonusSalary1();
    }
    
}
