
package salary_bonus_management_system;


public class FullTimeLabour extends Labour implements BonusSalary{
    
    public FullTimeLabour(String name, int id, String address, int phone_num, int workHour, int service_period, int salary) {
        super(name, id, address, phone_num, workHour, service_period, salary);
    }
     @Override
     public void bonusSalary1(){
        
        if(workHour >8 && service_period >= 12)
        {
           System.out.println("FullTime Labours TotalSalary with 30% bonus is:" + (salary + (salary * 0.3)));
        }
         else if(workHour < 8)
        {
            System.out.println("FullTime Labours TotalSalary with 10% reduction from salary is:" + (salary - (salary * 0.1)));
        }
        else 
        {
            System.out.println("You are not eligible for bonus");
         }
}
}