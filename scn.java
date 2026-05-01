import java.util.Scanner;
class scn{
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter name:");
        String name = s.nextLine();
        System.out.println("Enter age:");
        int age = s.nextInt();
        System.out.println("Enter mobile no:");
        long mobileNo = s.nextLong();
        System.out.println("Enter attendance percentage:");
        float attend = s.nextFloat();
        s.nextLine(); 
        System.out.println("Enter email:");
        String email = s.nextLine();
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Mobile No: " + mobileNo);
        System.out.println("Attendance Percentage: " + attend);
        System.out.println("Email: " + email);
    }
}