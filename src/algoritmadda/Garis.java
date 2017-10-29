/*k;
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package algoritmadda;

import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JPanel;

/**
 *
 * @author DIF
 */
public class Garis extends JPanel {
    //Menentukan titik awal dan akhir
    private int x1,y1,x2,y2;
    
    //atur set get dari titik awal dan titik akhir
    public int getx1() {
        return x1;
    }
    
    public int getx2() {
        return x2;
    }
    
    public int gety1() {
        return y1;
    }
    
    public int gety2() {
        return y2;
    }
    
    public void setx1(int xa) {
        x1 = xa;
    }
    
    public void sety1(int ya) {
        y1 = ya;
    }
    
    public void setx2(int xb) {
        x2 = xb;
    }
    
    public void sety2(int yb) {
        y2 = yb;
    }
    public void paintComponent(Graphics g) {
        int x, y, steps, k;
        x = x1;
        y = y1;
        
//menghitung dx dan dy
        int dx = Math.abs(x2-x1);
        int dy = Math.abs(y2-y1);
        
        //menghitung steps
        if (dx > dy){
            steps = dx;
        }else
            steps = dy;
        
        //hitung perubahan nilai x (x_inc) dan y (y_inc)atau penambahan titik x dan y
        float x_inc,y_inc;
        x_inc = dx/(float)steps;
        y_inc = dy/(float)steps;
        
            //Gambar Titik Awal
            //tampilan ketebalan garis dan warna garis
            g.drawRect(x, y, 17, 3);
            g.setColor(Color.YELLOW);
            
        //looping untuk menggambar titik-titik    
        for(k=0;k<steps;k++){
            x += x_inc; //x = x + x_inc ; hasil perhitungan x_inc dan y_inc dibulatkan
            y += y_inc; //y = y + y_inc
            
            //Gambar Setelah dilakukan Penambahan
            //tampilan ketebalan garis dan warna garis
            g.drawRect(x, y, 17, 3);
            g.setColor(Color.RED);
            
        }
        
    }
    
}
