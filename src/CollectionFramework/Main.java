package CollectionFramework;

import java.util.ArrayList;
import java.util.List;

//generate class
class MyCollection<T>{
    private T data;
    public void add(T d){
        data = d;
    }
    public T getData(){
        return data;
    }
}

public class Main {
    public static void main(String[] args) {

        MyCollection<String> myCollection = new MyCollection<>();
        myCollection.add("Hello");
        System.out.println(myCollection.getData());


        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(3,4); // add

        list.set(1,100); //update

        list.remove(1); // remove
        list.removeIf(e->e<3); // delete num >3
        System.out.println(list);
        //lamda expreetion
        for(Integer n: list){
            System.out.println(n);
        }
        list.forEach(e-> System.out.println(e));
        list.forEach(System.out::println);

    }
}
