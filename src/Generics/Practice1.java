package Generics;

import java.util.ArrayList;
import java.util.List;

class Students{
    int id;
    String name;
    String gender;
}

public class Practice1 {
    public static <U> void printInfo (U s){
        System.out.println(s);
    }

    public static void main(String[] args) {

            List<Student> students = new ArrayList<>();
            students.add(new Student (1,"ra","M"));
            students.add(new Student (2,"ry","M"));

            Box<Student>box = new Box();
            box.setItems(students);

            System.out.println(box.getItems());

        }
    }

