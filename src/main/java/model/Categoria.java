package model;

import dao.CategoriaDAO;
import java.util.*;

public class Categoria {

    private int id_categoria;
    private String nome_categoria, tamanho, embalagem;

    public Categoria(int id_categoria, String nome_categoria, String tamanho, String embalagem) {
        this.id_categoria = id_categoria;
        this.nome_categoria = nome_categoria;
        this.tamanho = tamanho;
        this.embalagem = embalagem;
    }

    public Categoria() {
        this(0, "", "", "");
    }

    public int getId_categoria() {
        return id_categoria;
    }

    public void setId_categoria(int id_categoria) {
        this.id_categoria = id_categoria;
    }

    public String getNome_categoria() {
        return nome_categoria;
    }

    public void setNome_categoria(String nome_categoria) {
        this.nome_categoria = nome_categoria;
    }

    public String getTamanho() {
        return tamanho;
    }

    public void setTamanho(String tamanho) {
        this.tamanho = tamanho;
    }

    public String getEmbalagem() {
        return embalagem;
    }

    public void setEmbalagem(String embalagem) {
        this.embalagem = embalagem;
    }

    public ArrayList<Categoria> getMinhaListaC() {
        return CategoriaDAO.getMinhaListaC();
    }

    public boolean insertCategoriaBD(String nome_categoria, String tamanho, String embalagem) {
        int id_categoria = this.maiorIDC() + 1;
        Categoria objeto = new Categoria(id_categoria, nome_categoria, tamanho, embalagem);
        getMinhaListaC().add(objeto);
        return true;
    }

    public int maiorIDC() {
        return CategoriaDAO.maiorIDC();
    }
}