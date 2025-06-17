package visualizar;

import dao.CategoriaDAO;
import javax.swing.JOptionPane;
import modelo.Categoria;
import javax.swing.table.DefaultTableModel;

/**
 * Tela de gerenciamento de categorias. Permite listar, adicionar, atualizar e
 * excluir categorias do sistema. A interface apresenta uma tabela com as
 * categorias cadastradas.
 *
 * @author Ricardo Zimmer Junior
 */
public class FrmGerenciamentoCategoria extends javax.swing.JFrame {

    private int id_categoria;
    private CategoriaDAO categoriaDAO = new CategoriaDAO();

    /**
     * Carrega os dados das categorias na tabela da interface. Limpa os dados
     * anteriores e preenche com a lista atual de categorias do banco.
     */
    public void carregaTabela() {

        DefaultTableModel modelo = (DefaultTableModel) this.jTableGerenciar.getModel();
        modelo.setNumRows(0);

        for (Categoria a : categoriaDAO.getListarCategoria()) {
            modelo.addRow(new Object[]{
                a.getId_categoria(),
                a.getNome_categoria(),
                a.getTamanho(),
                a.getEmbalagem()
            });
        }
    }

    /**
     * Construtor da tela de gerenciamento de categorias. Inicializa componentes
     * gráficos e carrega a tabela com as categorias.
     */
    public FrmGerenciamentoCategoria() {
        initComponents();
        carregaTabela();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableGerenciar = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        JTFNome = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        JTFTamanho = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        JTFEmbalagem = new javax.swing.JTextField();
        JBAtualizar = new javax.swing.JButton();
        JBDeletar = new javax.swing.JButton();
        JBCancelar = new javax.swing.JButton();

        jLabel1.setText("Nome");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jTableGerenciar.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "ID", "Nome", "Tamanho", "Embalagem"
            }
        ));
        jTableGerenciar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTableGerenciarMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTableGerenciar);

        jLabel2.setText("Nome");

        jLabel3.setText("Tamanho");

        jLabel4.setText("Embalagem");

        JBAtualizar.setText("Atualizar");
        JBAtualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBAtualizarActionPerformed(evt);
            }
        });

        JBDeletar.setText("Deletar");
        JBDeletar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBDeletarActionPerformed(evt);
            }
        });

        JBCancelar.setText("Cancelar");
        JBCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBCancelarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 400, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(JTFEmbalagem, javax.swing.GroupLayout.DEFAULT_SIZE, 99, Short.MAX_VALUE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(JTFTamanho, javax.swing.GroupLayout.DEFAULT_SIZE, 99, Short.MAX_VALUE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(JTFNome))
                        .addComponent(jLabel4)))
                .addGap(213, 213, 213)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(JBAtualizar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(JBDeletar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(JBCancelar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(JTFNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(JBAtualizar))
                .addGap(18, 18, 18)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(JTFTamanho, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(JBDeletar))
                .addGap(18, 18, 18)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(JTFEmbalagem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(JBCancelar))
                .addGap(0, 4, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
/**
     * Evento acionado ao clicar em uma linha da tabela de gerenciamento.
     * Carrega os dados da linha selecionada para os campos de texto
     * correspondentes no formulário, permitindo a edição dos dados da categoria
     * selecionada.
     *
     * @param evt O evento do clique do mouse na tabela.
     */
    private void jTableGerenciarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableGerenciarMouseClicked
        if (this.jTableGerenciar.getSelectedRow() != -1) {

            int linha = this.jTableGerenciar.getSelectedRow();
            int idSelecionado = Integer.parseInt(this.jTableGerenciar.getValueAt(linha, 0).toString());

            this.id_categoria = idSelecionado;

            String nome = this.jTableGerenciar.getValueAt(linha, 1).toString();
            String embalagem = this.jTableGerenciar.getValueAt(linha, 3).toString();
            String tamanho = this.jTableGerenciar.getValueAt(linha, 2).toString();

            this.JTFNome.setText(nome);
            this.JTFEmbalagem.setText(embalagem);
            this.JTFTamanho.setText(tamanho);
        }
    }//GEN-LAST:event_jTableGerenciarMouseClicked
    /**
     * Ação executada ao clicar no botão "Atualizar". Valida os campos do
     * formulário para a categoria (nome, tamanho e embalagem), atualiza a
     * categoria selecionada no banco de dados e atualiza a tabela. Exibe
     * mensagens de erro caso a validação falhe ou a atualização não seja
     * possível.
     *
     * @param evt O evento de ação disparado pelo clique no botão.
     */
    private void JBAtualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBAtualizarActionPerformed
        try {
            String nome_categoria = "";
            String tamanho = "";
            String embalagem = "";

            if (this.JTFNome.getText().length() < 2) {
                throw new Mensagem("Nome deve conter ao menos 2 caracteres.");
            } else {
                nome_categoria = this.JTFNome.getText();
            }

            if (this.JTFTamanho.getText().length() < 2) {
                throw new Mensagem("Tamanho deve conter ao menos 2 caracteres.");
            } else {
                tamanho = this.JTFTamanho.getText();
            }

            if (this.JTFEmbalagem.getText().length() < 2) {
                throw new Mensagem("Embalagem deve conter ao menos 2 caracteres.");
            } else {
                embalagem = this.JTFEmbalagem.getText();
            }

            Categoria categoriaAtualizada = new Categoria(id_categoria, nome_categoria, tamanho, embalagem);

            if (categoriaDAO.atualizarCategoria(categoriaAtualizada)) {

                this.JTFNome.setText("");
                this.JTFTamanho.setText("");
                this.JTFEmbalagem.setText("");

                JOptionPane.showMessageDialog(rootPane, "Categoria Alterado com Sucesso!");
            }

            System.out.println(categoriaDAO.getListarCategoria().toString());
        } catch (Mensagem erro) {

            JOptionPane.showMessageDialog(null, erro.getMessage());
        } catch (NumberFormatException erro2) {

            JOptionPane.showMessageDialog(null, "Informe um número válido.");
        } finally {

            carregaTabela();
        }
    }//GEN-LAST:event_JBAtualizarActionPerformed
    /**
     * Ação executada ao clicar no botão "Deletar". Verifica se uma categoria
     * está selecionada na tabela, solicita confirmação do usuário para deletar
     * a categoria selecionada e, se confirmado, realiza a exclusão e atualiza a
     * tabela e os campos do formulário.
     *
     * @param evt O evento de ação disparado pelo clique no botão.
     */
    private void JBDeletarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBDeletarActionPerformed
        try {

            if (this.jTableGerenciar.getSelectedRow() == -1) {

                throw new Mensagem(
                        "Primeiro Selecione uma Categoria para APAGAR ");
            } else {

                id_categoria = Integer.parseInt(this.jTableGerenciar.
                        getValueAt(this.jTableGerenciar.getSelectedRow(), 0).
                        toString());
            }

            int respostaUsuario = JOptionPane.
                    showConfirmDialog(null,
                            "Tem certeza que deseja apagar esta Categoria ?");
            if (respostaUsuario == 0) {

                if (categoriaDAO.deletarCategoria(id_categoria)) {

                    this.JTFNome.setText("");
                    this.JTFTamanho.setText("");
                    this.JTFEmbalagem.setText("");

                    JOptionPane.showMessageDialog(rootPane,
                            "Categoria Apagado com Sucesso!");
                }
            }

            System.out.println(categoriaDAO.getListarCategoria().toString());
        } catch (Mensagem erro) {

            JOptionPane.showMessageDialog(null, erro.getMessage());
        } finally {

            carregaTabela();
        }
    }//GEN-LAST:event_JBDeletarActionPerformed
    /**
     * Evento acionado ao clicar no botão "Cancelar". Fecha (ou "descarta") a
     * janela atual, liberando seus recursos.
     *
     * @param evt O evento de ação disparado pelo clique no botão.
     */
    private void JBCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBCancelarActionPerformed
        this.dispose();
    }//GEN-LAST:event_JBCancelarActionPerformed

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
            java.util.logging.Logger.getLogger(FrmGerenciamentoCategoria.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmGerenciamentoCategoria.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmGerenciamentoCategoria.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmGerenciamentoCategoria.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmGerenciamentoCategoria().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton JBAtualizar;
    private javax.swing.JButton JBCancelar;
    private javax.swing.JButton JBDeletar;
    private javax.swing.JTextField JTFEmbalagem;
    private javax.swing.JTextField JTFNome;
    private javax.swing.JTextField JTFTamanho;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTableGerenciar;
    // End of variables declaration//GEN-END:variables
}
