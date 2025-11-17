/*
 === C. Russell ===
 === Demo Class for Project Pt. 3 === 
 === Insurance Policy Demo Class === 
*/

import java.util.Scanner;
import java.util.*;
import java.io.*;

public class Project_ce_russell
{
    public static void main(String[] args) throws IOException
    {
        ArrayList<Policy> policies = new ArrayList<>();

        // Open file
        File file = new File("PolicyInformation.txt");
        Scanner fileInput = new Scanner(file);

        // Read each record
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

            // Skip blank line between records
            if (fileInput.hasNextLine())
                fileInput.nextLine();

            // Create PolicyHolder
            PolicyHolder holder = new PolicyHolder(
                firstName, lastName, age,
                smokingStatus, heightInInches, weightInPounds
            );

            // Create Policy
            Policy policy = new Policy(policyNumber, providerName, holder);

            policies.add(policy);
        }

        fileInput.close();

        // Counters
        int smokers = 0;
        int nonSmokers = 0;

        // Print policies and count smoking status
        for (Policy policy : policies)
        {
            System.out.println(policy);  // implicit toString()
            System.out.println();

            if (policy.getPolicyHolder().getSmokingStatus().equalsIgnoreCase("smoker"))
                smokers++;
            else
                nonSmokers++;
        }

        // Totals
        System.out.println("Number of Policy objects created: " + Policy.getPolicyCount());
        System.out.println("Number of Policyholders who are smokers: " + smokers);
        System.out.println("Number of Policyholders who are non-smokers: " + nonSmokers);
    }
}
