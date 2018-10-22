package com.soa.ws.RestWs;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SayHello {

    @RequestMapping("/hola")
    public String sayhello() {
        return("Hola Mundo");
    }
    //Esto es un cambio 2
}
