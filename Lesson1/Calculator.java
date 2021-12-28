public class Calculator {
    public static void main(String[] args) {
        int a = 11;
        int b = 5;
        char operator = '^';

        if(a >= 0 && b >= 0) {
                if (operator == '+') {
                    System.out.println("a + b = " + a + b);
                } else if (operator == '-') {
                    System.out.println("a - b = " + a - b);
                } else if (operator == '*') {
                    System.out.println("a * b = " + a * b);
                } else if (operator == '/') {
                    System.out.println("a / b = " + a / b);
                } else if (operator == '%') {
                    System.out.println("a % b = " + a % b);
                } else if (operator == '^') {
                    int result = 1;
                    for (int i = 0; i < b; i++) {
                        result =* a;
                    }
                    System.out.println("a ^ b = " + result);
                }
        } else {
            System.out.println("Одно или несколько чисел являются отрицательными");
        }
    }
}