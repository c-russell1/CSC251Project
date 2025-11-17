// Project pt. 3 //
// C. Russell //
// represents customer w/ policy (policy holder) // 

public class PolicyHolder
{
    private String firstName;
    private String lastName;
    private int age;
    private String smokingStatus;
    private int heightInInches;
    private int weightInPounds;

    public PolicyHolder()
    {
        firstName = "";
        lastName = "";
        age = 0;
        smokingStatus = "non-smoker";
        heightInInches = 0;
        weightInPounds = 0;
    }

    public PolicyHolder(String firstName, String lastName, int age,
                         String smokingStatus, int heightInInches, int weightInPounds)
    {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.smokingStatus = smokingStatus;
        this.heightInInches = heightInInches;
        this.weightInPounds = weightInPounds;
    }

    public String getFirstName() { return firstName; }
    public String getLastName() { return lastName; }
    public int getAge() { return age; }
    public String getSmokingStatus() { return smokingStatus; }
    public int getHeightInInches() { return heightInInches; }
    public int getWeightInPounds() { return weightInPounds; }

    public double calculateBMI()
    {
        return (weightInPounds * 703.0) /
               (heightInInches * heightInInches);
    }

    @Override
    public String toString()
    {
        return "Policy Holder Information:\n" +
               "First Name: " + firstName + "\n" +
               "Last Name: " + lastName + "\n" +
               "Age: " + age + "\n" +
               "Smoking Status: " + smokingStatus + "\n" +
               "Height (in): " + heightInInches + "\n" +
               "Weight (lbs): " + weightInPounds + "\n" +
               "BMI: " + String.format("%.2f", calculateBMI());
    }
}
