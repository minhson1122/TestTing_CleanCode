package TinhLuongNhanVien;

public class Employe {
    private String name ;
    private int id;
    private double soGioLamViecTrongThang;
    private double mucLuongCoBanTheoGio;
    private double soGiolamThem;
    private double mucLuongLamThemTheoGio;

    public Employe(String name, int id, double soGioLamViecTrongThang, double mucLuongCoBanTheoGio, double soGiolamThem, double mucLuongLamThemTheoGio) {
        this.name = name;
        this.id = id;
        this.soGioLamViecTrongThang = soGioLamViecTrongThang;
        this.mucLuongCoBanTheoGio = mucLuongCoBanTheoGio;
        this.soGiolamThem = soGiolamThem;
        this.mucLuongLamThemTheoGio = mucLuongLamThemTheoGio;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getSoGioLamViecTrongThang() {
        return soGioLamViecTrongThang;
    }

    public void setSoGioLamViecTrongThang(double soGioLamViecTrongThang) {
        this.soGioLamViecTrongThang = soGioLamViecTrongThang;
    }

    public double getMucLuongCoBanTheoGio() {
        return mucLuongCoBanTheoGio;
    }

    public void setMucLuongCoBanTheoGio(double mucLuongCoBanTheoGio) {
        this.mucLuongCoBanTheoGio = mucLuongCoBanTheoGio;
    }

    public double getSoGiolamThem() {
        return soGiolamThem;
    }

    public void setSoGiolamThem(double soGiolamThem) {
        this.soGiolamThem = soGiolamThem;
    }

    public double getMucLuongLamThemTheoGio() {
        return mucLuongLamThemTheoGio;
    }

    public void setMucLuongLamThemTheoGio(double mucLuongLamThemTheoGio) {
        this.mucLuongLamThemTheoGio = mucLuongLamThemTheoGio;
    }
    public double LuongCoBan(){
      return this.soGioLamViecTrongThang * this.mucLuongLamThemTheoGio;
    }
    public double LuongLamThem(){
        return this.soGiolamThem * this.mucLuongLamThemTheoGio;
    }
    public double TongLuong(){
        return this.LuongCoBan() + this.LuongLamThem();
    }

    @Override
    public String toString() {
        return "Employe{" +
                "name='" + name + '\'' +
                ", id=" + id +
                ", soGioLamViecTrongThang=" + soGioLamViecTrongThang +
                ", mucLuongCoBanTheoGio=" + mucLuongCoBanTheoGio +
                ", soGiolamThem=" + soGiolamThem +
                ", mucLuongLamThemTheoGio=" + mucLuongLamThemTheoGio +
                '}';
    }
}
