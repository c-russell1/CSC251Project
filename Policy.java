/* 
=== C. Russell  === 
=== Project Pt. 1 === 
=== Insurance Policy Class (model for 1 person) === 
*/

// UPDATED on 11.17.25 -- PROJECT PT. 3 // 
public class Policy
{
    // static field 
    private static int policyCount = 0;

    // fields 
    private int policyNumber;
    private String providerName;
    private PolicyHolder holder;

    // no-arg constructor
    public Policy()
    {
        policyNumber = 0;
        providerName = "";
        holder = new PolicyHolder();
        policyCount++;
    }

    // Full constructor 
    public Policy(int policyNumber, String providerName, PolicyHolder holder)
    {
        this.policyNumber = policyNumber;
        this.providerName = providerName;
        this.holder = holder;
        policyCount++;
    }

    // getters ====
    public int getPolicyNumber() { return policyNumber; }
    public String getProviderName() { return providerName; }
    public PolicyHolder getPolicyHolder() { return holder; }
    public static int getPolicyCount(){ return policyCount; } // static Getter

    // policy price ====
    public double calculatePolicyPrice()
    {
        double bmi = holder.calculateBMI();
        int age = holder.getAge();
        String smoking = holder.getSmokingStatus();

        double price = 600.0;

        if (age >= 50)
            price += 75;

        if (smoking.equalsIgnoreCase("smoker"))
            price += 100;

        if (bmi >= 35)
            price += (bmi - 35) * 20;

        return price;
    }

    // toString 
    @Override
    public String toString()
    {
        return "Policy Information:\n" +
               "Policy Number: " + policyNumber + "\n" +
               "Provider Name: " + providerName + "\n" +
               holder.toString() + "\n" +
               "Policy Price: $" + String.format("%.2f", calculatePolicyPrice());
    }
}

