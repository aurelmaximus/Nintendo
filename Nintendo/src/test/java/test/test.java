package test;

import model.Console;
import model.Jeu;

public class test {


	public static void main(String[] args) {
		
		Console ps4 = new Console ("PS4");
		Console pc = new Console ("PC");
		Console Xbox = new Console ("XBOX");
		
		
		Jeu j1 = new Jeu ("Fifa",pc);
		Jeu j2 = new Jeu ("Burnout",ps4);
		Jeu j3 = new Jeu ("Zelda",ps4);
		Jeu j4 = new Jeu ("League of Legend",pc);
		Jeu j5 = new Jeu ("Final Fantasy",Xbox);
		
		
	}

}
