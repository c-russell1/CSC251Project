/*
=== C. Russell ===
=== Driver/Demo Class for Project Pt. 1 === 
=== Insurance Policy Class === 
*/

import java.util.Scanner; 

public class Project_ce_russell // demo class
{
    public static void main(String[] args) // main method
    {
        Scanner input = new Scanner(System.in); // get input from user

        System.out.print("Please enter the Policy Number: ");
        int policyNumber = input.nextInt(); // get input and clear buffer
        input.nextLine(); 

        System.out.print("Please enter the Provider Name: ");
        String providerName = input.nextLine();

        System.out.print("Please enter the Policyholder's First Name: ");
        String firstName = input.nextLine();

        System.out.print("Please enter the Policyholder's Last Name: ");
        String lastName = input.nextLine();

        System.out.print("Please enter the Policyholder's Age: ");
        int age = input.nextInt();
        input.nextLine();

        System.out.print("Please enter the Policyholder's Smoking Status (smoker/non-smoker): ");
        String smokingStatus = input.nextLine();

        System.out.print("Please enter the Policyholder's Height (in inches): ");
        int heightInInches = input.nextInt();

        System.out.print("Please enter the Policyholder's Weight (in pounds): ");
        int weightInPounds = input.nextInt();

        // === "Policy" object === //
        Policy policy = new Policy(policyNumber, providerName, firstName, lastName, age, smokingStatus, heightInInches, weightInPounds);

        // === Display output === //
        System.out.println();
        System.out.println("Policy Information:");
        System.out.println("Policy Number: " + policy.getPolicyNumber());
        System.out.println("Provider Name: " + policy.getProviderName());
        System.out.println("Policyholder's First Name: " + policy.getFirstName());
        System.out.println("Policyholder's Last Name: " + policy.getLastName());
        System.out.println("Policyholder's Age: " + policy.getAge());
        System.out.println("Policyholder's Smoking Status: " + policy.getSmokingStatus());
        System.out.println("Policyholder's Height: " + policy.getHeightInInches() + " inches");
        System.out.println("Policyholder's Weight: " + policy.getWeightInPounds() + " pounds");
        System.out.printf("Policyholder's BMI: %.2f\n", policy.calculateBMI());
        System.out.printf("Policy Price: $%.2f\n", policy.calculatePolicyPrice());
    }
}