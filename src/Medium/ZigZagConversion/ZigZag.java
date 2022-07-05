package Medium.ZigZagConversion;

import java.util.ArrayList;

public class ZigZag {

    public static void main(String[] args) {
        convert("ABCD", 3);
    }



    public static String convert(String s, int numRows) {
        if(numRows == 1)
            return s;

        int lettersInZigZag = 0;
        if(s.length()/numRows >=2 )
            lettersInZigZag = numRows-2;

        int lengthWord = numRows+lettersInZigZag;
        ArrayList<StringBuilder> words = new ArrayList<>();
        StringBuilder buf = new StringBuilder();
        for(int i = 0; i < s.length(); ++i){
            if(i != 0 && i%lengthWord == 0){
                words.add(buf);
                buf = new StringBuilder();
            }
            buf.append(s.charAt(i));
        }
        if(buf.length() != 0){
            words.add(buf);
        }
        for (StringBuilder str:
             words) {
            System.out.println(str);
        }
        StringBuilder res = new StringBuilder();
        for(int i = 0; i < words.size(); ++i){
            res.append(words.get(i).charAt(0));
        }

        for(int i = 1; i < numRows; ++i){
            //пошла i-ая строка
            for (StringBuilder word : words) {
                //выбираем из каждого слова нужные символы к этой строке
                if(i < word.length())
                    res.append(word.charAt(i));
                if(word.length()-i >= numRows)
                    res.append(word.charAt(lengthWord-i));
            }
        }
        System.out.println(res);
        return res.toString();
    }

}
