package com.kenIT;

public class Main {

    public static void main(String[] args) {
        // charAt method()
        // return giá trị char của chuỗi tại 1 ví trị mình cần
//        String method = "charAt";
//        char ch = method.charAt(1);
//        System.out.println(ch);

        // compareTo method
        //Phương thức compareTo() so sánh các chuỗi cho trước với chuỗi hiện tại theo thứ tự từ điển. Nó trả về số dương, số âm hoặc 0.
        //Nếu chuỗi đầu tiên lớn hơn chuỗi thứ hai, nó sẽ trả về số dương (chênh lệch giá trị ký tự). Nếu chuỗi đầu tiên nhỏ hơn chuỗi thứ hai, nó sẽ trả về số âm và nếu chuỗi đầu tiên là bằng chuỗi thứ hai, nó trả về 0.
//        String s1 = "cba";
//        String s2 = "cba";
//        String s3 = "baa";
//        String s4 = "daa";
//        System.out.println(s1.compareTo(s2));
//        System.out.println(s1.compareTo(s3));
//        System.out.println(s1.compareTo(s4));

        // concat method()
        //Phương thức concat() nối thêm chuỗi được chỉ định vào cuối chuỗi đã cho.
//        String s1 = "Hello World";
//        String s2 = "VN";
//       s1 = s1.concat(s2);
//        System.out.println(s1);
        // contains method()
        // Phương thức contains() tìm kiếm chuỗi ký tự trong chuỗi này. Nó trả về true nếu chuỗi các giá trị char được tìm thấy trong chuỗi này, nếu không trả về false.
        // contains(): tìm kiếm tuyệt đối
//        String s1 = "Hello World";
//        String s2 = "No way";
//        System.out.println(s1.contains(s2));
//        System.out.println(s1.contains("He"));
//        System.out.println(s1.contains("he"));

        // endsWith method()
        // Phương thức endsWith() kiểm tra nếu chuỗi này kết thúc với hậu tố nhất định. Nó trả về true nếu chuỗi này kết thúc với hậu tố đã cho, nếu khác thì trả về false.
//        String s1 = "Hello World";
//        System.out.println(s1.endsWith("d"));
//        System.out.println(s1.endsWith("ld"));
//        System.out.println(s1.endsWith("orld"));
//        System.out.println(s1.endsWith("rld"));
//        System.out.println(s1.endsWith("World"));
//        System.out.println(s1.endsWith("Hello World"));
//        System.out.println(s1.endsWith("o World"));

        // equals method
        //Phương thức equals() so sánh hai chuỗi đưa ra dựa trên nội dung của chuỗi. Nếu hai chuỗi khác nhau nó trả về false. Nếu hai chuỗi bằng nhau nó trả về true.
        //
        //Phương thức equals() của lớp String được ghi đè từ phương thức equals() của lớp Object.
//        String s1 = "Hello World";
//        String s2 = "hello world";
//        String s3 = "Hello World";
//        String s4 = "Hello";
//        String s5 = "World";
//        System.out.println(s1.equals(s2));
//        System.out.println(s1.equals(s3));
//        System.out.println(s1.equals(s4));
//        System.out.println(s1.equals(s5));

        // equalsIgnoreCase method
        // Phương thức equalsIgnoreCase() so sánh hai chuỗi đưa ra dựa trên nội dung của chuỗi không phân biệt chữ hoa và chữ thường. Nếu hai chuỗi khác nhau nó trả về false. Nếu hai chuỗi bằng nhau nó trả về true.
//        String s1 = "Hello World";
//        String s2 = "Hello World";
//        String s3 = "hello world";
//        String s4 = "HelloWorld";
//        String s5 = "World";
//        System.out.println(s1.equalsIgnoreCase(s2));
//        System.out.println(s1.equalsIgnoreCase(s3));
//        System.out.println(s1.equalsIgnoreCase(s4));
//        System.out.println(s1.equalsIgnoreCase(s5));

        // format method
        //Phương thức formart() trả về một chuỗi được format theo miền địa phương.
        //
        //Nếu bạn không chỉ định miền địa phương trong phương thức String.format(), nó sử dụng miền mặc bằng cách gọi phương thức Locale.getDefault().
        //
        //Phương thức format() của ngôn ngữ java là giống như hàm sprintf() trong C và printf() trong Java.
//        String name = "noo";
//        String sf1 = String.format("name is %s", name);
//        String sf2 = String.format("value is %f", 32.33434);
//        String sf3 = String.format("value is %32.8f", 32.33434);
//
//        System.out.println(sf1);
//        System.out.println(sf2);
//        System.out.println(sf3);

        // getBytes method
        String s1 = "AABC";
        byte[] barr = s1.getBytes();
        for (int i = 0; i < barr.length; i++) {
            System.out.println(barr[i]);
        }
    }
}
