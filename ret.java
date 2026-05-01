import java.util.*;
class ret{
    public static void main(String[] args) {
        System.out.println("Enter task: ");
        Scanner sc = new Scanner(System.in);
        String a=sc.nextLine();
        todolist t = new todolist();
        t.todo(a);
        
    }
    
}
class todolist{
    void todo(String a){
        if(a.isBlank()){
            System.out.println("Task not entered");
            return;
        }
        else{
            System.out.println("Task entered: " + a);

        }
        System.out.println("Thank you for entering the task.");
    }
}
