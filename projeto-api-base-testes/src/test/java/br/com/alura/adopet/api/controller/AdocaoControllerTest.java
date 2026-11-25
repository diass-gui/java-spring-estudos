package br.com.alura.adopet.api.controller;

import com.sun.net.httpserver.HttpsConfigurator;
import org.junit.jupiter.api.Test;
import org.springframework.http.HttpStatus;

import static org.junit.jupiter.api.Assertions.*;

class AdocaoControllerTest {

    @Test
    void deveriaDevolverCodigo400ParaSolicitacaoDeAdocaoComErros() {
        // Arrange
        String json = "{}";

        // Act


        // Assert
        assertEquals(400, HttpStatus.BAD_REQUEST);

    }

}