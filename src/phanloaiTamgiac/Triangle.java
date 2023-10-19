package phanloaiTamgiac;

import java.util.Scanner;

public class Triangle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("-----Tạo một tam giác-----");
        System.out.println("Nhập vào cạnh A");
        int canhA = input.nextInt();
        System.out.println("Nhập vào cạnh B");
        int canhB = input.nextInt();
        System.out.println("Nhập vào cạnh C");
        int canhC = input.nextInt();


        if ((canhA + canhB > canhC) && (canhB + canhC > canhA) && (canhA + canhC > canhB)) {
            if ((canhA == canhB) && (canhB == canhC)) {
                System.out.println("Tam giác đều!");
            } else if ((canhA == canhB) || (canhA == canhC) || (canhB == canhC)) {
                System.out.println("Tam giác cân!");
            } else if ((canhA * canhA == canhB * canhB + canhC * canhC) ||
                    (canhB * canhB == canhA * canhA + canhC * canhC) ||
                    (canhC * canhC == canhA * canhA + canhB * canhB)) {
                System.out.println("Tam giác vuông!");
            } else if (((canhA * canhA + canhB * canhB == canhC * canhC) && (canhA == canhB)) ||
                    ((canhA * canhA + canhC * canhC == canhB * canhB) && (canhA == canhC)) ||
                    ((canhB * canhB + canhC * canhC == canhA * canhA) && (canhB == canhC))) {
                System.out.println("Tam giác vuông cân!");
            } else {
                System.out.println("Tam giác thường!");
            }
        } else {
            System.out.println("3 cạnh của tam giác không thỏa mãn điều kiện lập thành tam giác!");
        }
        }

    }



