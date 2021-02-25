

public class App {
    public static void main(String[] args) throws Exception {
        Student student = new Student();
        System.out.println("Sinh viên thứ nhất: ");
        student.name = "Đức";
        student.lyThuyet = 10;
        student.thucHanh = 9;
        student.maSinhVien = 100;
        System.out.println("Tên sinh viên: "+student.name+"\nMã sinh viên: "+student.maSinhVien+"\nĐiểm lý thuyết: "+student.lyThuyet+"\nĐiểm thực hành: "+student.thucHanh);
        student.trungBinh(student.lyThuyet, student.thucHanh);

        Student student2 = new Student();
        System.out.println("\nSinh viên thứ hai: ");
        student2.name = "Linh";
        student2.lyThuyet = 8;
        student2.thucHanh = 10;
        student2.maSinhVien = 110;
        System.out.println("Tên sinh viên: "+student2.name+"\nMã sinh viên: "+student2.maSinhVien+"\nĐiểm lý thuyết: "+student2.lyThuyet+"\nĐiểm thực hành: "+student2.thucHanh);
        student2.trungBinh(student2.lyThuyet, student2.thucHanh);

        Student student3 = new Student();
        System.out.println("\nSinh viên thứ ba: ");
        student3.name = "Tây";
        student3.lyThuyet = 9;
        student3.thucHanh = 1;
        student3.maSinhVien = 120;
        System.out.println("Tên sinh viên: "+student3.name+"\nMã sinh viên: "+student3.maSinhVien+"\nĐiểm lý thuyết: "+student3.lyThuyet+"\nĐiểm thực hành: "+student3.thucHanh);
        student3.trungBinh(student3.lyThuyet, student3.thucHanh);

        System.out.println("\nSinh viên thứ tư: ");
        Student student4 = new Student(0, "Crypto", 10, 10);
        
    }

}
