package CommonPrefix;

public class CodeClass {
    public static void main(String[] args) {
        System.out.println(longestCommonPrefix(new String[]{"ab", "ab"}));

    }


    public static String longestCommonPrefix(String[] strs) {
        StringBuilder result = new StringBuilder();
        int index = 0;
        char buf;
        if(strs[0].length() > 0){
            buf = strs[0].charAt(0);
        } else {
            return "";
        }
        while(true) {
            for (String str : strs) {
                if (str.length() <= index || str.charAt(index) != buf) {
                    return result.toString();
                }
            }
            result.append(buf);
            index++;
            if(strs[0].length() > index){
                buf = strs[0].charAt(index);
            } else {
                break;
            }
        }
        return result.toString();
    }
}
