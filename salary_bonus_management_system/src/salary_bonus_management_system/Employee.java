
package salary_bonus_management_system;


public abstract class Employee {
    String name, email, address;
int id, phone_num, salary, workHour, ser_hour, service_period,saving, leave;

Employee(String name,int id, String email, String address, int phone_num, int workHour, int service_period, int salary )
{
    this.name = name;
    this.leave= leave;
    this.id = id;
    this.email = email;
    this.address = address;
    this.phone_num = phone_num;
    this.workHour = workHour;
    this.salary = salary;
    this.service_period = service_period;
    
        
}

void depositSalary(  )
{
   System.out.println(saving += salary*service_period);
}

void Message(int leave)
{
    System.out.println("you are absent");
}
   
}
    

