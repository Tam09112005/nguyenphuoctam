
package baitap4;

import java.util.Scanner;


public class Baitap4 {

    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập một chuỗi: ");
        if (scanner.hasNext()) {
            String input = scanner.next();
            System.out.println("Bạn đã nhập chuỗi: " + input);
        } else {
            System.out.println("Đầu vào không phải là chuỗi.");
        }
    }
    
}
