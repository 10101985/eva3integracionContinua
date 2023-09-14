package com.platinum.stepdefs;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import static org.junit.jupiter.api.Assertions.*;

public class StepDefinitions {

    private String username;
    private String password;
    private boolean authenticationResult;

    @Given("el nombre de usuario {string}")
    public void el_nombre_de_usuario(String string) {
        username = string;
    }

    @Given("la contraseña {string}")
    public void la_contraseña(String string) {
        password = string;
    }

    @When("intento iniciar sesión")
    public void intento_iniciar_sesión() {
        LoginController loginController = new LoginController();
        authenticationResult = loginController.authenticate(username, password);
    }

    @Then("debería obtener el resultado {string}")
    public void debería_obtener_el_resultado(String string) {
        boolean expected = Boolean.parseBoolean(string);
        assertEquals(expected, authenticationResult);
    }
}
