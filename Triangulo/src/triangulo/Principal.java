
package triangulo;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import javax.swing.Timer;


public class Principal extends javax.swing.JFrame {
int x1, x2,x3,y1,y2,y3;
int r1,g1,b1,r2,g2,b2,r3,g3,b3;
   
    public Principal() {
        initComponents();
        triangulo2.setVisible(true);
        timer.start();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        triangulo2 = new triangulo.Triangulo();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        X1 = new javax.swing.JTextField();
        Y1 = new javax.swing.JTextField();
        Y2 = new javax.swing.JTextField();
        X2 = new javax.swing.JTextField();
        Y3 = new javax.swing.JTextField();
        X3 = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        R1 = new javax.swing.JTextField();
        G1 = new javax.swing.JTextField();
        B1 = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        R2 = new javax.swing.JTextField();
        G2 = new javax.swing.JTextField();
        B2 = new javax.swing.JTextField();
        B3 = new javax.swing.JTextField();
        G3 = new javax.swing.JTextField();
        R3 = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        Perimetro = new javax.swing.JTextField();
        Area = new javax.swing.JTextField();
        Altura = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        triangulo2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        javax.swing.GroupLayout triangulo2Layout = new javax.swing.GroupLayout(triangulo2);
        triangulo2.setLayout(triangulo2Layout);
        triangulo2Layout.setHorizontalGroup(
            triangulo2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 448, Short.MAX_VALUE)
        );
        triangulo2Layout.setVerticalGroup(
            triangulo2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 448, Short.MAX_VALUE)
        );

        jLabel1.setText("Ingrese coordenadas");

        jLabel2.setText("Primer punto");

        jLabel3.setText("Segundo punto");

        jLabel4.setText("Tercer Punto");

        X1.setText("0");

        Y1.setText("0");

        Y2.setText("0");

        X2.setText("0");

        Y3.setText("0");

        X3.setText("0");

        jLabel5.setText("Ingrese valores de colores");

        R1.setText("0");

        G1.setText("0");

        B1.setText("0");

        jLabel6.setText("Puntos (R,G,B)");

        R2.setText("122");
        R2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                R2ActionPerformed(evt);
            }
        });

        G2.setText("122");

        B2.setText("122");

        B3.setText("255");

        G3.setText("255");

        R3.setText("255");

        jLabel7.setText("Lineas(R,G,B)");

        jLabel8.setText("Relleno(R,G,B)");

        Perimetro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PerimetroActionPerformed(evt);
            }
        });

        jLabel9.setText("Area");

        jLabel10.setText("Perimetro");

        jLabel11.setText("Altura");

        jLabel12.setText("La altura se calcula desde el lado mas largo");

        jLabel13.setText("0");

        jLabel14.setText("30");

        jLabel15.setText("30");

        jLabel16.setText("0");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel16)
                            .addComponent(jLabel15))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(triangulo2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addComponent(jLabel13)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel14)))
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(X1, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Y1, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel2)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(X3, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Y3, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(X2, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Y2, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel3)
                            .addComponent(jLabel4))
                        .addGap(41, 41, 41)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6)
                            .addComponent(jLabel8)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(R3, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(G3, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(B3, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(R2, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(G2, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(B2, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(R1, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(G1, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(B1, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addComponent(jLabel12)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Area, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel9))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel10)
                            .addComponent(Perimetro, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel11)
                            .addComponent(Altura, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(52, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(jLabel5))
                        .addGap(26, 26, 26)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(jLabel8))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(X1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Y1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(R3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(G3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(B3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(7, 7, 7)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(jLabel7))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(X2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Y2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(R2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(G2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(B2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(12, 12, 12)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(jLabel6))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(X3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Y3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(R1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(G1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(B1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(79, 79, 79)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Area, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Perimetro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Altura, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel9)
                            .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel11))
                        .addGap(32, 32, 32)
                        .addComponent(jLabel12))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(triangulo2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel15)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel16)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel14)
                            .addComponent(jLabel13))))
                .addContainerGap(36, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    Timer timer = new Timer(200,new ActionListener() {
    
    public void actionPerformed(ActionEvent e) {
    Graficar();
    }
});
    public void Graficar(){
         Validacion();
    Calcular();
    triangulo2.valX1 = x1;
    triangulo2.valX2 = x2;
    triangulo2.valX3 = x3;
    triangulo2.valY1 = y1;
    triangulo2.valY2 = y2;
    triangulo2.valY3 = y3;
    triangulo2.R1 = r1;
    triangulo2.G1 = g1;
    triangulo2.B1 = b1;
    triangulo2.R2 = r2;
    triangulo2.G2 = g2;
    triangulo2.B2 = b2;
    triangulo2.R3 = r3;
    triangulo2.G3 = g3;
    triangulo2.B3 = b3;
    triangulo2.repaint(); 
    }
    private void PerimetroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PerimetroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_PerimetroActionPerformed

    private void R2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_R2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_R2ActionPerformed
public void Validacion(){
   Valores();
   
    if(x1>30){
        JOptionPane.showMessageDialog(null, "El numero no puede ser mayor a 30","Valor invalido",JOptionPane.INFORMATION_MESSAGE);
        X1.setText("30");
        triangulo2.repaint();
    }
     if(x2>30){
        JOptionPane.showMessageDialog(null, "El numero no puede ser mayor a 30","Valor invalido",JOptionPane.INFORMATION_MESSAGE);
        X2.setText("30");
        triangulo2.repaint();
    }
      if(x3>30){
        JOptionPane.showMessageDialog(null, "El numero no puede ser mayor a 30","Valor invalido",JOptionPane.INFORMATION_MESSAGE);
        X3.setText("30");
        triangulo2.repaint();
    }
       if(y1>30){
        JOptionPane.showMessageDialog(null, "El numero no puede ser mayor a 30","Valor invalido",JOptionPane.INFORMATION_MESSAGE);
        Y1.setText("30");
        triangulo2.repaint();
    }
        if(y2>30){
        JOptionPane.showMessageDialog(null, "El numero no puede ser mayor a 30","Valor invalido",JOptionPane.INFORMATION_MESSAGE);
        Y2.setText("30");
        triangulo2.repaint();
    }
         if(y3>30){
        JOptionPane.showMessageDialog(null, "El numero no puede ser mayor a 30","Valor invalido",JOptionPane.INFORMATION_MESSAGE);
        Y3.setText("30");
        triangulo2.repaint();
    }
    
    if(r1>255){
        JOptionPane.showMessageDialog(null, "El numero no puede ser mayor a 255","Valor invalido",JOptionPane.INFORMATION_MESSAGE);
        R1.setText("255");
        triangulo2.repaint();
    }
    if(g1>255){
        JOptionPane.showMessageDialog(null, "El numero no puede ser mayor a 255","Valor invalido",JOptionPane.INFORMATION_MESSAGE);
        G1.setText("255");
        triangulo2.repaint();
    }
    if(b1>255){
        JOptionPane.showMessageDialog(null, "El numero no puede ser mayor a 255","Valor invalido",JOptionPane.INFORMATION_MESSAGE);
        B1.setText("255");
        triangulo2.repaint();
    }
    if(r2>255){
        JOptionPane.showMessageDialog(null, "El numero no puede ser mayor a 255","Valor invalido",JOptionPane.INFORMATION_MESSAGE);
        R2.setText("255");
        triangulo2.repaint();
    }
    if(g2>255){
        JOptionPane.showMessageDialog(null, "El numero no puede ser mayor a 255","Valor invalido",JOptionPane.INFORMATION_MESSAGE);
        G2.setText("255");
        triangulo2.repaint();
    }
    if(b2>255){
        JOptionPane.showMessageDialog(null, "El numero no puede ser mayor a 255","Valor invalido",JOptionPane.INFORMATION_MESSAGE);
        B2.setText("255");
        triangulo2.repaint();
    }
    if(r3>255){
        JOptionPane.showMessageDialog(null, "El numero no puede ser mayor a 255","Valor invalido",JOptionPane.INFORMATION_MESSAGE);
        R3.setText("255");
        triangulo2.repaint();
    }
    if(g3>255){
        JOptionPane.showMessageDialog(null, "El numero no puede ser mayor a 255","Valor invalido",JOptionPane.INFORMATION_MESSAGE);
        G3.setText("255");
        triangulo2.repaint();
    }
    if(b3>255){
        JOptionPane.showMessageDialog(null, "El numero no puede ser mayor a 255","Valor invalido",JOptionPane.INFORMATION_MESSAGE);
        B3.setText("255");
        triangulo2.repaint();
    }       
}
public void Calcular(){
Valores();
float distancia1 = (float) Math.pow((x2 - x1),2) + (float)Math.pow((y2-y1),2);
float dis1 = (float) Math.sqrt(distancia1);
float distancia2 = (float) Math.pow((x3 - x1),2) + (float)Math.pow((y3-y1),2);
float dis2 = (float) Math.sqrt(distancia2);
float distancia3 = (float) Math.pow((x2 - x3),2) + (float)Math.pow((y2-y3),2);
float dis3 = (float) Math.sqrt(distancia3);
float Total = dis1 + dis2 + dis3;
Perimetro.setText(String.format("%.2f",Total));
float area = (((x1*y2)+(x2*y3)+(x3*y1))-((x1*y3)+(x3*y2)+(x2*y1)))/2;
if(area < 0){
    area = -area;
    Area.setText(String.format("%.2f",area) + "a^2");
}else{
Area.setText(String.format("%.2f",area) + "a^2");
}
if(dis1 >=dis2 && dis1 >=dis3){
    
    float altura = (2*area)/dis1;
    Altura.setText(String.format("%.2f",altura));
  }
if(dis2 >=dis1 && dis2 >=dis3){
    float altura = (2*area)/dis2;
    Altura.setText(String.format("%.2f",altura));
  }
if(dis3 >=dis2 && dis3 >=dis1){
    float altura = (2*area)/dis3;
    Altura.setText(String.format("%.2f",altura));
  }
}

public void Valores(){
    if(X1.getText().length()==0){
    x1 =0;
    }else{
    x1 = (Integer.parseInt(X1.getText())+ 0);}
    if(X2.getText().length()==0){
    x2 =0;
    }else{
    x2 = (Integer.parseInt(X2.getText())+ 0);}
    if(X3.getText().length()==0){
    x3 =0;
    }else{
    x3 = (Integer.parseInt(X3.getText())+ 0);}
    if(Y1.getText().length()==0){
    y1 =0;
    }else{
    y1 = (Integer.parseInt(Y1.getText())+ 0);}
    if(Y2.getText().length()==0){
    y2 =0;
    }else{
    y2 = (Integer.parseInt(Y2.getText())+ 0);}
    if(Y3.getText().length()==0){
    y3 =0;
    }else{
    y3 = (Integer.parseInt(Y3.getText())+ 0); } 
    if(R1.getText().length()==0){
    r1 =0;
    }else{
    r1 = (Integer.parseInt(R1.getText())+ 0);}
    if(G1.getText().length()==0){
    g1 =0;
    }else{
    g1 = (Integer.parseInt(G1.getText())+ 0);}
    if(B1.getText().length()==0){
    b1 =0;
    }else{
    b1 = (Integer.parseInt(B1.getText())+ 0);}
    if(R2.getText().length()==0){
    r2 =0;
    }else{
    r2 = (Integer.parseInt(R2.getText())+ 0);}
    if(G2.getText().length()==0){
    g2 =0;
    }else{
    g2 = (Integer.parseInt(G2.getText())+ 0);}
    if(B2.getText().length()==0){
    b2 =0;
    }else{
    b2 = (Integer.parseInt(B2.getText())+ 0);}
    if(R3.getText().length()==0){
    r3 =0;
    }else{
    r3 = (Integer.parseInt(R3.getText())+ 0);}
    if(G3.getText().length()==0){
    g3 =0;
    }else{
    g3 = (Integer.parseInt(G3.getText())+ 0);}
    if(B3.getText().length()==0){
    b3 =0;
    }else{
    b3 = (Integer.parseInt(B3.getText())+ 0);}
    
}
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Principal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField Altura;
    private javax.swing.JTextField Area;
    private javax.swing.JTextField B1;
    private javax.swing.JTextField B2;
    private javax.swing.JTextField B3;
    private javax.swing.JTextField G1;
    private javax.swing.JTextField G2;
    private javax.swing.JTextField G3;
    private javax.swing.JTextField Perimetro;
    private javax.swing.JTextField R1;
    private javax.swing.JTextField R2;
    private javax.swing.JTextField R3;
    private javax.swing.JTextField X1;
    private javax.swing.JTextField X2;
    private javax.swing.JTextField X3;
    private javax.swing.JTextField Y1;
    private javax.swing.JTextField Y2;
    private javax.swing.JTextField Y3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private triangulo.Triangulo triangulo2;
    // End of variables declaration//GEN-END:variables
}
