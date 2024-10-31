/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package homework1;

import java.util.Scanner;

/**
 *
 * @author Inspiron
 */
import java.util.Scanner;
public class homework3 {
    public static void main(String[]args){
    
      Scanner kitu = new Scanner(System.in);
       int so;
  System.out.println("nhap vao ki tu: ");
  so = kitu.nextInt();
  System.out.println(so);
  if(kitu.hasNextInt(so)==true) System.out.println("day la so nguyen");
          else System.out.println("day khong phai 1 so nguyen");
      
       kitu.close();
     
      
   }
}


