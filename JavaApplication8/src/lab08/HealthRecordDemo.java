/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab08;


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
    
    public HealthRecord(){
        
        
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
        
    }
    
}


public class HealthRecordDemo {

    public static void main(String[] args) {
        // TODO code application logic here
    }
    
}
