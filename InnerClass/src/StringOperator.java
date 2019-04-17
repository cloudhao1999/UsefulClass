import java.lang.String;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class StringOperator {

    public static int LetterTime(String str, char letter) {
        // 统计字母出现次数
        int appearNum = 0;

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == letter)
                appearNum++;
        }

        return appearNum;
    }

    public static void toUpper(String str) {
        // 正则表达式将单词首字母转换为大写
        String word = null;
        StringBuilder sb = new StringBuilder();

        Pattern pattern = Pattern.compile("([a-z])([a-z]*)");
        Matcher matcher = pattern.matcher(str);

        while (matcher.find()) {
            word = matcher.group();
            word = word.substring(0, 1).toUpperCase() + word.substring(1);
            sb.append(word).append(" ");
        }
        System.out.println("字符串转换为首字母大写 : " + sb.toString());
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

        String Str = new String("this is a test of java");
        char letter = 's';

        System.out.println("字符串s出现的次数 : " + LetterTime(Str, letter));
        System.out.println("取出子字符串Test : " + Str.substring(10, 14));

        char[] str = Str.toCharArray();
        System.out.print("将本字符串复制到字符数组 : ");
        for (int i = 0; i < str.length; i++) {
            System.out.print(str[i]);
        }
        System.out.println();
        toUpper(Str);
        reverseString(Str);
        stringToWord(Str);

    }
}
