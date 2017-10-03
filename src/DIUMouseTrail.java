
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Point;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import static java.lang.Thread.sleep;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.Timer;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Granfran
 */
public class DIUMouseTrail extends javax.swing.JFrame {
    private final Timer timer;

    /**
     * Creates new form DIUMouseTrack
     */
    public DIUMouseTrail() {
        initComponents();
        this.trail = new MouseTrail(panelToPaint.getGraphics());
        timer = new Timer(500, new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                trail.update();
                panelToPaint.paint(panelToPaint.getGraphics());
                trail.paint();
            }
        });
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        bgComboBox = new javax.swing.JComboBox();
        trailColourComboBox = new javax.swing.JComboBox();
        trailShapeComboBox = new javax.swing.JComboBox();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        panelToPaint = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Mouse Trail free trial");

        bgComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "White", "Black", "Blue" }));
        bgComboBox.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                bgComboBoxMouseExited(evt);
            }
        });
        bgComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bgComboBoxActionPerformed(evt);
            }
        });

        trailColourComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Black", "Pink", "Yellow" }));
        trailColourComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                trailColourComboBoxActionPerformed(evt);
            }
        });

        trailShapeComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Circle", "Rectangle", "Star" }));
        trailShapeComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                trailShapeComboBoxActionPerformed(evt);
            }
        });

        jLabel1.setText("Background Colour");

        jLabel2.setText("Trail Colour");

        jLabel3.setText("Trail shape");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(80, 80, 80)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(bgComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(trailColourComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(trailShapeComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel3)))
                .addContainerGap(94, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bgComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(trailColourComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(trailShapeComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(22, 22, 22))
        );

        panelToPaint.setBackground(new java.awt.Color(255, 255, 255));
        panelToPaint.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                panelToPaintMouseMoved(evt);
            }
        });
        panelToPaint.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                panelToPaintMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                panelToPaintMouseExited(evt);
            }
        });

        javax.swing.GroupLayout panelToPaintLayout = new javax.swing.GroupLayout(panelToPaint);
        panelToPaint.setLayout(panelToPaintLayout);
        panelToPaintLayout.setHorizontalGroup(
            panelToPaintLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        panelToPaintLayout.setVerticalGroup(
            panelToPaintLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 196, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(panelToPaint, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(panelToPaint, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bgComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bgComboBoxActionPerformed
        int index = bgComboBox.getSelectedIndex();
        switch (index) {
            case 0:
                panelToPaint.setBackground(Color.white);
                break;
            case 1:
                panelToPaint.setBackground(Color.black);
                break;
            case 2:
                panelToPaint.setBackground(Color.blue);
                break;
        }
    }//GEN-LAST:event_bgComboBoxActionPerformed

    private void panelToPaintMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelToPaintMouseMoved
        timer.restart();
        Point point = evt.getPoint();
        trail.add(point);
        try {
            updateTrailDraw();
        } catch (InterruptedException ex) {
            Logger.getLogger(DIUMouseTrail.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_panelToPaintMouseMoved

    private void trailColourComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_trailColourComboBoxActionPerformed
        int index = trailColourComboBox.getSelectedIndex();
        switch (index) {
            case 0:
                trail.setColour(Color.black);
                break;
            case 1:
                trail.setColour(Color.pink);
                break;
            case 2:
                trail.setColour(Color.yellow);
                break;
        }
    }//GEN-LAST:event_trailColourComboBoxActionPerformed

    private void trailShapeComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_trailShapeComboBoxActionPerformed
        trail.setShape(trailShapeComboBox.getSelectedIndex());
    }//GEN-LAST:event_trailShapeComboBoxActionPerformed

    private void panelToPaintMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelToPaintMouseExited
        timer.stop();
    }//GEN-LAST:event_panelToPaintMouseExited

    private void panelToPaintMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelToPaintMouseEntered
        timer.start();
        bgComboBox.hidePopup();
        trailColourComboBox.hidePopup();
        trailShapeComboBox.hidePopup();
    }//GEN-LAST:event_panelToPaintMouseEntered

    private void bgComboBoxMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bgComboBoxMouseExited

    }//GEN-LAST:event_bgComboBoxMouseExited

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
            java.util.logging.Logger.getLogger(DIUMouseTrail.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DIUMouseTrail.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DIUMouseTrail.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DIUMouseTrail.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new DIUMouseTrail().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox bgComboBox;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel panelToPaint;
    private javax.swing.JComboBox trailColourComboBox;
    private javax.swing.JComboBox trailShapeComboBox;
    // End of variables declaration//GEN-END:variables
    private final MouseTrail trail;

    private void updateTrailDraw() throws InterruptedException {
        Graphics graphics = panelToPaint.getGraphics();
        panelToPaint.paint(graphics);
        trail.paint();
        sleep(100);
    }
}
