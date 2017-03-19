package view;

public class ConsultaEstoqueView extends javax.swing.JInternalFrame {
    
    public ConsultaEstoqueView() {
        //Botao de Grupo dos Filtros.
        btnGrupoFiltro.add(radRefrigerante);
        btnGrupoFiltro.add(radOutro);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnGrupoFiltro = new javax.swing.ButtonGroup();
        pnlConsultaEstoque = new javax.swing.JPanel();
        radRefrigerante = new javax.swing.JRadioButton();
        radOutro = new javax.swing.JRadioButton();
        btnConsultar = new javax.swing.JButton();
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

        javax.swing.GroupLayout pnlConsultaEstoqueLayout = new javax.swing.GroupLayout(pnlConsultaEstoque);
        pnlConsultaEstoque.setLayout(pnlConsultaEstoqueLayout);
        pnlConsultaEstoqueLayout.setHorizontalGroup(
            pnlConsultaEstoqueLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlConsultaEstoqueLayout.createSequentialGroup()
                .addGroup(pnlConsultaEstoqueLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlConsultaEstoqueLayout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addComponent(radRefrigerante)
                        .addGap(32, 32, 32)
                        .addComponent(radOutro))
                    .addGroup(pnlConsultaEstoqueLayout.createSequentialGroup()
                        .addGap(69, 69, 69)
                        .addComponent(btnConsultar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(109, Short.MAX_VALUE))
        );
        pnlConsultaEstoqueLayout.setVerticalGroup(
            pnlConsultaEstoqueLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlConsultaEstoqueLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlConsultaEstoqueLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(radRefrigerante)
                    .addComponent(radOutro))
                .addGap(18, 18, 18)
                .addComponent(btnConsultar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(22, Short.MAX_VALUE))
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
                .addContainerGap(38, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnConsultar;
    private javax.swing.ButtonGroup btnGrupoFiltro;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPanel pnlConsultaEstoque;
    private javax.swing.JRadioButton radOutro;
    private javax.swing.JRadioButton radRefrigerante;
    private javax.swing.JTable tblConsultaEstoque;
    // End of variables declaration//GEN-END:variables
}
