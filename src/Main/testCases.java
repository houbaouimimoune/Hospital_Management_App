package Main;

import static org.junit.jupiter.api.Assertions.*;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.time.Duration;
import java.util.InputMismatchException;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Test;

class testCases {
	
	
	public static int c = 0;
	
	/*
	@Test
	void testConstrMed1() {
		Medcin medcin = new Medcin("saad", 8, 8000, "CARD");
		
		assertEquals(medcin.nomPrenom,"saad");
		assertEquals(medcin.tempsTravail,8);
		assertEquals(medcin.salaire,8000);
		assertEquals(medcin.specialite,"CARD");
	}
	
	@Test
	void testConstMed2() {
		Medcin medcin = new Medcin();
		
		medcin.nomPrenom = "hassan";
		medcin.tempsTravail = 7;
		medcin.salaire = 6000;
		medcin.specialite = "CHRG";
		
		assertEquals(medcin.nomPrenom,"hassan");
		assertEquals(medcin.tempsTravail,7);
		assertEquals(medcin.salaire,6000);
		assertEquals(medcin.specialite,"CHRG");	
	}
	
	
	
	@Test
	void testCompteurMed1() {
		Medcin.compteur = 0 ;
		assertEquals(Medcin.compteur, 0);
		Medcin medcin= new Medcin();
		assertEquals(Medcin.compteur, 1);
	}
	
	
	@Test
	void testCompteurMed2() {
		Medcin.compteur = 0 ;
		assertEquals(Medcin.compteur, 0);
		Medcin medcin = new Medcin("saad", 8, 8000, "CARD");
		assertEquals(Medcin.compteur, 1);
	}
	
	
	
	
	//assertTrue and assertFalse
	@Test
	void testIdMed1() {
		Medcin.compteur = 0 ;
		Medcin medcin = new Medcin("saad", 8, 8000, "CARD");
		assertTrue(medcin.idMed.equals("CARD1"));

	}
	
	
	
	//assertNull and assertNotNull
	@Test
	void testIdMed2() {
		Medcin.compteur = 0;
		Medcin medcin = new Medcin();
		
		medcin.nomPrenom = "hassan";
		medcin.tempsTravail = 7;
		medcin.salaire = 6000;
		medcin.specialite = "CHRG";
		
		assertNull(medcin.idMed);

	}
	
	
	
	
	@Test
	void testAddEmployeMed() {
		Medcin medcin = new Medcin();
		medcin.addEmploye();
		assertFalse(medcin.listMedcins.isEmpty());
	}

	
	
	//assertSame  compare les références des objets n'est pas leur valeur
	@Test
	void testObjectAddEmployeMed() {
		Medcin medcin1 = new Medcin("saad", 8, 8000, "CARD");
		Medcin medcin2= new Medcin("saad", 8, 8000, "CARD");
		assertSame(medcin1, medcin2);

	}
	
	
	@Test
	void testAddEmploy() {
		String nom = "MOHAMED";
		float temps = 7;
		float salaire =6000;
		String special = "CARD";
		
		Medcin medcin = new Medcin();
		medcin.addEmploye();
		
		for(Medcin m:Medcin.listMedcins) {
			assertEquals(m.nomPrenom , nom);
			assertEquals(m.tempsTravail , temps);
			assertEquals(m.salaire,salaire);
			assertEquals(m.specialite, special);
			break;
		}
		
	}
	
	@Test
	void testHowMuchAddEmployee() {
		Medcin medcin = new Medcin();
		medcin.addEmploye();
		int i = 0;
		for(Medcin m:medcin.listMedcins) {
			i+=1;
		}
		assertEquals(i, 1);
	}
	@Test
	void testDelete() {
		Medcin medcin = new Medcin("Mohamed",7,9000,"CARD");
		Medcin.listMedcins.add(medcin);
		assertFalse(Medcin.listMedcins.isEmpty());
		medcin.delete(medcin.idMed);
		assertTrue(Medcin.listMedcins.isEmpty());
	}
	@Test
	void testFindBy() {
		Medcin medcin = new Medcin("Mimoune",8,9000,"GIRT");
		Medcin.listMedcins.add(medcin);
		
		
		String excpectedString = "Not Found";
		
		ByteArrayOutputStream contenant = new ByteArrayOutputStream();
		System.setOut(new PrintStream(contenant));
		
		medcin.FindById("12");
		String actualString = contenant.toString();
		assertEquals(excpectedString,actualString );
	}
	
	@Test
	void testFindBy2() {
		Medcin.compteur=0;
		Medcin medcin = new Medcin("Mimoune",8,9000,"GIRT");
		Medcin.listMedcins.add(medcin);
		
		
		String excpectedString = "Medcin :\r\n"
				+ "Nom : Mimoune\r\n"
				+ "Id : GIRT1\r\n"
				+ "TempsTravail : 8.0 heure par jour\r\n"
				+ "Salaire : 9000.0 dh\r\n"
				+ "Specialite : GIRT\r\n"
				+ "	-------------------------------------------------------";
		
		ByteArrayOutputStream contenant = new ByteArrayOutputStream();
		System.setOut(new PrintStream(contenant));
		
		medcin.FindById(medcin.idMed);
		String actualString = contenant.toString();
		assertEquals(excpectedString,actualString );
	}
	
	@Test 
	void testListPatientEmpty() {
		Patient p = new Patient();
		assertTrue(p.listPatients.isEmpty());
	}
	
	@Test
	void testAddPatient() {
		Patient p = new Patient();
		p.add_Patient();
		assertFalse(Patient.listPatients.isEmpty());
	}
	
	
	
	@Test
	void testListPatientCont() {
		Patient patient = new Patient();
		
		String nom = "Mimoune";
		String date = "17/04/2001";
		String cartNatio = "Z120303";
		String maladie = "Cardiale";
		patient.add_Patient();
		for(Patient p:patient.listPatients) {
			assertEquals(nom, p.nom_Prenom);
			assertEquals(date, p.date_Naissance);
			assertEquals(cartNatio, p.n_Carte_Nationale);
			assertEquals(maladie, p.maladie);
			break;
		}
		
	}
	
	*/
	@Test
	void testExceptionNumMedcin() {
		Patient patient = new Patient();
		assertThrows(InputMismatchException.class, ()-> patient.add_Patient());
		
	}
	
	
	@Test
	void testDelete() {
		Medcin medcin = new Medcin("Mohamed",7,9000,"CARD");
		//Medcin.listMedcins.add(medcin);
		assertThrows(IndexOutOfBoundsException.class, ()-> medcin.delete("12"));
	}
	
	
	
	
	
}
