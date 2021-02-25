public class Student {
    public int maSinhVien;
    public String name;
    public float lyThuyet;
    public float thucHanh;

    public Student(int maSinhVien, String name, float lyThuyet, float thucHanh) {
        this.maSinhVien = maSinhVien;
        this.name = name;
        this.lyThuyet = lyThuyet;
        this.thucHanh = thucHanh;
        System.out.println("Tên sinh viên: "+name+"\nMã sinh viên: "+maSinhVien+"\nĐiểm lý thuyết: "+lyThuyet+"\nĐiểm thực hành: "+thucHanh);
        this.trungBinh(lyThuyet, thucHanh);
    }

    public Student() {
        
    }

    public void trungBinh(float lyThuyet, float thucHanh) {
        float trungBinh = (lyThuyet + thucHanh) / 2;
        System.out.println(
                "Điểm trung bình của sinh viên " + name + " là " + trungBinh);
    }
}
