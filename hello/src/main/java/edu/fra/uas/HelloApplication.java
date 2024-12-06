package edu.fra.uas;
//Einstiegspunkt der Anwendung
//Spring-Klasse initialisiert Hauptanwendung und startet Anwendung
//SpringBoot Application kombiniert mehrere SB Konfigs
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication //Meta Annotation -> Bean Definition, Aktiviert autom. Konfig SpringBoot; aktiviert Scan
public class HelloApplication {

	public static void main(String[] args) { //Einstiegspunkt der Anwendung
		SpringApplication.run(HelloApplication.class, args); //Startet Spring Appl Context, erstellt Beans, startet Server
	}

}
