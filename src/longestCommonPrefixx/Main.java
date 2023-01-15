package longestCommonPrefixx;

public class Main {
    public static void main(String[] args) {
        String [] strs = {"flower","flow","flight"};
        System.out.println(longestCommonPrefix(strs));
    }
    public static String longestCommonPrefix(String[] strs) {
        if(0 == strs.length) return "";
        if(strs[0].length() == 0) return "";
        String resultStr = strs[0];
        for(int i = 1; i < strs.length; i++){
            if(strs[i].equals("")) return "";
            int len = Math.min(resultStr.length(), strs[i].length());
            resultStr = resultStr.substring(0, len);
            for(int j = 0; j < len; j++){
                if(resultStr.charAt(j) != strs[i].charAt(j)){
                    resultStr = resultStr.substring(0, j);
                    break;
                }
            }
        }
        return resultStr;
    }
}
