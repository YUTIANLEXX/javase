package com.yutianle.object;

public class StringAPIdemo {
    public static void main(String[] args) {
        //1、public int length();  获取字符串长度
        String name = "我爱你中国love";
        System.out.println(name.length());

        //2、public char charAt(int index);  获取某个索引位置处的字符
        char c = name.charAt(1);
        System.out.println(c);

        System.out.println("---------遍历字符串中的每个字符---------");

        for (int i = 0; i < name.length(); i++) {
            char ch = name.charAt(i);
            System.out.print(ch + "\t");
        }

        //3、public char() toCharArray();  把字符串转换成字符数组
        char[] chars = name.toCharArray();
        System.out.println();
        for (int i = 0; i < chars.length; i++) {
            char ch = chars[i];
            System.out.print(ch + "\t");
        }

        //4、public String substring(int beginIndex, int endIndex);  截取内容，包前步包后
        System.out.println();
        String name2 = "JAVA是最厉害的编程语言";
        String rs = name2.substring(0,9);
        System.out.println(rs);

        //5、public String substring(int beginIndex); 从当前索引一直截取到末尾
        String rs1 = name2.substring(4);
        System.out.println(rs1);

        //6、public String replace(CharSequence target, CharSequence replacement)
        String name3 = "金三胖是最厉害的80后，金三胖胖胖的！我好爱金三胖";
        String rs3 = name3.replace("金三胖","***");
        System.out.println(rs3);

        //7、public boolean contains(CharSequence s);
        System.out.println(name3.contains("金三胖"));    //true

        //8、public boolean startsWith(String prefix)
        System.out.println(name3.startsWith("金三胖"));  //true

        //9、public String[] spList(String s);  按照某个内容把字符串分割成字符串数组返回
        String name4 = "王宝强,贾乃亮,陈羽凡";
        String[] names = name4.split(",");
        for (int i = 0; i < names.length; i++) {
            System.out.println("选择了：" + names[i]);
        }
    }
}
