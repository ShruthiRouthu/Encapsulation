/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab1;
import java.util.Random;



/**
 *
 * @author srouthu
 */
public class HRManager {
    
    private Employee  employee ;
    
      
    public void hireEmployee(String firstName, String lastName,String ssn)
    {
        this.employee = new Employee(firstName, lastName,ssn);
        
        employee.meetWithHrForBenefitAndSalryInfo();
        employee.meetDepartmentStaff();
        employee.reviewDeptPolicies();
        
        
        Random randomNumbers = new Random();
        int cubicleNo = randomNumbers.nextInt(50)+ 1;
        employee.moveIntoCubicle(String.valueOf(cubicleNo));
    }
     
    public String getEmployeeStatus()
    {
       return employee.getStatus(); 
    }
    
}
