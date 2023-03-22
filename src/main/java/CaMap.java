import java.util.*;
class CaMap {
    public static void main(String args[]) {
        HashMap<String, String> map = new HashMap<>();
        map.put("Sahil", "A");
        map.put("shadiq", "A");
        map.put("phanidra", "A");
        map.put("rishu", "A");
        System.out.println(map);

        System.out.println(map.get("Sahil"));


       Set<String> s = map.keySet();

        for (String a: s) {
            System.out.println(a+" = "+map.get(a));

        }
        System.out.println(map.containsKey("shadiq"));
        System.out.println(s);
        map.remove("Sahil");
        map.put("shadiq","B");
        System.out.println(map);
        System.out.println(map.size());
        map.clear();
        System.out.println(map.isEmpty());

    }


}
