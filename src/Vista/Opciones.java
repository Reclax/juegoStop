/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package Vista;
/**
 *
 * @author mateo
 */
public class Opciones extends javax.swing.JPanel {

    public Opciones() {
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

        jLabel4 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jButtonIniciar1 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jButtonAgregar = new javax.swing.JButton();
        jTextField2 = new javax.swing.JTextField();
        jSpinnerTiempo = new javax.swing.JSpinner();
        jButtonAgregar1 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jLabel3 = new javax.swing.JLabel();
        jCheckBox1 = new javax.swing.JCheckBox();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabelP = new javax.swing.JLabel();

        setBackground(new java.awt.Color(36, 56, 99));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("Turnos aleatorios");
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 270, 133, 50));

        jTextField1.setBackground(new java.awt.Color(255, 79, 169));
        jTextField1.setForeground(new java.awt.Color(51, 255, 255));
        jTextField1.setText("jTextField1");
        add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 390, 115, -1));

        jButtonIniciar1.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 18)); // NOI18N
        jButtonIniciar1.setForeground(new java.awt.Color(0, 0, 0));
        jButtonIniciar1.setText("Iniciar");
        jButtonIniciar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonIniciar1ActionPerformed(evt);
            }
        });
        add(jButtonIniciar1, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 630, 102, 57));

        jLabel5.setFont(new java.awt.Font("Arial Black", 0, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(36, 56, 99));
        jLabel5.setText("Nombre del Jugador");
        add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 430, 330, 50));

        jButtonAgregar.setBackground(new java.awt.Color(255, 79, 169));
        jButtonAgregar.setText("Agregar");
        jButtonAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAgregarActionPerformed(evt);
            }
        });
        add(jButtonAgregar, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 390, 97, -1));

        jTextField2.setBackground(new java.awt.Color(36, 56, 99));
        jTextField2.setText("jTextField1");
        jTextField2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField2ActionPerformed(evt);
            }
        });
        add(jTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 490, 115, -1));
        add(jSpinnerTiempo, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 200, 134, 36));

        jButtonAgregar1.setBackground(new java.awt.Color(36, 56, 99));
        jButtonAgregar1.setText("Agregar");
        jButtonAgregar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAgregar1ActionPerformed(evt);
            }
        });
        add(jButtonAgregar1, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 490, 97, -1));

        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("Nombre del Jugador");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 340, 154, 50));

        jTable2.setBackground(new java.awt.Color(255, 79, 169));
        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null},
                {null}
            },
            new String [] {
                "Categorias"
            }
        ));
        jScrollPane2.setViewportView(jTable2);

        add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 180, 211, 194));

        jLabel3.setFont(new java.awt.Font("Arial Black", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 79, 169));
        jLabel3.setText("Tiempo:");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 190, 81, 50));
        add(jCheckBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 290, -1, -1));

        jTable1.setBackground(new java.awt.Color(36, 56, 99));
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null}
            },
            new String [] {
                "Jugador", "Nombre"
            }
        ));
        jScrollPane1.setViewportView(jTable1);
        if (jTable1.getColumnModel().getColumnCount() > 0) {
            jTable1.getColumnModel().getColumn(0).setPreferredWidth(70);
            jTable1.getColumnModel().getColumn(0).setMaxWidth(70);
        }

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 420, 211, 199));

        jLabelP.setBackground(new java.awt.Color(255, 153, 0));
        jLabelP.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/fondo_1.png"))); // NOI18N
        add(jLabelP, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 10, 1120, 770));
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonAgregar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAgregar1ActionPerformed

    }//GEN-LAST:event_jButtonAgregar1ActionPerformed

    private void jTextField2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField2ActionPerformed

    private void jButtonAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAgregarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonAgregarActionPerformed

    private void jButtonIniciar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonIniciar1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonIniciar1ActionPerformed
    

    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton jButtonAgregar;
    public javax.swing.JButton jButtonAgregar1;
    public javax.swing.JButton jButtonIniciar1;
    private javax.swing.JCheckBox jCheckBox1;
    public javax.swing.JLabel jLabel2;
    public javax.swing.JLabel jLabel3;
    public javax.swing.JLabel jLabel4;
    public javax.swing.JLabel jLabel5;
    public javax.swing.JLabel jLabelP;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    public javax.swing.JSpinner jSpinnerTiempo;
    public javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    // End of variables declaration//GEN-END:variables
}
