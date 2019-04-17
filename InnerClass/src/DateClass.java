import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.time.format.FormatStyle;
import java.time.format.DateTimeFormatter;
import java.time.LocalDate;
import java.time.LocalDateTime;

public class DateClass {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("请输入日期(yyyy-MM-dd) :");
        String str = br.readLine();
        int year = Integer.parseInt(str.substring(0, 4));
        int month = Integer.parseInt(str.substring(5, 7));
        int day = Integer.parseInt(str.substring(8, 10));

        LocalDate inputDate = LocalDate.of(year, month, day);
        inputDate = inputDate.plusDays(7);  
        System.out.println("用FormatStyle.MEDIUM格式输出日期:" +
                inputDate.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.MEDIUM)));

        System.out.println();

        LocalDateTime datetime = LocalDateTime.now();
        System.out.println("短日期:" + datetime.format(DateTimeFormatter.ofLocalizedDateTime(FormatStyle.SHORT, FormatStyle.SHORT)));
        System.out.println("中等日期:" + datetime.format(DateTimeFormatter.ofLocalizedDateTime(FormatStyle.MEDIUM, FormatStyle.MEDIUM)));
        System.out.println("长日期:" + datetime.format(DateTimeFormatter.ofLocalizedDateTime(FormatStyle.LONG, FormatStyle.LONG)));
        System.out.println("完整日期:" + datetime.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.FULL)));
        System.out.println();
        System.out.println("年份为原来加1年:" + datetime.plusYears(1));
        System.out.println("月份为原来加1月:" + datetime.plusMonths(1));
        System.out.println("天数为原来加1天:" + datetime.plusDays(1));
        System.out.println("小时为原来加1小时:" + datetime.plusHours(1));
    }
}
