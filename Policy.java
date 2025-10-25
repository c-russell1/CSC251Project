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
   
       // Full Constructors (w/ arguments)//
       /*
     @param policyNumber The policy number.
     @param providerName The insurance provider name.
     @param firstName The policy holder’s first name.
     @param lastName The policy holder’s last name.
     @param age The policy holder’s age.
     @param smokingStatus The smoking status (smoker or non-smoker).
     @param heightInInches The policy holder’s height in inches.
     @param weightInPounds The policy holder’s weight in pounds.
     */
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
     /* 
     @return The policy number.
     */ 
       public int getPolicyNumber ()
         {return policyNumber;}
     /*  
     @return  The provider name.
     */    
       public String getProviderName () 
         {return providerName;}
     /* 
     @return  The policy holder's first name.
     */     
       public String getFirstName () 
         {return firstName;}
     /* 
     @return  The policy holder's last name.
     */     
       public String getLastName () 
         {return lastName;}
     /* 
     @return  The policy holder's age.
     */     
       public int getAge () 
         {return age;}
     /* 
     @return  The policy holder's smoking status (smoker/non-smoker).
     */     
       public String getSmokingStatus () 
         {return smokingStatus;}
     /* 
     @return  The policy holder's height in inches.
     */     
       public int getHeightInInches () 
         {return heightInInches;}
     /* 
     @return  The policy holder's weight in pounds.
     */     
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
   /*
   @return Calculated BMI as a double. 
   */
       public double calculateBMI() 
       {
          double calcBMI = ((weightInPounds * 703) / (heightInInches * heightInInches)); 
          // BMI Formula = ( weightInPounds * 703.0) / (heightInInches * heightInInches)
           
           return calcBMI; // placeholder
       }

   // === Policy Price Calculation Method === //
    /*
   @return Calculated policy price as a double. 
   */
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

