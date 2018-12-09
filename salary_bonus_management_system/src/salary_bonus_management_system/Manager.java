
package salary_bonus_management_system;


public abstract class Manager {
    String name,email,address;
    int id,phone_num,workHour,service_period,salary,saving;
    

    public Manager(String name, int id, String email, String address, int phone_num, int workHour, int service_period, int salary) {
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

          System.out.println(saving += service_period*salary);
         }
        
   
        void Message(int leave){
            if (leave > 25){
                System.out.println("you are absent & fined for each of day");
            }
            else {
                System.out.println("you are not absent");
}
        }
}


