package sn.Babs.repository;

import sn.Babs.domain.Classe;

public class ClasseRepository {
    public Classe[] getAll(){
        return new Classe[]{
                new Classe(1,"6emeA"),
                new Classe(1,"6emeB"),
                new Classe(1,"5emeC"),
                new Classe(1,"4emeB"),
                new Classe(1,"3emeB"),
                new Classe(1,"3emeB"),
                new Classe(1,"Seconde S2A"),
                new Classe(1,"Premier L1C"),
                new Classe(1,"Terminal S1A"),
        };
    }
}
