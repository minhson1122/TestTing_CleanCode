package TinhLuongNhanVien;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Nhập thông tin nhận viên");
        Scanner input = new Scanner(System.in);
        System.out.println("tên nhận viên :");
        String name = input.nextLine();
        System.out.println("mã nhân viên :" );
        int id = input.nextInt();
        System.out.println("Số giờ làm việc trong tháng :" );
        double soGioLamViecTrongThang = input.nextDouble();
        System.out.println("Mưc lương cơ bản them giờ :");
        double MucLuongCoBanTheoGio = input.nextDouble();
        System.out.println("số giờ làm thêm là :");
        double soGioLamThem = input.nextDouble();
        System.out.println("Mức lương làm thêm theo giờ :");
        double MucLuongLamThemTheoGio = input.nextDouble();

        Employe nhanvien1 = new Employe(name,id,soGioLamViecTrongThang,MucLuongCoBanTheoGio,soGioLamThem,MucLuongLamThemTheoGio);
        System.out.println(nhanvien1.TongLuong());

    }
}
