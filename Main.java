package sk.itsovy.strausz.family;

import sk.itsovy.strausz.other.FreeClass;

public class Main {


	//
	// CHANGE !!!
	//


    public static void main(String[] args) {
        Person person1;
        person1 = new Person();

        Person person2 = new Person();

        person1.setName("Dominik");
        person2.setName("Lucia");
        person1.setAge(25);
        person2.setAge(19);
        System.out.println(person1);
        person1.setHeight(1.79);
        person1.setWeight(80);

        Mobil mobil1 = new Mobil();

        mobil1.setBrand("OnePlus");
        mobil1.setModel("5T");
        mobil1.setPhoneNumber("+421958209236");

        Mobil mobil2 = new Mobil("Samsung", "S9", "0905125789");

        person1.setMobil(mobil1);

        person1.about();
        System.out.println("Your BMI: " + person1.calculateBMI());
        System.out.println("Result: " + person1.getBMIStatus());
        System.out.println("BirthYear: " + person1.getBirthYear());
        System.out.println("Person 1 is " + person1.getAge() + " yo");
        System.out.println("Person 1 has: " + mobil1.getBrand() + mobil1.getModel());

        Person student = new Person("Oliver", 19, 1.88, 97, true, 'S');
        student.setMobil(mobil2);

        if (student.hasMobilePhone())
            System.out.println("Phone number: " + student.getMobil().getPhoneNumber());
        else
            System.out.println("Student has no mobile!");


        person1.print();


        Calculator casio = new Calculator("Casio FX552");
        person2.setCalculator(casio);

        if (person2.hasCalculator()) {
            casio.turnOn();
            System.out.println(person2.getCalculator().add(58, 77));

        }
        casio.turnOn();
        System.out.println(person2.getCalculator() .calculateSquareArea(5));

        casio.turnOn();
        System.out.println(person2.getCalculator() .cmToInch(5));

        casio.turnOn();
        System.out.println(person2.getCalculator() .inchToCm(10));

        System.out.println(person2.getCalculator() .convertDecimalToBinary(65472));
        ;

        FreeClass fc= new FreeClass();
        fc.sayNHello(12);

        fc.sayNHi(12);


        System.out.println(fc.getEvenNumber(5));

        System.out.println(person2.getCalculator() .calculateAvg(6,9,10));

        System.out.println(person2.getCalculator() .calcLoan(8, 5, 101005));

        fc.test();



    }


}