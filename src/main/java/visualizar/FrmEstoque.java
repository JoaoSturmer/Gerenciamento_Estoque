package visualizar;

import dao.MovimentacaoDAO;
import dao.ProdutoDAO;
import java.time.LocalDateTime;
import javax.swing.table.DefaultTableModel;
import modelo.Produto;
import modelo.Movimentacao;
import javax.swing.JOptionPane;

/**
 * Classe que representa a interface gráfica para o gerenciamento do estoque.
 * Permite exibir os produtos e suas quantidades, bem como realizar
 * movimentações.
 *
 * @author Ricardo Zimmer Junior
 */
public class FrmEstoque extends javax.swing.JFrame {

    /**
     * Objeto DAO responsável pelas operações de produto no banco de dados.
     */
    private ProdutoDAO produtoDAO = new ProdutoDAO();

    /**
     * Objeto DAO responsável pelas operações de movimentacao no banco de dados.
     */
    private MovimentacaoDAO movimentacaoDAO = new MovimentacaoDAO();

    /**
     * Identificador do produto selecionado ou em edição.
     */
    private int id_produto;

    /**
     * Identificador da movimentaçao selecionado ou em edição.
     */
    private int id_movimentacao;

    /**
     * Carrega os dados dos produtos na tabela de estoque. Limpa as linhas
     * existentes e adiciona uma linha para cada produto presente no banco de
     * dados.
     */
    public void carregaTabela() {
        DefaultTableModel modelo = (DefaultTableModel) this.jTableEstoque.getModel();
        modelo.setNumRows(0);

        for (Produto a : produtoDAO.getListaProdutos()) {
            modelo.addRow(new Object[]{
                a.getId(),
                a.getNome(),
                a.getQuantidade(),
                a.getQuantidadeMinima(),
                a.getQuantidadeMaxima()
            });
        }
    }

    /**
     * Construtor da classe FrmEstoque. Inicializa os componentes da interface
     * gráfica e carrega os dados na tabela.
     */
    public FrmEstoque() {
        initComponents();
        carregaTabela();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTableEstoque = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        JTFNome = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        JTFQuantidade = new javax.swing.JTextField();
        JBAdicionar = new javax.swing.JButton();
        JBRetirar = new javax.swing.JButton();
        JBCancelar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Estoque");

        jTableEstoque.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "ID", "Nome", "Quantidade", "Quantidade Min", "Quantidade Max"
            }
        ));
        jTableEstoque.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTableEstoqueMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTableEstoque);

        jLabel1.setText("Nome");

        JTFNome.setEditable(false);

        jLabel2.setText("Quantidade");

        JTFQuantidade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JTFQuantidadeActionPerformed(evt);
            }
        });

        JBAdicionar.setText("Adicionar");
        JBAdicionar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBAdicionarActionPerformed(evt);
            }
        });

        JBRetirar.setText("Retirar");
        JBRetirar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBRetirarActionPerformed(evt);
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
            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(JTFNome, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 217, Short.MAX_VALUE)
                        .addComponent(JBAdicionar))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel1))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(JTFQuantidade, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(JBCancelar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 81, Short.MAX_VALUE)
                            .addComponent(JBRetirar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(JTFNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(JBAdicionar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(JTFQuantidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(JBRetirar))
                .addGap(34, 34, 34)
                .addComponent(JBCancelar)
                .addContainerGap(27, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void JTFQuantidadeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JTFQuantidadeActionPerformed

    }//GEN-LAST:event_JTFQuantidadeActionPerformed
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
     * Método acionado ao clicar no botão "Adicionar". Realiza a adição de
     * quantidade ao estoque do produto selecionado na tabela, registrando uma
     * movimentação do tipo "ENTRADA" com a quantidade informada.
     *
     * @param evt O evento de ação disparado pelo clique no botão.
     */
    private void JBAdicionarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBAdicionarActionPerformed
        try {
            int linha = this.jTableEstoque.getSelectedRow();
            int quantidade1 = Integer.parseInt(this.jTableEstoque.getValueAt(linha, 2).toString());
            int quantidadeMax = Integer.parseInt(this.jTableEstoque.getValueAt(linha, 4).toString());
            String tipo = "ENTRADA";
            LocalDateTime data = LocalDateTime.now();
            int quantidade_movimentacao = Integer.parseInt(JTFQuantidade.getText());
            int quantidade = quantidade_movimentacao + quantidade1;

            Produto produto = new Produto(id_produto, quantidade);

            Movimentacao movimentacao = new Movimentacao(id_movimentacao, quantidade_movimentacao, data, tipo, produto);

            if (quantidade <= quantidadeMax) {
                if (movimentacaoDAO.movimentarEstoque(movimentacao)) {
                    this.JTFNome.setText("");
                    this.JTFQuantidade.setText("");
                    JOptionPane.showMessageDialog(rootPane, "Item adicionado com Sucesso!");
                }
            } else {
                throw new Mensagem("Quantidade não pode ser maior que a quantidade maxima permitida.");
            }
        } catch (NumberFormatException erro2) {
            JOptionPane.showMessageDialog(null, "Informe um número válido.");
        } catch (Mensagem erro) {
            JOptionPane.showMessageDialog(null, erro.getMessage());
        } finally {
            carregaTabela();
        }
    }//GEN-LAST:event_JBAdicionarActionPerformed
    /**
     * Método acionado quando o usuário clica em uma linha da tabela de estoque.
     * Seleciona o produto clicado e preenche o campo de texto com o nome do
     * produto.
     *
     * @param evt O evento de clique do mouse na tabela.
     */
    private void jTableEstoqueMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableEstoqueMouseClicked
        if (this.jTableEstoque.getSelectedRow() != -1) {
            int linha = this.jTableEstoque.getSelectedRow();

            int idSelecionado = Integer.parseInt(this.jTableEstoque.getValueAt(linha, 0).toString());

            this.id_produto = idSelecionado;

            String nome = this.jTableEstoque.getValueAt(linha, 1).toString();

            this.JTFNome.setText(nome);
        }
    }//GEN-LAST:event_jTableEstoqueMouseClicked
    /**
     * Ação para retirar uma quantidade de produto do estoque. Atualiza a
     * quantidade do produto removendo a quantidade especificada, garantindo que
     * a quantidade resultante não seja menor que a quantidade mínima permitida.
     * Registra a movimentação como uma saída no estoque.
     *
     * @param evt O evento de ação disparado pelo botão "Retirar".
     */
    private void JBRetirarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBRetirarActionPerformed
        try {
            int linha = this.jTableEstoque.getSelectedRow();
            int quantidade1 = Integer.parseInt(this.jTableEstoque.getValueAt(linha, 2).toString());
            String tipo = "SAIDA";
            LocalDateTime data = LocalDateTime.now();
            int quantidade_movimentacao = Integer.parseInt(JTFQuantidade.getText());
            int quantidade = quantidade1 - quantidade_movimentacao;

            Produto produtoAtualizado = new Produto(id_produto, quantidade);

            Movimentacao movimentacao = new Movimentacao(id_movimentacao, quantidade_movimentacao, data, tipo, produtoAtualizado);

            if (quantidade >= 0) {
                if (movimentacaoDAO.movimentarEstoque(movimentacao)) {
                    this.JTFNome.setText("");
                    this.JTFQuantidade.setText("");
                    JOptionPane.showMessageDialog(rootPane, "Item retirado com Sucesso!");
                }
            } else {
                throw new Mensagem("Quantidade não pode ser menor que 0.");
            }
        } catch (NumberFormatException erro2) {
            JOptionPane.showMessageDialog(null, "Informe um número válido.");
        } catch (Mensagem erro) {
            JOptionPane.showMessageDialog(null, erro.getMessage());
        } finally {
            carregaTabela();
        }
    }//GEN-LAST:event_JBRetirarActionPerformed

    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(FrmEstoque.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmEstoque.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmEstoque.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmEstoque.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmEstoque().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton JBAdicionar;
    private javax.swing.JButton JBCancelar;
    private javax.swing.JButton JBRetirar;
    private javax.swing.JTextField JTFNome;
    private javax.swing.JTextField JTFQuantidade;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTableEstoque;
    // End of variables declaration//GEN-END:variables
}
