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
//        String s1 = "AABC";
//        byte[] barr = s1.getBytes();
//        for (int i = 0; i < barr.length; i++) {
//            System.out.println(barr[i]);
//        }

        // getChars method
        //Phương thức getChars() sao chép nội dung của chuỗi thành mảng Char cụ thể. Có 4 đối số truyền vào phương thức getChars().
        // srcBegin : vị trí bắt đầu sao chép
        // srcEnd : vị trí cuối cùng sao chép
        // mảng được sao chép
        // dstBegin : vị trí bắt đầu gắn vào
//        String str = "hello Java how are you?";
//        char[] ch = new char[4];
//        try {
//            str.getChars(6, 10, ch, 0);
//            System.out.println(ch);
//        }catch (Exception e){
//            System.out.println(e);
//        }

        // indexOf method
        // Phương thức indexOf() trả về chỉ số của giá trị ký tự đã cho hoặc chuỗi con. Nếu không tìm thấy trả lại giá trị -1. Chỉ số (index) được đếm từ 0.
//        String s1 = "this is index of example";

        //Truyền vào giá trị Char
//        int index1 = s1.indexOf('i');
//        System.out.println(index1);

        //Truyền vào chuỗi con và chỉ số bắt đầu
//        int index2 = s1.indexOf("is",4);
//        System.out.println(index2);

        //Truyền vào chuỗi con
//        int index3 = s1.indexOf("this");
//        System.out.println(index3);

        //intern method
        //Phương thức intern() có thể được sử dụng để trả về chuỗi từ Pool chứa hằng số chuỗi khi nó được tạo bởi từ khóa new.
//        String s1 = new String("hello");
//        String s2 = "hello";
//        String s3 = s1.intern();
//        System.out.println(s1 == s2);
//        System.out.println(s2 == s3);


        // isEmpty method
        //Phương thức isEmpty() khi chuỗi trống trả về true, ngược lại trả về false.
        //
        //Phương thức isEmpty() của lớp String được tích hợp từ phiên bản JDK 1.6.
//        String s1 = "";
//        String s2 = "hello";
//        System.out.println(s1.isEmpty());
//        System.out.println(s2.isEmpty());


        // join method
        //Phương thức join() trả về một chuỗi được nối với nhau bởi dấu phân tách. Trong phương thức join chuỗi, dấu phân cách được sử dụng cho mỗi chuỗi được nối. Trong trượng hợp chuỗi = null, giá trị "null" được thêm vào. Phương thức join() được tích hợp từ JDK 1.8
//        String s1 = String.join(",","wel","wel");
//        System.out.println(s1);


        // lastIndexOf method
        //Phương thức lastIndexOf() trả vể chỉ số cuối của ký tự hoặc chuỗi con. Nếu không tìm thấy trả về -1. Giá trị index được tính từ 0.
//        String s1 = "this is index of example";
//        int index = s1.lastIndexOf("e");
//        System.out.println(index);


        // length method
        //Phương thức length () trả về độ dài của chuỗi (tổng số ký tự theo mã unicode).
//        String s1 = "Ronaldo";
//        System.out.println(s1.length());

        // replace method
        //Phương thức replace() được sử dụng để thay thế tất cả các ký tự hoặc chuỗi cũ thành ký tự hoặc chuỗi mới.
        //
        //Phương thức replace() được tích hợp từ JDK 1.5.

//        String s1 = "I am buddhist";
//        s1 =s1.replace('t','s');
//        System.out.println(s1);
//
//        String s2 = "I am buddhist";
//        s2 = s2.replace("no","is");
//        System.out.println(s2);

        // replaceAll method
        //Phương thức replaceAll() trả về một chuỗi thay thế tất cả các chuỗi ký tự phù hợp với regex.
//        String s1 = "I am buddhist";
//        String s2 = "can";
//        s1 = s1.replaceAll("am","is");
//        s2 = s2.replaceAll("can",s1);
//        System.out.println(s1);
//        System.out.println(s2);

        // split method
        //Phương thức split() tách chuỗi này theo biểu thức chính quy(regular expression) và trả về mảng chuỗi.
//        String s1 = "java is true false true";
//        String[] words = s1.split("\\s");
//        for (String w:
//             words) {
//            System.out.println(w);
//        }
//
//        // limit chia theo số lần có thể chia
//        for (String w : s1.split("\\s", 2)) {
//            System.out.println(w);
//        }

        //startsWith method
        //Phương thức startsWith() được sử dụng để kiểm tra tiền tố của chuỗi có khớp với giá trị tiền tố đã nhập không, nếu đúng trả về true, sai trả về false.
        String s1 = "Welcome to Java";
        System.out.println(s1.startsWith("W"));
        System.out.println(s1.startsWith("Welcome"));
        System.out.println(s1.startsWith("Welcome",0));

    }
}

