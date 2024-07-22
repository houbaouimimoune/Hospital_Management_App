package Main;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class Administrateur extends Person {
	public String Permanence;
	public String idAdm;
	public static int compteur = -1;
	Scanner scanner = new Scanner(System.in);
	public static ArrayList<Administrateur> listaAdministrateurs = new ArrayList<Administrateur>();

	//const
	public Administrateur(  String nomPrenom, float tempsTravail, float salaire, String permanence) {
		super(nomPrenom, tempsTravail, salaire);
		Permanence = permanence;
		Administrateur.compteur +=1;
		this.idAdm = this.Permanence+Administrateur.compteur;
	}
	public Administrateur() {
		Administrateur.compteur +=1;
	}
	//function
	@Override
	public void addEmploye() {
		Administrateur administrateur = new Administrateur();
		System.out.println("Entrer le nom de l' administrateur");
		administrateur.nomPrenom = scanner.next();
		System.out.println("Entrer la Permanence de l' administrateur Nuit/Jour entrer N ou J");
		administrateur.Permanence = scanner.next();
		administrateur.idAdm = administrateur.Permanence+Administrateur.compteur;
		System.out.println("Entrer le temps de travail de l' administrateur");
		administrateur.tempsTravail = scanner.nextFloat();
		System.out.println("Entrer le salaire de l' administrateur");
		administrateur.salaire = scanner.nextFloat();
		
		
		Administrateur.listaAdministrateurs.add(administrateur);
		
		
	}

	@Override
	public void getData() {
		System.out.println("\t\t L'administrateur :");
		System.out.println("\t\t Nom : "+this.nomPrenom);
		System.out.println("\t\t Id : "+this.idAdm);
		System.out.println("\t\t TempsTravail : "+this.tempsTravail +" H");
		System.out.println("\t\t Salaire : "+this.salaire);
		System.out.println("\t\t Permanence : "+this.Permanence);
		System.out.println("-------------------------------------------------------\n");
	}
	@Override
	public void delete(String idString) {
		try {
			for(Administrateur administrateur : listaAdministrateurs) {
				if(idString.equals(administrateur.idAdm)) {
					listaAdministrateurs.remove(administrateur);
					System.out.println("l'administrateur a ete supprime");
					Administrateur.compteur-= 1;
					
				}
			}
		} catch (Exception e) {
			System.out.println("la liste est vide maintenant");
		}
			

		
	}

	
	//function find by id employé
	@Override
	public  void FindById(String para) {
		int i=0;

		for (Administrateur administrateur : Administrateur.listaAdministrateurs) {
			if(para.equals(administrateur.idAdm)) {
				administrateur.getData();	
				i = 1;
				break;
				
			}
		}
		if (i == 0) {
			System.out.println("Not Found");
		}
		
	}


	
	
	
}
