/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guishapes;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import shapecalculator.*;

/**
 *
 * @author 01048750
 */
public class RectangleGUI extends javax.swing.JFrame implements ActionListener {

    /**
     * Creates new form CircleGUI
     */
    public RectangleGUI() {
        initComponents();
        InputButton.addActionListener(this);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        InputLabel = new javax.swing.JLabel();
        InputTextfield = new javax.swing.JTextField();
        InputButton = new javax.swing.JButton();
        PerimeterLabel = new javax.swing.JLabel();
        AreaLabel = new javax.swing.JLabel();
        Input2Label = new javax.swing.JLabel();
        Input2Textfield = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Rectangle Calculator");

        InputLabel.setText("Length: ");

        InputTextfield.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                InputTextfieldActionPerformed(evt);
            }
        });

        InputButton.setText("Enter");

        PerimeterLabel.setText("0: Perimeter");
        PerimeterLabel.setToolTipText("");

        AreaLabel.setText("0: Area");

        Input2Label.setText("Width:");

        Input2Textfield.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Input2TextfieldActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(AreaLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(PerimeterLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(Input2Label, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(InputLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(InputTextfield, javax.swing.GroupLayout.DEFAULT_SIZE, 132, Short.MAX_VALUE)
                                .addGap(79, 79, 79))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(Input2Textfield)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(InputButton)
                                .addContainerGap())))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(InputLabel)
                    .addComponent(InputTextfield, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Input2Label)
                    .addComponent(Input2Textfield, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(InputButton))
                .addGap(18, 18, 18)
                .addComponent(PerimeterLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(AreaLabel)
                .addContainerGap(33, Short.MAX_VALUE))
        );

        setSize(new java.awt.Dimension(287, 189));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void InputTextfieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_InputTextfieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_InputTextfieldActionPerformed

    private void Input2TextfieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Input2TextfieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Input2TextfieldActionPerformed

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
            java.util.logging.Logger.getLogger(RectangleGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RectangleGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RectangleGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RectangleGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RectangleGUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel AreaLabel;
    private javax.swing.JLabel Input2Label;
    private javax.swing.JTextField Input2Textfield;
    private javax.swing.JButton InputButton;
    private javax.swing.JLabel InputLabel;
    private javax.swing.JTextField InputTextfield;
    private javax.swing.JLabel PerimeterLabel;
    // End of variables declaration//GEN-END:variables

    @Override
    public void actionPerformed(ActionEvent ae) {
       double length = Double.parseDouble(InputTextfield.getText());
       double width = Double.parseDouble(Input2Textfield.getText());
       Rectangle rectangle = new Rectangle(length,width);
       PerimeterLabel.setText(String.valueOf(rectangle.getPerimeter()) + ": Perimeter");
       AreaLabel.setText(String.valueOf(rectangle.getArea()) + ": Area");
    }
}
