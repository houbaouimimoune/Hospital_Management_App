package Main;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Medcin extends Person{
	
	public String specialite;
	public String idMed;
	Scanner scanner = new Scanner(System.in);
	public static ArrayList<Medcin> listMedcins = new ArrayList<Medcin>();
	public static int compteur = -1;
	//const
	public Medcin( String nomPrenom, float tempsTravail, float salaire, String specialite) {
		super(nomPrenom, tempsTravail, salaire);
		this.specialite = specialite;
		Medcin.compteur +=1;
		this.idMed = this.specialite+Medcin.compteur;
	}

	public Medcin(){
		Medcin.compteur +=1;
	}
	
	
	//function
	@Override
	public void addEmploye() {
		
		Medcin medcin = new Medcin();
		System.out.println("Entrer le nom de medcin");
		medcin.nomPrenom = scanner.next();
		System.out.println("Entrer la specialite de medcin");
		System.out.println("\t\t l’immunologie ==> IMUN");
		System.out.println("\t\t La chirurgie ==> CHRG");
		System.out.println("\t\t La cardiologie ==> CARD");
		System.out.println("\t\t L’andrologie ==> ANDR");
		System.out.println("\t\t La gériatrie ==> GIRT");
		System.out.println("\t\t L’hématologie ==> HEMT");
		medcin.specialite = scanner.next();
		medcin.idMed = medcin.specialite+Medcin.compteur;
		System.out.println("Entrer le temps de travail de medcin");
		medcin.tempsTravail = scanner.nextFloat();
		System.out.println("Entrer le salaire de medcin");
		medcin.salaire = scanner.nextFloat();
		
		Medcin.listMedcins.add(medcin);
		
	}

	@Override
	public void getData() {
		System.out.println("\t\t Medcin :");
		System.out.println("\t\t Nom : "+this.nomPrenom);
		System.out.println("\t\t Id : "+this.idMed);
		System.out.println("\t\t TempsTravail : "+this.tempsTravail+" heure par jour");
		System.out.println("\t\t Salaire : "+this.salaire+" dh");
		System.out.println("\t\t Specialite : "+this.specialite);
		System.out.println("-------------------------------------------------------\n");
		
	}
	
	@Override
	public void delete(String idString) {
		
			try {
				for(Medcin medcin : listMedcins) {
					if(idString.equals(medcin.idMed)) {
						listMedcins.remove(medcin);
						System.out.println("le medcin a ete supprime");
						Medcin.compteur-= 1;
						
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
	
		for (Medcin medcin : Medcin.listMedcins) {
			if(para.equals(medcin.idMed)) {
				medcin.getData();	
				i += 1;
				break;
				
			}
		}
		if (i == 0) {
			System.out.println("Not Found");
		}
		
	}

	
	
	

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
	
	
	
	
	
	
	
	

	
	
	
	
	
	
	
	

