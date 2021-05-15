package VENTANA;

import TCP.Cliente;
import TCP.Servidor;
import UDP.UDPcliente;
import UDP.UDPservidor;
import RMI.ClienteRMI;
import RMI.ServidorRMI;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.SwingUtilities;
import javax.swing.Timer;
import javax.swing.table.DefaultTableModel;

import LOGICA.Registro;
/**
 * 
 * @author lesli
 */
public class Vista extends JFrame {

    boolean sudp = false, stcp = false, rmi = false;

    // TCP
    Servidor servidorTCP = new Servidor();
    Cliente clienteTCP = new Cliente();

    // UDP
    UDPservidor ServidorUDP = new UDPservidor();
    UDPcliente ClienteUDP = new UDPcliente();

    // RMI
    ClienteRMI crmi = new ClienteRMI();
    ServidorRMI srmi = new ServidorRMI();

    public Vista() {
        initComponents();
        this.setLocationRelativeTo(null);
        this.setResizable(false);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        RegistroUI = new javax.swing.JFrame();
        jScrollPane2 = new javax.swing.JScrollPane();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        tnombre = new javax.swing.JTextField();
        tncodigo = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        Benviar = new javax.swing.JButton();
        jLabel15 = new javax.swing.JLabel();
        tnapellido = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        tnCarrera = new javax.swing.JComboBox<>();
        jLabel17 = new javax.swing.JLabel();
        tnSala = new javax.swing.JComboBox<>();
        pnListaRegistro = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabla = new javax.swing.JTable();
        jLabel6 = new javax.swing.JLabel();
        lbEscuchandoen = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        lblEscuchandoa = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        btnTCP = new javax.swing.JButton();
        btnUDP = new javax.swing.JButton();
        btnRMI = new javax.swing.JButton();
        jLabel14 = new javax.swing.JLabel();

        RegistroUI.setTitle("Cliente");
        RegistroUI.setMinimumSize(new java.awt.Dimension(898, 650));
        RegistroUI.setResizable(false);
        RegistroUI.addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                RegistroUIWindowClosing(evt);
            }
        });

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "INFORMACIÓN DEL ESTUDIANTE", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION));

        tnombre.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N

        tncodigo.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        tncodigo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                tncodigoKeyTyped(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Ebrima", 1, 24)); // NOI18N
        jLabel2.setText("INGRESO DE ESTUDIANTES");

        jLabel4.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel4.setText("Nombres:");

        jLabel5.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel5.setText("Codigo:");

        Benviar.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        Benviar.setText("Enviar");
        Benviar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BenviarActionPerformed(evt);
            }
        });

        jLabel15.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel15.setText("Apellido:");

        tnapellido.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        tnapellido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tnapellidoActionPerformed(evt);
            }
        });

        jLabel16.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel16.setText("Carrera:");

        tnCarrera.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        tnCarrera.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Ingeniería de Sistemas", "Ingeniería de Alimentos", "Ingeniería Quimica", "Ingeniería Civil", " " }));

        jLabel17.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel17.setText("Sala de:");

        tnSala.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        tnSala.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Informatica", "Tutoria", "Estudio", "Entretenimiento" }));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(89, 89, 89)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel15)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5)
                    .addComponent(jLabel16)
                    .addComponent(jLabel17))
                .addGap(59, 59, 59)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(tncodigo)
                    .addComponent(tnapellido)
                    .addComponent(tnombre)
                    .addComponent(tnCarrera, 0, 505, Short.MAX_VALUE)
                    .addComponent(tnSala, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(276, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(Benviar, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(337, 337, 337))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(265, 265, 265))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(4, 4, 4)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(tnombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addGap(7, 7, 7)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tnapellido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel15))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tncodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel16)
                    .addComponent(tnCarrera))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel17)
                    .addComponent(tnSala, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Benviar)
                .addGap(6, 6, 6))
        );

        pnListaRegistro.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "LISTA DE REGISTRO", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION));

        tabla.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        tabla.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nombre", "Apellido", "Codigo", "Carrera", "Sala", "Fecha", "FechaS"
            }
        ));
        jScrollPane1.setViewportView(tabla);
        if (tabla.getColumnModel().getColumnCount() > 0) {
            tabla.getColumnModel().getColumn(2).setMinWidth(3);
        }

        javax.swing.GroupLayout pnListaRegistroLayout = new javax.swing.GroupLayout(pnListaRegistro);
        pnListaRegistro.setLayout(pnListaRegistroLayout);
        pnListaRegistroLayout.setHorizontalGroup(
            pnListaRegistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 854, Short.MAX_VALUE)
            .addGroup(pnListaRegistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnListaRegistroLayout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 844, Short.MAX_VALUE)))
        );
        pnListaRegistroLayout.setVerticalGroup(
            pnListaRegistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 281, Short.MAX_VALUE)
            .addGroup(pnListaRegistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(pnListaRegistroLayout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 259, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        jLabel6.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        jLabel6.setText("ESCUCHANDO EN:");

        lbEscuchandoen.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N

        jLabel18.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        jLabel18.setText("ESCUCHANDO A:");

        lblEscuchandoa.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pnListaRegistro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lbEscuchandoen, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lblEscuchandoa, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbEscuchandoen, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblEscuchandoa, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pnListaRegistro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jScrollPane2.setViewportView(jPanel1);

        javax.swing.GroupLayout RegistroUILayout = new javax.swing.GroupLayout(RegistroUI.getContentPane());
        RegistroUI.getContentPane().setLayout(RegistroUILayout);
        RegistroUILayout.setHorizontalGroup(
            RegistroUILayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 906, Short.MAX_VALUE)
        );
        RegistroUILayout.setVerticalGroup(
            RegistroUILayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(RegistroUILayout.createSequentialGroup()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 650, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Proyecto ");
        setResizable(false);

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel1.setText("BIENVENIDO");

        btnTCP.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        btnTCP.setText("TCP");
        btnTCP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTCPActionPerformed(evt);
            }
        });

        btnUDP.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        btnUDP.setText("UDP");
        btnUDP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUDPActionPerformed(evt);
            }
        });

        btnRMI.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        btnRMI.setText("RMI");
        btnRMI.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRMIActionPerformed(evt);
            }
        });

        jLabel14.setText("SELECCIONE LA TECNOLOGIA:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addComponent(btnTCP)
                .addGap(27, 27, 27)
                .addComponent(btnUDP)
                .addGap(26, 26, 26)
                .addComponent(btnRMI)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jLabel1))
                    .addComponent(jLabel14))
                .addGap(62, 62, 62))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel14)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnUDP)
                    .addComponent(btnRMI)
                    .addComponent(btnTCP))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnUDPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUDPActionPerformed
        sudp = true;
        this.dispose();
        RegistroUI.setVisible(true);

        // inicar server UDP
        new Thread(() -> {
            try {
                ServidorUDP.iniciarServidor();
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(Vista.class.getName()).log(Level.SEVERE, null, ex);
            }
        }).start();

        this.lbEscuchandoen.setText(ServidorUDP.getIp() + ":" + ServidorUDP.getPuerto());
    }//GEN-LAST:event_btnUDPActionPerformed
    /**
     *
     * @param evt
     */
    private void btnTCPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTCPActionPerformed
        stcp = true;
        this.dispose();
        RegistroUI.setVisible(true);

        // SE INICIA EL SERVIDOR TCP
        new Thread(() -> {
            try {
                servidorTCP.recibir();
            } catch (IOException ex) {
                Logger.getLogger(Vista.class.getName()).log(Level.SEVERE, null, ex);
            }
        }).start();

        try {
            clienteTCP.conectar();
        } catch (IOException ex) {
            Logger.getLogger(Vista.class.getName()).log(Level.SEVERE, null, ex);
        }

        this.lbEscuchandoen.setText(servidorTCP.getIp() + ":" + servidorTCP.getPort());
        this.lblEscuchandoa.setText(servidorTCP.getIp2());
        try {
            clienteTCP.desconectar();
        } catch (IOException ex) {
            Logger.getLogger(Vista.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnTCPActionPerformed
    /**
     * SE LIMPIA LOS DATOS INGRESADOS
     */
    public void limpiartexto() {
        tnombre.setText("");
        tncodigo.setText("");
        tnapellido.setText("");
        tnSala.setSelectedIndex(0);
        tnCarrera.setSelectedIndex(0);

    }

    /**
     * SE LIMPIAN LOS DATOS DE LA TABLA
     *
     * @param table
     */
    public void limpiarTabla(JTable table) {
        DefaultTableModel model = (DefaultTableModel) table.getModel();
        model.setRowCount(0);
    }

    /**
     * RELLENA LA TABLA CON LOS DATOS OBTENIDOS DE LA BASE DE DATOS
     *
     * @param cts
     * @param table
     */
    public void refrescartabla(ArrayList<Registro> cts, JTable table) {

        limpiarTabla(table);
        if (cts.size() > 0) {
            DefaultTableModel model = (DefaultTableModel) table.getModel();
            String nombre = null, codigo = null, fecha = null, carrera = null, apellido = null, sala = null, fechaS = null;

            for (Registro reg : cts) {
                nombre = reg.getNomnbre();
                apellido = reg.getApellido();
                codigo = reg.getCodigo();
                carrera = reg.getCarrera();
                sala = reg.getSala();
                fecha = reg.getFecha();
                fechaS = reg.getFechaS();

                model.addRow(new Object[]{nombre, apellido, codigo, carrera, sala, fecha, fechaS});
            }
        }
    }

    /**
     * INICIA EL SERVIDOR DE RMI
     *
     * @param evt
     */
    private void btnRMIActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRMIActionPerformed
        rmi = true;
        this.dispose();
        RegistroUI.setVisible(true);
        this.lbEscuchandoen.setText(srmi.getNombreServer());
    }//GEN-LAST:event_btnRMIActionPerformed
    /**
     * CIERRA LA VENTANA CLIENTEUI Y MUESTRA LA VENTANA PRINCIPAL VISTA
     *
     * @param evt
     */
    private void RegistroUIWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_RegistroUIWindowClosing
        this.setVisible(true);
    }//GEN-LAST:event_RegistroUIWindowClosing
    /**
     * RECIBE LOS DATOS INGRESADOS EN LA VENTANA DE CLIENTEUI, LOS ENVÍA A LA
     * BASE DE DATOS Y LOS MUESTRA EN LA TABLA, TENIENDO EN CUENTA CADA PROTOCOLO
     *
     * @param evt
     */
    private void BenviarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BenviarActionPerformed
        if (!tnombre.getText().isEmpty() && !tncodigo.getText().isEmpty() && !tnapellido.getText().isEmpty()) {
            if (stcp) {

                new Thread(() -> {
                    try {
                        ArrayList<Registro> cts;
                        //String nomnbre, String codigo, String apellido, String sala, String carrera, String fecha
                        cts = clienteTCP.iniciar(new Registro(tnombre.getText(), tnapellido.getText(), tncodigo.getText(), tnCarrera.getSelectedItem().toString(), tnSala.getSelectedItem().toString()));
                        refrescartabla(cts, tabla);
                        limpiartexto();
                        this.lblEscuchandoa.setText(servidorTCP.getIp2());
                        JOptionPane.showMessageDialog(this, "Registro guardado con éxito!");
                    } catch (IOException ex) {
                        Logger.getLogger(Vista.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }).start();
            }

            if (sudp) {
                if (!tnombre.getText().isEmpty() && !tncodigo.getText().isEmpty() && !tnapellido.getText().isEmpty()) {

                    try {
                        ArrayList<Registro> cts;
                        cts = ClienteUDP.GuardarRegistros(new Registro(tnombre.getText(), tnapellido.getText(), tncodigo.getText(), tnCarrera.getSelectedItem().toString(), tnSala.getSelectedItem().toString()));

                        this.lblEscuchandoa.setText(String.valueOf(ClienteUDP.getIp() + ":" + ClienteUDP.getPuertocliente()));
                        Timer SimpleTimer = new Timer(4500, new ActionListener() {
                            @Override
                            public void actionPerformed(ActionEvent e) {
                                // udpport.setText("");
                            }
                        });
                        SimpleTimer.start();
                        JOptionPane.showMessageDialog(this, "Registro guardado con éxito!");
                        refrescartabla(cts, tabla);
                        limpiartexto();
                    } catch (IOException | ClassNotFoundException ex) {
                        Logger.getLogger(Vista.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
            }

            if (rmi) {
                if (!tnombre.getText().isEmpty() && !tncodigo.getText().isEmpty() && !tnapellido.getText().isEmpty()) {
                    ArrayList<Registro> cts;
                    cts = crmi.peticion(new Registro(tnombre.getText(), tnapellido.getText(), tncodigo.getText(), tnCarrera.getSelectedItem().toString(), tnSala.getSelectedItem().toString()));
                    refrescartabla(cts, tabla);
                    limpiartexto();
                    JOptionPane.showMessageDialog(this, "Registro guardado con éxito!");
                }
            }
        } else {
            JOptionPane.showMessageDialog(this, "INGRESE TODOS LOS DATOS!");
        }
    }//GEN-LAST:event_BenviarActionPerformed

    private void tncodigoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tncodigoKeyTyped
        char car = evt.getKeyChar();
        if ((car < '0' || car > '9')) {
            evt.consume();
        }
    }//GEN-LAST:event_tncodigoKeyTyped

    private void tnapellidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tnapellidoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tnapellidoActionPerformed

    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Vista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        SwingUtilities.invokeLater(() -> {
            new Vista().setVisible(true);
        });

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Benviar;
    private javax.swing.JFrame RegistroUI;
    private javax.swing.JButton btnRMI;
    private javax.swing.JButton btnTCP;
    private javax.swing.JButton btnUDP;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lbEscuchandoen;
    private javax.swing.JLabel lblEscuchandoa;
    private javax.swing.JPanel pnListaRegistro;
    private javax.swing.JTable tabla;
    private javax.swing.JComboBox<String> tnCarrera;
    private javax.swing.JComboBox<String> tnSala;
    private javax.swing.JTextField tnapellido;
    private javax.swing.JTextField tncodigo;
    private javax.swing.JTextField tnombre;
    // End of variables declaration//GEN-END:variables
}
