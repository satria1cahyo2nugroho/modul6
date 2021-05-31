/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modul6;

/**
 *
 * @author User
 */
public class TumpukanApp {
   public static void main (String [] args){
       Tumpukan tumpukan=new Tumpukan(10);
       tumpukan.push(50);
       tumpukan.baca();
       System.out.println("");
       tumpukan.push(100);
       tumpukan.baca();
       tumpukan.pop();
       System.out.println("");
       tumpukan.push(60);
       tumpukan.baca();
       System.out.println("");
       tumpukan.push(80);
       tumpukan.baca();
       System.out.println("");
       tumpukan.pop();
       System.out.println("");
       tumpukan.baca();
       System.out.println("");
       long nilai1=tumpukan.peek();
       System.out.println("Nilai atas = "+nilai1);
   } 
}
