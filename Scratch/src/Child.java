import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class Child {
    // PROPERTIES
    private String name;
    private LocalDate dob;
    private EyeColor eyeColor;
    private HairColor hairColor;

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

    // CONSTRUCTORS
    public Child(String name, LocalDate dob, EyeColor eyeColor, HairColor hairColor) {
        setName(name);
        setDob(dob);
        setEyeColor(eyeColor);
        setHairColor(hairColor);
    }

    public Child() { }

    // To String Method
    public String toString() {
        return "Child: name=" + getName() + ", DOB:" + getDob()
 + ", Eye Color=" + getEyeColor() + ", Hair Color=" + getHairColor(); }

    //METHODS
    public String toCry(){
        System.out.println("WAAAAAAAAAAHAAHAHAHAHAAH");
        return "WAAAAAAAHAHHAHAHAHAHAHAAH";
    }
    
    public void eats(){
        isHungry = false;
    }
}
