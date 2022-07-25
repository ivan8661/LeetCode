package FirstLetterTwice;

import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;

public class CodeClass {
    public static void main(String[] args) {
        System.out.println(repeatedCharacter("abccbaacz"));
    }


    public static char repeatedCharacter(String s) {
        HashMap<Character, Integer> hashMap = new HashMap<>();
        for(int i = 0; i < s.length()-1; ++i){
            for(int j = i+1; j < s.length(); ++j){
                if(s.charAt(i) == s.charAt(j) && hashMap.get(s.charAt(i)) == null){
                        hashMap.put(s.charAt(i), j);
                }
            }
        }
        System.out.println(hashMap);
        Map.Entry<Character, Integer> min = Collections.min(hashMap.entrySet(), Map.Entry.comparingByValue());
        return min.getKey();
    }
}
