package Exc14;

import java.util.*;

public class Exc14
{
    public static void main(String[] args)
    {
        Map<String, Integer> map1 = new HashMap<>();
        Map<String, Integer> map2 = new HashMap<>();
        map1.put("Henning", 32);
        map1.put("Bent", 19);
        map1.put("Søren", 61);
        map2.put("Ida", 11);
        map2.put("Henning", 32);
        map2.put("Søren", 61);
        map2.put("Bent", 97);

        System.out.println(intersect(map1, map2));
    }

    private static Map<String, Integer> intersect(Map<String, Integer> map1, Map<String, Integer> map2)
    {
        Map<String, Integer> mapFinal = new HashMap<>();
        List<String> listString = new ArrayList<>();
        List<Integer> listInt = new ArrayList<>();

        listString.addAll(map1.keySet());
        listInt.addAll(map1.values());

        for (int i = 0; i < listString.size(); i++)
        {
            if (map2.containsKey(listString.get(i)) && map2.get(listString.get(i)) == listInt.get(i))
            {
                mapFinal.put(listString.get(i), listInt.get(i));
            }
        }
        return mapFinal;
    }
}
