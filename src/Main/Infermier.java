package Main;

import java.util.ArrayList;
import java.util.Scanner;

public class Infermier extends Person {
	
	public String specialte;
	public  String idInf;
	public static int compteur = -1;
	Scanner scanner = new Scanner(System.in);
	public static ArrayList<Infermier> listInfermiers = new ArrayList<Infermier>();

	//const
	public Infermier( String nomPrenom, float tempsTravail, float salaire, String specialte) {
		super( nomPrenom, tempsTravail, salaire);
		this.specialte = specialte;
		Infermier.compteur +=1;
		this.idInf = this.specialte+Infermier.compteur;
	}
	public Infermier() {
		Infermier.compteur +=1;
	}

	//function
	@Override
	public void addEmploye() {
		
		Infermier infermier = new Infermier();
		System.out.println("Entrer le nom de l'infermier");
		infermier.nomPrenom = scanner.next();
		System.out.println("Entrer la specialite de l'infermier");
		
		System.out.println("\t\t  infirmier anesthésiste ==> ANSTS");
		System.out.println("\t\t  infirmier polyvalent ==> POLY");
		System.out.println("\t\t  infirmier de bloc opératoire ==> BOPER");
		System.out.println("\t\t infirmier d'urgence ==> URG");
		infermier.specialte = scanner.next();
		infermier.idInf = infermier.specialte+Infermier.compteur;
		System.out.println("Entrer le temps de travail de l'infermier");
		infermier.tempsTravail = scanner.nextFloat();
		System.out.println("Entrer le salaire de l'infermier");
		infermier.salaire = scanner.nextFloat();
		
		
		Infermier.listInfermiers.add(infermier);
		
	}

	@Override
	public void getData() {
		System.out.println("\t\t Infermier :");
		System.out.println("\t\t Nom : "+this.nomPrenom);
		System.out.println("\t\t Id : "+this.idInf);
		System.out.println("\t\t TempsTravail : "+this.tempsTravail);
		System.out.println("\t\t Salaire : "+this.salaire);
		System.out.println("\t\t Specialte : "+this.specialte);
		System.out.println("-------------------------------------------------------\n");
	}
	@Override
	public void delete(String idString) {
			try {
				 for(Infermier infermier : listInfermiers) {
						if(idString.equals(infermier.idInf)) {
								listInfermiers.remove(infermier);
								System.out.println("l'infermier a ete supprime");
								Infermier.compteur-= 1;
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

		for (Infermier infermier : Infermier.listInfermiers) {
			if(para.equals(infermier.idInf)) {
				infermier.getData();	
				i = 1;
				break;
				
			}
		}
		if (i == 0) {
			System.out.println("Not Found");
		}
		
	}
	
	
	

	
}
