package sn.Babs.service;

import sn.Babs.domain.Classe;
import sn.Babs.domain.Eleve;
import sn.Babs.repository.ClasseRepository;
import sn.Babs.repository.EleveRepository;
import sn.Babs.repository.ram.ArrayBasedClasseRepository;
import sn.Babs.repository.ram.ArrayBasedEleveRepository;

import java.io.IOException;
import java.util.Scanner;

public class DisplayMenu {
    /**
     * MENU PRINCIPAL
     * */
    public void showWelcomeMenu(){

        boolean arret = false;
        while (!arret){

            System.out.println("Bienvenue sur la platforme de gestion de votre établissement scolaire!!");
            System.out.println("1-Admin");
            System.out.println("2-Prof");
            System.out.println("3-Parent");
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
                    //Menu Prof
                    break;
                case 3:
                    // Menu Parent
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
        ArrayBasedClasseRepository arrayBasedClasseRepository  = new ArrayBasedClasseRepository();
        ArrayBasedEleveRepository arrayBasedEleveRepository = new ArrayBasedEleveRepository();
        Classe[] classes = arrayBasedClasseRepository.getAll();

        do{
            System.out.println("Bienvenue Admin!!");
            System.out.println("1-Afficher les classes");
            System.out.println("2-Afficher les matieres");
            System.out.println("3-Faire une inscription");
            System.out.println("4-Ajouter un prof");
            System.out.println("5-Quitter");
            System.out.println("Veuillez choisir une option pour continuer:");
            Scanner scanner = new Scanner(System.in);
            choice = scanner.nextInt();
            //clearConsole();
            switch (choice) {
                case 1:
                    System.out.println("Les classes de votre établissements:");
                    for (int i=0;i<classes.length;i++){
                        Classe classe = classes[i];
                        System.out.println(String.format("> %S %S", classe.getId(),classe.getLibelle()));
                    }
                    System.out.println("Choissisez une classe pour voir les élèves:");
                    int idClasse = scanner.nextInt();
                    if(idClasse == 1){
                        System.out.println("Les élèves de la classe 6emeA:");
                        Eleve[] eleves = arrayBasedEleveRepository.getAllEleve6emeA();
                        for (int i=0;i<eleves.length;i++){
                            Eleve eleve = eleves[i];
                            System.out.println(String.format("> %S %S", eleve.getNom(),eleve.getPrenom()));
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
