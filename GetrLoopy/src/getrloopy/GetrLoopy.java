/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package getrloopy;
import java.util.Scanner;
/**
 *
 * @author Administrator
 */
public class GetrLoopy {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         Scanner in = new Scanner(System.in);
         
         for(int r=0; r < 31; r++)
         {
             System.out.println("" + r);
         }
         System.out.println("----------");
         for(int r = 30; r > 0; r--)
         {
             System.out.println("" + r);
         }
         System.out.println("----------");
         for(int r=0; r < 19; r+= 3)   
         {
             System.out.println("" + r);
         }
         System.out.println("----------");
         for(int r=10; r > -1; r-=2)
         {
             System.out.println("" + r);
         }
    }
    
}
