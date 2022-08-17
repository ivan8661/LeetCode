package UniqueMorse;

import java.util.HashSet;

public class CodeClass {

    public static void main(String[] args) {
        System.out.println(uniqueMorseRepresentations(new String[]{"gin","zen","gig","msg"}));
    }

    public static int uniqueMorseRepresentations(String[] words) {
        HashSet<String> set = new HashSet<>();
        for(String word : words)
            set.add(toMorse(word));
        return set.size();
    }

    public static String toMorse(String word) {
        StringBuilder stringBuilder = new StringBuilder();
        for (char ch : word.toCharArray()) {
            switch(ch) {
                case 'a' -> stringBuilder.append(".-");
                case 'b' -> stringBuilder.append("-...");
                case 'c' -> stringBuilder.append("-.-.");
                case 'd' -> stringBuilder.append("-..");
                case 'e' -> stringBuilder.append(".");
                case 'f' -> stringBuilder.append("..-.");
                case 'g' -> stringBuilder.append("--.");
                case 'h' -> stringBuilder.append("....");
                case 'i' -> stringBuilder.append("..");
                case 'j' -> stringBuilder.append(".---");
                case 'k' -> stringBuilder.append("-.-");
                case 'l' -> stringBuilder.append(".-..");
                case 'm' -> stringBuilder.append("--");
                case 'n' -> stringBuilder.append("-.");
                case 'o' -> stringBuilder.append("---");
                case 'p' -> stringBuilder.append(".--.");
                case 'q' -> stringBuilder.append("--.-");
                case 'r' -> stringBuilder.append(".-.");
                case 's' -> stringBuilder.append("...");
                case 't' -> stringBuilder.append("-");
                case 'u' -> stringBuilder.append("..-");
                case 'v' -> stringBuilder.append("...-");
                case 'w' -> stringBuilder.append(".--");
                case 'x' -> stringBuilder.append("-..-");
                case 'y' -> stringBuilder.append("-.--");
                case 'z' -> stringBuilder.append("--..");
            }
        }
        return stringBuilder.toString();
    }
}

