import java.util.HashMap;
import java.util.Map;

// Please make changes in this code file here
public class Client {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();
        funWithMaps(map);
    }

    static void funWithMaps(Map<String, Integer> map){
        map.put("abc", 140);
        map.put("def", 142);

        System.out.println(map.get("abc"));
        System.out.println(map.size());
    }
}