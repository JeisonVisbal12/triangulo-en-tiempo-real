
package triangulo;


/**
 *
 * @author JEISON VISBAL
 */
import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.GeneralPath;

public class Triangulo extends javax.swing.JPanel {
int valX1=0, valX2=0, valX3=0,valY1=0,valY2=0,valY3=0;
int R1=0,G1=0,B1=0,R2=0,R3=0,G2=0,G3=0,B2=0,B3=0;
public Triangulo(){
initComponents();
}
public void paint(Graphics g){
 int valX[] = {valX1*15,valX2*15,valX3*15};
 int valY[] = {450-(valY1*15), 450-(valY2*15),450-(valY3*15)};
 super.paint(g);
 Color Puntos = new Color(R1,G1,B1);
 Color Bordes = new Color(R2,G2,B3);
 Color relleno = new Color(R3,G3,B3);
 Graphics2D g2d = (Graphics2D)g;
 g2d.setColor(Color.GRAY);
 g2d.drawLine(15, 0, 15, 450);g2d.drawLine(0, 15, 450, 15);
 g2d.drawLine(30, 0, 30, 450);g2d.drawLine(0, 30, 450, 30);
 g2d.drawLine(45, 0, 45, 450);g2d.drawLine(0, 45, 450, 45);
 g2d.drawLine(60, 0, 60, 450);g2d.drawLine(0, 60, 450, 60);
 g2d.drawLine(75, 0, 75, 450);g2d.drawLine(0, 75, 450, 75);
 g2d.drawLine(90, 0, 90, 450);g2d.drawLine(0, 90, 450, 90);
 g2d.drawLine(105, 0, 105, 450);g2d.drawLine(0, 105, 450, 105);
 g2d.drawLine(120, 0, 120, 450);g2d.drawLine(0, 120, 450, 120);
 g2d.drawLine(135, 0, 135, 450);g2d.drawLine(0, 135, 450, 135);
 g2d.drawLine(150, 0, 150, 450);g2d.drawLine(0, 150, 450, 150);
 g2d.drawLine(165, 0, 165, 450);g2d.drawLine(0, 165, 450, 165);
 g2d.drawLine(180, 0, 180, 450);g2d.drawLine(0, 180, 450, 180);
 g2d.drawLine(195, 0, 195, 450);g2d.drawLine(0, 195, 450, 195);
 g2d.drawLine(210, 0, 210, 450);g2d.drawLine(0, 210, 450, 210);
 g2d.drawLine(225, 0, 225, 450);g2d.drawLine(0, 225, 450, 225);
 g2d.drawLine(240, 0, 240, 450);g2d.drawLine(0, 240, 450, 240);
 g2d.drawLine(255, 0, 255, 450);g2d.drawLine(0, 255, 450, 255);
 g2d.drawLine(270, 0, 270, 450);g2d.drawLine(0, 270, 450, 270);
 g2d.drawLine(285, 0, 285, 450);g2d.drawLine(0, 285, 450, 285);
 g2d.drawLine(300, 0, 300, 450);g2d.drawLine(0, 300, 450, 300);
 g2d.drawLine(315, 0, 315, 450);g2d.drawLine(0, 315, 450, 315);
 g2d.drawLine(330, 0, 330, 450);g2d.drawLine(0, 330, 450, 330);
 g2d.drawLine(345, 0, 345, 450);g2d.drawLine(0, 345, 450, 345);
 g2d.drawLine(360, 0, 360, 450);g2d.drawLine(0, 360, 450, 360);
 g2d.drawLine(375, 0, 375, 450);g2d.drawLine(0, 375, 450, 375);
 g2d.drawLine(390, 0, 390, 450);g2d.drawLine(0, 390, 450, 390);
 g2d.drawLine(405, 0, 405, 450);g2d.drawLine(0, 405, 450, 405);
 g2d.drawLine(420, 0, 420, 450);g2d.drawLine(0, 420, 450, 420);
 g2d.drawLine(435, 0, 435, 450);g2d.drawLine(0, 435, 450, 435);
 
 
 g2d.setStroke(new BasicStroke(3.0f));
 g2d.setColor(Bordes);
 g2d.drawLine(valX1*15, 450-(valY1*15), valX2*15, 450-(valY2*15));
 g2d.drawLine(valX1*15, 450-(valY1*15), valX3*15, 450-(valY3*15));
 g2d.drawLine(valX3*15, 450-(valY3*15), valX2*15, 450-(valY2*15));
 g2d.setStroke(new BasicStroke(5.0f));
 g2d.setColor(Puntos);
 g2d.drawLine(valX1*15, 450-(valY1*15), valX1*15, 450-(valY1*15));
 g2d.drawLine(valX3*15, 450 -(valY3*15), valX3*15,450-( valY3*15));
 g2d.drawLine(valX2*15, 450-(valY2*15), valX2*15, 450-(valY2*15));
 g.setColor(relleno);
 g.fillPolygon(valX, valY, 3);

}

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 450, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 450, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents
    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}
