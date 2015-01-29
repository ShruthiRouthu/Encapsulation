package lab1;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * In this lab your challenge is to fix the code in both classes to use
 * proper encapsulation and the other best practices as explained by 
 * your instructor.
 *
 * @author      Jim Lombardo, WCTC Instructor
 * @version     1.01
 */
public class Employee {
    private String firstName;
    private String lastName;
    private String ssn;
    private Date birthDate;
    private boolean metWithHr;
    private boolean metDeptStaff;
    private boolean reviewedDeptPolicies;
    private boolean movedIn;
    private String cubeId;
    private String fmtDate;
    

    //No arg constructor
     public Employee()
     {
         setFmtDate(); 
     }
     
    //Constructor
    public Employee(String firstName, String lastName,String ssn )
    {
        //calling  setters
        setFirstName(firstName);
        setLastName(lastName);
        setSsn(ssn);
        setFmtDate(); 
    }

    public void setFirstName(String firstName) {
        if(firstName.length() > 0)
            {this.firstName = firstName;}
    }

    public void setLastName(String lastName) {
        if(lastName.length() > 0)
             {this.lastName = lastName;} 
    }

    public void setSsn(String ssn) {
        if(ssn.length() == 9)
            {this.ssn = ssn;}
    }

    public void setBirthDate(Date birthDate) {
        this.birthDate = birthDate;
    }

    public void setFmtDate() {
        Date currentDate =  new Date();
        SimpleDateFormat sdf = new SimpleDateFormat("M/d/yyyy");
        this.fmtDate = sdf.format(currentDate);
    }
    
    

    // Assume this must be performed first
    public void meetWithHrForBenefitAndSalryInfo() {
        System.out.println("Met with Hr on " + fmtDate);
        metWithHr = true;
    }

    // Assume this is must be performed second
    public void meetDepartmentStaff() {
        if(metWithHr) {
            System.out.println("Met with Dept. Staff on " + fmtDate);
            metDeptStaff = true;
        } else {
            System.out.println("Sorry, you cannot meet with "
                    + "department staff until you have met with HR.");
        }
    }

    // Assume this must be performed third
    public void reviewDeptPolicies() {
        if(metWithHr && metDeptStaff) {
            System.out.println("Reviewed Dept. Policies on " + fmtDate);
            reviewedDeptPolicies = true;
        } else {
            System.out.println("Sorry, you cannot review "
                    + " department policies until you have first met with HR "
                    + "and then with department staff.");
        }
    }

    // Assume this must be performed 4th
    public void moveIntoCubicle(String cubeId) {
        if(metWithHr && metDeptStaff && reviewedDeptPolicies) {
            System.out.println("Moved into cube on " + fmtDate);
            this.cubeId = cubeId;
            this.movedIn = true;
        } else {
            System.out.println("Sorry, you cannot move in to a "
                    + "cubicle until you have first met with HR "
                    + "and then with department staff, and then reviewed"
                    + "department policies.");
        }

    }

    public String getStatus() {
        if(metWithHr && metDeptStaff
           && reviewedDeptPolicies && movedIn) {
            return "Orientation is completed on: " + fmtDate;
        } else {
            return fmtDate + ": Orientation in progress...";
        }
    }
}
