
package lab08;

import java.util.Scanner;


/**
 *
 * @author tud17229
 */
class HealthRecord{
    
    private int ssn;
    private String firstName;
    private String lastName;
    private int age;
    private long phoneNumber;
    private String email;
    private double weight;
    private double height;
    
    public HealthRecord(int initialSSN, String initialFirstName, String initialLastName,
            int initialAge, long initialPhoneNumber, String initialEmail, double initialWeight,
            double initialHeight){
        set (initialSSN, initialFirstName, initialLastName, initialAge, 
                initialPhoneNumber, initialEmail, initialWeight, initialHeight);               
    }
    
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
                
    }
    
    
    private void set (int newSSN, String newFirstName, String newLastName,
            int newAge, long newPhoneNumber, String newEmail, double newWeight,
            double newHeight){
        
        //SSN
        if (newSSN < 1 || newSSN > 999999999){
            System.out.println("SSN is too Large or too Small");
            System.exit(0);
        }else{
            ssn = newSSN;
        }                    
        firstName = newFirstName;
        lastName = newLastName;        
        //Age
        if (newAge < 1 || newAge > 125){
            System.out.println("Age is too Low or too Large");
            System.exit(0);
        }else{
            age = newAge;
        }        
        //PhoneNumber
        if (newPhoneNumber < 1L || newPhoneNumber > 9999999999L){
            System.out.println("Phone Number is too Small or Large");            
        }else{
            phoneNumber = newPhoneNumber;
        }
        //email
        email = newEmail;
        //weight
        if (newWeight < 1 || newWeight > 1400){
            System.out.println("Weight is too low or too high");
        }else{
            weight = newWeight;
        }
        //height
        if (newHeight < 1 || newHeight > 108){
            System.out.println("Height is too low or too high");
        }else{
            height = newHeight;
        }        
    } // end of set() method
    
    private int getSSN (){
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
    
    public void calculateBMI (){
        System.out.println("BMI" + (weight / (height * height)) * 703);
    }//end bmi
    
    public void display(){
        System.out.println("SSN" + ssn);
        System.out.println("First Name" + firstName);
        System.out.println("Last Name" + lastName);
        System.out.println("Age" + age);
        System.out.println("Phone Number" + phoneNumber);
        System.out.println("Email" + email);
        System.out.println("Weight" + weight);
        System.out.println("Height" + height);
    }//end display
}


public class HealthRecordDemo {

    public static void main(String[] args) {
        
        //HealthRecord patientJohn = new HealthRecord();
        
        
    }
    
}
