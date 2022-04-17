package com.kenIT;

public class Main {

    public static void main(String[] args) {
        // charAt method()
        // return giá trị char của chuỗi tại 1 ví trị mình cần
        String method = "charAt";
        char ch = method.charAt(1);
        System.out.println(ch);

        // compareTo method
        //Phương thức compareTo() so sánh các chuỗi cho trước với chuỗi hiện tại theo thứ tự từ điển. Nó trả về số dương, số âm hoặc 0.
        //Nếu chuỗi đầu tiên lớn hơn chuỗi thứ hai, nó sẽ trả về số dương (chênh lệch giá trị ký tự). Nếu chuỗi đầu tiên nhỏ hơn chuỗi thứ hai, nó sẽ trả về số âm và nếu chuỗi đầu tiên là bằng chuỗi thứ hai, nó trả về 0.
        String s1 = "cba";
        String s2 = "cba";
        String s3 = "baa";
        String s4 = "daa";
        System.out.println(s1.compareTo(s2));
        System.out.println(s1.compareTo(s3));
        System.out.println(s1.compareTo(s4));
    }
}
