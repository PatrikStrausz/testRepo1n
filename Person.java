package sk.itsovy.strausz.family;

public class Person {
    private String name;
    private int age;
    private boolean gender; //T-Man, F-Female
    private double height;
    private int weight;
    private char status; //S-Single, M-Married, D-Divorced, W-Widow
    private Mobil mobil; //default null
    private Calculator calculator;

    public Person() {

    }

    public Person(String name, int age, double height, int weight, boolean gender, char status) {
        this.name = name;
        this.height = height;
        this.weight = weight;
        this.gender = gender;
        this.status = status;
        this.age = age;


    }


    public void about() {
        System.out.println("Hello. I am class Person. Have a nice day! ");
    }

    public double calculateBMI() {
        double bmi;
        bmi = weight / (height * height);
        return bmi;
    }

    public String getBMIStatus() {
        if (calculateBMI() < 20)
            return "underweight";
        if (calculateBMI() < 25)
            return "optimal";
        if (calculateBMI() < 30)
            return "overweight";

        return "obesity";
    }

    public int getBirthYear() {
        return 2019 - age;
    }

    public void setName(String meno) {
        name = meno;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setGender(boolean gender) {
        this.gender = gender;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public void setStatus(char status) {
        this.status = status;
    }


    public int getAge() {
        return age;
    }

    public Mobil getMobil() {
        return mobil;
    }

    public void setMobil(Mobil mobil) {
        this.mobil = mobil;
    }

    public boolean hasMobilePhone() {
        if (mobil == null)
            return false;
        else
            return true;
    }

    public void print() {
        System.out.println("------------------------------");
        System.out.println("Name: " + this.name);
        System.out.println("Age: " + this.age);
        System.out.println("Height/Weight: " + this.height + "/" + this.weight);
        System.out.println(" BMI: " + calculateBMI() + "(" + getBMIStatus() + ")");
        System.out.println("Gender: " + this.gender);
        System.out.println("Status " + this.status);
        if (hasMobilePhone()) {
            System.out.println("Phone " + mobil.getPhoneNumber());

        }
        System.out.println("------------------------------");


    }

    public Calculator getCalculator() {
        return calculator;
    }

    public void setCalculator(Calculator calculator) {
        this.calculator = calculator;
    }

    public boolean hasCalculator() {
        return calculator != null;
    }

}




