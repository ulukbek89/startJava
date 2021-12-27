public class Calculator{
    public static void main(String[] args) {
        int a = 11;
        int b = 5;
        char math = '^';
        int result;

        if(a >= 0) {
            if(b >= 0) {
                if (math == '+') {
                    result = a + b;
                    System.out.println("a + b = " + result);
                } else if (math == '-') {
                    result = a - b;
                    System.out.println("a - b = " + result);
                } else if (math == '*') {
                    result = a * b;
                    System.out.println("a * b = " + result);
                } else if (math == '/') {
                    result = a / b;
                    System.out.println("a / b = " + result);
                } else if (math == '%') {
                    result = a % b;
                    System.out.println("a % b = " + result);
                } else if (math == '^') {
                    result = 1;
                    for (int i = 0; i < b; i++) {
                        result = result * a;
                    }
                    System.out.println("a ^ b = " + result);
                }
            } else {
                System.out.println("Одно или несколько чисел являются отрицательными");
            }
        } else {
            System.out.println("Одно или несколько чисел являются отрицательными");
        }
    }
}