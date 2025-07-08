package CollectionFramework;

import java.util.Comparator;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class HashsetDemo {
        public static void main(String[] args) {
            ///  object HashSet
            Set<Integer> set = new TreeSet<>((o1, o2) -> o1 - o2);
            System.out.println();
        //can't store duplicate element
        set.add(1);
        set.add(2);
        set.add(3);

        set.remove(2);
        System.out.println(set);
    }
}
