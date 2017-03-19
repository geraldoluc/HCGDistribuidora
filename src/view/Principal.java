package view;

import javax.swing.JFrame;

public class Principal extends javax.swing.JFrame {

    public Principal() {
        initComponents();
        this.setVisible(true);
        this.setExtendedState(JFrame.MAXIMIZED_BOTH);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnl_principal = new javax.swing.JPanel();
        jMenuBar1 = new javax.swing.JMenuBar();
        mnuArquivo = new javax.swing.JMenu();
        mniFornecedor = new javax.swing.JMenuItem();
        jMenu1 = new javax.swing.JMenu();
        mniCadastroEstoque = new javax.swing.JMenuItem();
        mniConsultaEstoque = new javax.swing.JMenuItem();
        mnuSair = new javax.swing.JMenu();
        mniSair = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        javax.swing.GroupLayout pnl_principalLayout = new javax.swing.GroupLayout(pnl_principal);
        pnl_principal.setLayout(pnl_principalLayout);
        pnl_principalLayout.setHorizontalGroup(
            pnl_principalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 781, Short.MAX_VALUE)
        );
        pnl_principalLayout.setVerticalGroup(
            pnl_principalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 493, Short.MAX_VALUE)
        );

        mnuArquivo.setText("Fornecedores");

        mniFornecedor.setText("Controle");
        mniFornecedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mniFornecedorActionPerformed(evt);
            }
        });
        mnuArquivo.add(mniFornecedor);

        jMenuBar1.add(mnuArquivo);

        jMenu1.setText("Estoque");

        mniCadastroEstoque.setText("Cadastro");
        mniCadastroEstoque.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mniCadastroEstoqueActionPerformed(evt);
            }
        });
        jMenu1.add(mniCadastroEstoque);

        mniConsultaEstoque.setText("Consulta");
        mniConsultaEstoque.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mniConsultaEstoqueActionPerformed(evt);
            }
        });
        jMenu1.add(mniConsultaEstoque);

        jMenuBar1.add(jMenu1);

        mnuSair.setText("Sair");

        mniSair.setText("Sair");
        mniSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mniSairActionPerformed(evt);
            }
        });
        mnuSair.add(mniSair);

        jMenuBar1.add(mnuSair);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pnl_principal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pnl_principal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void mniSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mniSairActionPerformed
        this.dispose();
    }//GEN-LAST:event_mniSairActionPerformed

    private void mniFornecedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mniFornecedorActionPerformed
        FornecedorView fornecedor = new FornecedorView();
        pnl_principal.removeAll();
        pnl_principal.add(fornecedor);
        pnl_principal.updateUI();
    }//GEN-LAST:event_mniFornecedorActionPerformed

    private void mniCadastroEstoqueActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mniCadastroEstoqueActionPerformed
        CadastroEstoqueView cadastro = new CadastroEstoqueView();
        pnl_principal.removeAll();
        pnl_principal.add(cadastro);
        pnl_principal.updateUI();
    }//GEN-LAST:event_mniCadastroEstoqueActionPerformed

    private void mniConsultaEstoqueActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mniConsultaEstoqueActionPerformed
        ConsultaEstoqueView consulta = new ConsultaEstoqueView();
        pnl_principal.removeAll();
        pnl_principal.add(consulta);
        pnl_principal.updateUI();
    }//GEN-LAST:event_mniConsultaEstoqueActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem mniCadastroEstoque;
    private javax.swing.JMenuItem mniConsultaEstoque;
    private javax.swing.JMenuItem mniFornecedor;
    private javax.swing.JMenuItem mniSair;
    private javax.swing.JMenu mnuArquivo;
    private javax.swing.JMenu mnuSair;
    private javax.swing.JPanel pnl_principal;
    // End of variables declaration//GEN-END:variables
}
