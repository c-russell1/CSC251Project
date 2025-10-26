/*
=== C. Russell ===
=== Demo Class for Project Pt. 1 === 
=== Insurance Policy Demo Class === 
*/

import java.util.Scanner;
import java.util.*;
import java.io.*;

public class Project_ce_russell // demo class
{
    public static void main(String[] args) throws IOException // main method
    {
        // array list to hold Policy objects
        ArrayList<Policy> policies = new ArrayList<>();

        // Open file
        File file = new File("PolicyInformation.txt");
        Scanner fileInput = new Scanner(file);

        // Read each policy
        while (fileInput.hasNext())
        {
            int policyNumber = fileInput.nextInt();
            fileInput.nextLine(); // clear buffer

            String providerName = fileInput.nextLine();
            String firstName = fileInput.nextLine();
            String lastName = fileInput.nextLine();

            int age = fileInput.nextInt();
            fileInput.nextLine(); // clear buffer

            String smokingStatus = fileInput.nextLine();
            int heightInInches = fileInput.nextInt();
            int weightInPounds = fileInput.nextInt();

            // Skip any blank line between records
            if (fileInput.hasNextLine())
                fileInput.nextLine();

            // Create Policy object and add to list
            policies.add(new Policy(policyNumber, providerName, firstName, lastName, 
                                    age, smokingStatus, heightInInches, weightInPounds));
        }

        fileInput.close();

        // === Display output === //
        int smokerCounter = 0;
        int nonSmokerCounter = 0;
        
        for (Policy policy : policies)
        {
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
           
           if (policy.getSmokingStatus().equalsIgnoreCase("smoker")) smokerCounter++;
           else nonSmokerCounter++;
           
           System.out.println("The number of policies with a smoker is: " + smokerCounter ); 
           System.out.println("The number of policies with a non-smoker is: " + nonSmokerCounter ); 
        }
    }
}