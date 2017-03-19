package view;

import dao.FornecedorDAO;
import java.util.List;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import model.Fornecedor;

public class FornecedorView extends javax.swing.JInternalFrame {
    Fornecedor fornecedor;
    FornecedorDAO fornecedorDAO;
    List<Fornecedor> listaFornecedor;
    
    public FornecedorView() {
        fornecedorDAO = new FornecedorDAO();
        listaFornecedor = new ArrayList<>();
        initComponents();
        this.setVisible(true);
        atualizarTabelaFornecedor();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        lblCodigo = new javax.swing.JLabel();
        lblNome = new javax.swing.JLabel();
        lblEndereco = new javax.swing.JLabel();
        lblCidade = new javax.swing.JLabel();
        txtCodigo = new javax.swing.JTextField();
        txtNome = new javax.swing.JTextField();
        txtEndereco = new javax.swing.JTextField();
        txtCidade = new javax.swing.JTextField();
        btnGravar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        txtCNPJ = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtTelefone = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtEmail = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblFornecedor = new javax.swing.JTable();
        btnCancelar = new javax.swing.JButton();
        btnExcluir = new javax.swing.JButton();
        btnAlterar = new javax.swing.JButton();
        btnNovo = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(jTable1);

        setClosable(true);
        setTitle("Fornecedores");
        setPreferredSize(new java.awt.Dimension(650, 400));

        lblCodigo.setText("Código");

        lblNome.setText("Nome *");

        lblEndereco.setText("Endereço *");

        lblCidade.setText("Cidade *");

        txtCodigo.setEditable(false);

        txtNome.setEnabled(false);

        txtEndereco.setEnabled(false);

        txtCidade.setEnabled(false);

        btnGravar.setText("Gravar");
        btnGravar.setEnabled(false);
        btnGravar.setPreferredSize(new java.awt.Dimension(75, 30));
        btnGravar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGravarActionPerformed(evt);
            }
        });

        jLabel1.setText("CNPJ *");

        txtCNPJ.setEnabled(false);

        jLabel2.setText("Telefone *");

        txtTelefone.setEnabled(false);

        jLabel3.setText("Email *");

        txtEmail.setEnabled(false);

        tblFornecedor.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "ID", "Nome", "CNPJ", "Telefone", "Cidade"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblFornecedor.getTableHeader().setReorderingAllowed(false);
        tblFornecedor.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblFornecedorMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tblFornecedor);
        if (tblFornecedor.getColumnModel().getColumnCount() > 0) {
            tblFornecedor.getColumnModel().getColumn(0).setResizable(false);
            tblFornecedor.getColumnModel().getColumn(0).setPreferredWidth(10);
            tblFornecedor.getColumnModel().getColumn(1).setResizable(false);
            tblFornecedor.getColumnModel().getColumn(2).setResizable(false);
            tblFornecedor.getColumnModel().getColumn(3).setResizable(false);
            tblFornecedor.getColumnModel().getColumn(4).setResizable(false);
        }

        btnCancelar.setText("Cancelar");
        btnCancelar.setEnabled(false);
        btnCancelar.setPreferredSize(new java.awt.Dimension(75, 30));
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });

        btnExcluir.setText("Excluir");
        btnExcluir.setEnabled(false);
        btnExcluir.setPreferredSize(new java.awt.Dimension(75, 30));
        btnExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExcluirActionPerformed(evt);
            }
        });

        btnAlterar.setText("Alterar");
        btnAlterar.setEnabled(false);
        btnAlterar.setPreferredSize(new java.awt.Dimension(75, 30));
        btnAlterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAlterarActionPerformed(evt);
            }
        });

        btnNovo.setText("Novo");
        btnNovo.setPreferredSize(new java.awt.Dimension(75, 30));

        jLabel4.setForeground(new java.awt.Color(255, 0, 51));
        jLabel4.setText("Observação: Itens com * são obrigatórios.");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(48, 48, 48)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel2)
                            .addComponent(lblEndereco)
                            .addComponent(lblCodigo)
                            .addComponent(lblNome))
                        .addGap(10, 10, 10)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(txtCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(51, 51, 51)
                                .addComponent(jLabel4))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(txtTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabel3))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(txtEndereco, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(lblCidade))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(72, 72, 72)
                                        .addComponent(jLabel1)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtCNPJ, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtCidade, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(89, 89, 89)
                        .addComponent(btnNovo, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnAlterar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnGravar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(51, 51, 51)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 500, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 83, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCodigo)
                    .addComponent(txtCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNome)
                    .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtCNPJ, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblEndereco)
                    .addComponent(txtEndereco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtCidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblCidade))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 10, Short.MAX_VALUE)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnGravar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnAlterar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnNovo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(48, 48, 48))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public void atualizarTabelaFornecedor() {
        fornecedor = new Fornecedor();
        try{
            listaFornecedor = fornecedorDAO.listaFornecedor();
        } catch (SQLException ex){
            Logger.getLogger(FornecedorView.class.getName()).log(Level.SEVERE, null, ex);
        }
        
            String dados[][] = new String[listaFornecedor.size()][5];
            int i = 0;
            for (Fornecedor cliente : listaFornecedor){
                dados[i][0] = String.valueOf(cliente.getCodigoFornecedor());
                dados[i][1] = cliente.getNomeFornecedor();
                dados[i][2] = String.valueOf(cliente.getCnpjFornecedor());
                dados[i][3] = String.valueOf(cliente.getTelefoneFornecedor());
                dados[i][4] = cliente.getCidadeFornecedor();
                i++;
            }
            
            String tituloColuna[] = {"ID", "Nome", "CNPJ", "Telefone", "Cidade"};
            DefaultTableModel tabelaCliente = new DefaultTableModel();
            tabelaCliente.setDataVector(dados, tituloColuna);
            tblFornecedor.setModel(new DefaultTableModel(dados, tituloColuna){
                boolean[] canEdit = new boolean[]{
                    false, false, false, false, false
                };
                
                public boolean isCellEditable(int rowIndex, int ColumnIndex){
                    return canEdit[ColumnIndex];
                }
            });
            
            tblFornecedor.getColumnModel().getColumn(0).setPreferredWidth(20);
            tblFornecedor.getColumnModel().getColumn(1).setPreferredWidth(150);
            tblFornecedor.getColumnModel().getColumn(2).setPreferredWidth(150);
            tblFornecedor.getColumnModel().getColumn(3).setPreferredWidth(80);
            tblFornecedor.getColumnModel().getColumn(4).setPreferredWidth(100);
            
            DefaultTableCellRenderer centralizado = new DefaultTableCellRenderer();
            centralizado.setHorizontalAlignment(SwingConstants.CENTER);
            tblFornecedor.getColumnModel().getColumn(0).setCellRenderer(centralizado);
            tblFornecedor.setRowHeight(25);
            tblFornecedor.updateUI();   
    }
    
    private void btnGravarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGravarActionPerformed
        if (txtNome.getText().isEmpty() || txtEndereco.getText().isEmpty()){
            JOptionPane.showMessageDialog(null, "Preenche todos os campos");
            txtNome.requestFocusInWindow();
            
        } else if (txtCodigo.getText().isEmpty()){
            fornecedor = new Fornecedor();
            fornecedor.setNomeFornecedor(txtNome.getText());
            fornecedor.setCnpjFornecedor(Integer.parseInt(txtCNPJ.getText()));
            fornecedor.setEnderecoFornecedor(txtEndereco.getText());
            fornecedor.setCidadeFornecedor(txtCidade.getText());
            fornecedor.setTelefoneFornecedor(Integer.parseInt(txtTelefone.getText()));
            fornecedor.setEmailFornecedor(txtEmail.getText());
            
            try {
                fornecedorDAO.salvar(fornecedor);
            } catch (SQLException ex){
                Logger.getLogger(FornecedorView.class.getName()).log(Level.SEVERE, null, ex);
            }
            JOptionPane.showMessageDialog(null, "Gravado com sucesso.");
            atualizarTabelaFornecedor();
            preparaSalvareCancelar();
            
        } else {
            fornecedor = new Fornecedor();
            fornecedor.setNomeFornecedor(txtNome.getText());
            fornecedor.setCnpjFornecedor(Integer.parseInt(txtCNPJ.getText()));
            fornecedor.setEnderecoFornecedor(txtEndereco.getText());
            fornecedor.setCidadeFornecedor(txtCidade.getText());
            fornecedor.setTelefoneFornecedor(Integer.parseInt(txtTelefone.getText()));
            fornecedor.setEmailFornecedor(txtEmail.getText());
            
            try {
                fornecedorDAO.salvar(fornecedor);
            } catch (SQLException ex){
                Logger.getLogger(FornecedorView.class.getName()).log(Level.SEVERE, null, ex);
            }
            JOptionPane.showMessageDialog(null, "Gravado com sucesso.");
            atualizarTabelaFornecedor();
            preparaSalvareCancelar();
        }
    }//GEN-LAST:event_btnGravarActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        preparaSalvareCancelar();
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void btnExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirActionPerformed
        if (txtCodigo.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Selecione um Cliente");
        } else {
            fornecedor = new Fornecedor();
            fornecedor.setCodigoFornecedor(Integer.parseInt(txtCodigo.getText()));
            int confirma = JOptionPane.showConfirmDialog(null, "Deseja Excluir: " + txtNome.getText());
            if (confirma == 0){
                try{
                    fornecedorDAO.excluir(fornecedor);
                } catch (SQLException ex){
                    Logger.getLogger(FornecedorView.class.getName()).log(Level.SEVERE, null, ex);
                }
                atualizarTabelaFornecedor();
                preparaExcluir();
            }
        }
    }//GEN-LAST:event_btnExcluirActionPerformed
   
    private void btnAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAlterarActionPerformed
        btnCancelar.setEnabled(false);        
        if (txtCodigo.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Selecione um Cliente");
        } else {
            fornecedor = new Fornecedor();
            fornecedor.setCodigoFornecedor(Integer.parseInt(txtCodigo.getText()));
            fornecedor.setNomeFornecedor(txtNome.getText());
            fornecedor.setEnderecoFornecedor(txtEndereco.getText());
            fornecedor.setCidadeFornecedor(txtCidade.getText());

            try{
                fornecedorDAO.excluir(fornecedor);
            } catch (SQLException ex){
                Logger.getLogger(FornecedorView.class.getName()).log(Level.SEVERE, null, ex);
            }   
            atualizarTabelaFornecedor();
        }      
    }//GEN-LAST:event_btnAlterarActionPerformed

    private void tblFornecedorMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblFornecedorMouseClicked
        Fornecedor fornecedor1;
        fornecedor1 = new Fornecedor();
        
        String aux;
        aux = (tblFornecedor.getValueAt(tblFornecedor.getSelectedRow(),0).toString());
        
        int id = Integer.parseInt(aux);
        fornecedor1.setCodigoFornecedor(id);
        
        try{
            fornecedor1 = FornecedorDAO.busca(id);
        }catch(SQLException ex){
            JOptionPane.showMessageDialog(null, "Erro: "+ex.getMessage());
        }
        
        txtCodigo.setText(Integer.toString(fornecedor1.getCodigoFornecedor()));
        txtNome.setText(fornecedor1.getNomeFornecedor());
        txtCNPJ.setText(Integer.toString(fornecedor1.getCnpjFornecedor()));
        txtEndereco.setText(fornecedor1.getEnderecoFornecedor());
        txtCidade.setText(fornecedor1.getCidadeFornecedor());
        txtTelefone.setText(Integer.toString(fornecedor1.getTelefoneFornecedor()));
        txtEmail.setText(fornecedor1.getEmailFornecedor());
        preparaSelecaoTabela();
    }//GEN-LAST:event_tblFornecedorMouseClicked

    public void preparaNovo(){
        btnNovo.setEnabled(false);
        btnGravar.setEnabled(true);
        btnCancelar.setEnabled(true);
        tblFornecedor.setEnabled(false);
        tblFornecedor.clearSelection();
    }
    
    public void preparaSalvareCancelar(){
        btnNovo.setEnabled(true);
        btnGravar.setEnabled(false);
        btnCancelar.setEnabled(false);
        tblFornecedor.setEnabled(true);
    }
    
    public void preparaSelecaoTabela(){
        btnNovo.setEnabled(true);
        btnExcluir.setEnabled(true);
        btnAlterar.setEnabled(true);
    }
    
    public void preparaAlterar(){
        btnNovo.setEnabled(false);
        btnExcluir.setEnabled(false);
        btnAlterar.setEnabled(false);
        btnGravar.setEnabled(true);
        btnCancelar.setEnabled(true);
        tblFornecedor.setEnabled(false);
        tblFornecedor.clearSelection();
    }
    
    public void preparaExcluir(){
        btnExcluir.setEnabled(false);
        btnAlterar.setEnabled(false);
    }
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAlterar;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnExcluir;
    private javax.swing.JButton btnGravar;
    private javax.swing.JButton btnNovo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JLabel lblCidade;
    private javax.swing.JLabel lblCodigo;
    private javax.swing.JLabel lblEndereco;
    private javax.swing.JLabel lblNome;
    private javax.swing.JTable tblFornecedor;
    private javax.swing.JTextField txtCNPJ;
    private javax.swing.JTextField txtCidade;
    private javax.swing.JTextField txtCodigo;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtEndereco;
    private javax.swing.JTextField txtNome;
    private javax.swing.JTextField txtTelefone;
    // End of variables declaration//GEN-END:variables
}
