/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package homework1;

import java.util.Scanner;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
/**
 *
 * @author Inspiron
 */
import java.util.Scanner;

public class homeworkSao {

    public static void main(String[] args) throws ParseException {
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

        SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");

        System.out.print("nhap ngay thang năm sinh (dd/MM/yyyy): ");
        String dateInput = Ttsv.nextLine();

        Date date = formatter.parse(dateInput);

        System.out.println("ten: " + ten);
        System.out.println("tuoi: " + tuoi);
        System.out.println("gioi tinh: " + gioitinh);
        System.out.println("Ngay sinh: " + formatter.format(date));
        System.out.println("que quan: " + quequan);
        System.out.println("chuyen nganh: " + chuyennganh);
        System.out.println("GPA: " + gpa);
       

        Ttsv.close();
    }
}
