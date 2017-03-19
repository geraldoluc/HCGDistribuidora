package view;

import dao.EstoqueDAO;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import model.Estoque;

public class ConsultaEstoqueView extends javax.swing.JInternalFrame {
    Estoque estoque;
    EstoqueDAO estoqueDAO;
    List<Estoque> listaEstoque;
    boolean aux;
    
    public ConsultaEstoqueView() {
        estoqueDAO = new EstoqueDAO();
        listaEstoque = new ArrayList<>();
        initComponents();
        this.setVisible(true);
        
        //Botao de Grupo dos Filtros.
        btnGrupoFiltro.add(radRefrigerante);
        btnGrupoFiltro.add(radOutro);
    }

    public void atualizarTabelaEstoque() {
        estoque = new Estoque();
        
        try{
            listaEstoque = estoqueDAO.listaEstoque(aux);
        } catch (SQLException ex){
            Logger.getLogger(FornecedorView.class.getName()).log(Level.SEVERE, null, ex);
        }
        
            String dados[][] = new String[listaEstoque.size()][5];
            int i = 0;
            for (Estoque estoq : listaEstoque){
                dados[i][0] = String.valueOf(estoq.getCodigoEstoque());
                dados[i][1] = estoq.getDescricaoEstoque();
                dados[i][2] = String.valueOf(estoq.isCategoriaEstoque());
                
                if (dados[i][2] == "false")
                    dados[i][2] = "Refrigerante";
                else
                    dados[i][2] = "Outro";
                
                dados[i][3] = String.valueOf(estoq.getPreco_custoEstoque());
                dados[i][4] = String.valueOf(estoq.getPreco_vendaEstoque());
                i++;
            }
            
            String tituloColuna[] = {"Código", "Descrição", "Categoria", "Preço de Custo", "Preço de Venda"};
            DefaultTableModel tabelaCliente = new DefaultTableModel();
            tabelaCliente.setDataVector(dados, tituloColuna);
            tblConsultaEstoque.setModel(new DefaultTableModel(dados, tituloColuna){
                boolean[] canEdit = new boolean[]{
                    false, false, false, false, false
                };
                
                public boolean isCellEditable(int rowIndex, int ColumnIndex){
                    return canEdit[ColumnIndex];
                }
            });
            
            tblConsultaEstoque.getColumnModel().getColumn(0).setPreferredWidth(20);
            tblConsultaEstoque.getColumnModel().getColumn(1).setPreferredWidth(150);
            tblConsultaEstoque.getColumnModel().getColumn(2).setPreferredWidth(150);
            tblConsultaEstoque.getColumnModel().getColumn(3).setPreferredWidth(80);
            tblConsultaEstoque.getColumnModel().getColumn(4).setPreferredWidth(100);
            
            DefaultTableCellRenderer centralizado = new DefaultTableCellRenderer();
            centralizado.setHorizontalAlignment(SwingConstants.CENTER);
            tblConsultaEstoque.getColumnModel().getColumn(0).setCellRenderer(centralizado);
            tblConsultaEstoque.setRowHeight(25);
            tblConsultaEstoque.updateUI();   
    }
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnGrupoFiltro = new javax.swing.ButtonGroup();
        pnlConsultaEstoque = new javax.swing.JPanel();
        radRefrigerante = new javax.swing.JRadioButton();
        radOutro = new javax.swing.JRadioButton();
        btnConsultar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblConsultaEstoque = new javax.swing.JTable();

        setClosable(true);
        setTitle("Consulta de Estoque");
        setPreferredSize(new java.awt.Dimension(800, 600));

        pnlConsultaEstoque.setBorder(javax.swing.BorderFactory.createTitledBorder("Filtros"));

        radRefrigerante.setText("Refrigerante");

        radOutro.setText("Outro");

        btnConsultar.setText("Consultar");
        btnConsultar.setMaximumSize(new java.awt.Dimension(90, 35));
        btnConsultar.setMinimumSize(new java.awt.Dimension(90, 35));
        btnConsultar.setPreferredSize(new java.awt.Dimension(90, 35));
        btnConsultar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConsultarActionPerformed(evt);
            }
        });

        jLabel1.setForeground(new java.awt.Color(255, 0, 51));
        jLabel1.setText("Observação: Obrigatorio escolher algum filtro.");

        javax.swing.GroupLayout pnlConsultaEstoqueLayout = new javax.swing.GroupLayout(pnlConsultaEstoque);
        pnlConsultaEstoque.setLayout(pnlConsultaEstoqueLayout);
        pnlConsultaEstoqueLayout.setHorizontalGroup(
            pnlConsultaEstoqueLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlConsultaEstoqueLayout.createSequentialGroup()
                .addGroup(pnlConsultaEstoqueLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlConsultaEstoqueLayout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addGroup(pnlConsultaEstoqueLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addGroup(pnlConsultaEstoqueLayout.createSequentialGroup()
                                .addGap(33, 33, 33)
                                .addComponent(radRefrigerante)
                                .addGap(18, 18, 18)
                                .addComponent(radOutro))))
                    .addGroup(pnlConsultaEstoqueLayout.createSequentialGroup()
                        .addGap(89, 89, 89)
                        .addComponent(btnConsultar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(79, Short.MAX_VALUE))
        );
        pnlConsultaEstoqueLayout.setVerticalGroup(
            pnlConsultaEstoqueLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlConsultaEstoqueLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlConsultaEstoqueLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(radRefrigerante)
                    .addComponent(radOutro))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnConsultar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 8, Short.MAX_VALUE)
                .addComponent(jLabel1))
        );

        tblConsultaEstoque.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Código", "Descrição", "Categoria", "Preço de Custo", "Valor de Venda"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblConsultaEstoque);
        if (tblConsultaEstoque.getColumnModel().getColumnCount() > 0) {
            tblConsultaEstoque.getColumnModel().getColumn(0).setResizable(false);
            tblConsultaEstoque.getColumnModel().getColumn(1).setResizable(false);
            tblConsultaEstoque.getColumnModel().getColumn(2).setResizable(false);
            tblConsultaEstoque.getColumnModel().getColumn(3).setResizable(false);
            tblConsultaEstoque.getColumnModel().getColumn(4).setResizable(false);
        }

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 746, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pnlConsultaEstoque, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(28, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pnlConsultaEstoque, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(37, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnConsultarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConsultarActionPerformed
       if (radRefrigerante.isSelected()){
           aux = false;
           atualizarTabelaEstoque();
       }
       else if (radOutro.isSelected()){
           aux = true;
           atualizarTabelaEstoque();
       }
       else
           JOptionPane.showMessageDialog(null, "Por favor, preencher algum campo.");
    }//GEN-LAST:event_btnConsultarActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnConsultar;
    private javax.swing.ButtonGroup btnGrupoFiltro;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPanel pnlConsultaEstoque;
    private javax.swing.JRadioButton radOutro;
    private javax.swing.JRadioButton radRefrigerante;
    private javax.swing.JTable tblConsultaEstoque;
    // End of variables declaration//GEN-END:variables
}
