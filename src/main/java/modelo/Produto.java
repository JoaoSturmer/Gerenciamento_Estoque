package modelo;

/**
 * Representa um produto no sistema, com suas propriedades como nome, preço,
 * unidade de medida, quantidades mínima e máxima, e categoria associada.
 *
 * @author Ricardo Zimmer Junior
 */
public class Produto {

    /**
     * Identificador único do produto.
     */
    private int id;

    /**
     * Nome do produto.
     */
    private String nome;

    /**
     * Preço do produto.
     */
    private double preco;

    /**
     * Unidade de medida do produto (ex: kg, unidade, litro).
     */
    private String unidade;

    /**
     * Quantidade atual do produto em estoque.
     */
    private int quantidade;

    /**
     * Quantidade mínima permitida em estoque.
     */
    private int quantidadeMinima;

    /**
     * Quantidade máxima permitida em estoque.
     */
    private int quantidadeMaxima;

    /**
     * Categoria a qual o produto pertence.
     */
    private Categoria categoria;

    /**
     * Construtor completo para criar um produto com todos os atributos.
     *
     * @param id identificador do produto.
     * @param nome nome do produto.
     * @param preco preço do produto.
     * @param unidade unidade de medida.
     * @param quantidade quantidade atual em estoque.
     * @param quantidadeMinima quantidade mínima em estoque.
     * @param quantidadeMaxima quantidade máxima em estoque.
     * @param categoria categoria do produto.
     */
    public Produto(int id, String nome, double preco, String unidade, int quantidade,
            int quantidadeMinima, int quantidadeMaxima, Categoria categoria) {
        this.id = id;
        this.nome = nome;
        this.preco = preco;
        this.unidade = unidade;
        this.quantidade = quantidade;
        this.quantidadeMinima = quantidadeMinima;
        this.quantidadeMaxima = quantidadeMaxima;
        this.categoria = categoria;
    }

    /**
     * Construtor que cria um produto com apenas id e quantidade. Usado
     * geralmente para operações que envolvem atualização de estoque.
     *
     * @param id identificador do produto.
     * @param quantidade quantidade atualizada.
     */
    public Produto(int id, int quantidade) {
        this.id = id;
        this.quantidade = quantidade;
    }

    /**
     * Construtor padrão.
     */
    public Produto() {
    }

    /**
     * Retorna o id do produto.
     *
     * @return id do produto.
     */
    public int getId() {
        return id;
    }

    /**
     * Define o id do produto.
     *
     * @param id novo id do produto.
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * Retorna o nome do produto.
     *
     * @return nome do produto.
     */
    public String getNome() {
        return nome;
    }

    /**
     * Define o nome do produto.
     *
     * @param nome novo nome do produto.
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * Retorna o preço do produto.
     *
     * @return preço do produto.
     */
    public double getPreco() {
        return preco;
    }

    /**
     * Define o preço do produto.
     *
     * @param preco novo preço do produto.
     */
    public void setPreco(double preco) {
        this.preco = preco;
    }

    /**
     * Retorna a unidade de medida do produto.
     *
     * @return unidade de medida.
     */
    public String getUnidade() {
        return unidade;
    }

    /**
     * Define a unidade de medida do produto.
     *
     * @param unidade nova unidade de medida.
     */
    public void setUnidade(String unidade) {
        this.unidade = unidade;
    }

    /**
     * Retorna a quantidade atual do produto em estoque.
     *
     * @return quantidade em estoque.
     */
    public int getQuantidade() {
        return quantidade;
    }

    /**
     * Define a quantidade atual do produto em estoque.
     *
     * @param quantidade nova quantidade em estoque.
     */
    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    /**
     * Retorna a quantidade mínima permitida em estoque.
     *
     * @return quantidade mínima.
     */
    public int getQuantidadeMinima() {
        return quantidadeMinima;
    }

    /**
     * Define a quantidade mínima permitida em estoque.
     *
     * @param quantidadeMinima nova quantidade mínima.
     */
    public void setQuantidadeMinima(int quantidadeMinima) {
        this.quantidadeMinima = quantidadeMinima;
    }

    /**
     * Retorna a quantidade máxima permitida em estoque.
     *
     * @return quantidade máxima.
     */
    public int getQuantidadeMaxima() {
        return quantidadeMaxima;
    }

    /**
     * Define a quantidade máxima permitida em estoque.
     *
     * @param quantidadeMaxima nova quantidade máxima.
     */
    public void setQuantidadeMaxima(int quantidadeMaxima) {
        this.quantidadeMaxima = quantidadeMaxima;
    }

    /**
     * Retorna a categoria do produto.
     *
     * @return categoria do produto.
     */
    public Categoria getCategoria() {
        return categoria;
    }

    /**
     * Define a categoria do produto.
     *
     * @param categoria nova categoria.
     */
    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
    }
}