package IntegerToRoman;

public class CodeClass {
    public static void main(String[] args) {
        System.out.println(intToRoman(58));
    }


    public static String intToRoman(int num) {
        StringBuilder answer = new StringBuilder();
            while (num / 1000 > 0) {
                answer.append('M');
                num -= 1000;
            }
            while (num / 900 > 0) {
                answer.append("CM");
                num -= 900;
            }
            while (num / 500 > 0) {
                answer.append("D");
                num -= 500;
            }
            while (num / 400 > 0) {
                answer.append("CD");
                num -= 400;
            }
            while (num / 100 > 0) {
                answer.append("C");
                num -= 100;
            }
            while (num / 90 > 0) {
                answer.append("XC");
                num -= 90;
            }
            while (num / 50 > 0) {
                answer.append("L");
                num -= 50;
            }
            while (num / 40 > 0) {
                answer.append("XL");
                num -= 40;
            }
            while (num / 10 > 0) {
                answer.append("X");
                num -= 10;
            }
            while (num / 9 > 0) {
                answer.append("IX");
                num -= 9;
            }
            while (num / 5 > 0) {
                answer.append("V");
                num -= 5;
            }
            while (num / 4 > 0) {
                answer.append("IV");
                num -= 4;
            }
            if (num < 4) {
                answer.append("I".repeat(Math.max(0, num)));
                num = 0;
            }
            if (num == 0) {
                return answer.toString();
            }
        return answer.toString();
    }
}
