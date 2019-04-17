import java.lang.String;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class StringOperator {

    public static int statLetterTime(String str, char letter) {
        // 统计字母出现的次数
        int appearNum = 0;

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == letter)
                appearNum++;
        }

        return appearNum;
    }

    public static void regexToUpper(String str) {
        // 利用正则表达式将字符串每个单词首字母转换为大写
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
        // 使用for循环逆序输出字符串
        System.out.print("For循环逆序输出字符串 : ");
        for (int i = str.length() - 1; i >= 0; i--) {
            System.out.print(str.charAt(i));
        }
        System.out.println();

        // 使用StringBuilder逆序输出字符串
        StringBuilder sb = new StringBuilder(str);
        System.out.println("StringBuilder逆序输出字符串 : " + sb.reverse());
    }

    public static void stringToWordArray(String str) {
        // 将字符串转换为字符串数组，每个元素都是单词tring
        String[] wordStrArr = str.split(" ");

        // 输出字符串数组
        System.out.print("转换为字符串数组 : ");
        for (int i = 0; i < wordStrArr.length; i++) {
            System.out.print(wordStrArr[i] + "-");
        }
        System.out.println();
    }

    public static void main(String[] args) {

        String mainStr = new String("this is a test of java");
        char letter = 's';

        System.out.println("字母s出现的次数 : " + statLetterTime(mainStr, letter));
        System.out.println("取出子串Test : " + mainStr.substring(10, 14));

        char[] newStr = mainStr.toCharArray();
        System.out.print("复制字符串到字符数组 : ");
        for (int i = 0; i < newStr.length; i++) {
            System.out.print(newStr[i]);
        }
        System.out.println();

        regexToUpper(mainStr);
        reverseString(mainStr);
        stringToWordArray(mainStr);

    }
}
