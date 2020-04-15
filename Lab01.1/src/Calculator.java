/*
* a simple class that performs basic math functions
 */


class Calculator {

    static int add(int a, int b) {
        int c = a + b;
        System.out.println(a + " + " + b + " = "+ c);
        return a + b;
    }

    static int subtract(int a, int b){
        int c = a - b;
        System.out.println(a + " - " + b + " = "+ c);
        return a - b;
    }

    static int multiply(int a, int b) {
        int c = a * b;
        System.out.println(a + " x " + b + " = "+ c);
        return a * b;
    }

    static int divide(int a, int b) {
        int c = a / b;
        System.out.println(a + " / " + b + " = "+ c);
        return a / b;
    }
}
