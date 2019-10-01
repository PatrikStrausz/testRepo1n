package sk.itsovy.strausz.family;

public class Calculator {
    private boolean power;
    private String calculatorName;


    public Calculator(String calculatorName) {
        this.calculatorName = calculatorName;
        power = false;
    }

    public boolean isPower() {
        return power;
    }

    public void turnOn() {
        power = true;
    }

    public void turnOff() {
        power = false;
    }

    public String getCalculatorName() {
        return calculatorName;
    }

    public int add(int a, int b) {
        if (isPower()) {
            return a + b;
        } else {
            return 0;
        }

    }

    public int calculateSquareArea(int a) {
        if (isPower()) {
            return a * a;
        } else {
            return 0;
        }
    }

    public double inchToCm(double value) {
        if (isPower()) {
            return value / 2.54;
        } else {
            return 0;
        }
    }

    public double cmToInch(double value) {
        if (isPower()) {
            return value * 0.393;
        } else {
            return 0;
        }
    }

    public void toggleCalculator() {
        power = !power;
    }

    public String convertDecimalToBinary(int value) {
        if (isPower()) {
            return Integer.toBinaryString(value);
        } else {
            return null;
        }
    }


    public double calculateDiagonalRectangle(int a, int b) {
        if (isPower()) {
            // return  Math.pow(Math.E , Math.log((a*a)+(b*b)) /2 );
            return Math.sqrt(a * a + b * b); // alebo Math.pow(a,2)
        } else {
            return 0;
        }
    }

    public double calculateCircleArea(double r) {
        if (isPower()) {
            return Math.PI * (r * r); // alebo Math.Pi * Math.pow(r,2)
        } else {
            return 0;
        }
    }

    public double calculateAvg(int a, int b, int c) {
        if (isPower()) {
            // return (a+b+c) / 3.0;
            // alebo
            return (double) (a + b + c) / 3;
        } else {
            return 0;
        }
    }

    public double calcCircleCapacity(int r) {
        if (isPower() && r > 0) {
            return (double)4 / 3 * Math.pow(r, 3) * Math.PI;
        } else {
            return 0;
        }
    }

    public double calcBlockSurface(int a, int b, int c) {
        if (isPower() && a > 0 && b > 0 && c > 0) {
            return (double) 2 * a * b + 2 * b * c + 2 * a * c;
        } else {
            return 0;
        }
    }

    public double calcLoan(int monthly, int interest, int sum) {
        if (isPower()&& monthly > 0 && interest > 0 && sum > 0) {
            return (double)(sum * interest) / monthly;
        } else {
            return 0;
        }
    }
}



