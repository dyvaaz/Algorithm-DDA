/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package algoritmadda;

import java.awt.Color;
import javax.swing.JFrame;

/**
 *
 * @author DIF
 */
public class mainDDA {

    public static void main(String[] args) {
        // TODO code application logic here
        JFrame frame = new JFrame("Algoritma DDA");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //Memanggil fungsi garis yang ada di class Garis
        Garis hasil = new Garis();
        
        //menampilkan hasil dari garis dan mengatur titik
        hasil.setx1y1(30,50);
        hasil.setx2y2(180,100);
        
        
        //Menampilkan Frame
        frame.add(hasil);
        frame.setBackground(Color.BLACK);
        frame.setSize(500,500);
        frame.setVisible(true);
        
    }
}
