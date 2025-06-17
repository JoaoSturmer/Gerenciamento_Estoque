package principal;

import visualizar.FrmMenuPrincipal;

/**
 * Classe principal que inicia a aplicação exibindo a janela principal.
 * 
 * @author Ricardo Zimmer Junior
 */
public class Principal {

    /**
     * Método principal que é o ponto de entrada da aplicação. Inicializa e
     * exibe a janela principal do sistema.
     *
     * @param args argumentos da linha de comando (não utilizados).
     */
    public static void main(String[] args) {
        FrmMenuPrincipal objetotela = new FrmMenuPrincipal();
        objetotela.setVisible(true);
    }
}
