public class Main {
    public static void main(String[] args) {

        Student student1 = new Student("Mark");

        Teacher teacher1 = new Teacher("John");
        Teacher teacher2 = new Teacher("Marianna");

        Course course1 = new Course("Java", teacher1);

        student1.setCourse(course1);
        System.out.println(student1);
    }
}