package a;


import java.util.HashMap;

public class b {

    public static void main(String[] args) {

        HashMap<String, String> map = new HashMap<>();
        map.put("name","TOM");
        map.put("age","12");

        String age = map.get("age");
        map.remove("age");
        map.put("as", "ass");

        System.out.println(age);
    }



}
