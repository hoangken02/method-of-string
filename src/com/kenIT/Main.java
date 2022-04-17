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
        String s1 = "Hello World";
        System.out.println(s1.endsWith("d"));
        System.out.println(s1.endsWith("ld"));
        System.out.println(s1.endsWith("orld"));
        System.out.println(s1.endsWith("rld"));
        System.out.println(s1.endsWith("World"));
        System.out.println(s1.endsWith("Hello World"));
        System.out.println(s1.endsWith("o World"));
    }
}
