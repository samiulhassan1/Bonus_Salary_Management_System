
package salary_bonus_management_system;


public class Salesman extends Employee implements BonusSalary {

    public Salesman(String name, int id, String email, String address, int phone_num, int workHour, int service_period, int salary) {
        super(name, id, email, address, phone_num, workHour, service_period, salary);
        
    }
    @Override
    public void bonusSalary1(){
        
        if(workHour >8 && service_period >= 12)
        {
           System.out.println(" Salesmans TotalSalary with 50% bonus is:" + (salary + (salary * 0.5)));
        }
         else if(workHour < 8)
        {
            System.out.println("Salesmans TotalSalary with 10% reduction from salary is:" + (salary - (salary * 0.1)));
    }
        else 
        {
            System.out.println("You are not eligible for bonus");
    }
    }
    
    @Override
        void depositSalary( ){

          System.out.println(saving += salary * service_period);
        }
 
    @Override
    void Message(int leave){
            if (leave > 15){
                System.out.println("you are absent and fined for each day");
            }
            else {
                System.out.println("you are not absent");
}
        }     
}