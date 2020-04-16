import java.time.LocalDate;
import java.time.Period;

class Child {
    // PROPERTIES
    private String name;
    private LocalDate dob;
    private EyeColor eyeColor;
    private HairColor hairColor;
    private boolean isABrat;

    // OTHER PROPERTIES
    private boolean isHungry;


    // GETTORS
    public String getName(){
        return this.name;
    }

    public LocalDate getDob(){
        return this.dob;
    }

    public EyeColor getEyeColor() {
        return this.eyeColor;
    }

    public HairColor getHairColor(){
        return this.hairColor;
    }

    public boolean getIsABrat() { return this.isABrat; }

    // SETTORS
    public void setName(String name) {
        this.name = name;
    }

    public void setDob(LocalDate birthDate){
        this.dob = birthDate;
    }

    public void setEyeColor(EyeColor color){
        this.eyeColor = color;
    }

    public void setHairColor(HairColor color){
        this.hairColor = color;
    }

    public void setIsABrat(boolean brat) {
        this.isABrat = brat;
    }

    // CONSTRUCTORS
    public Child(String name, LocalDate dob, EyeColor eyeColor, HairColor hairColor, boolean brat) {
        if (isAgePositive(dob)) {
            setName(name);
            setDob(dob);
            setEyeColor(eyeColor);
            setHairColor(hairColor);
            setIsABrat(brat);
        } else {
            System.out.println("ERROR: Inputted Age is Negative. A child instance will be created only for chlidren already born.");
        }

    }

    public Child() { }

    // To String Method
    public String toString() {
        return "Child: name=" + getName() + ", DOB:" + getDob()
 + ", Eye Color=" + getEyeColor() + ", Hair Color=" + getHairColor(); }

    //METHODS
    // calculate the time between a given date and today (future dates are negative)
    public int calculateAge(LocalDate date) {
        LocalDate today = LocalDate.now();
        Period period = Period.between(date, today);
        int age = period.getYears();
        System.out.println("Age is " + age);
        return age;
    }

    // method returns false if inputted date is in the future
    public boolean isAgePositive(LocalDate date){
        int age;
        boolean returnValue = false;
        age = calculateAge(date);
        if (age >= 0) {
            returnValue = true;
        }
        return returnValue;
    }

    public String toCry(){
        System.out.println("WAAAAAAAAAAHAAHAHAHAHAAH");
        return "WAAAAAAAHAHHAHAHAHAHAHAAH";
    }

    public void eats(){
        isHungry = false;
    }

    public void poop() {
        System.out.println("Child has pooped. May need to change diapers");
    }
}
