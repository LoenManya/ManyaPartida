package com.soa.ws.RestWs;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SumatoriController {


    private String sumaResultado;

    //Con el @RequestMapping indicamos la página que vamos a llamar: localhost:8080/sumar
    @RequestMapping("/sumar")
    //Mediante @RequestParam indicamos los valores que le vamos a pasar al web service en este caso por navegador= localhost:8080/sumar?numero1=5&numero2=10
    public String sumatori(@RequestParam(value="numero1",defaultValue="1") int numero,@RequestParam(value="numero2",defaultValue="1") int numero2) {
        Sumatori suma;
        suma = new Sumatori(numero,numero2);
        sumaResultado="El resultado de la suma de los números "+numero+" + "+numero2+" es = "+suma.sumar();
        //Devuelve el resultado al web service que lo mostrará en el navegador
        return sumaResultado;
    }

}

