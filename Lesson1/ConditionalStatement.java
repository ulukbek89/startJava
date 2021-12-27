public class ConditionalStatement {
    public static void main(String[] args) {
        int age = 22;
        boolean isMale = true;
        float growth = 1.85f;
        char firstLetterName = 'M';

        if(age > 20) {
            System.out.println("Age: " + age);
        }

        if(isMale) {
            System.out.println("He is a Man");
        }

        if(!isMale) {
            System.out.println("She is a Woman");
        }

        if(growth < 1.80) {
            System.out.println("Growth over 1.80m");
        } else {
            System.out.println("Growth lower 1.80m");
        }

        if(firstLetterName == 'M') {
            System.out.println("Name starts with letter M");
        } else if(firstLetterName == 'I') {
            System.out.println("Name starts with letter I");
        } else {
            System.out.println("Name does not start with M and I");
        }
    }
}