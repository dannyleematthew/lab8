
package lab08;

import java.util.Scanner;


/**
 *
 * @author :    Danny Lee Matthew : tud17229 : 914463190
 * @date   :    11-06-14
 * @course :    CIS 1068 : 005
 * @HW #   :    Lab 8 : HealthRecordDemo
 * @Problem:    The user is going to enter basic health-care information of five patients. 
 *              The program will then calculate the BMI and display the patients info.
 * 
 */
class HealthRecord{
    
    /* Instance Variables Declarations */
    
    private int ssn;
    private String firstName;
    private String lastName;
    private int age;
    private long phoneNumber;
    private String email;
    private double weight;
    private double height;
    
    /* Constructors */
    
    //[1] Full Entry 
    public HealthRecord(int initialSSN, String initialFirstName, String initialLastName,
            int initialAge, long initialPhoneNumber, String initialEmail, double initialWeight,
            double initialHeight){
        
        set(initialSSN, initialFirstName, initialLastName, initialAge, 
                initialPhoneNumber, initialEmail, initialWeight, initialHeight);               
    }
    
    //[2] Personal Info
    public HealthRecord(int initialSSN, String initialFirstName, String initialLastName, int initialAge){
        
        set (initialSSN, initialFirstName, initialLastName, initialAge, 1, "No Email", 1, 1);        
    }
    //[3] Contact Info
    public HealthRecord(String initialFirstName, String initialLastName, long initialPhoneNumber, String initialEmail){
        set (1, initialFirstName, initialLastName, 1, initialPhoneNumber, initialEmail, 1, 1);
    }
    //[4] Physical Attributes
    public HealthRecord(String initialFirstName, String initialLastName, double initialWeight, double initialHeight){        
        set (1, initialFirstName, initialLastName, 1, 1, "No Email", initialWeight, initialHeight);
    }
    //[5] Default
    public HealthRecord (){
//        set(0,"No FirstName", "No LastName", 0, 0, "No Email", 0, 0);
    }
    
    /* Methods */
    
    //SETS!
    private void set(int newSSN, String newFirstName, String newLastName,
            int newAge, long newPhoneNumber, String newEmail, double newWeight,
            double newHeight){
        
        //SSN
        if (newSSN < 1 || newSSN > 999999999){
            System.out.println("\tSSN is too Large or too Small");
            System.exit(0);
        }else{
            ssn = newSSN;
        }                    
        firstName = newFirstName;
        lastName = newLastName;        
        //Age
        if (newAge < 1 || newAge > 125){
            System.out.println("\tAge is too Low or too Large");
            System.exit(0);
        }else{
            age = newAge;
        }        
        //PhoneNumber
        if (newPhoneNumber < 1L || newPhoneNumber > 9999999999L){
            System.out.println("\tPhone Number is too Small or Large");
            System.exit(0);
        }else{
            phoneNumber = newPhoneNumber;
        }
        //email
        email = newEmail;
        //weight
        if (newWeight < 1 || newWeight > 1400){
            System.out.println("\tWeight is too low or too high");
            System.exit(0);
        }else{
            weight = newWeight;
        }
        //height
        if (newHeight < 1 || newHeight > 108){
            System.out.println("\tHeight is too low or too high");
            System.exit(0);
        }else{
            height = newHeight;
        }        
    } // end of set() method
    
    //GETS!
    private int getSSN(){
        return ssn;
    }
    private String getFirstName(){
        return firstName;
    }
    private String getLastName(){
        return lastName;
    }
    private int getAge(){
        return age;
    }
    private long getPhoneNumber(){
        return phoneNumber;
    }
    private String getEmail(){
        return email;
    }
    private double getWeight(){
        return weight;
    }
    private double getHeight(){
        return height;
    }
    
    //Calculate BMI
    public void calculateBMI(){
        System.out.println();
        System.out.println("\t" + getFirstName() + " " +  getLastName()+ "'s BMI: " 
                + (weight / (height*height)) * 703);              
    }
    
    //Reading User-Inputs
    public void readInputs(){
        
        System.out.println();
        System.out.println("Health Records Dept:");
        System.out.println("\nPlease Enter Patient Data");
        System.out.println();
        
        Scanner console = new Scanner (System.in);
        
        System.out.print("\tEnter social security number (SSN): ");
        ssn = console.nextInt();
        
        System.out.print("\tEnter first name: ");
        firstName = console.next();
        
        System.out.print("\tEnter last name: ");
        lastName = console.next();
        
        System.out.print("\tEnter age: ");
        age = console.nextInt();
        
        System.out.print("\tEnter phone number (e.g., 2152049999): ");
        phoneNumber = console.nextLong();
        
        System.out.print("\tEnter email (e.g., ajaj@temple.edu): ");
        email = console.next();
        
        System.out.print("\tEnter weight: ");
        weight = console.nextDouble();
        
        System.out.print("\tEnter height: ");
        height = console.nextDouble();     
        
        set(ssn, firstName, lastName, age, phoneNumber, email, weight, height); //for input validation
    }
    
    //Display Patient Info
    public void display(){
            System.out.println();
            System.out.println("Patient Entry: ");
            System.out.println();
            System.out.println("\tSSN: " + getSSN());
            System.out.println("\tFirst Name: " + getFirstName());
            System.out.println("\tLast Name: " + getLastName());
            System.out.println("\tAge: " + getAge());
            System.out.println("\tPhone Number: " + getPhoneNumber());
            System.out.println("\tEmail: " + getEmail());
            System.out.println("\tWeight: " + getWeight() + " pounds");
            System.out.println("\tHeight: " + getHeight() + " inches");
            System.out.println();        
        }
}


public class HealthRecordDemo {

    public static void main(String[] args) {
        
        //[ER Patient] object : create--> read user-input --> calc BMI --> display info
        HealthRecord ER_patient = new HealthRecord();
        ER_patient.readInputs();
        ER_patient.calculateBMI();
        ER_patient.display();
        
        //[ICU Patient] object : create
        HealthRecord ICU_patient = new HealthRecord(155607279, "James", "Bond", 37, 2155557500L, "jbond@mi6.gov", 168, 72);
        //[Neuro Patient] object : create
        HealthRecord NEURO_patient = new HealthRecord(188704862, "Gregory", "House", 55);
        //[OR Patient] object : create
        HealthRecord OR_patient = new HealthRecord("Jim", "Carey", 2156664444L, "jim.carrey@gmail.ca");
        //[Maternity Patient] object : create
        HealthRecord MATERN_patient = new HealthRecord("Angelina", "Jolie", 115, 68);
        
        //Display information : ICU, NEURO, OR, MATERN Patients
        ICU_patient.display();
        NEURO_patient.display();
        OR_patient.display();
        MATERN_patient.display();
      
        System.out.println("Program End");
    }
    
}
