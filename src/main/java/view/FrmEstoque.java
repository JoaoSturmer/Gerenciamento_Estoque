package view;

import javax.swing.table.DefaultTableModel;
import model.Produto;
import java.util.*;
import javax.swing.JOptionPane;

public class FrmEstoque extends javax.swing.JFrame {

    private Produto objetoproduto;
    private int id;

    public void carregaTabela() {
        DefaultTableModel modelo = (DefaultTableModel) this.jTableEstoque.getModel();
        modelo.setNumRows(0); //Posiciona na primeira linha da tabela
//Carrega a lista de objetos aluno
        ArrayList<Produto> minhaLista = objetoproduto.getMinhaLista();
        for (Produto a : minhaLista) {
            modelo.addRow(new Object[]{
                a.getId(),
                a.getCategoria(),
                a.getNome(),
                a.getQuantidade(),
                a.getPreco()
            });
        }
    }

    public FrmEstoque() {
        initComponents();
        this.objetoproduto = new Produto();
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
                "ID", "Categoria", "Nome", "Quantidade", "Preço"
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
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 133, Short.MAX_VALUE)
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

    private void JBCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBCancelarActionPerformed
        this.dispose();
    }//GEN-LAST:event_JBCancelarActionPerformed

    private void JBAdicionarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBAdicionarActionPerformed
        int linha = this.jTableEstoque.getSelectedRow();
        double preco = Double.parseDouble(this.jTableEstoque.getValueAt(linha, 4).toString());
        String nome = this.jTableEstoque.getValueAt(linha, 2).toString();
        String categoria = this.jTableEstoque.getValueAt(linha, 1).toString();
        int quantidade1 = Integer.parseInt(this.jTableEstoque.getValueAt(linha, 3).toString());

        int soma = Integer.parseInt(JTFQuantidade.getText());
        int quantidade = soma + quantidade1;

        if (this.objetoproduto.updateProdutoBD(quantidade, nome, preco, categoria, id)) {
            this.JTFNome.setText("");
            this.JTFQuantidade.setText("");
            JOptionPane.showMessageDialog(rootPane, "Item adicionado com Sucesso!");
            carregaTabela();
        }
    }//GEN-LAST:event_JBAdicionarActionPerformed

    private void jTableEstoqueMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableEstoqueMouseClicked
        if (this.jTableEstoque.getSelectedRow() != -1) {
            int linha = this.jTableEstoque.getSelectedRow();

            // CAPTURE O ID!
            int idSelecionado = Integer.parseInt(this.jTableEstoque.getValueAt(linha, 0).toString());
            this.id = idSelecionado; // Armazena em atributo da classe

            // Popula os campos
            String nome = this.jTableEstoque.getValueAt(linha, 2).toString();

            this.JTFNome.setText(nome);
        }
    }//GEN-LAST:event_jTableEstoqueMouseClicked

    private void JBRetirarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBRetirarActionPerformed
        try {
            int linha = this.jTableEstoque.getSelectedRow();
            double preco = Double.parseDouble(this.jTableEstoque.getValueAt(linha, 4).toString());
            String nome = this.jTableEstoque.getValueAt(linha, 2).toString();
            String categoria = this.jTableEstoque.getValueAt(linha, 1).toString();
            int quantidade1 = Integer.parseInt(this.jTableEstoque.getValueAt(linha, 3).toString());

            int soma = Integer.parseInt(JTFQuantidade.getText());
            int quantidade = quantidade1 - soma;

            if (this.objetoproduto.updateProdutoBD(quantidade, nome, preco, categoria, id)) {
                this.JTFNome.setText("");
                this.JTFQuantidade.setText("");
                JOptionPane.showMessageDialog(rootPane, "Item retirado com Sucesso!");
            }

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
