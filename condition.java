

class condition{
    public static void main(String[] args) {
        int grad = 85;
        if (grad>90) 
        {
            System.out.println("A");
        }
        else if(grad>=75 && grad<=90) {
            System.out.println("B");
        }
        else if(grad>=60 && grad<=74) {
            System.out.println("C");
        }
        else if(grad>=40 && grad<=59) {
            System.out.println("D");
        }
        else 
            System.out.println("Fail");
    }}
