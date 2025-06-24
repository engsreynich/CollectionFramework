package Generics;

class Operation <K,V>{
    public void  setKey(K key){
        System.out.println("Key was set:" + key);
    }
    public void setValue(V value){
        System.out.println("Value was set:"+value);
    }
}

public class MultiType {
    public static void main(String[] args) {
        Operation<Integer, String> operation = new Operation<>();
        operation.setKey(12);
        operation.setValue("My Value");

        System.out.println("Done");
    }
}
