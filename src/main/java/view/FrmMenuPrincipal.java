package view;

public class FrmMenuPrincipal extends javax.swing.JFrame {

    public FrmMenuPrincipal() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuBar1 = new javax.swing.JMenuBar();
        jMenuArquivo = new javax.swing.JMenu();
        jMenuCategoria = new javax.swing.JMenuItem();
        jMenuProduto = new javax.swing.JMenuItem();
        jMenuGerenciamento = new javax.swing.JMenuItem();
        jMenuEstoque = new javax.swing.JMenuItem();
        jMenuSair = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Gerenciamento de Estoque");

        jMenuArquivo.setText("Arquivo");

        jMenuCategoria.setText("Categoria");
        jMenuCategoria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuCategoriaActionPerformed(evt);
            }
        });
        jMenuArquivo.add(jMenuCategoria);

        jMenuProduto.setText("Produto");
        jMenuProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuProdutoActionPerformed(evt);
            }
        });
        jMenuArquivo.add(jMenuProduto);

        jMenuGerenciamento.setText("Gerenciamento");
        jMenuGerenciamento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuGerenciamentoActionPerformed(evt);
            }
        });
        jMenuArquivo.add(jMenuGerenciamento);

        jMenuEstoque.setText("Estoque");
        jMenuEstoque.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuEstoqueActionPerformed(evt);
            }
        });
        jMenuArquivo.add(jMenuEstoque);

        jMenuSair.setText("Sair");
        jMenuSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuSairActionPerformed(evt);
            }
        });
        jMenuArquivo.add(jMenuSair);

        jMenuBar1.add(jMenuArquivo);

        jMenu2.setText("Sobre");
        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 277, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuProdutoActionPerformed
        FrmProduto objeto = new FrmProduto();
        objeto.setVisible(true);
    }//GEN-LAST:event_jMenuProdutoActionPerformed

    private void jMenuEstoqueActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuEstoqueActionPerformed
        FrmEstoque objeto = new FrmEstoque();
        objeto.setVisible(true);    
    }//GEN-LAST:event_jMenuEstoqueActionPerformed

    private void jMenuCategoriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuCategoriaActionPerformed
        FrmCategoria objeto = new FrmCategoria();
        objeto.setVisible(true);
    }//GEN-LAST:event_jMenuCategoriaActionPerformed

    private void jMenuGerenciamentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuGerenciamentoActionPerformed
        FrmGerenciamento objeto = new FrmGerenciamento();
        objeto.setVisible(true);
    }//GEN-LAST:event_jMenuGerenciamentoActionPerformed

    private void jMenuSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuSairActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jMenuSairActionPerformed

    public static void main(String args[]) {

        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(FrmMenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmMenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmMenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmMenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmMenuPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenuArquivo;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuCategoria;
    private javax.swing.JMenuItem jMenuEstoque;
    private javax.swing.JMenuItem jMenuGerenciamento;
    private javax.swing.JMenuItem jMenuProduto;
    private javax.swing.JMenuItem jMenuSair;
    // End of variables declaration//GEN-END:variables
}
