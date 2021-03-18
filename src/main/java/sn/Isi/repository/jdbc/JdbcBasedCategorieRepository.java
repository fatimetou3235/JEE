package sn.Isi.repository.jdbc;

import sn.Isi.domain.Categorie;
import sn.Isi.repository.CategorieRepository;

public class JdbcBasedCategorieRepository implements CategorieRepository {

    public Categorie[] getAll() {
        return new Categorie[0];
    }
    
}
