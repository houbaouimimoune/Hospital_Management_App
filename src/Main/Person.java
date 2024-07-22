package Main;

import java.util.ArrayList;

public abstract class Person {
	
	protected String nomPrenom;
	protected float tempsTravail;
	protected float salaire;
	//public static ArrayList<Person> listPersons = new ArrayList<Person>();

	//constructor
	Person(){
		
	}
	public Person( String nomPrenom, float tempsTravail, float salaire) {
		
		this.nomPrenom = nomPrenom;
		this.tempsTravail = tempsTravail;
		this.salaire = salaire;
	}
	
	//function
	public abstract void addEmploye();
	public abstract void getData();
	public abstract void delete(String idString);
	public abstract void FindById(String para);
	
}
