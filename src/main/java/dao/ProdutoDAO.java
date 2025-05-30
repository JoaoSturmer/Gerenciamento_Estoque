package dao;

import java.util.*;
import model.Produto;
import model.Categoria;

public class ProdutoDAO {

    private static ArrayList<Produto> minhaLista = new ArrayList<>();

    public static ArrayList getMinhaLista() {
        return minhaLista;
    }

    public static void setMinhaLista(ArrayList minhaLista) {
        ProdutoDAO.minhaLista = minhaLista;
    }
    
    private static ArrayList<Categoria> minhaListac = new ArrayList<>();

    public static ArrayList getMinhaListac() {
        return minhaListac;
    }

    public static void setMinhaListac(ArrayList minhaLista) {
        ProdutoDAO.minhaListac = minhaLista;
    }
    
    public static int maiorID() {
        int maiorID = 0;
        for (int i = 0; i < minhaLista.size(); i++) {
            if (minhaLista.get(i).getId() > maiorID) {
                maiorID = minhaLista.get(i).getId();
            }
        }
        return maiorID;
    }
}
