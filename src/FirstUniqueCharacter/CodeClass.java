package FirstUniqueCharacter;

import org.spf4j.base.Pair;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.SortedMap;

public class CodeClass {

    public static void main(String[] args) {
        System.out.println(firstUniqChar("leetcode"));
    }



    public static int firstUniqChar(String s) {
        LinkedHashMap<Character, Integer> map = new LinkedHashMap<>();
        for(int i = 0; i < s.length(); ++i)
            map.merge(s.charAt(i), 1, Integer::sum);
        char result = 0;
        for (Map.Entry entry: map.entrySet()) {
            if(entry.getValue().equals(1)) {
                result = (char) entry.getKey();
                break;
            }
        }
        System.out.println(result);
        for(int i = 0; i < s.length(); ++i){
            if(s.charAt(i) == result)
                return i;
        }
        return -1;
    }

}
