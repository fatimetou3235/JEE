package sn.Babs.repository;

import sn.Babs.domain.Classe;

public class ClasseRepository {
    public Classe[] getAll(){
        return new Classe[]{
                new Classe(1,"6emeA"),
                new Classe(2,"6emeB"),
                new Classe(3,"5emeC"),
                new Classe(4,"4emeB"),
                new Classe(5,"3emeB"),
                new Classe(6,"3emeB"),
                new Classe(7,"Seconde S2A"),
                new Classe(8,"Premier L1C"),
                new Classe(9,"Terminal S1A"),
        };
    }
}
