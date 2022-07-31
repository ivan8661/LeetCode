package LetterCombinations;

import java.util.*;

import static java.util.stream.Collectors.toList;

public class CodeClass {

    public static Map<Character, List<Character>> mapOfLetter = null;

    public static void main(String[] args) {
        System.out.println(letterCombinations("233"));
    }

    public static List<String> letterCombinations(String digits) {
        mapOfLetter = new HashMap<>();
        mapOfLetter.put('2', Arrays.asList('a', 'b', 'c'));
        mapOfLetter.put('3', Arrays.asList('d', 'e', 'f'));
        mapOfLetter.put('4', Arrays.asList('g', 'h', 'i'));
        mapOfLetter.put('5', Arrays.asList('j', 'k', 'l'));
        mapOfLetter.put('6', Arrays.asList('m', 'n', 'o'));
        mapOfLetter.put('7', Arrays.asList('p', 'q', 'r', 's'));
        mapOfLetter.put('8', Arrays.asList('t', 'u', 'v'));
        mapOfLetter.put('9', Arrays.asList('w', 'x', 'y', 'z'));
        char[] nums = digits.toCharArray();
        List<String> answer = new LinkedList<>();
        for (char num : nums) {
            List<Character> numbersFromBoard = mapOfLetter.get(num);
            if (answer.size() == 0) {
                for (Character c : numbersFromBoard) {
                    answer.add(c.toString());
                }
                continue;
            }
            List<String> buf = new ArrayList<>();
            for (String s : answer) {
                for (int i = 0; i < numbersFromBoard.size(); ++i) {
                    buf.add(s + numbersFromBoard.get(i));
                }
            }
            answer = buf;
        }
        return answer;
    }
}
