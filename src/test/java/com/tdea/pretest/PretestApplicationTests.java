package com.tdea.pretest;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

class PretestApplicationTests {

    @Test
    void contextLoads() {
        String contra="123456";
        String password="123456";

        boolean valor = UserUtils.isPasswordEqual(contra, password); //con este metodo importamos el UserUtils para comparar las dos contraseñas y asignamos un nombre al metodo

        assertTrue(valor); //de esta forma ejecutamos el true para comprobar si es verdadero o falso el metodo anterior
    }


}
