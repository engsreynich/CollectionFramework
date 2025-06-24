package Generics;

class Utils<T> {
    private T data;
    public void setData(T data) {
        this.data = data;
    }
    public T getData(){
        return data;

    }
}

public class Main {
    public static void main(String[] args) {
        Utils<String> utils = new Utils<>();
        utils.setData("My Data");

        Utils<Integer> utils1n = new Utils<>();
        utils1n.setData(12);

        Utils<Double> utils2 = new Utils<>();
        utils2.setData(23.2);

        System.out.println(utils.getData());
    }

}
