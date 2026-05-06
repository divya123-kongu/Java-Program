class Course {
    String name;
    static int count = 0;

    Course(String name) {
        this.name = name;
        count++;
    }
}

class Sample {
    public static void main(String[] args) {
        Course c = new Course("Java Programming");
        System.out.println(c.name + ":" + Course.count);
    }
}