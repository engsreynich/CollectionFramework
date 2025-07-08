package Generics;

import lombok.*;

import javax.swing.*;
import java.util.ArrayList;
import java.util.List;

@Setter
@Getter
@ToString
@NoArgsConstructor
@AllArgsConstructor
class Box<T>{
    private List<T> items;
}
@AllArgsConstructor
@ToString
class Student{
    int id;
    String name;
    String gender;
}

public class GenericsBycherPhea {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        students.add(new Student (1,"ra","M"));
        students.add(new Student (2,"ry","M"));

        Box<Student>box = new Box();
        box.setItems(students);

        System.out.println(box.getItems());

    }
}
