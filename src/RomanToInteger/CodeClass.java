package RomanToInteger;

public class CodeClass {

    public static void main(String[] args) {
        System.out.println(romanToInt("MCMXCIV"));
    }


    public static int romanToInt(String s) {
        int result = 0;
        for(int i = 0; i < s.length(); ++i) {
            switch (s.charAt(i)){
                case 'I' -> {
                    if(s.length() > (i+1) && s.charAt(i+1) == 'V'){
                        result += 4;
                        i++;
                        break;
                    }
                    if(s.length() > (i+1) && s.charAt(i+1) == 'X'){
                        result += 9;
                        i++;
                        break;
                    }
                    result += 1;
                }
                case 'X' -> {
                    if(s.length() > (i+1) && s.charAt(i+1) == 'L'){
                        result += 40;
                        i++;
                        break;
                    }
                    if(s.length() > (i+1) && s.charAt(i+1) == 'C'){
                        result += 90;
                        i++;
                        break;
                    }
                    result += 10;
                }
                case 'C' -> {
                    if(s.length() > (i+1) && s.charAt(i+1) == 'D'){
                        result += 400;
                        i++;
                        break;
                    }
                    if(s.length() > (i+1) && s.charAt(i+1) == 'M') {
                        result += 900;
                        i++;
                        break;
                    }
                    result += 100;
                }
                case 'V' -> { result += 5; }
                case 'L' -> { result += 50; }
                case 'D' -> { result += 500; }
                case 'M' -> { result += 1000; }
            }
        }
        return result;
    }
}
