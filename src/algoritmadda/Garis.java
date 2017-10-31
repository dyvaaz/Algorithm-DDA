
package algoritmadda;

import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JPanel;


public class Garis extends JPanel {
    //Menentukan titik awal dan akhir
    private int x1,y1,x2,y2;
    
    //atur set dari titik awal dan titik akhir
 public void setx1y1(int x1, int y1) {
        this.x1 = x1;
        this.y1 = y1;
    }

    public void setx2y2(int x2, int y2) {
        this.x2 = x2;
        this.y2 = y2;
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
