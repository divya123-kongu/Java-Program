import java.util.*;

class add{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

 
        int total = 0;
        
            System.out.print("Enter product name: ");
            String product = sc.nextLine();

            System.out.print("Enter price: ");
            int price = sc.nextInt();
            total+=price;
        
            System.out.println("Do you want to continue(1-YES,0-NO):");
            int choice = sc.nextInt();

        while(true) {
            if(choice==1) {
                System.out.print("Enter product name: ");
                product = sc.next();

                System.out.print("Enter price: ");
                price = sc.nextInt();
                total+=price;
                System.out.println("Do you want to continue(1-YES,0-NO):");
                choice = sc.nextInt();
            }

            else if(choice==0){ 
                System.out.println("Total:"+ total);
                break;
            }
        
        
    }
}

}

        