
package salary_bonus_management_system;

import java.util.ArrayList;


public class MaleManager extends Manager implements BonusSalary {
    int paternityLeave;
   
    
   public MaleManager( String name, int id, String email, String address, int phone_num, int workHour, int service_period, int salary)
    {
        super(name,id,email,address,phone_num,workHour,service_period,salary);
        this.paternityLeave = paternityLeave;
        
    }
    
    void paidPaternityLeave( ){
        if(paternityLeave == 2)
        {
            System.out.println("they are eligible for paternity leave");
  
        }
        else
        {
            System.out.print("they are fined a days of income for each day of absence");
        }
    }
    @Override
       void depositSalary(){

          System.out.println(saving += service_period*salary);
         }
      @Override
     public void bonusSalary1(){
        
        if(workHour >8 && service_period >= 12)
        {
           System.out.println("Male Manegers TotalSalary with 70% bonus is :" + (salary + (salary * 0.7)));
        }
         else if(workHour < 8)
        {
            System.out.println("Male Manegers TotalSalary with 10% reduction from salary is:" + (salary - (salary * 0.1)));
        }
        else 
        {
            System.out.println("you are not eligible for bonus");
         }
    }
   void CheckLeave(ArrayList<PartTimeLabour> pt){
       for(PartTimeLabour e :pt){
           if(e.leave>17){
               System.out.println("You are absent and fined for each day");
           }
           else{
               System.out.println("You are not absent");
           }
       }
   } 
}

    
    
    
    

