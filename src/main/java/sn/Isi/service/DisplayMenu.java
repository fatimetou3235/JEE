package sn.Isi.service;

import sn.Isi.domain.Categorie;
import sn.Isi.domain.Produit;
import sn.Isi.repository.ram.ArrayBasedCategorieRepository;
import sn.Isi.repository.ram.ArrayBasedProduitRepository;
import sn.Isi.repository.ram.ListBasedCategorieRepository;

import java.util.List;
import java.util.Scanner;

public class DisplayMenu {
    /**
     * MENU PRINCIPAL
     * */
    public void showWelcomeMenu(){

        boolean arret = false;
        while (!arret){

            System.out.println("Bienvenue sur la platforme de gestion de gestion de stock et approvisionnement!!");
            System.out.println("1-Admin");
            System.out.println("2-codification");
            System.out.println("3-Approvisionnement");
            System.out.println("4-Quitter");
            System.out.println("Veuillez choisir un profil pour continuer:");
            Scanner scanner = new Scanner(System.in);
            int choice = scanner.nextInt();
            //clearConsole();
            switch (choice) {
                case 1:
                    showAdminMenu();
                    break;
                case 2:
                    //Menu Codification
                    break;
                case 3:
                    // Menu Approvisionnement
                    break;
                case 4: arret = true; break;

                default: System.out.println("entrez un choix entre 1 et 3"); break;

            }

        }

    }

    /**
     * Menu Admin
     */
    public void showAdminMenu(){
        int choice;
        ArrayBasedCategorieRepository arrayBasedCategorieRepository  = new ArrayBasedCategorieRepository();
        ListBasedCategorieRepository listBasedCategorieRepository = new ListBasedCategorieRepository();
        ArrayBasedProduitRepository arrayBasedProduitRepository = new ArrayBasedProduitRepository();
        Categorie[] categories = arrayBasedCategorieRepository.getAll();
        List<Categorie> lCategories= listBasedCategorieRepository.PrintAllClasse();
        do{
            System.out.println("Bienvenue Admin!!");
            System.out.println("1-Afficher les categories");
            System.out.println("2-Afficher les produits");
            System.out.println("3-Faire une vente");
            System.out.println("4-Ajouter un fournisseur");
            System.out.println("5-Quitter");
            System.out.println("Veuillez choisir une option pour continuer:");
            Scanner scanner = new Scanner(System.in);
            choice = scanner.nextInt();
            //clearConsole();
            switch (choice) {
                case 1:
                    System.out.println("Les categories disponible:");

                    for (Categorie cl : lCategories) {
                        System.out.println(String.format("> %S %S", cl.getId(),cl.getLibelle()));
                    }
                    System.out.println("Choissisez une categorie pour voir les élèves:");
                    int idClasse = scanner.nextInt();
                    if(idClasse == 1){
                        System.out.println("Les produits de la categorie alimentaire:");
                        Produit[] produits = arrayBasedProduitRepository.getAll();
                        for (int i = 0; i< produits.length; i++){
                            Produit produit = produits[i];
                            System.out.println(String.format("> %S %S", produit.getLibelle(), produit.getPrix()));
                        }
                    }
                    break;
                case 2:
                    //
                    break;
                case 3:
                    //
                    break;

                default: System.out.println("entrez un choix entre 1 et 5"); break;

            }

        }while(choice!=5);

    }




    public final static void clearConsole()
    {
        try
        {
            final String os = System.getProperty("os.name");
            if (os.contains("Windows"))
            {
                Runtime.getRuntime().exec("cls");
            }
            else
            {
                Runtime.getRuntime().exec("clear");
            }
        }
        catch (final Exception e)
        {
            e.printStackTrace();
        }
    }
}
