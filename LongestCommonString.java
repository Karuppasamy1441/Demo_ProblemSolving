
//Implement a program to find the longest common substring
import java.util.Scanner;

public class LongestCommonString {
    public static String LongestSubstring(String str1, String str2) {
        int m = str1.length();
        int n = str2.length();
        int maxLength = 0;
        int endIndex = 0;

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                int tempLength = 0;
                while (i + tempLength < m && j + tempLength < n && str1.charAt(i + tempLength) == str2.charAt(j + tempLength)) {
                    tempLength++;
                }
                if (tempLength > maxLength) {
                    maxLength = tempLength;
                    endIndex = i + tempLength;
                }
            }
        }

        if (maxLength == 0) {
            return "No common substring found";
        }
        return str1.substring(endIndex - maxLength, endIndex);
    }
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        String str1 = in.nextLine();
        String str2 = in.nextLine();
        String result =LongestSubstring(str1, str2);
        System.out.println("Longest Common Substring : " + result);

    }
}



