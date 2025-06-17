package visualizar;

import dao.ProdutoDAO;
import dao.CategoriaDAO;
import modelo.Produto;
import modelo.Categoria;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;

/**
 * Classe responsável pela interface gráfica de gerenciamento de produtos.
 * Permite cadastrar, listar, editar e excluir produtos, bem como associá-los a
 * categorias.
 *
 * Esta janela é uma subclasse de {@code javax.swing.JFrame}. Utiliza os DAOs
 * {@code ProdutoDAO} e {@code CategoriaDAO} para persistência em banco de
 * dados.
 *
 * Ao ser construída, a interface carrega a lista de categorias no combobox para
 * seleção.
 *
 * @author Ricardo Zimmer Junior
 */
public class FrmProduto extends javax.swing.JFrame {

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
     * Identificador ds categoria selecionado ou em edição.
     */
    private int id_categoria;

    /**
     * Nome da categoria associada ao produto.
     */
    private String nome_categoria;

    /**
     * Carrega a lista de categorias disponíveis no banco de dados e insere seus
     * nomes no combobox {@code JCBCategoria} da interface.
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
     * Construtor da classe {@code FrmProduto}. Inicializa os componentes da
     * interface gráfica e carrega a lista de categorias no combobox.
     */
    public FrmProduto() {
        initComponents();
        carregaBox();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        JCBCategoria = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        JTFNome = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        JTFPreco = new javax.swing.JTextField();
        JBCadastrar = new javax.swing.JButton();
        JBCancelar = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        JTFUnidade = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        JTFQuantidadeMax = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        JTFQuantidadeMin = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Cadastro de Produto");

        jLabel1.setText("Categoria");

        JCBCategoria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JCBCategoriaActionPerformed(evt);
            }
        });

        jLabel2.setText("Nome");

        jLabel3.setText("Preço");

        JBCadastrar.setText("Cadastrar");
        JBCadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBCadastrarActionPerformed(evt);
            }
        });

        JBCancelar.setText("Cancelar");
        JBCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBCancelarActionPerformed(evt);
            }
        });

        jLabel6.setText("Unidade");

        jLabel4.setText("Quantidade Maxima");

        jLabel5.setText("Quantidade Minima");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(JTFPreco, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(JTFUnidade))
                            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addGap(68, 68, 68)
                                .addComponent(jLabel6))
                            .addComponent(JCBCategoria, javax.swing.GroupLayout.Alignment.LEADING, 0, 174, Short.MAX_VALUE)
                            .addComponent(JTFNome, javax.swing.GroupLayout.Alignment.LEADING))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 120, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(JBCadastrar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(JBCancelar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(JTFQuantidadeMax)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(JTFQuantidadeMin, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(JCBCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(JBCadastrar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(JTFNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(JBCancelar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(JTFPreco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(JTFUnidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(JTFQuantidadeMax, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(JTFQuantidadeMin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(12, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    /**
     * Evento acionado ao clicar no botão "Cancelar". Fecha (ou "descarta") a
     * janela atual, liberando seus recursos.
     *
     * @param evt O evento de ação disparado pelo clique no botão.
     */
    private void JBCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBCancelarActionPerformed
        this.dispose();
    }//GEN-LAST:event_JBCancelarActionPerformed

    private void JCBCategoriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JCBCategoriaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JCBCategoriaActionPerformed
    /**
     * Evento acionado ao clicar no botão "Cadastrar". Valida os campos do
     * formulário, cria um novo objeto {@code Produto} com os dados inseridos, e
     * tenta inseri-lo no banco de dados via {@code ProdutoDAO}.
     *
     * <p>
     * As validações realizadas incluem:</p>
     * <ul>
     * <li>Nome e unidade com no mínimo 2 caracteres</li>
     * <li>Preço maior que zero</li>
     * <li>Quantidade mínima menor que a máxima</li>
     * </ul>
     *
     * <p>
     * Em caso de erro de validação, uma mensagem personalizada é exibida. Se a
     * inserção for bem-sucedida, os campos do formulário são limpos e o usuário
     * recebe uma confirmação.</p>
     *
     * @param evt O evento de ação disparado pelo clique no botão.
     */
    private void JBCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBCadastrarActionPerformed
        try {
            int quantidade = 0;
            int quantidadeMaxima = 0;
            int quantidadeMinima = 0;
            String unidade = "";
            double preco = 0;
            String nome = "";
            String itemSelecionado = (String) JCBCategoria.getSelectedItem();
            
            if (itemSelecionado != null && itemSelecionado.contains(" - ")) {
                String[] partes = itemSelecionado.split(" - ", 2); // limita a 2 partes
                id_categoria = Integer.parseInt(partes[0].trim());
                nome_categoria = partes[1].trim();
            }

            if (this.JTFNome.getText().length() < 2) {
                throw new Mensagem("Nome deve conter ao menos 2 caracteres.");
            } else {
                nome = this.JTFNome.getText();
            }

            if (this.JTFPreco.getText().length() <= 0) {
                throw new Mensagem("Preço deve ser número e maior que zero.");
            } else {
                preco = Double.parseDouble(this.JTFPreco.getText());
            }

            if (this.JTFUnidade.getText().length() < 2) {
                throw new Mensagem("Unidade deve conter ao menos 2 caracteres.");
            } else {
                unidade = this.JTFUnidade.getText();
            }

            if (this.JTFQuantidadeMax.getText().length() <= 0) {
                throw new Mensagem("Quantidade maxima deve ser número e maior que zero.");
            } else {
                quantidadeMaxima = Integer.parseInt(this.JTFQuantidadeMax.getText());
            }

            if (this.JTFQuantidadeMin.getText().length() >= quantidadeMaxima) {
                throw new Mensagem("Quantidade minima não pod ser maior que a quantidade maxima.");
            } else {
                quantidadeMinima = Integer.parseInt(this.JTFQuantidadeMin.getText());
            }

            Categoria categoria = new Categoria(id_categoria, nome_categoria);

            Produto produto = new Produto(id_produto, nome, preco, unidade, quantidade, quantidadeMinima, quantidadeMaxima, categoria);

            if (produtoDAO.inserirProduto(produto)) {

                JOptionPane.showMessageDialog(null, "Produto Cadastrado com Sucesso!");

                this.JTFNome.setText("");
                this.JTFPreco.setText("");
                this.JTFQuantidadeMin.setText("");
                this.JTFQuantidadeMax.setText("");
                this.JTFUnidade.setText("");
            }
        } catch (Mensagem erro) {
            JOptionPane.showMessageDialog(null, erro.getMessage());
        } catch (NumberFormatException erro2) {
            JOptionPane.showMessageDialog(null, "Informe um número válido.");
        }
    }//GEN-LAST:event_JBCadastrarActionPerformed

    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(FrmProduto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmProduto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmProduto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmProduto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmProduto().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton JBCadastrar;
    private javax.swing.JButton JBCancelar;
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
    // End of variables declaration//GEN-END:variables
}
