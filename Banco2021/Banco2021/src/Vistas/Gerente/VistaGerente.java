package Vistas.Gerente;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JPopupMenu;

public class VistaGerente extends javax.swing.JFrame {

    public VistaGerente() {
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
        BtnActivar = new javax.swing.JButton();
        BtnDesactivar = new javax.swing.JButton();
        BtnModificar = new javax.swing.JButton();
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

        jLabel1.setFont(new java.awt.Font("Comic Sans MS", 0, 18)); // NOI18N
        jLabel1.setText("Bienvenid@ al menú del gerente.");

        BtnConsultarSaldo.setBackground(new java.awt.Color(153, 255, 153));
        BtnConsultarSaldo.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        BtnConsultarSaldo.setText("Consultar Saldo");

        BtnDepositar.setBackground(new java.awt.Color(153, 255, 153));
        BtnDepositar.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        BtnDepositar.setText("Depositar");

        BtnActivar.setBackground(new java.awt.Color(153, 255, 153));
        BtnActivar.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        BtnActivar.setText("Activar");

        BtnDesactivar.setBackground(new java.awt.Color(153, 255, 153));
        BtnDesactivar.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        BtnDesactivar.setText("Desactivar");

        BtnModificar.setBackground(new java.awt.Color(153, 255, 153));
        BtnModificar.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        BtnModificar.setText("Modificar");

        BtnSalir.setBackground(new java.awt.Color(255, 153, 153));
        BtnSalir.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        BtnSalir.setText("Salir");

        LabelTitular.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        LabelTitular.setText("Titular: ");

        LabelNumeroCuenta.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        LabelNumeroCuenta.setText("Nro: ");

        LabelEstadoCuenta.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        LabelEstadoCuenta.setText("Estado:");

        javax.swing.GroupLayout VentanaInicioLayout = new javax.swing.GroupLayout(VentanaInicio);
        VentanaInicio.setLayout(VentanaInicioLayout);
        VentanaInicioLayout.setHorizontalGroup(
            VentanaInicioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(VentanaInicioLayout.createSequentialGroup()
                .addGroup(VentanaInicioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(VentanaInicioLayout.createSequentialGroup()
                        .addGap(130, 130, 130)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(VentanaInicioLayout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(BtnDesactivar, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(30, 30, 30)
                        .addComponent(BtnModificar, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(40, 40, 40)
                        .addComponent(BtnSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(VentanaInicioLayout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addGroup(VentanaInicioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(VentanaInicioLayout.createSequentialGroup()
                                .addComponent(BtnConsultarSaldo)
                                .addGap(31, 31, 31)
                                .addComponent(BtnDepositar, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(40, 40, 40))
                            .addGroup(VentanaInicioLayout.createSequentialGroup()
                                .addComponent(LabelTitular)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(LabelNumeroCuenta)
                                .addGap(91, 91, 91)))
                        .addGroup(VentanaInicioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(LabelEstadoCuenta)
                            .addComponent(BtnActivar, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(80, 80, 80))
        );
        VentanaInicioLayout.setVerticalGroup(
            VentanaInicioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(VentanaInicioLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(14, 14, 14)
                .addGroup(VentanaInicioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LabelTitular)
                    .addComponent(LabelNumeroCuenta)
                    .addComponent(LabelEstadoCuenta))
                .addGap(30, 30, 30)
                .addGroup(VentanaInicioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(BtnConsultarSaldo)
                    .addComponent(BtnDepositar)
                    .addComponent(BtnActivar))
                .addGap(61, 61, 61)
                .addGroup(VentanaInicioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(BtnDesactivar)
                    .addComponent(BtnModificar)
                    .addComponent(BtnSalir)))
        );

        getContentPane().add(VentanaInicio, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 600, 400));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public JMenuItem getjMenuItem1() {
        return jMenuItem1;
    }

    public JPopupMenu getjPopupMenu1() {
        return jPopupMenu1;
    }

    public JButton getBtnActivar() {
        return BtnActivar;
    }

    public JButton getBtnConsultarSaldo() {
        return BtnConsultarSaldo;
    }

    public JButton getBtnDepositar() {
        return BtnDepositar;
    }

    public JButton getBtnDesactivar() {
        return BtnDesactivar;
    }

    public JButton getBtnModificar() {
        return BtnModificar;
    }

    public JButton getBtnSalir() {
        return BtnSalir;
    }

    public JLabel getLabelNumeroCuenta() {
        return LabelNumeroCuenta;
    }

    public JLabel getLabelTitular() {
        return LabelTitular;
    }

    public JPanel getVentanaInicio() {
        return VentanaInicio;
    }

    public JLabel getjLabel1() {
        return jLabel1;
    }

    public JLabel getLabelEstadoCuenta() {
        return LabelEstadoCuenta;
    }
    
    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VistaGerente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new VistaGerente().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnActivar;
    private javax.swing.JButton BtnConsultarSaldo;
    private javax.swing.JButton BtnDepositar;
    private javax.swing.JButton BtnDesactivar;
    private javax.swing.JButton BtnModificar;
    private javax.swing.JButton BtnSalir;
    private javax.swing.JLabel LabelEstadoCuenta;
    private javax.swing.JLabel LabelNumeroCuenta;
    private javax.swing.JLabel LabelTitular;
    private javax.swing.JPanel VentanaInicio;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JPopupMenu jPopupMenu1;
    // End of variables declaration//GEN-END:variables
}
