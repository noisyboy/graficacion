
package Unidad3;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Font;
import java.awt.GradientPaint;
import java.awt.Graphics2D;
import java.awt.geom.Rectangle2D;
import javax.swing.JOptionPane;

/**
 *
 * @author Eduardo
 */
public class Act_GraficaJFrame extends javax.swing.JFrame {

    /**
     * Creates new form Act_GraficaJFrame
     */
    public Act_GraficaJFrame() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jp_grafica = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txt_pedro = new javax.swing.JTextField();
        txt_pablo = new javax.swing.JTextField();
        btn_limpiar = new javax.swing.JButton();
        btn_graficar = new javax.swing.JButton();
        txt_pepe = new javax.swing.JTextField();
        txt_juan = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Grafica interactiva");
        setSize(new java.awt.Dimension(1200, 420));

        jp_grafica.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        javax.swing.GroupLayout jp_graficaLayout = new javax.swing.GroupLayout(jp_grafica);
        jp_grafica.setLayout(jp_graficaLayout);
        jp_graficaLayout.setHorizontalGroup(
            jp_graficaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 470, Short.MAX_VALUE)
        );
        jp_graficaLayout.setVerticalGroup(
            jp_graficaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        jLabel1.setFont(new java.awt.Font("Calibri", 0, 20)); // NOI18N
        jLabel1.setText("Calificaciones");

        jLabel2.setFont(new java.awt.Font("Calibri", 0, 16)); // NOI18N
        jLabel2.setText("Pepe");

        jLabel3.setFont(new java.awt.Font("Calibri", 0, 16)); // NOI18N
        jLabel3.setText("Juan");

        jLabel4.setFont(new java.awt.Font("Calibri", 0, 16)); // NOI18N
        jLabel4.setText("Pablo");

        jLabel5.setFont(new java.awt.Font("Calibri", 0, 16)); // NOI18N
        jLabel5.setText("Pedro");

        txt_pedro.setFont(new java.awt.Font("Calibri", 0, 16)); // NOI18N

        txt_pablo.setFont(new java.awt.Font("Calibri", 0, 16)); // NOI18N

        btn_limpiar.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btn_limpiar.setText("limpiar");
        btn_limpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_limpiarActionPerformed(evt);
            }
        });

        btn_graficar.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btn_graficar.setText("graficar");
        btn_graficar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_graficarMouseClicked(evt);
            }
        });

        txt_pepe.setFont(new java.awt.Font("Calibri", 0, 16)); // NOI18N

        txt_juan.setFont(new java.awt.Font("Calibri", 0, 16)); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(51, 51, 51)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(41, 41, 41)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel5)
                            .addComponent(jLabel4)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel3)
                                .addComponent(jLabel2)))
                        .addGap(23, 23, 23)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(txt_pablo)
                                .addComponent(txt_pedro, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(txt_pepe, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt_juan, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addComponent(btn_limpiar)
                        .addGap(18, 18, 18)
                        .addComponent(btn_graficar)))
                .addGap(18, 18, 18)
                .addComponent(jp_grafica, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jp_grafica, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(txt_pepe, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(txt_juan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txt_pedro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txt_pablo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4))
                        .addGap(30, 30, 30)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btn_limpiar)
                            .addComponent(btn_graficar))
                        .addGap(0, 136, Short.MAX_VALUE)))
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btn_graficarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_graficarMouseClicked
        // TODO add your handling code here:
        basegrafica();
        pepe();
        juan();
    }//GEN-LAST:event_btn_graficarMouseClicked

    private void btn_limpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_limpiarActionPerformed
        // TODO add your handling code here:
        limpiar();
    }//GEN-LAST:event_btn_limpiarActionPerformed
 
    public void limpiar(){
        txt_pepe.setText(null);
        
        txt_juan.setText(null);
        txt_pablo.setText(null);
        txt_pedro.setText(null); 
        jp_grafica.removeAll();
        jp_grafica.repaint();
    }
    
    public void basegrafica(){
        Graphics2D g2d = (Graphics2D)jp_grafica.getGraphics();
        
        g2d.setColor(Color.black);
        g2d.setStroke(new BasicStroke(3));
        g2d.drawLine(100, 98, 100, 298); //linea vertical
        g2d.drawLine(100, 298, 380, 298); //linea horizontal
        
        for (int i=278, j=i-268; i>=98; i=i-20,j=j+10) {
            g2d.drawLine(90, i, 110, i); 
            g2d.drawString(""+j, 60, i);
        }
        
        Font fuente = new Font("Seoge UI", Font.ITALIC, 15);
        g2d.setFont(fuente);
        g2d.drawString("Pepe", 120, 320);
        g2d.drawString("Juan", 195, 320);           
        g2d.drawString("Pedro", 250, 320);                
        g2d.drawString("Pablo", 315, 320);  
        
//                g2d.fillRect(195, 278, 50 , 20); //barra de juan                
//                g2d.fillRect(250, 278, 50 , 20); //barra de pedro               
//                g2d.fillRect(315, 278, 50 , 20); //barra de pablo
    }
    
    public void pepe() {
        int pepe;
        pepe = Integer.parseInt(txt_pepe.getText());
        
        Graphics2D g2d = (Graphics2D)jp_grafica.getGraphics();
        
        switch (pepe) {
            case 10:                    
                g2d.setPaint(new GradientPaint (145, 278, Color.yellow, 145, 298, Color.orange, true));
                g2d.fill( new Rectangle2D.Double( 120, 278, 50 , 20 ) ); //barra de pepe
            break; 
            case 20:
                g2d.setPaint(new GradientPaint (145, 258, Color.yellow, 145, 298, Color.orange, true));
                g2d.fill( new Rectangle2D.Double( 120, 258, 50 , 40 ) ); //barra de pepe
            break;
            case 30:
                g2d.setPaint(new GradientPaint (145, 238, Color.yellow, 145, 298, Color.orange, true));
                g2d.fill( new Rectangle2D.Double( 120, 238, 50 , 60 ) ); //barra de pepe
            break;
            case 40:
                g2d.setPaint(new GradientPaint (145, 218, Color.yellow, 145, 298, Color.orange, true));
                g2d.fill( new Rectangle2D.Double( 120, 218, 50 , 80 ) ); //barra de pepe
            break;
            case 50:
                g2d.setPaint(new GradientPaint (145, 198, Color.yellow, 145, 298, Color.orange, true));
                g2d.fill( new Rectangle2D.Double( 120, 198, 50 , 100 ) ); //barra de pepe
            break;
            case 60:
                g2d.setPaint(new GradientPaint (145, 178, Color.yellow, 145, 298, Color.orange, true));
                g2d.fill( new Rectangle2D.Double( 120, 178, 50 , 120 ) ); //barra de pepe
            break;
            case 70:
                g2d.setPaint(new GradientPaint (145, 158, Color.yellow, 145, 298, Color.orange, true));
                g2d.fill( new Rectangle2D.Double( 120, 158, 50 , 140 ) ); //barra de pepe
            break;
            case 80:
                g2d.setPaint(new GradientPaint (145, 138, Color.yellow, 145, 298, Color.orange, true));
                g2d.fill( new Rectangle2D.Double( 120, 138, 50 , 160 ) ); //barra de pepe
            break;
            case 90:
                g2d.setPaint(new GradientPaint (145, 118, Color.yellow, 145, 298, Color.orange, true));
                g2d.fill( new Rectangle2D.Double( 120, 118, 50 , 180 ) ); //barra de pepe
            break;
            case 100:
                g2d.setPaint(new GradientPaint (145, 98, Color.yellow, 145, 298, Color.orange, true));
                g2d.fill( new Rectangle2D.Double( 120, 98, 50 , 200 ) ); //barra de pepe
            break;
            default:
                JOptionPane.showMessageDialog(this, "error en la enreada de datos");
                limpiar();
            break;
        }        
    }
    
    public void juan() {
        int juan;
        juan = Integer.parseInt(txt_juan.getText());
        
        Graphics2D g2d = (Graphics2D)jp_grafica.getGraphics();
        
        switch (juan) {
            case 10:                    
                g2d.setPaint(new GradientPaint (220, 278, Color.yellow, 145, 298, Color.orange, true));
                g2d.fill( new Rectangle2D.Double( 195, 278, 50 , 20 ) ); //barra de pepe
            break; 
            case 20:
                g2d.setPaint(new GradientPaint (220, 258, Color.yellow, 145, 298, Color.orange, true));
                g2d.fill( new Rectangle2D.Double( 195, 258, 50 , 40 ) ); //barra de pepe
            break;
            case 30:
                g2d.setPaint(new GradientPaint (220, 238, Color.yellow, 145, 298, Color.orange, true));
                g2d.fill( new Rectangle2D.Double( 195, 238, 50 , 60 ) ); //barra de pepe
            break;
            case 40:
                g2d.setPaint(new GradientPaint (220, 218, Color.yellow, 145, 298, Color.orange, true));
                g2d.fill( new Rectangle2D.Double( 195, 218, 50 , 80 ) ); //barra de pepe
            break;
            case 50:
                g2d.setPaint(new GradientPaint (220, 198, Color.yellow, 145, 298, Color.orange, true));
                g2d.fill( new Rectangle2D.Double( 195, 198, 50 , 100 ) ); //barra de pepe
            break;
            case 60:
                g2d.setPaint(new GradientPaint (220, 178, Color.yellow, 145, 298, Color.orange, true));
                g2d.fill( new Rectangle2D.Double( 195, 178, 50 , 120 ) ); //barra de pepe
            break;
            case 70:
                g2d.setPaint(new GradientPaint (220, 158, Color.yellow, 145, 298, Color.orange, true));
                g2d.fill( new Rectangle2D.Double( 195, 158, 50 , 140 ) ); //barra de pepe
            break;
            case 80:
                g2d.setPaint(new GradientPaint (220, 138, Color.yellow, 145, 298, Color.orange, true));
                g2d.fill( new Rectangle2D.Double( 195, 138, 50 , 160 ) ); //barra de pepe
            break;
            case 90:
                g2d.setPaint(new GradientPaint (220, 118, Color.yellow, 145, 298, Color.orange, true));
                g2d.fill( new Rectangle2D.Double( 195, 118, 50 , 180 ) ); //barra de pepe
            break;
            case 100:
                g2d.setPaint(new GradientPaint (220, 98, Color.yellow, 145, 298, Color.orange, true));
                g2d.fill( new Rectangle2D.Double( 195, 98, 50 , 200 ) ); //barra de pepe
            break;
            default:
                JOptionPane.showMessageDialog(this, "error en la enreada de datos");
                limpiar();
            break;
        } 
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
            java.util.logging.Logger.getLogger(Act_GraficaJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Act_GraficaJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Act_GraficaJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Act_GraficaJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Act_GraficaJFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_graficar;
    private javax.swing.JButton btn_limpiar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jp_grafica;
    private javax.swing.JTextField txt_juan;
    private javax.swing.JTextField txt_pablo;
    private javax.swing.JTextField txt_pedro;
    private javax.swing.JTextField txt_pepe;
    // End of variables declaration//GEN-END:variables
}
