public class Cycle {
    public static void main(String[] args) {
        for(int i = 0; i <= 20; i++) {
            System.out.println(i);
        }

        int j = -6;

        while(j<=6) {
            System.out.println(j);
            j = j + 2;
        }

        int k = 10;
        int sumNotEven = 0;
        do {
            if(k % 2 == 1) {
                sumNotEven = sumNotEven + k;
            }
            k++;
        } while(k <= 20);

        System.out.println("The Summary of not even numbers between 10-20 is " + sumNotEven);
    }
}