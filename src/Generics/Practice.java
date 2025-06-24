package Generics;

import java.math.BigDecimal;

class Data<T>{
    private T data;
    public void setData(T data){
        this.data = data;

    }
    public T getData(){
        return data;
    }
}

public class Practice {
    public static void main(String[] args) {
        Data<Long> data = new Data<>();
        data.setData(12L);
        System.out.println(data.getData());

        Data<BigDecimal> data1 = new Data<>();
        data1.setData(new BigDecimal("0.03444444444"));
        System.out.println(data1.getData());
    }
}
