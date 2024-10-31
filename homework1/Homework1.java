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
import java.util.Date;

public class Homework1 {

    public static void main(String[] args) {
        Scanner Ttsv = new Scanner(System.in);
        System.out.println("nhap ten");
        String ten = Ttsv.nextLine();
        System.out.println("nhap tuoi");
        int tuoi = Ttsv.nextInt();
        Ttsv.nextLine();
        System.out.println("nhap gioi tinh: ");
        Boolean gioitinh = Ttsv.nextBoolean();
         Ttsv.nextLine();
        System.out.println("nhap chuyen nganh");
        String chuyennganh = Ttsv.nextLine();
         Ttsv.nextLine();
        System.out.println("nhap que quan");
        String quequan = Ttsv.nextLine();
         Ttsv.nextLine();
          System.out.println("nhap GPA ");
        String gpa = Ttsv.nextLine();
         Ttsv.nextLine();
        System.out.println("ten: " + ten);
        System.out.println("tuoi: " + tuoi);
        if (gioitinh == true) {
            System.out.println("gioitinh: Nam");
        } else {
            System.out.println("gioitinh: Nu");
        }
  System.out.println ("chuyen nganh"+chuyennganh);
System.out.println("GPA: "+gpa);
System.out.println("que quan: "+quequan);


        Ttsv.close();
    }

}
