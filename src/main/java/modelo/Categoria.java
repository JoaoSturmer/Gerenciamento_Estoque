package modelo;

/**
 * Representa uma categoria de produto, contendo informações como nome, tamanho
 * e tipo de embalagem.
 *
 *@author Ricardo Zimmer Junior
 */
public class Categoria {

    /**
     * Identificador único da categoria.
     */
    private int id_categoria;

    /**
     * Nome da categoria.
     */
    private String nome_categoria;

    /**
     * Tamanho associado à categoria (ex: "Pequeno", "Médio", "Grande").
     */
    private String tamanho;

    /**
     * Tipo de embalagem da categoria (ex: "Caixa", "Saco").
     */
    private String embalagem;

    /**
     * Construtor completo para inicializar todos os atributos da categoria.
     *
     * @param id_categoria identificador da categoria.
     * @param nome_categoria nome da categoria.
     * @param tamanho tamanho da categoria.
     * @param embalagem tipo de embalagem da categoria.
     */
    public Categoria(int id_categoria, String nome_categoria, String tamanho, String embalagem) {
        this.id_categoria = id_categoria;
        this.nome_categoria = nome_categoria;
        this.tamanho = tamanho;
        this.embalagem = embalagem;
    }

    /**
     * Construtor para inicializar apenas o id e o nome da categoria.
     *
     * @param id_categoria identificador da categoria.
     * @param nome_categoria nome da categoria.
     */
    public Categoria(int id_categoria, String nome_categoria) {
        this.id_categoria = id_categoria;
        this.nome_categoria = nome_categoria;
    }

    /**
     * Construtor padrão.
     */
    public Categoria() {
    }

    /**
     * Retorna o identificador da categoria.
     *
     * @return id da categoria.
     */
    public int getId_categoria() {
        return id_categoria;
    }

    /**
     * Define o identificador da categoria.
     *
     * @param id_categoria novo id da categoria.
     */
    public void setId_categoria(int id_categoria) {
        this.id_categoria = id_categoria;
    }

    /**
     * Retorna o nome da categoria.
     *
     * @return nome da categoria.
     */
    public String getNome_categoria() {
        return nome_categoria;
    }

    /**
     * Define o nome da categoria.
     *
     * @param nome_categoria novo nome da categoria.
     */
    public void setNome_categoria(String nome_categoria) {
        this.nome_categoria = nome_categoria;
    }

    /**
     * Retorna o tamanho da categoria.
     *
     * @return tamanho da categoria.
     */
    public String getTamanho() {
        return tamanho;
    }

    /**
     * Define o tamanho da categoria.
     *
     * @param tamanho novo tamanho da categoria.
     */
    public void setTamanho(String tamanho) {
        this.tamanho = tamanho;
    }

    /**
     * Retorna o tipo de embalagem da categoria.
     *
     * @return embalagem da categoria.
     */
    public String getEmbalagem() {
        return embalagem;
    }

    /**
     * Define o tipo de embalagem da categoria.
     *
     * @param embalagem nova embalagem da categoria.
     */
    public void setEmbalagem(String embalagem) {
        this.embalagem = embalagem;
    }
}