package main.java.com.soulcode.soulib.controllers;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {
    // ao acessar localhost:8080/home
    // deve exibir a pagina index

    // configura o metado para responder a uma erquisição
    // para /home
    
    @GetMapping("/home")
    public String paginaHome(){
        return "index"; // indica qual view serah exibida 
    }
}
