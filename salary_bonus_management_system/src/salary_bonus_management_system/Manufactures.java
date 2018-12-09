
package salary_bonus_management_system;


public abstract class Manufactures {
String name,email,address;
int id,phone_num,workHour,service_period,salary,saving;
    public Manufactures(String name, int id, String email, String address, int phone_num, int workHour, int service_period, int salary) {
        this.address= address;
        this.email= email;
        this.id= id;
        this.name=name;
        this.phone_num= phone_num;
        this.salary= salary;
        this.service_period= service_period;
        this.workHour=workHour;
        this.saving= saving;
        
        
    }

    void depositSalary(){

          System.out.println(saving += salary * service_period);
        }
   
    }
    
   
 
        
