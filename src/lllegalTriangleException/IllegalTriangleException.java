package lllegalTriangleException;

import sun.security.krb5.SCDynamicStoreConfig;

import java.util.Scanner;

public class IllegalTriangleException {
    public static void main(String[] args) {
        boolean check = true;
        while (check) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Nhập 3  cạnh a,b,c của tam giác:");
            System.out.println("a:");
            int a = scanner.nextInt();
            System.out.println("b:");
            int b = scanner.nextInt();
            System.out.println("c:");
            int c = scanner.nextInt();

if (a<0&&b<0&&c<0&&a+b>c&&a+c>b&&c+b>a){
    System.out.println("a,b,c không là 3 cạnh của tam giác");
}else {
    System.out.println("a,b,c  là 3 cạnh của tam giác");
}
        }
    }
}
