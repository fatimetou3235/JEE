package sn.Isi.repository.ram;

import sn.Isi.domain.Categorie;
import sn.Isi.domain.Produit;
import sn.Isi.repository.ProduitRepository;

public class ArrayBasedProduitRepository implements ProduitRepository {

    public Produit[] getAllEleve6emeA() {
        Categorie categorie = new Categorie(1,"6emeA");
        return new Produit[]{
                new Produit(1,"NDIAYE","Babacar","07/10/1995", categorie),
                new Produit(2,"FALL","Abdoul","17/12/1996", categorie),
                new Produit(3,"SY","Amina","11/10/1993", categorie),
        };
    }
    
}
