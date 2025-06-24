package Generics;

import java.time.LocalDate;

class Userr {
    private Integer id;
    private  String name;

    public Userr(Integer id, String name){
        this.id = id;
        this.name = name;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
record UserData<T>(
        LocalDate time,
        String message,
        T data
) {}

public class  RecordNich {
    public static void main(String[] args) {
        User user = new User( 1, "nich");
        UserData<User> userData = new UserData<>(LocalDate.now(),
                "Get User", user
                );


        System.out.println(userData);
    }}