
package Generics;

class Operationn <K,V>{
    public void  setKey(K key){
        System.out.println("Key was set:" + key);
    }
    public void setValue(V value){
        System.out.println("Value was set:"+value);
    }
}
class User {
    private Integer id;
    private  String name;

    public User(Integer id, String name){
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
public class Test {
    public static void main(String[] args) {
        Operationn<Integer, User> operation = new Operationn<>();
        operation.setKey(12);
        User user = new User(12,"nich");
        operation.setValue(user);

        System.out.println("Done");
    }}