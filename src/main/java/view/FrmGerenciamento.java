package view;

import javax.swing.table.DefaultTableModel;
import model.Produto;
import java.util.*;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import model.Categoria;

public class FrmGerenciamento extends javax.swing.JFrame {

    private Produto objetoproduto;
    private int id;

    public void carregaTabela() {
        DefaultTableModel modelo = (DefaultTableModel) this.jTableGerenciar.getModel();
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

    public void carregaBox() {
        DefaultComboBoxModel modelo = (DefaultComboBoxModel) this.JCBCategoria.getModel();

        ArrayList<Categoria> minhaListac = objetoproduto.getMinhaListac();
        for (Categoria a : minhaListac) {
            modelo.addElement(
                    a.getCategoria()
            );
        }
    }

    public FrmGerenciamento() {
        initComponents();
        this.objetoproduto = new Produto();
        carregaTabela();
        carregaBox();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTableGerenciar = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        JTFNome = new javax.swing.JTextField();
        JCBCategoria = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        JTFPreco = new javax.swing.JTextField();
        JBAtualizar = new javax.swing.JButton();
        JBDeletar = new javax.swing.JButton();
        JBCancelar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Gerenciamento de Produto");

        jTableGerenciar.setModel(new javax.swing.table.DefaultTableModel(
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
        jTableGerenciar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTableGerenciarMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTableGerenciar);

        jLabel1.setText("Categoria");

        jLabel2.setText("Nome");

        jLabel3.setText("Preço");

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
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(JTFNome)
                            .addComponent(JCBCategoria, 0, 174, Short.MAX_VALUE)
                            .addComponent(JTFPreco, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(JBAtualizar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(JBCancelar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(JBDeletar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(JCBCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(JBAtualizar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(JTFNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(JBDeletar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(JTFPreco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(JBCancelar))
                .addGap(0, 25, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void JBCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBCancelarActionPerformed
        this.dispose();
    }//GEN-LAST:event_JBCancelarActionPerformed

    private void JBAtualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBAtualizarActionPerformed
        try {
            int linha = this.jTableGerenciar.getSelectedRow();
            int quantidade = Integer.parseInt(this.jTableGerenciar.getValueAt(linha, 3).toString());
            
            String nome = "";
            double preco = 0;
            String categoria = "";
            int indice = JCBCategoria.getSelectedIndex();

            if (this.JTFNome.getText().length() < 2) {
                throw new Mensagem("Nome deve conter ao menos 2 caracteres.");
            } else {
                nome = this.JTFNome.getText();
            }
            if (this.JTFPreco.getText().length() <= 0) {
                throw new Mensagem("Idade deve ser número e maior que zero.");
            } else {
                preco = Double.parseDouble(this.JTFPreco.getText());
            }
            if (indice >= 0 && indice < JCBCategoria.getItemCount()) {
                categoria = (String) this.JCBCategoria.getSelectedItem();
                System.out.println("Item selecionado: " + categoria);
            } else {
                throw new Mensagem("Selecione uma categoria válida.");
            }

            if (this.objetoproduto.updateProdutoBD(quantidade, nome, preco, categoria, id)) {
                this.JTFNome.setText("");
                this.JTFPreco.setText("");
                JOptionPane.showMessageDialog(rootPane, "Aluno Alterado com Sucesso!");
            }
            System.out.println(this.objetoproduto.getMinhaLista().toString());
        } catch (Mensagem erro) {
            JOptionPane.showMessageDialog(null, erro.getMessage());
        } catch (NumberFormatException erro2) {
            JOptionPane.showMessageDialog(null, "Informe um número válido.");
        } finally {
            carregaTabela();
        }
    }//GEN-LAST:event_JBAtualizarActionPerformed

    private void jTableGerenciarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableGerenciarMouseClicked
        if (this.jTableGerenciar.getSelectedRow() != -1) {
            int linha = this.jTableGerenciar.getSelectedRow();

            // CAPTURE O ID!
            int idSelecionado = Integer.parseInt(this.jTableGerenciar.getValueAt(linha, 0).toString());
            this.id = idSelecionado; // Armazena em atributo da classe

            // Popula os campos
            String nome = this.jTableGerenciar.getValueAt(linha, 2).toString();
            String preco = this.jTableGerenciar.getValueAt(linha, 4).toString();
            String categoria = this.jTableGerenciar.getValueAt(linha, 1).toString();

            this.JTFNome.setText(nome);
            this.JTFPreco.setText(preco);
            this.JCBCategoria.setSelectedItem(categoria);
        }
    }//GEN-LAST:event_jTableGerenciarMouseClicked

    private void JBDeletarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBDeletarActionPerformed
        try {
// validando dados da interface gráfica.
            if (this.jTableGerenciar.getSelectedRow() == -1) {
                throw new Mensagem(
                        "Primeiro Selecione um Aluno para APAGAR ");
            } else {
                id = Integer.parseInt(this.jTableGerenciar.
                        getValueAt(this.jTableGerenciar.getSelectedRow(), 0).
                        toString());
            }
// retorna 0 -> primeiro botão | 1 -> segundo botão | 2 -> terceiro botão
            int respostaUsuario = JOptionPane.
                    showConfirmDialog(null,
                            "Tem certeza que deseja apagar este Aluno ?");
            if (respostaUsuario == 0) {// clicou em SIM
// envia os dados para o Aluno processar
                if (this.objetoproduto.deleteProdutoBD(id)) {
// limpa os campos
                    this.JTFNome.setText("");
                    this.JTFPreco.setText("");
                    JOptionPane.showMessageDialog(rootPane,
                            "Aluno Apagado com Sucesso!");
                }
            }
// atualiza a tabela.
            System.out.println(this.objetoproduto.getMinhaLista().toString());
        } catch (Mensagem erro) {
            JOptionPane.showMessageDialog(null, erro.getMessage());
        } finally {
// atualiza a tabela.
            carregaTabela();
        }
    }//GEN-LAST:event_JBDeletarActionPerformed

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
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTableGerenciar;
    // End of variables declaration//GEN-END:variables
}
