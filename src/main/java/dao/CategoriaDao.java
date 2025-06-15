package dao;

import model.Categoria;
import java.util.*;

public class CategoriaDAO {

    private static ArrayList<Categoria> minhaListaC = new ArrayList<>();

    public static ArrayList getMinhaListaC() {
        return minhaListaC;
    }

    public static void setMinhaListaC(ArrayList minhaLista) {
        CategoriaDAO.minhaListaC = minhaLista;
    }

    public static int maiorIDC() {
        int maiorIDC = 0;
        for (int i = 0; i < minhaListaC.size(); i++) {
            if (minhaListaC.get(i).getId_categoria() > maiorIDC) {
                maiorIDC = minhaListaC.get(i).getId_categoria();
            }
        }
        return maiorIDC;
    }
}