package PackageTest;
import java.util.HashMap;

import java.util.HashMap;

public class SegundaClase {
    public static int firstFunction(String Key){
        HashMap<String, Integer> firstMap = new HashMap<String, Integer>();

        // Add some key-value pairs to the HashMap
        firstMap.put("Zuko", 2);
        firstMap.put("Flick", 15);
        firstMap.put("Gaia", 3);
        firstMap.put("Argos", 1);
        firstMap.put("Dante", 1);

        return firstMap.get(Key);
    }


}
