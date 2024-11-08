public class StudentClass{
    public static void main(String[] args){
        Student student1 = new Student();
        student1.setId(1234);
        student1.setname("Student_1");

        System.out.println("Student Id: " + student1.getId());
        System.out.println("Student Name: " + student1.getname());
    }
}