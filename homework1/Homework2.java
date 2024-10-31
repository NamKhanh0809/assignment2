/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package homework1;

/**
 *
 * @author Inspiron
 */
import java.util.Scanner;

public class Homework2 {
   public static void main(String[]args){
    
      Scanner kitu = new Scanner(System.in);
       String ten;
  System.out.println("nhap vao ki tu: ");
  ten = kitu.nextLine();
  System.out.println(ten);
  if(kitu.hasNext(ten)==true) System.out.println("day la chuoi");
          else System.out.println("day khong phai 1 chuoi");
      
       kitu.close();
     
      
   }
}
