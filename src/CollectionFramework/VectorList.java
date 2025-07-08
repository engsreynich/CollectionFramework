package CollectionFramework;

import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

public class VectorList {
    public static void main(String[] args) throws InterruptedException {
        int size = 1000000;
//1. Performance
        Long start = System.currentTimeMillis();
        ArrayList<Integer> arrayList = new ArrayList<>();

        for (int i=0; i<size; i++){
            arrayList.add(i);
        }
        Long end = System.currentTimeMillis();
        System.out.println("Add" +size+" element into arrayList:"+(end-start)+"ms");
        System.out.println("Size:"+arrayList.size());


        //1. create vector object

        Long start1 = System.currentTimeMillis();
        Vector<Integer> vectorList = new Vector<>();
        for (int i=0; i<size; i++){
            vectorList.add(i);
        }
        Long end1 = System.currentTimeMillis();
        System.out.println("Add" +size+" element into VectorList:"+(end1-start1)+"ms");
        System.out.println("Size:"+vectorList.size());

//mutil
        long start2 = System.currentTimeMillis();
        Thread t1 = new Thread(() -> {
            for (int i = 0; i < size; i++) {
                arrayList.add(i);
            }
        });
        Thread t2 = new Thread(() -> {
            for (int i = 0; i < size; i++) {
                arrayList.add(i);
            }
        });

        t1.start();
        t2.start();

        t1.join();
        t2.join();
        long end2 = System.currentTimeMillis();
        System.out.println("Multi Thread arrayList: " + (end2 - start2) + " ms");
        System.out.println(arrayList.size());
    }
}
