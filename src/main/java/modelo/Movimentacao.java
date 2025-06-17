package modelo;

import java.time.LocalDateTime;

/**
 * Representa uma movimentação de estoque, que pode ser uma entrada ou saída
 * de produtos, com quantidade, data, tipo e produto associado.
 * 
 *  @author Ricardo Zimmer Junior
 */
public class Movimentacao {
    /**
     * Identificador único da movimentação.
     */
    private int id_movimentacao;

    /**
     * Quantidade movimentada (positiva para entradas, negativa para saídas).
     */
    private int quantidade_movimentacao;

    /**
     * Data e hora em que a movimentação ocorreu.
     */
    private LocalDateTime data;

    /**
     * Tipo da movimentação, por exemplo "entrada" ou "saida".
     */
    private String tipo;

    /**
     * Produto associado à movimentação.
     */
    private Produto produto;

    /**
     * Construtor completo para inicializar todos os atributos da movimentação.
     * 
     * @param id_movimentacao identificador da movimentação.
     * @param quantidade_movimentacao quantidade movimentada.
     * @param data data e hora da movimentação.
     * @param tipo tipo da movimentação (entrada ou saida).
     * @param produto produto associado à movimentação.
     */
    public Movimentacao(int id_movimentacao, int quantidade_movimentacao, LocalDateTime data, String tipo, Produto produto) {
        this.id_movimentacao = id_movimentacao;
        this.quantidade_movimentacao = quantidade_movimentacao;
        this.data = data;
        this.tipo = tipo;
        this.produto = produto;
    }
    
    /**
     * Construtor padrão.
     */
    public Movimentacao() {}

    /**
     * Retorna o identificador da movimentação.
     * 
     * @return id da movimentação.
     */
    public int getId_movimentacao() {
        return id_movimentacao;
    }

    /**
     * Define o identificador da movimentação.
     * 
     * @param id_movimentacao novo id da movimentação.
     */
    public void setId_movimentacao(int id_movimentacao) {
        this.id_movimentacao = id_movimentacao;
    }

    /**
     * Retorna a quantidade movimentada.
     * 
     * @return quantidade movimentada.
     */
    public int getQuantidade_movimentacao() {
        return quantidade_movimentacao;
    }

    /**
     * Define a quantidade movimentada.
     * 
     * @param quantidade_movimentacao nova quantidade movimentada.
     */
    public void setQuantidade_movimentacao(int quantidade_movimentacao) {
        this.quantidade_movimentacao = quantidade_movimentacao;
    }

    /**
     * Retorna a data e hora da movimentação.
     * 
     * @return data da movimentação.
     */
    public LocalDateTime getData() {
        return data;
    }

    /**
     * Define a data e hora da movimentação.
     * 
     * @param data nova data da movimentação.
     */
    public void setData(LocalDateTime data) {
        this.data = data;
    }

    /**
     * Retorna o tipo da movimentação.
     * 
     * @return tipo da movimentação (ex: "entrada", "saida").
     */
    public String getTipo() {
        return tipo;
    }

    /**
     * Define o tipo da movimentação.
     * 
     * @param tipo novo tipo da movimentação.
     */
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    /**
     * Retorna o produto associado à movimentação.
     * 
     * @return produto relacionado à movimentação.
     */
    public Produto getProduto() {
        return produto;
    }

    /**
     * Define o produto associado à movimentação.
     * 
     * @param produto novo produto relacionado.
     */
    public void setProduto(Produto produto) {
        this.produto = produto;
    }
}
