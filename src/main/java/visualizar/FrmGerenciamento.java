package visualizar;

import dao.ProdutoDAO;
import dao.CategoriaDAO;
import javax.swing.table.DefaultTableModel;
import modelo.Produto;
import java.util.ArrayList;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import modelo.Categoria;

/**
 * Classe FrmGerenciamento representa a interface gráfica para gerenciamento de
 * produtos cadastrados no sistema. Exibe uma tabela com os produtos e permite
 * visualizar categorias disponíveis.
 *
 * Utiliza as classes DAO para acessar os dados no banco: - {@code ProdutoDAO}
 * para manipulação de produtos - {@code CategoriaDAO} para manipulação de
 * categorias
 *
 * Esta tela é normalmente utilizada por administradores para verificar e
 * controlar os dados de estoque.
 *
 * @author Ricardo Zimmer Junior
 */
public class FrmGerenciamento extends javax.swing.JFrame {

    /**
     * Objeto DAO responsável pelas operações de produto no banco de dados.
     */
    private ProdutoDAO produtoDAO = new ProdutoDAO();

    /**
     * Objeto DAO responsável pelas operações de categoria no banco de dados.
     */
    private CategoriaDAO categoriaDAO = new CategoriaDAO();

    /**
     * Identificador do produto selecionado ou em edição.
     */
    private int id_produto;
    
    /**
     * Identificador da categoria selecionado ou em edição.
     */
    private int id_categoria;

    /**
     * Nome da categoria associada ao produto.
     */
    private String nome_categoria;

    /**
     * Carrega os dados de produtos do banco e os exibe na tabela
     * jTableGerenciar. Cada linha representa um produto com as seguintes
     * colunas: ID, Categoria, Nome, Quantidade, Quantidade Máxima, Quantidade
     * Mínima, Unidade, Preço.
     */
    public void carregaTabela() {
        DefaultTableModel modelo = (DefaultTableModel) this.jTableGerenciar.getModel();
        modelo.setNumRows(0);

        for (Produto a : produtoDAO.getListaProdutos()) {
            modelo.addRow(new Object[]{
                a.getId(),
                a.getCategoria().getNome_categoria(),
                a.getNome(),
                a.getQuantidade(),
                a.getQuantidadeMaxima(),
                a.getQuantidadeMinima(),
                a.getUnidade(),
                a.getPreco()
            });
        }
    }

    /**
     * Carrega os nomes das categorias cadastradas no banco e os adiciona no
     * combo box {@code JCBCategoria}. Utilizado para seleção de categoria ao
     * cadastrar ou editar um produto.
     */
    public void carregaBox() {
        DefaultComboBoxModel modelo = (DefaultComboBoxModel) this.JCBCategoria.getModel();

        for (Categoria a : categoriaDAO.getListarCategoria()) {
            modelo.addElement(
                    a.toString()
            );
        }
    }

    /**
     * Construtor padrão. Inicializa os componentes da interface, carrega os
     * dados na tabela de produtos e no combo box de categorias.
     */
    public FrmGerenciamento() {
        initComponents();
        carregaTabela();
        carregaBox();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTableGerenciar = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        JCBCategoria = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        JTFNome = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        JTFPreco = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        JTFQuantidadeMax = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        JTFQuantidadeMin = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        JTFUnidade = new javax.swing.JTextField();
        JBAtualizar = new javax.swing.JButton();
        JBDeletar = new javax.swing.JButton();
        JBCancelar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Gerenciamento de Produto");

        jTableGerenciar.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null}
            },
            new String [] {
                "ID", "Categoria", "Nome", "Quantidade", "Quantidade Min", "Quantidade Max", "Unidade", "Preço"
            }
        ));
        jTableGerenciar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTableGerenciarMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTableGerenciar);

        jLabel1.setText("Categoria");

        jLabel2.setText("Nome");

        jLabel3.setText("Preço");

        jLabel4.setText("Quantidade Maxima");

        jLabel5.setText("Quantidade Minima");

        jLabel6.setText("Unidade");

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
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 747, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(JTFPreco, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(JCBCategoria, 0, 150, Short.MAX_VALUE)
                    .addComponent(JTFNome))
                .addGap(128, 128, 128)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel5)
                                .addComponent(JTFQuantidadeMax))
                            .addComponent(JTFQuantidadeMin, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(254, 254, 254)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(JBAtualizar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(JBDeletar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6)
                            .addComponent(JTFUnidade, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(255, 255, 255)
                        .addComponent(JBCancelar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel4))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(JCBCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(JTFQuantidadeMax, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(JBAtualizar))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(jLabel5))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(JTFNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(JTFQuantidadeMin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(JBDeletar))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(jLabel6))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(JTFPreco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(JTFUnidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(JBCancelar, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(0, 25, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
/**
     * Ação executada quando uma linha da tabela de produtos é clicada.
     *
     * <p>
     * Este método recupera os dados da linha selecionada na
     * {@code jTableGerenciar} e os exibe nos campos de entrada do formulário.
     * Também armazena o ID do produto selecionado na variável
     * {@code id_produto} para permitir futuras atualizações ou exclusões.</p>
     *
     * <p>
     * Campos populados após o clique:</p>
     * <ul>
     * <li>Nome do produto</li>
     * <li>Preço</li>
     * <li>Categoria (selecionada no combo box)</li>
     * <li>Quantidade mínima e máxima</li>
     * <li>Unidade</li>
     * </ul>
     *
     * @param evt o evento de clique do mouse na tabela
     */
    private void jTableGerenciarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableGerenciarMouseClicked
        if (this.jTableGerenciar.getSelectedRow() != -1) {

            int linha = this.jTableGerenciar.getSelectedRow();
            int idSelecionado = Integer.parseInt(this.jTableGerenciar.getValueAt(linha, 0).toString());
            this.id_produto = idSelecionado;

            String nome = this.jTableGerenciar.getValueAt(linha, 2).toString();
            String preco = this.jTableGerenciar.getValueAt(linha, 7).toString();
            String categoria = this.jTableGerenciar.getValueAt(linha, 1).toString();
            String quantidademax = this.jTableGerenciar.getValueAt(linha, 5).toString();
            String quantidademin = this.jTableGerenciar.getValueAt(linha, 4).toString();
            String unidade = this.jTableGerenciar.getValueAt(linha, 6).toString();

            this.JTFNome.setText(nome);
            this.JTFPreco.setText(preco);
            this.JTFQuantidadeMin.setText(quantidademin);
            this.JTFQuantidadeMax.setText(quantidademax);
            this.JTFUnidade.setText(unidade);

            this.JCBCategoria.setSelectedItem(categoria);
        }
    }//GEN-LAST:event_jTableGerenciarMouseClicked
    /**
     * Ação executada quando o botão "Atualizar" é clicado.
     *
     * <p>
     * Este método realiza as seguintes operações:</p>
     * <ul>
     * <li>Valida os campos de entrada do formulário.</li>
     * <li>Cria um objeto {@link Produto} com os novos dados informados.</li>
     * <li>Atualiza o produto correspondente no banco de dados usando
     * {@link ProdutoDAO}.</li>
     * <li>Limpa os campos do formulário após a atualização.</li>
     * <li>Exibe mensagens ao usuário em caso de sucesso ou erro.</li>
     * <li>Recarrega a tabela de produtos exibida na interface.</li>
     * </ul>
     *
     * @param evt o evento de clique no botão "Atualizar"
     */
    private void JBAtualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBAtualizarActionPerformed
        try {
            int quantidade = 0;
            String nome = "";
            double preco = 0;
            int quantidadeMaxima = 0;
            int quantidadeMinima = 0;
            String unidade = "";
            String categoria = this.JCBCategoria.getSelectedItem().toString();

            if (categoria != null && categoria.contains(" - ")) {
                String[] partes = categoria.split(" - ", 2); // limita a 2 partes
                id_categoria = Integer.parseInt(partes[0].trim());
                nome_categoria = partes[1].trim();
            }

            if (this.JTFNome.getText().length() < 2) {
                throw new Mensagem("Nome deve conter ao menos 2 caracteres.");
            } else {
                nome = this.JTFNome.getText();
            }

            if (this.JTFQuantidadeMax.getText().length() <= 0) {
                throw new Mensagem("Quantidade Maxima deve ser número.");
            } else {

                quantidadeMaxima = Integer.parseInt(this.JTFQuantidadeMax.getText());
            }

            if (this.JTFQuantidadeMin.getText().length() >= quantidadeMaxima) {
                throw new Mensagem("Quantidade Minima não pode ser maior que a quantidade maxima.");
            } else {

                quantidadeMinima = Integer.parseInt(this.JTFQuantidadeMin.getText());
            }

            if (this.JTFUnidade.getText().length() < 2) {
                throw new Mensagem("Unidade deve conter ao menos 2 caracteres.");
            } else {
                unidade = this.JTFUnidade.getText();
            }

            if (this.JTFPreco.getText().length() <= 0) {
                throw new Mensagem("Preço deve ser número e maior que zero.");
            } else {

                preco = Double.parseDouble(this.JTFPreco.getText());
            }

            Categoria cat = new Categoria(id_categoria, nome_categoria);

            Produto produtoAtualizado = new Produto(id_produto, nome, preco, unidade, quantidade, quantidadeMinima, quantidadeMaxima, cat);

            if (produtoDAO.atualizarProduto(produtoAtualizado)) {
                this.JTFNome.setText("");
                this.JTFPreco.setText("");
                this.JTFQuantidadeMin.setText("");
                this.JTFQuantidadeMax.setText("");
                this.JTFUnidade.setText("");
                JOptionPane.showMessageDialog(rootPane, "Produto Alterado com Sucesso!");
            }
            System.out.println(produtoDAO.getListaProdutos().toString());
        } catch (Mensagem erro) {
            JOptionPane.showMessageDialog(null, erro.getMessage());
        } catch (NumberFormatException erro2) {
            JOptionPane.showMessageDialog(null, "Informe um número válido.");
        } finally {
            carregaTabela();
        }
    }//GEN-LAST:event_JBAtualizarActionPerformed
    /**
     * Ação executada ao clicar no botão "Deletar".
     *
     * <p>
     * Este método realiza a exclusão do produto selecionado na tabela
     * {@code jTableGerenciar}. Primeiro verifica se algum produto está
     * selecionado. Em seguida, solicita confirmação do usuário. Se o usuário
     * confirmar, o produto é removido do banco de dados através da DAO
     * {@code ProdutoDAO}. Após a exclusão, os campos do formulário são limpos e
     * a tabela é recarregada.</p>
     *
     * @param evt o evento de clique do botão
     */
    private void JBDeletarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBDeletarActionPerformed
        try {
            if (this.jTableGerenciar.getSelectedRow() == -1) {
                throw new Mensagem(
                        "Primeiro Selecione um Aluno para APAGAR ");
            } else {
                id_produto = Integer.parseInt(this.jTableGerenciar.
                        getValueAt(this.jTableGerenciar.getSelectedRow(), 0).
                        toString());
            }

            int respostaUsuario = JOptionPane.
                    showConfirmDialog(null,
                            "Tem certeza que deseja apagar este Aluno ?");

            if (respostaUsuario == 0) {
                if (produtoDAO.deletarProduto(id_produto)) {
                    this.JTFNome.setText("");
                    this.JTFPreco.setText("");
                    JOptionPane.showMessageDialog(rootPane, "Produto Apagado com Sucesso!");
                }
            }
            System.out.println(produtoDAO.getListaProdutos().toString());
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

    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(FrmGerenciamento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmGerenciamento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmGerenciamento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmGerenciamento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmGerenciamento().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton JBAtualizar;
    private javax.swing.JButton JBCancelar;
    private javax.swing.JButton JBDeletar;
    private javax.swing.JComboBox<String> JCBCategoria;
    private javax.swing.JTextField JTFNome;
    private javax.swing.JTextField JTFPreco;
    private javax.swing.JTextField JTFQuantidadeMax;
    private javax.swing.JTextField JTFQuantidadeMin;
    private javax.swing.JTextField JTFUnidade;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTableGerenciar;
    // End of variables declaration//GEN-END:variables
}
