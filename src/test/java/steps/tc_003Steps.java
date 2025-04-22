package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import pages.tc_003Page;

public class tc_003Steps {
    WebDriver driver;
    tc_003Page loginPage = new tc_003Page(driver);

    @Given("el usuario está en la página de inicio de sesión")
    public void el_usuario_esta_en_la_pagina_de_inicio_de_sesion() {
        loginPage.navegarPaginaLogin();
    }

    @When("ingresa un usuario {string} y una contraseña {string}")
    public void ingresa_un_usuario_y_una_contraseña(String usuario, String contraseña) {
        loginPage.ingresarCredenciales(usuario, contraseña);
        loginPage.hacerClickEnLogin();
    }

    @Then("el sistema muestra un mensaje de error de autenticación")
    public void el_sistema_muestra_un_mensaje_de_error_de_autenticacion() {
        Assert.assertTrue("El mensaje de error de autenticación no es visible", loginPage.mensajeErrorVisible());
    }
}