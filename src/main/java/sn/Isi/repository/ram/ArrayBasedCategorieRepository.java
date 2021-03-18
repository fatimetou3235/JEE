package sn.Isi.repository.ram;

import sn.Isi.domain.Categorie;
import sn.Isi.repository.CategorieRepository;

public class ArrayBasedCategorieRepository implements CategorieRepository {

    public Categorie[] getAll() {
        return new Categorie[]{
            new Categorie(1,"6emeA"),
            new Categorie(2,"6emeB"),
            new Categorie(3,"5emeC"),
            new Categorie(4,"4emeB"),
            new Categorie(5,"3emeB"),
            new Categorie(6,"3emeB"),
            new Categorie(7,"Seconde S2A"),
            new Categorie(8,"Premier L1C"),
            new Categorie(9,"Terminal S1A"),
    };
    }
    
}
