/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package homework1;

/**
 *
 * @author Inspiron
 */
import java.util.Scanner;

public class Homework1 {

    public static void main(String[] args) {
        Scanner Ttsv = new Scanner(System.in);
        System.out.println("nhap ten: ");
        String ten = Ttsv.nextLine();

        System.out.println("mhap tuoi: ");
        int tuoi = Ttsv.nextInt();
        Ttsv.nextLine(); // Consume the newline

        System.out.println("nhap gioi tinh (Nam/nu): ");
        String gioitinh = Ttsv.nextLine();

        System.out.println("nhap chuyen nganh: ");
        String chuyennganh = Ttsv.nextLine();

        System.out.println("nhap que quan: ");
        String quequan = Ttsv.nextLine();

        System.out.println("nhap GPA: ");
        String gpa = Ttsv.nextLine();

        System.out.println("ten: " + ten);
        System.out.println("tuoi: " + tuoi);
        System.out.println("gioi tinh: " + gioitinh);
        System.out.println("chuyen nganh: " + chuyennganh);
        System.out.println("GPA: " + gpa);
        System.out.println("que quan: " + quequan);

        Ttsv.close();
    }

}
