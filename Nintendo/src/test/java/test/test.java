package test;

import model.Achat;
import model.Adresse;
import model.Boutique;
import model.Client;
import model.Console;
import model.Jeu;

public class test {


	public static void main(String[] args) {
		
		Console ps4 = new Console ("PS4",350,"12-12-2010");
		Console pc = new Console ("PC Gaming",2200,"10-01-2020");
		Console Xbox = new Console ("XBOX",350,"12-12-2009");
		
		Clinet c1 = new Client("tata";"titi");
		Client c2 = new Clinet("toto","tata");
		
		
		
		Jeu j1 = new Jeu ("Fifa",pc);
		Jeu j2 = new Jeu ("Burnout",ps4);
		Jeu j3 = new Jeu ("Zelda",ps4);
		Jeu j4 = new Jeu ("League of Legend",pc);
		Jeu j5 = new Jeu ("Final Fantasy",Xbox);
		
		Achat a1 = new Achat (j2, "12-12-12",26 );
				
		System.out.println(j1);
		System.out.println(j2);
		System.out.println(j3);
		System.out.println(j4);
		System.out.println(j5);
		System.out.println(a1);
		
		
		Adresse chezNous = new Adresse(11,"Rue des Cacahuètes", "Scientrier");
		Boutique boubou = new Boutique("Jeux Tout Chaud", chezNous);
		
	}

}
