package edu.fra.uas.controller;

//Benötigte Klassen, um Funktionalität Controller bereitzustellen und HTTP-Anfragen zu bearbeiten
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RequestParam;


@Controller // markiert Java-Klassse als Controller Komponente im MVC
public class HelloWorldController {

    @RequestMapping(value = "yarak", method = RequestMethod.GET) //Bindet die Methode an den URL Pfad hello; Reagiert nur auf GET-Anfragen
    @ResponseBody //Rückgabewert der Methode wird direkt in die HTTP Antwort geschrieben, anstatt HTML-Seite zu rendern (verarbeiten der Dateien und visuell darstellbare Website daraus erstellen)
    public String getHelloWorld() {
        return "<h1>Hello World Spring Boot!</h1>"; //Nachricht als html überschrift
    }

    //personalisierte Begrüßung
    @RequestMapping(value = "greet", method=RequestMethod.GET)
    @ResponseBody
    //Über Request Param: optionalser Parameter aus URL wird abgerufen -> URL Schema: localhost:8080/greet?name=Marv
    public String greetUser(@RequestParam (name = "name", defaultValue = "Guest") String name) {
        return "<h1>Hello, " + name + "!</h1>";
    }
    
}

