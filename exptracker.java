import java.util.Scanner;
class exptracker{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double amount, total = 0, foodTotal = 0;
        String category;
        while (true) {
            System.out.print("Enter amount (0 to stop): ");
            amount = sc.nextDouble();

            if (amount == 0)
                break;

            System.out.print("Enter category: ");
            category = sc.next();

            total = total + amount;

            if (category.equalsIgnoreCase("Food")) {
                foodTotal = foodTotal + amount;
            }

            System.out.println(category + " : " + amount);
        }

        System.out.println("Total expense = " + total);
        System.out.println("Food expense = " + foodTotal);
    }
}