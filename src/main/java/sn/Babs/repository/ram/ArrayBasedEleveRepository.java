package sn.Babs.repository.ram;

import sn.Babs.domain.Classe;
import sn.Babs.domain.Eleve;
import sn.Babs.repository.EleveRepository;

public class ArrayBasedEleveRepository implements EleveRepository {

    public Eleve[] getAllEleve6emeA() {
        Classe classe = new Classe(1,"6emeA");
        return new Eleve[]{
                new Eleve(1,"NDIAYE","Babacar","07/10/1995",classe),
                new Eleve(2,"FALL","Abdoul","17/12/1996",classe),
                new Eleve(3,"SY","Amina","11/10/1993",classe),
        };
    }
    
}