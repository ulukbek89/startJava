public class Unicode {
    public static void main(String[] args){
        int fromRange = 33;
        int toRange = 126;
        int range = toRange - fromRange;
        char unicode = 33;

        for(int i = 0; i < range; i++) {
            unicode++;
            System.out.println("Char is " + unicode);
        }
    }
}