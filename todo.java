import java.util.Scanner;

class todo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s1, s2, s3;

        System.out.print("Enter task 1: ");
        s1 = sc.nextLine();

        System.out.print("Enter task 2: ");
        s2 = sc.nextLine();

        System.out.print("Enter task 3: ");
        s3 = sc.nextLine();

        System.out.println("\nYour To-Do List:");
        System.out.println("1. " + s1);
        System.out.println("2. " + s2);
        System.out.println("3. " + s3); 
    }
}