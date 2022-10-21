package it.danieledenza;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;


import it.danieledenzaSpring.Contenuto;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ApplicationContext context = new AnnotationConfigApplicationContext(Contenuto.class);
		Immobile imm = context.getBean(Immobile.class);
		System.out.println(imm);
		
		
		
	}

}
