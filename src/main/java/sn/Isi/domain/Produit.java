package sn.Isi.domain;

public class Produit {
    private int id;
    private String libelle;
    private String prix;
    private String qte;

    private Categorie categorie;
    public Produit() {
    }

    public Produit(int id, String prix, String libelle, String qte, Categorie categorie) {
        this.id = id;
        this.libelle = libelle;
        this.prix = prix;
        this.qte = qte;
        this.categorie = categorie;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getLibelle() {
        return libelle;
    }

    public void setLibelle(String libelle) {
        this.libelle = libelle;
    }

    public String getPrix() {
        return prix;
    }

    public void setPrix(String prix) {
        this.prix = prix;
    }

    public String getQte() {
        return qte;
    }

    public void setQte(String qte) {
        this.qte = qte;
    }

    public Categorie getCategorie() {
        return categorie;
    }

    public void setCategorie(Categorie categorie) {
        this.categorie = categorie;
    }
}
