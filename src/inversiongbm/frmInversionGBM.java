/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package inversiongbm;
//hola desde la mac

import java.awt.event.ActionEvent;
import java.awt.event.KeyEvent;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.text.NumberFormat;
import javax.swing.JOptionPane;
import java.awt.HeadlessException;

/**
 *
 * @author slb_18
 */
public class frmInversionGBM extends javax.swing.JFrame {

    /**
     * Creates new form frmInversionGBM
     */
    public frmInversionGBM() {
        initComponents();

//        FileReader archivo;
//        FileReader archivoMac;
//
//        BufferedReader lector;
//        BufferedReader lector2;
//
//        try {
//
//            archivo = new FileReader("C:/interes.txt");
//            archivoMac = new FileReader("/interes.txt");
//            //archivo = new FileReader("/interes.txt"); linux
//            if (archivo.ready()) {
//                lector = new BufferedReader(archivo);
//                String cadena;
//
//                while ((cadena = lector.readLine()) != null) {
//
//                    //System.out.println(cadena);
//                    txtInteres.setText(cadena);
//                    txtCantidad.requestFocus();
//                }
//            } else if (archivoMac.ready()) {
//                lector2 = new BufferedReader(archivoMac);
//                String cadena;
//
//                while ((cadena = lector2.readLine()) != null) {
//
//                    //System.out.println(cadena);
//                    txtInteres.setText(cadena);
//                    txtCantidad.requestFocus();
//                }
//
//            } else {
//                //System.out.println("El archivo no esta listo para ser leido...");
//                JOptionPane.showMessageDialog(null, "El archivo no esta listo para ser leido...");
//            }
//
//        } catch (Exception e) {
//            System.out.println("Error: " + e.getMessage());
//            JOptionPane.showMessageDialog(null, "El archivo no esta listo para ser leido...");
//            
//            // codigo si no encuentra el archivo de texto
//            
//        }

        //activar boton manual
        InteresManual();
        

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        cmdSalir = new javax.swing.JButton();
        cmdCalcular = new javax.swing.JButton();
        cmdLimpiar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        txtDia = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtMes = new javax.swing.JTextField();
        txtAno = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtCantidad = new javax.swing.JTextField();
        lblCantidad = new javax.swing.JLabel();
        txtInteres = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        cmdCambiarInteres = new javax.swing.JButton();
        cmdManual = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Inversion GBM+");
        setResizable(false);
        addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                formKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                formKeyReleased(evt);
            }
        });

        cmdSalir.setMnemonic('S');
        cmdSalir.setText("Salir");
        cmdSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdSalirActionPerformed(evt);
            }
        });

        cmdCalcular.setMnemonic('C');
        cmdCalcular.setText("Calcular");
        cmdCalcular.setToolTipText("Calcular Inversion");
        cmdCalcular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdCalcularActionPerformed(evt);
            }
        });

        cmdLimpiar.setMnemonic('L');
        cmdLimpiar.setText("Limpiar");
        cmdLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdLimpiarActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 22)); // NOI18N
        jLabel1.setText("Cantidad a Invertir $");

        txtDia.setEditable(false);
        txtDia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDiaActionPerformed(evt);
            }
        });
        txtDia.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtDiaKeyTyped(evt);
            }
        });

        jLabel2.setText("Dia");

        jLabel3.setText("Mes");

        jLabel4.setText("Año");

        txtMes.setEditable(false);
        txtMes.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtMesKeyTyped(evt);
            }
        });

        txtAno.setEditable(false);
        txtAno.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtAnoKeyTyped(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel5.setText("Calculo de Inversion GBM+");

        txtCantidad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCantidadActionPerformed(evt);
            }
        });
        txtCantidad.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtCantidadKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtCantidadKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtCantidadKeyTyped(evt);
            }
        });

        lblCantidad.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        lblCantidad.setText("--");

        txtInteres.setEditable(false);
        txtInteres.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtInteresActionPerformed(evt);
            }
        });
        txtInteres.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtInteresKeyTyped(evt);
            }
        });

        jLabel6.setText("Interes");

        cmdCambiarInteres.setMnemonic('B');
        cmdCambiarInteres.setText("Cambiar en BD");
        cmdCambiarInteres.setEnabled(false);
        cmdCambiarInteres.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdCambiarInteresActionPerformed(evt);
            }
        });

        cmdManual.setMnemonic('M');
        cmdManual.setText("Manual");
        cmdManual.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdManualActionPerformed(evt);
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
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtDia, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtMes, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(12, 12, 12)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtAno, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(cmdLimpiar, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 265, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addComponent(txtCantidad, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(38, 38, 38)
                        .addComponent(cmdCalcular, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(53, 53, 53)
                                        .addComponent(cmdManual, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(lblCantidad, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                                .addComponent(cmdSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtInteres, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(cmdCambiarInteres)
                                .addGap(0, 0, Short.MAX_VALUE)))))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(109, 109, 109)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 375, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtCantidad, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cmdCalcular))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4))
                .addGap(10, 10, 10)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtDia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cmdLimpiar)
                    .addComponent(txtMes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtAno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtInteres, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6)
                    .addComponent(cmdCambiarInteres))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 65, Short.MAX_VALUE)
                        .addComponent(cmdSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cmdManual)
                        .addGap(18, 18, 18)
                        .addComponent(lblCantidad, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(12, Short.MAX_VALUE))))
        );

        lblCantidad.getAccessibleContext().setAccessibleName("lblCantidad");

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void cmdSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdSalirActionPerformed
        // Boton Salir
        System.gc();
        System.exit(0); //Salir del Programa
    }//GEN-LAST:event_cmdSalirActionPerformed

    private void Calcular() {
        NumberFormat formatoImporte = NumberFormat.getCurrencyInstance();
        // validamos que no esten vacios los campos

        double interes = Double.parseDouble(txtInteres.getText());   //0.85
        int meses = 12;
        int dias = 30;

        while (txtCantidad.getText().isEmpty()) {
            //El campo esta vacio,
            JOptionPane.showMessageDialog(null, "Cantidad Vacia");

            txtCantidad.requestFocus();
            txtCantidad.setText("0"); //ayuda a que el enter funcione en el inicio
            return;
        }

        //El campo tiene texto
        // Calcular
        double cantidadInvertida = Double.parseDouble(txtCantidad.getText());

        double cantidaAno = (cantidadInvertida * interes) / 10;
        double cantidaMes = ((cantidadInvertida * interes) / 10) / meses;
        double cantidaDia = ((cantidadInvertida * interes) / 10 / meses) / dias;

        //imprimir resultados
        txtAno.setText(formatoImporte.format(cantidaAno));
        txtMes.setText(formatoImporte.format(cantidaMes));
        txtDia.setText(formatoImporte.format(cantidaDia));

        lblCantidad.setText("Inversion: " + formatoImporte.format(cantidadInvertida));
        txtCantidad.setText("");

    }
    private void cmdCalcularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdCalcularActionPerformed
        Calcular();

    }//GEN-LAST:event_cmdCalcularActionPerformed

    private void cmdLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdLimpiarActionPerformed
        // Boton Limpiar
        txtDia.setText("");
        txtMes.setText("");
        txtAno.setText("");

        txtDia.setText("");
        txtMes.setText("");
        txtAno.setText("");

        txtCantidad.setText("");

        txtCantidad.requestFocus();

    }//GEN-LAST:event_cmdLimpiarActionPerformed

    private void txtDiaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDiaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDiaActionPerformed

    private void txtDiaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtDiaKeyTyped
        // Solo numeros y punto
        int key = evt.getKeyChar();

        boolean numeros = key >= 46 && key <= 57;

        if (!numeros) {
            evt.consume();
        }

        if (txtDia.getText().trim().length() == 10) {
            evt.consume();
        }
    }//GEN-LAST:event_txtDiaKeyTyped

    private void txtMesKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtMesKeyTyped
        // TODO add your handling code here:
        // Solo numeros y punto
        int key = evt.getKeyChar();

        boolean numeros = key >= 46 && key <= 57;

        if (!numeros) {
            evt.consume();
        }
        if (txtMes.getText().trim().length() == 10) {
            evt.consume();
        }
    }//GEN-LAST:event_txtMesKeyTyped

    private void txtAnoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtAnoKeyTyped
        // TODO add your handling code here:
        // Solo numeros y punto
        int key = evt.getKeyChar();

        boolean numeros = key >= 46 && key <= 57;

        if (!numeros) {
            evt.consume();
        }
        if (txtAno.getText().trim().length() == 10) {
            evt.consume();
        }
    }//GEN-LAST:event_txtAnoKeyTyped

    private void txtCantidadKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCantidadKeyTyped
        // Solo numeros y punto
        int key = evt.getKeyChar();

        boolean numeros = key >= 46 && key <= 57;

        if (!numeros) {
            evt.consume();
        }

        if (txtCantidad.getText().trim().length() == 10) {
            evt.consume();
        }        // TODO add your handling code here:
    }//GEN-LAST:event_txtCantidadKeyTyped

    private void formKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_formKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_formKeyPressed

    private void txtCantidadKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCantidadKeyReleased
        // TODO add your handling code here:
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {

            //cmdCalcular.doClick();
            Calcular();
        }
        if (evt.getKeyCode() == KeyEvent.VK_ESCAPE) {
            System.exit(0);
        }
    }//GEN-LAST:event_txtCantidadKeyReleased

    private void txtCantidadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCantidadActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCantidadActionPerformed

    private void formKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_formKeyReleased
        if (evt.getKeyCode() == KeyEvent.VK_ESCAPE) {
            //System.exit(0);
            // cmdSalir.doClick();

        }
    }//GEN-LAST:event_formKeyReleased

    private void txtCantidadKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCantidadKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCantidadKeyPressed

    private void txtInteresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtInteresActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtInteresActionPerformed

    private void txtInteresKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtInteresKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_txtInteresKeyTyped

    private void cmdCambiarInteresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdCambiarInteresActionPerformed
        // Boton de Cambiar Interes
        FileWriter archivo = null;
        PrintWriter escritor = null;

        try {
            archivo = new FileWriter("C:/interes.txt");
            //archivo = new FileWriter("/interes.txt"); linux
            escritor = new PrintWriter(archivo);

            double cantidad = Float.parseFloat(JOptionPane.showInputDialog("Digite el Interes Mensual"));
            escritor.println(cantidad / 10);

            archivo.close();

            txtInteres.setText(String.valueOf(cantidad / 10));
            txtCantidad.requestFocus();

        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }


    }//GEN-LAST:event_cmdCambiarInteresActionPerformed

    private void cmdManualActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdManualActionPerformed
        
        // Boton de cambio manual de interes
        InteresManual();;
       

    }//GEN-LAST:event_cmdManualActionPerformed

    private void InteresManual(){
         boolean repetir = true;

        while (repetir ) {

            try {
                double cantidad = Float.parseFloat(JOptionPane.showInputDialog("Digite el Interes Mensual"));
                
                txtInteres.setText(String.valueOf(cantidad / 10));
                txtCantidad.requestFocus();
                repetir = false;

            } catch (HeadlessException | NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Cadena ingresada, debe ingresar un valor numerico", "Informacion", JOptionPane.INFORMATION_MESSAGE);

            }

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
            java.util.logging.Logger.getLogger(frmInversionGBM.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmInversionGBM.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmInversionGBM.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmInversionGBM.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmInversionGBM().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cmdCalcular;
    private javax.swing.JButton cmdCambiarInteres;
    private javax.swing.JButton cmdLimpiar;
    private javax.swing.JButton cmdManual;
    private javax.swing.JButton cmdSalir;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel lblCantidad;
    private javax.swing.JTextField txtAno;
    private javax.swing.JTextField txtCantidad;
    private javax.swing.JTextField txtDia;
    private javax.swing.JTextField txtInteres;
    private javax.swing.JTextField txtMes;
    // End of variables declaration//GEN-END:variables
}
