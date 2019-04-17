import java.lang.String;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class StringOperator {

    public static int countLetters(String str, char letter) {
        // 统计字母出现的次数
        int appearNum = 0;

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == letter)
                appearNum++;
        }

        return appearNum;
    }

    public static void toUpper(String str) {
        String word = null;
        StringBuilder strB = new StringBuilder();

        Pattern pattern = Pattern.compile("([a-z])([a-z]*)");
        Matcher matcher = pattern.matcher(str);

        while (matcher.find()) {
            word = matcher.group();
            word = word.substring(0, 1).toUpperCase() + word.substring(1);
            strB.append(word).append(" ");
        }
        System.out.println("首字母大写 : " + strB.toString());
    }

    public static void reverseString(String str) {
       
        System.out.print("For循环逆序输出字符串 : ");
        for (int i = str.length() - 1; i >= 0; i--) {
            System.out.print(str.charAt(i));
        }
        System.out.println();

        // 使用StringBuilder逆序输出字符串
        StringBuilder sb = new StringBuilder(str);
        System.out.println("StringBuilder逆序输出字符串 : " + sb.reverse());
    }

    public static void stringToWord(String str) {
        
        String[] wordStrArr = str.split(" ");

        // 输出字符串数组
        System.out.print("转换为字符串数组 : ");
        for (int i = 0; i < wordStrArr.length; i++) {
            System.out.print(wordStrArr[i] + "-");
        }
        System.out.println();
    }

    public static void main(String[] args) {

        String str = new String("this is a test of java");
        char letter = 'a';

        System.out.println("a出现的次数 : " + countLetters(str, letter));
        char[] str1 = str.toCharArray();
        System.out.print("本字符串复制到字符数组 : ");
        for (int i = 0; i < str1.length; i++) {
            System.out.print(str1[i]);
        }
        System.out.println();
        toUpper(str);
        reverseString(str);
        stringToWord(str);

    }
}
