package CollectionFramework;

import java.util.HashMap;
import java.util.Map;

public class HshMapDemo {
    public static void main(String[] args) {
        Map<String, String>map = new HashMap<>();
        map.put("username","nich");
        map.put("password","s12432");
        map.put("email", null);
        map.put(null,"engsreynich");
        System.out.println(map);
    }
}
