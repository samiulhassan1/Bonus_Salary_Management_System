
package salary_bonus_management_system;


public class PartTimeLabour extends Labour implements BonusSalary {
    
    public PartTimeLabour(String name, int id, String address, int phone_num, int workHour, int service_period, int salary,int leave) {
        super(name, id, address, phone_num, workHour, service_period, salary);
    }
    @Override
     public void bonusSalary1(){
        
        if(workHour >3 && service_period >= 6)
        {
           System.out.println("PartTime Labours TotalSalary with 20% bonus is:" + (salary + (salary * 0.2)));
        }
         else if(workHour <3)
        {
            System.out.println("PartTime Labours TotalSalary with 10% reduction from salary is:" + (salary - (salary * 0.1)));
        }
        else 
        {
            System.out.println("You are not eligible for bonus");
         } 
}
    
}
