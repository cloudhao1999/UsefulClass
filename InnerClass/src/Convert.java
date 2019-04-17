public class Convert {
    public static void main(String[] args) {

        int num = 100;
        Integer num2 = new Integer(233);
        String str = new String("250");

        // 包装类与基本数据类型的转换
        Integer interNum = new Integer(num);  
        int basicNum1 = num2.intValue();  

        // 包装类和字符串互相转换
        String str1 = num2.toString();  // Integer转换String
        Integer interNum1 = Integer.valueOf(str); // String类型转Integer

        // 基本数据类型和字符串互相转换
        String str3 = Integer.toString(num);  // int类型转换为String类型方法1

        int basicNum2 = Integer.parseInt(str);  // String类型转换为int类型方法1
    }
}
