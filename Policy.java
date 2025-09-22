/* 
=== C. Russell  === 
=== Project Pt. 1 === 
=== Insurance Policy Class (model for 1 person) === 
*/

public class Policy 
{
    // === Fields === //
    private int policyNumber;  
    private String providerName;  
    private String firstName;  
    private String lastName;  
    private int age; 
    private String smokingStatus;  
    private int heightInInches;  
    private int weightInPounds; 
    
    // === Constructors === //
       // No-Arg Constructors (w/ default values) 
       public Policy() 
       {
           policyNumber = 0;
           providerName = "";
           firstName = "";
           lastName = "";
           age = 0;
           smokingStatus = "non-smoker";
           heightInInches = 0;
           weightInPounds = 0;
       }
   
       // Full Constructors (w/ arguments)
       public Policy(int policyNumber, String providerName, String firstName, String lastName, int age, String smokingStatus, int heightInInches, int weightInPounds) 
       {
          this.policyNumber = policyNumber;
          this.providerName = providerName;
          this.firstName = firstName;
          this.lastName = lastName;
          this.age = age;
          this.smokingStatus = smokingStatus;
          this.heightInInches = heightInInches;
          this.weightInPounds = weightInPounds;
       }
   
       // === Getters === // 
       public int getPolicyNumber ()
         {return policyNumber;}
       public String getProviderName () 
         {return providerName;}
       public String getFirstName () 
         {return firstName;}
       public String getLastName () 
         {return lastName;}
       public int getAge () 
         {return age;}
       public String getSmokingStatus () 
         {return smokingStatus;}
       public int getHeightInInches () 
         {return heightInInches;}
       public int getWeightInPounds () 
         {return weightInPounds;}
       
       // === Setters === //
       public void setPolicyNumber () 
         {this.policyNumber = policyNumber;}
       public void setProviderName () 
         {this.providerName = providerName;}
       public void setFirstName () 
         {this.firstName = firstName;}
       public void setLastName () 
         {this.lastName = lastName;}
       public void setAge () 
          {this.age = age;}
       public void setSmokingStatus () 
         {this.smokingStatus = smokingStatus;}
       public void setHeightInInches () 
         {this.heightInInches = heightInInches;}
       public void setWeightInPounds () 
          {this.weightInPounds = weightInPounds;}

 // === Methods ==== //
 
   // === BMI Calculation Method === //
       public double calculateBMI() 
       {
          double calcBMI = ((weightInPounds * 703) / (heightInInches * heightInInches)); 
          // BMI Formula = ( weightInPounds * 703.0) / (heightInInches * heightInInches)
           
           return calcBMI; // placeholder
       }

   // === Policy Price Calculation Method === //
       public double calculatePolicyPrice() 
       {
           double calcBMI = calculateBMI();
           double policyPrice = 600.00; // Base fee = $600
           if (age >= 50) {policyPrice += 75.00;} // +$75 if Age >50
           if (smokingStatus.equalsIgnoreCase("smoker")) {policyPrice += 100.00;} // +$100 if Smoker
           if (calcBMI >= 35) {policyPrice += ( (calcBMI - 35) *20 ) ; } // +$ ((BMI - 35)*20) if BMI >35
           
           return policyPrice; // placeholder
       }

}

