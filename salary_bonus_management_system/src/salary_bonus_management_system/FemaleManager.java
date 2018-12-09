
package salary_bonus_management_system;


public class FemaleManager extends Manager implements BonusSalary {
    int maternity_leave;
     public FemaleManager( String name, int id, String email, String address, int phone_num, int workHour, int service_period, int salary)
    {
        super(name,id,email,address,phone_num,workHour,service_period,salary);
        this.maternity_leave = maternity_leave;
    }
 
    
    void paidMaternityLeave( ){
        if(maternity_leave == 12)
        {
            System.out.println("they are eligible for maternity leave");
  
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
           System.out.println("Female Managers TotalSalary with 70% bonus is:" + (salary + (salary * 0.7)));
        }
         else if(workHour < 8)
        {
            System.out.println("Female Managers TotalSalary with 10% reduction from salary is:" + (salary - (salary * 0.1)));
        }
        else 
        {
            System.out.println("You are not eligible for bonus"); 
}
   }
}
