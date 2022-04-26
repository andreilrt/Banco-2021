package Vistas.Cliente;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JPopupMenu;

public class VistaInicialCliente extends javax.swing.JFrame {

    public VistaInicialCliente() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPopupMenu1 = new javax.swing.JPopupMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        VentanaInicio = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        BtnConsultarSaldo = new javax.swing.JButton();
        BtnDepositar = new javax.swing.JButton();
        BtnRetirar = new javax.swing.JButton();
        BtnTransferir = new javax.swing.JButton();
        BtnCambiarClave = new javax.swing.JButton();
        BtnSalir = new javax.swing.JButton();
        LabelTitular = new javax.swing.JLabel();
        LabelNumeroCuenta = new javax.swing.JLabel();
        LabelEstadoCuenta = new javax.swing.JLabel();

        jMenuItem1.setText("Actualizar");
        jPopupMenu1.add(jMenuItem1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setSize(new java.awt.Dimension(550, 350));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        VentanaInicio.setBackground(new java.awt.Color(99, 163, 235));
        VentanaInicio.setComponentPopupMenu(jPopupMenu1);
        VentanaInicio.setMaximumSize(new java.awt.Dimension(570, 370));
        VentanaInicio.setMinimumSize(new java.awt.Dimension(570, 370));
        VentanaInicio.setPreferredSize(new java.awt.Dimension(570, 370));
        VentanaInicio.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Comic Sans MS", 0, 18)); // NOI18N
        jLabel1.setText("Bienvenid@ al menú del cliente.");
        VentanaInicio.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 20, 280, 40));

        BtnConsultarSaldo.setBackground(new java.awt.Color(153, 255, 153));
        BtnConsultarSaldo.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        BtnConsultarSaldo.setText("Consultar Saldo");
        VentanaInicio.add(BtnConsultarSaldo, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 121, -1, -1));

        BtnDepositar.setBackground(new java.awt.Color(153, 255, 153));
        BtnDepositar.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        BtnDepositar.setText("Depositar");
        VentanaInicio.add(BtnDepositar, new org.netbeans.lib.awtextra.AbsoluteConstraints(194, 121, 140, -1));

        BtnRetirar.setBackground(new java.awt.Color(153, 255, 153));
        BtnRetirar.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        BtnRetirar.setText("Retirar");
        VentanaInicio.add(BtnRetirar, new org.netbeans.lib.awtextra.AbsoluteConstraints(374, 121, 140, -1));

        BtnTransferir.setBackground(new java.awt.Color(153, 255, 153));
        BtnTransferir.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        BtnTransferir.setText("Transferir");
        VentanaInicio.add(BtnTransferir, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 211, 140, -1));

        BtnCambiarClave.setBackground(new java.awt.Color(153, 255, 153));
        BtnCambiarClave.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        BtnCambiarClave.setText("Cambiar Clave");
        VentanaInicio.add(BtnCambiarClave, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 211, 140, -1));

        BtnSalir.setBackground(new java.awt.Color(255, 153, 153));
        BtnSalir.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        BtnSalir.setText("Salir");
        VentanaInicio.add(BtnSalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 211, 140, -1));

        LabelTitular.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        LabelTitular.setText("Titular: ");
        VentanaInicio.add(LabelTitular, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 70, -1, -1));

        LabelNumeroCuenta.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        LabelNumeroCuenta.setText("Nro: ");
        VentanaInicio.add(LabelNumeroCuenta, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 70, -1, -1));

        LabelEstadoCuenta.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        LabelEstadoCuenta.setText("Estado:");
        VentanaInicio.add(LabelEstadoCuenta, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 70, -1, -1));

        getContentPane().add(VentanaInicio, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 600, 400));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public JMenuItem getjMenuItem1() {
        return jMenuItem1;
    }

    public JPopupMenu getjPopupMenu1() {
        return jPopupMenu1;
    }
    
    public JLabel getLabelEstadoCuenta() {
        return LabelEstadoCuenta;
    }

    public JLabel getLabelNumeroCuenta() {
        return LabelNumeroCuenta;
    }
    
    public JLabel getLabelTitular() {
        return LabelTitular;
    }
    
    public JButton getBtnCambiarClave() {
        return BtnCambiarClave;
    }

    public JButton getBtnConsultarSaldo() {
        return BtnConsultarSaldo;
    }

    public JButton getBtnDepositar() {
        return BtnDepositar;
    }

    public JButton getBtnRetirar() {
        return BtnRetirar;
    }

    public JButton getBtnSalir() {
        return BtnSalir;
    }

    public JButton getBtnTransferir() {
        return BtnTransferir;
    }

    public JPanel getVentanaInicio() {
        return VentanaInicio;
    }

    public JLabel getjLabel1() {
        return jLabel1;
    }

    
    
    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new VistaInicialCliente().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnCambiarClave;
    private javax.swing.JButton BtnConsultarSaldo;
    private javax.swing.JButton BtnDepositar;
    private javax.swing.JButton BtnRetirar;
    private javax.swing.JButton BtnSalir;
    private javax.swing.JButton BtnTransferir;
    private javax.swing.JLabel LabelEstadoCuenta;
    private javax.swing.JLabel LabelNumeroCuenta;
    private javax.swing.JLabel LabelTitular;
    private javax.swing.JPanel VentanaInicio;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JPopupMenu jPopupMenu1;
    // End of variables declaration//GEN-END:variables
}
