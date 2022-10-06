
package br.senai.sp.jandira.ui;

import br.senai.sp.jandira.dao.PlanoDeSaudeDao;
import javax.swing.JTable;

public class HomeFrame extends javax.swing.JFrame {

    public HomeFrame() {
        System.out.println("Criando a tela home...");
        initComponents();
        PlanoDeSaudeDao.criarPlanoDeSaudeTeste();
        criarTabelaPlanosDeSaude();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        labeltitulo = new javax.swing.JLabel();
        labelicon = new javax.swing.JLabel();
        buttonpacient = new javax.swing.JButton();
        buttondoctor = new javax.swing.JButton();
        buttonespecialidade = new javax.swing.JButton();
        buttonsaude = new javax.swing.JButton();
        buttonexit = new javax.swing.JButton();
        buttonagenda = new javax.swing.JButton();
        panelPlanodeSaude = new javax.swing.JPanel();
        labelPlanodeSaude = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablePlanoDeSaude = new javax.swing.JTable();
        buttonnew = new javax.swing.JButton();
        buttonedit = new javax.swing.JButton();
        buttondelete = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jPanel1.setBackground(new java.awt.Color(255, 0, 204));
        jPanel1.setLayout(null);

        labeltitulo.setFont(new java.awt.Font("Tw Cen MT", 3, 36)); // NOI18N
        labeltitulo.setForeground(new java.awt.Color(255, 255, 255));
        labeltitulo.setText("Sistema para Agendamento de Consultas");
        jPanel1.add(labeltitulo);
        labeltitulo.setBounds(140, 30, 600, 50);

        labelicon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/senai/sp/jandira/img/agenda.png"))); // NOI18N
        jPanel1.add(labelicon);
        labelicon.setBounds(40, 20, 64, 70);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 1090, 100);

        buttonpacient.setBackground(new java.awt.Color(204, 204, 255));
        buttonpacient.setFont(new java.awt.Font("Microsoft YaHei UI", 3, 12)); // NOI18N
        buttonpacient.setForeground(new java.awt.Color(102, 102, 102));
        buttonpacient.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/senai/sp/jandira/img/pacient.png"))); // NOI18N
        buttonpacient.setToolTipText("Pacientes");
        buttonpacient.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonpacientActionPerformed(evt);
            }
        });
        getContentPane().add(buttonpacient);
        buttonpacient.setBounds(110, 120, 90, 70);

        buttondoctor.setBackground(new java.awt.Color(204, 204, 255));
        buttondoctor.setFont(new java.awt.Font("Microsoft YaHei UI", 3, 12)); // NOI18N
        buttondoctor.setForeground(new java.awt.Color(102, 102, 102));
        buttondoctor.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/senai/sp/jandira/img/doctor.png"))); // NOI18N
        buttondoctor.setToolTipText("Médicos");
        buttondoctor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttondoctorActionPerformed(evt);
            }
        });
        getContentPane().add(buttondoctor);
        buttondoctor.setBounds(210, 120, 90, 70);

        buttonespecialidade.setBackground(new java.awt.Color(204, 204, 255));
        buttonespecialidade.setFont(new java.awt.Font("Microsoft YaHei UI", 3, 12)); // NOI18N
        buttonespecialidade.setForeground(new java.awt.Color(102, 102, 102));
        buttonespecialidade.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/senai/sp/jandira/img/especi.png"))); // NOI18N
        buttonespecialidade.setToolTipText("Especialidades");
        buttonespecialidade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonespecialidadeActionPerformed(evt);
            }
        });
        getContentPane().add(buttonespecialidade);
        buttonespecialidade.setBounds(310, 120, 90, 70);

        buttonsaude.setFont(new java.awt.Font("Microsoft YaHei UI", 3, 12)); // NOI18N
        buttonsaude.setForeground(new java.awt.Color(102, 102, 102));
        buttonsaude.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/senai/sp/jandira/img/plano.png"))); // NOI18N
        buttonsaude.setToolTipText("Planos de Saúde");
        buttonsaude.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonsaudeActionPerformed(evt);
            }
        });
        getContentPane().add(buttonsaude);
        buttonsaude.setBounds(410, 120, 90, 70);

        buttonexit.setBackground(new java.awt.Color(204, 204, 255));
        buttonexit.setFont(new java.awt.Font("Microsoft YaHei UI", 3, 12)); // NOI18N
        buttonexit.setForeground(new java.awt.Color(255, 0, 0));
        buttonexit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/senai/sp/jandira/img/exit.png"))); // NOI18N
        buttonexit.setToolTipText("Sair");
        buttonexit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonexitActionPerformed(evt);
            }
        });
        getContentPane().add(buttonexit);
        buttonexit.setBounds(980, 130, 90, 70);

        buttonagenda.setBackground(new java.awt.Color(204, 204, 255));
        buttonagenda.setFont(new java.awt.Font("Microsoft YaHei UI", 3, 12)); // NOI18N
        buttonagenda.setForeground(new java.awt.Color(102, 102, 102));
        buttonagenda.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/senai/sp/jandira/img/agenda (2).png"))); // NOI18N
        buttonagenda.setToolTipText("Agenda");
        buttonagenda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonagendaActionPerformed(evt);
            }
        });
        getContentPane().add(buttonagenda);
        buttonagenda.setBounds(10, 120, 90, 70);

        panelPlanodeSaude.setBackground(new java.awt.Color(255, 204, 255));
        panelPlanodeSaude.setLayout(null);

        labelPlanodeSaude.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        labelPlanodeSaude.setText("Planos de Saúde");
        labelPlanodeSaude.setToolTipText("");
        panelPlanodeSaude.add(labelPlanodeSaude);
        labelPlanodeSaude.setBounds(20, 10, 120, 20);

        tablePlanoDeSaude.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(tablePlanoDeSaude);

        panelPlanodeSaude.add(jScrollPane1);
        jScrollPane1.setBounds(20, 50, 1000, 320);

        buttonnew.setBackground(new java.awt.Color(204, 204, 255));
        buttonnew.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/senai/sp/jandira/img/new.png"))); // NOI18N
        buttonnew.setToolTipText("new");
        panelPlanodeSaude.add(buttonnew);
        buttonnew.setBounds(960, 380, 70, 60);

        buttonedit.setBackground(new java.awt.Color(204, 204, 255));
        buttonedit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/senai/sp/jandira/img/edit.png"))); // NOI18N
        buttonedit.setToolTipText("edit");
        panelPlanodeSaude.add(buttonedit);
        buttonedit.setBounds(880, 380, 70, 60);

        buttondelete.setBackground(new java.awt.Color(204, 204, 255));
        buttondelete.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/senai/sp/jandira/img/lixeira.png"))); // NOI18N
        buttondelete.setToolTipText("delete");
        panelPlanodeSaude.add(buttondelete);
        buttondelete.setBounds(800, 380, 70, 60);

        getContentPane().add(panelPlanodeSaude);
        panelPlanodeSaude.setBounds(0, 240, 1090, 490);

        jPanel3.setBackground(new java.awt.Color(255, 204, 255));
        jPanel3.setLayout(null);
        getContentPane().add(jPanel3);
        jPanel3.setBounds(0, 100, 1090, 140);

        setBounds(0, 0, 1105, 732);
    }// </editor-fold>//GEN-END:initComponents

    private void buttonpacientActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonpacientActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_buttonpacientActionPerformed

    private void buttondoctorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttondoctorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_buttondoctorActionPerformed

    private void buttonespecialidadeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonespecialidadeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_buttonespecialidadeActionPerformed

    private void buttonsaudeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonsaudeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_buttonsaudeActionPerformed

    private void buttonexitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonexitActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_buttonexitActionPerformed

    private void buttonagendaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonagendaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_buttonagendaActionPerformed

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
            java.util.logging.Logger.getLogger(HomeFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(HomeFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(HomeFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(HomeFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new HomeFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonagenda;
    private javax.swing.JButton buttondelete;
    private javax.swing.JButton buttondoctor;
    private javax.swing.JButton buttonedit;
    private javax.swing.JButton buttonespecialidade;
    private javax.swing.JButton buttonexit;
    private javax.swing.JButton buttonnew;
    private javax.swing.JButton buttonpacient;
    private javax.swing.JButton buttonsaude;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel labelPlanodeSaude;
    private javax.swing.JLabel labelicon;
    private javax.swing.JLabel labeltitulo;
    private javax.swing.JPanel panelPlanodeSaude;
    private javax.swing.JTable tablePlanoDeSaude;
    // End of variables declaration//GEN-END:variables

     private void criarTabelaPlanosDeSaude() {
     
         tablePlanoDeSaude.setModel(PlanoDeSaudeDao.getTableModel());
        //desativar o redimensionamento da jtable
        tablePlanoDeSaude.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
        
        //Definir a largura de cada coluna 
        tablePlanoDeSaude.getColumnModel().getColumn(0).setPreferredWidth(100);
        tablePlanoDeSaude.getColumnModel().getColumn(1).setPreferredWidth(300);
        tablePlanoDeSaude.getColumnModel().getColumn(2).setPreferredWidth(300);
        
        //Impedir/bloquear a movimentação das colunas 
        tablePlanoDeSaude.getTableHeader().setReorderingAllowed(false);
        
        //Bloquear edição das células 
        tablePlanoDeSaude.setDefaultEditor(Object.class, null);
 
     
     }



}
