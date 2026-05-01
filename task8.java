import java.util.*;

class ProductSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String product;
        double price;
        double total = 0;

        while (true) {
            System.out.print("Enter product name: ");
            product = sc.next();

            System.out.print("Enter price: ");
            price = sc.nextDouble();

            if (price == 0) {
                break; 
            }

            total = total + price;
        }

        System.out.println("Total price = " + total);
    }
}
        