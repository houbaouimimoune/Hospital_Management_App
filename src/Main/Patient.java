package Main;

import java.util.ArrayList;
import java.util.Scanner;

public class Patient {
	public String nom_Prenom;
	public String date_Naissance;
	public String n_Carte_Nationale;
	public String maladie;
	public static int compteur = 0;
	public ArrayList<Medcin> listMedcinsPatient = new ArrayList<Medcin>();
	public static ArrayList<Patient> listPatients = new ArrayList<Patient>();
	
	//const
	

	public Patient() {
		Patient.compteur +=1;
	}

	public Patient(String nom_Prenom, String date_Naissance, String n_Carte_Nationale, String maladie,ArrayList<Medcin> listMedcinsPatient) {
		this.nom_Prenom = nom_Prenom;
		this.date_Naissance = date_Naissance;
		this.n_Carte_Nationale = n_Carte_Nationale;
		this.maladie = maladie;
		this.listMedcinsPatient = listMedcinsPatient;
	}



	//functions 
	
	public static void add_Patient() {
		Scanner scanner = new Scanner(System.in);
		
			Patient patient = new Patient();
			System.out.println("Entrer le nom de patient");
			patient.nom_Prenom = scanner.next();
			System.out.println("Entrer la date de naissence de patient");
			patient.date_Naissance = scanner.next();
			System.out.println("Entrer le numero de la carte nationale de patient");
			patient.n_Carte_Nationale = scanner.next();
			System.out.println("Entrer la maladie de patient");
			patient.maladie = scanner.next();
			
			System.out.println("Entrer le nombre des medcins affecte a ce patient");
			int nMed = scanner.nextInt();
			
			for(int i=0 ; i< nMed ; i++) {
				
				System.out.println("le medcine numero "+(i+1));
				System.out.println("Est-ce que ce medcine est deja enregistre dans la liste des medcine de cet hopitale");
				System.out.println("\t1 - Oui");
				System.out.println("\t2 - Non");
				
				int bool = scanner.nextInt();
					//""""""""""""""""""""""""""""""""""""""""""""""
					if (bool == 1) {
						System.out.println("Donner l'Id de ce Medcin");
						String idString = scanner.next();
						
						
						for(Medcin medcin : Medcin.listMedcins) {
							
								if (medcin.idMed.equals(idString) ) {
									patient.listMedcinsPatient.add(medcin);
								}else {
									System.out.println("ce medcin n'existe pas");
								}
						}
						
					}else {
						Medcin medcin = new Medcin();
						System.out.println("ajouter le medcin a la liste  des medcins affectees a ce patient et aussi la liste principale des medcins");
						
						System.out.println("Entrer le nom de medcin numero "+ (i+1));
						medcin.nomPrenom = scanner.next();
						System.out.println("Entrer la specialite de medcin"+ (i+1));
						System.out.println("Entrer la specialite de medcin");
						System.out.println("\t\t l’immunologie ==> IMUN");
						System.out.println("\t\t La chirurgie ==> CHRG");
						System.out.println("\t\t La cardiologie ==> CARD");
						System.out.println("\t\t L’andrologie ==> ANDR");
						System.out.println("\t\t La gériatrie ==> GIRT");
						System.out.println("\t\t L’hématologie ==> HEMT");
						medcin.specialite = scanner.next();
						medcin.idMed = medcin.specialite +Medcin.compteur;
						System.out.println("Entrer le temps de travail de medcin"+ (i+1));
						medcin.tempsTravail = scanner.nextFloat();
						System.out.println("Entrer le salaire de medcin"+ (i+1));
						medcin.salaire = scanner.nextFloat();
						
						
						patient.listMedcinsPatient.add(medcin);
						Medcin.listMedcins.add(medcin);
					}
				
			
			}
			Patient.listPatients.add(patient);
	}
	
	
	
	
	
	public static void deletePatient(String num_carte_natio) {
		try {
			while(!(listPatients.isEmpty())) {
				for (Patient patient : listPatients) {
					if(patient.n_Carte_Nationale.equals(num_carte_natio)) {
						listPatients.remove(patient);
						System.out.println("le patient a ete  supprime");
						
					}
				}
			}
		} catch (Exception e) {
			System.out.println("la liste est vide");
		}
	}
	
	public static void getDataPatient(Patient patient) {
		System.out.println("Patient :");
		System.out.println("Nom et Prenom : "+patient.nom_Prenom);
		System.out.println("La date de naissence  : "+patient.date_Naissance);
		System.out.println("Numero de la carte nationale : "+patient.n_Carte_Nationale);
		System.out.println("La maladie : "+patient.maladie);
		System.out.println("les medcins affectees a ce patient :");
			for (Medcin medcin : patient.listMedcinsPatient) {
				medcin.getData();
			}
		System.out.println("-------------------------------------------------------\n");
		
	}
	
	

	
	
	public static void FindPatientByNumCarteNational(String para) {
		int i=0;

		for (Patient patient : Patient.listPatients) {
			if(patient.n_Carte_Nationale.equals(para)) {
				getDataPatient(patient);	
				i += 1;
				break;
				
			}
		}
		if (i == 0) {
			System.out.println("Not found");
		}
		
	}
	
}
