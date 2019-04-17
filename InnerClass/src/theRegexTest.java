import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class theRegexTest {

    public static void binPhoneFormat(String phone) {
        // 检查一个电话号码是否符合(0000)0000-0000
        Pattern p1 = Pattern.compile("\\(\\d{4}\\)(\\d{4})-(\\d{4})");
        Matcher m1 = p1.matcher(phone);

        if (m1.matches())
            System.out.println(phone + "合法");
        else
            System.out.println(phone + "不合法");


    }

    public static void main(String[] args) {
        binPhoneFormat("(1350)6500-1140");
        binPhoneFormat("1234-56789-1011");
    }
}
