import java.util.Arrays;

/** Arrays can store references to objects, including strings and custom types. */
public class ObjectArray {
    // Small class used to demonstrate an array of object references.
    static class Student {
        String name;
        int grade;

        Student(String name, int grade) {
            this.name = name;
            this.grade = grade;
        }

        @Override
        public String toString() {
            return name + " (" + grade + ")";
        }
    }

    public static void main(String[] args) {
        // The array has room for 3 references, but each reference starts null.
        Student[] students = new Student[3];
        students[0] = new Student("Asha", 92);
        students[1] = new Student("Ravi", 85);
        students[2] = new Student("Mina", 89);

        for (Student student : students) {
            System.out.println(student.name + " scored " + student.grade);
        }

        // Arrays.toString() calls each object's toString() method.
        System.out.println(Arrays.toString(students));
    }
}
