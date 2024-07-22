package Main;

import java.util.Scanner;


public class Main {
	
	static Scanner scanner = new Scanner(System.in);
	static Medcin medcin = new Medcin();
	static Infermier infermier = new Infermier();
	static Administrateur administrateur = new Administrateur();
	

	public static void main(String[] args) {

		// le menu principale
		String action;
		do {
			
			System.out.println("**********************************************Menu Principale**************************************\n");
			System.out.println("\t 1 - Ajouter un employe 				  				  *");
			System.out.println("\t 2 - Supprimer un employe   				  			 	  *");
			System.out.println("\t 3 - Afficher la liste des employes  						          *");
			System.out.println("\t 4 - Trouver un employe par Id   							  *");
			System.out.println("\t 5 - Services de patient    								  *");
			System.out.println("\t 6 - Voire le nombre des employees dans l'hopitale  				    	  *");
			System.out.println("\t 7 - Exit\t\t\t\t\t\t\t\t\t\t  * \n \t\t\t\t\t\t\t\t\t\t\t\t  *");	
			System.out.println("***************************************************************************************************\n");
			action = scanner.next();
			switch(action) {
				case "1" :
						menuScondaireAjout();
					break;
				case "2" :
						menuScondaireDelete();
					break;
				case "3" :
						menuScondairePrint();
					break;
				case "4" :
					 	menuScondaireFindById();
					break;
				case "5" :	
						menuScondaireAjoutPatient();
				break;	
				case "6" :	
						menuScondaireNumberEmployees();
					break;
				case "7" :	
						action = "exit";
					break;
				default:
					System.out.println("Error !! entrer une autre valeur entre 1 et 5");	
				 
			}
			
		} while (!action.equals("exit"));
		
	}

	///////////////
	///hors main///
	///////////////

	//le menu de nombre d'employées
	public static void menuScondaireNumberEmployees() {
		String action2;
		do {
			System.out.println("\t\t-------------Le menu pour Voire le nombre d'employee un employe------------ ");
			System.out.println("\t1 - Le nombre de Medcin");
			System.out.println("\t2 - Le nombre Infermier");
			System.out.println("\t3 - Le nombre Administrateur");
			System.out.println("\t4 exit");
			action2 = scanner.next();
			switch(action2) {
			
					case "1" :
							numberEmployees(medcin);
						break;
					case "2" :
							numberEmployees(infermier);
						break;
					case "3" :
							numberEmployees(administrateur);
						break;
					case "4" :	
						action2 = "exit";
						break;
					default:
						System.out.println("Error !! entrer une autre valeur entre 1 et 4");
			}
		} while (!action2.equals("exit"));
	}
	
	
	//le menu de la function ajouter
	public static void menuScondaireAjout() {
		String action2;
		do {
			System.out.println("\t\t-------------Le menu pour ajouter un employe------------ ");
			System.out.println("\t1 - Ajouter Medcin");
			System.out.println("\t2 - Ajouter Infermier");
			System.out.println("\t3 - Ajouter Administrateur");
			System.out.println("\t4 exit");
			action2 = scanner.next();
			switch(action2) {
			
					case "1" :
							Addpoly(medcin);
						break;
					case "2" :
							Addpoly(infermier);
						break;
					case "3" :
						 	Addpoly(administrateur);
						break;
					case "4" :	
						action2 = "exit";
						break;
					default:
						System.out.println("Error !! entrer une autre valeur entre 1 et 4");
			}
		} while (!action2.equals("exit"));
	}
	
	
	//le menu de la function supprimer
	public static void menuScondaireDelete() {
		String action4;
		do {
			System.out.println("\t\t-------------Le menu pour supprimer un employe------------ ");
			System.out.println("\t1 - supprimer Medcin");
			System.out.println("\t2 - supprimer Infermier");
			System.out.println("\t3 - supprimer Administrateur ");
			System.out.println("\t4 exit");
			action4 = scanner.next();
			switch(action4) {
			
					case "1" :
							supprimer(medcin);
							break;
					case "2" :
							supprimer(infermier);
							break;
					case "3" :
						 	supprimer(administrateur);
						 	break;
					case "4" :	
							action4 = "exit";
							break;
					default:
						System.out.println("Error !! entrer une autre valeur entre 1 et 4");
			}
		} while (!action4.equals("exit"));
	}
	
	//le menu secondaire de find By id
			public static void menuScondaireFindById() {
				String action4;
				do {
					System.out.println("\t\t-------------Le menu pour trouver  un employe------------ ");
					System.out.println("\t1 - trouver Medcin by id");
					System.out.println("\t2 - trouver Infermier by id");
					System.out.println("\t3 - trouver Administrateur by id");
					System.out.println("\t4 exit");
					action4 = scanner.next();
					switch(action4) {
					
							case "1" :
									trouver(medcin);
								break;
							case "2" :
									trouver(infermier);
								break;
							case "3" :
									trouver(administrateur);
								break;
							case "4" :	
								action4 = "exit";
								break;
							default:
								System.out.println("Error !! entrer une autre valeur entre 1 et 4");
					}
				} while (!action4.equals("exit"));
			}
	//le menu de la function print
		public static void menuScondairePrint() {
			String action4;
			do {
				System.out.println("\t\t-------------Le menu pour afficher un employe------------ ");
				System.out.println("\t1 - afficher la liste des  Medcin");
				System.out.println("\t2 - afficher la liste des  Infermier");
				System.out.println("\t3 - afficher la liste des Administrateur ");
				System.out.println("\t4 exit");
				action4 = scanner.next();
				switch(action4) { 
				
						case "1" :
								Print(medcin);
							break;
						case "2" :
								Print(infermier);
							break;
						case "3" :
								Print(administrateur);
							break;
						case "4" :	
							action4 = "exit";
							break;
						default:
							System.out.println("Error !! entrer une autre valeur entre 1 et 4");
				}
			} while (!action4.equals("exit"));
		}
	
	
	//menu secondaire d'ajout de patient
	public static void menuScondaireAjoutPatient() {
		String action3;
		do {
			System.out.println("\t\t-------------Le menu pour ajouter un Patient------------ ");
			System.out.println("\t1 - Ajouter Patient");
			System.out.println("\t2 - Supprimer Patient");
			System.out.println("\t3 - Afficher la liste des patients");
			System.out.println("\t4 - Trouver le patient par numero de la carte nationale");
			System.out.println("\t5 - Voire le nombre des patients dans l'hopitale");
			System.out.println("\t6 - exit");
			action3 = scanner.next();
			switch(action3) {
			
					case "1" :
							Patient.add_Patient();
						break;
					case "2" :
							System.out.println("entrer le numero de la carte nationale du patient que vous voulez supprimer");
							String para = scanner.next();
							Patient.deletePatient(para);
						break;
					case "3" :
							for (Patient patient : Patient.listPatients) {
									Patient.getDataPatient(patient);
								}
						break;
					case "4" :	
						System.out.println("entrer le numero de la carte nationale du patient que vous voulez afficher ses informations");
						String numCarteString = scanner.next();
						Patient.FindPatientByNumCarteNational(numCarteString);
						break;
					case "5" :	
						System.out.println(Patient.compteur);
						break;
					case "6" :	
						action3 = "exit";
						break;
					default:
						System.out.println("Error !! entrer une autre valeur entre 1 et 4");
			}
		} while (!action3.equals("exit"));
	}

	

	//function print employé / polymorphisme
		public static void Print(Person person1) {
			
				if(person1 instanceof Medcin) {
					for (Medcin medcin : Medcin.listMedcins) {
						medcin.getData();
					}
				}
				else if (person1 instanceof Infermier){
					for (Infermier infermier : Infermier.listInfermiers) {
						infermier.getData();
						}
				}
				else  {
					for (Administrateur administrateur : Administrateur.listaAdministrateurs) {
						administrateur.getData();
						}
					}
			
			
		}
		
	//function find by id employé : polymorphisme
	public static void trouver(Person person) {
		System.out.println("donnez l'ID");
		String idString = scanner.next();
		if(person instanceof Medcin) {
			person.FindById(idString);
		}
		else if (person instanceof Infermier){
			person.FindById(idString);
		}
		else  {
			person.FindById(idString);
		}
		
	}
	
	//function ajouter employé / polymorphisme
	public static void Addpoly(Person person) {
		if(person instanceof Medcin) {
			person.addEmploye();
		}
		else if (person instanceof Infermier){
			person.addEmploye();
		}
		else  {
			person.addEmploye();
		}
		
	}
	
	
	
	
	//function number employé / polymorphisme
		public static void numberEmployees(Person person) {
			if(person instanceof Medcin) {
				System.out.println(Medcin.compteur);
			}
			else if (person instanceof Infermier){
				System.out.println(Infermier.compteur);
			}
			else  {
				System.out.println(Administrateur.compteur);
			}
			
		}
		
		
		
	
	//function supprimer  employé / polymorphisme
		public static void supprimer(Person person) {
			
			if(person instanceof Medcin) {
				if (Medcin.listMedcins.isEmpty()) {
				System.out.println("la liste est vide");
				}
				else {
					System.out.println("donnez l'ID");
					String idString = scanner.next();
					person.delete(idString);
				}
			}
			
			
			else if (person instanceof Infermier){
				if (Infermier.listInfermiers.isEmpty()) {
					System.out.println("la liste est vide");
					}
					else {
						System.out.println("donnez l'ID");
						String idString = scanner.next();
						person.delete(idString);
					}
			}
			
			
			else  {
				if (Administrateur.listaAdministrateurs.isEmpty()) {
					System.out.println("la liste est vide");
					}
					else {
						System.out.println("donnez l'ID");
						String idString = scanner.next();
						person.delete(idString);
					}
			}
			
		}

	
}
