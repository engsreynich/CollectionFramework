package CollectionFramework;

import java.util.*;

public class ListCollection {

    static class Student {
        int id;
        String name;
        int age;

        public Student(int id, String name, int age) {
            this.id = id;
            this.name = name;
            this.age = age;
        }

        @Override
        public String toString() {
            return "{" + "id=" + id + ", name=" + name + ", age=" + age + '}';
        }
    }

    public static void main(String[] args) {
        Student s1 = new Student(1, "Nich", 20);

        List<Student> studentList = new ArrayList<>(Arrays.asList(s1, s1));

        System.out.println(studentList);
    }
}
