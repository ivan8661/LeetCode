package LengthLastWord;

public class CodeClass {
    public static void main(String[] args) {
        System.out.println(lengthOfLastWord("abc lolloll   "));
    }

    public static int lengthOfLastWord(String s) {
        int length = 0;
        for(int i = s.length()-1; i >= 0; --i) {
            if(length != 0){
                if(s.charAt(i) == ' ')
                    return length;
                length++;
            } else if(s.charAt(i) != ' '){
                 length++;
             }
            }
        return length;
        }
    }
