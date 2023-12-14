//creating a basic map
package HashMap;

import java.util.HashMap;
import java.util.Map;

public class basic {
    public static void main(String[] args){
        HashMap<Integer, String> map = new HashMap<Integer, String>();
        //putting values in map
        map.put(0, "A");
        map.put(1, "B");
        map.put(2, "C");
        map.put(3, "D");
        map.put(4, "E");
        map.put(5, "F");
        //iterating through map
        for(Map.Entry m : map.entrySet()){
            System.out.println(m.getKey() + ": "+ m.getValue());
        }
    }
}
