package model;

public class Categoria {

    private String categoria;
    private int id_categoria;

    public Categoria() {
        this.categoria = "";
        this.id_categoria = 0;
    }

    public Categoria(String categoria, int id) {
        this.categoria = categoria;
        this.id_categoria = id;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public int getId() {
        return id_categoria;
    }

    public void setId(int id) {
        this.id_categoria = id;
    }

}
