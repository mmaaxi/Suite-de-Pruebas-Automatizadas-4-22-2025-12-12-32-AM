package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.junit.Assert;

public class tc_002Page {
    WebDriver driver;

    By campoUsuario = By.id("campoUsuario");
    By campoContraseña = By.id("campoContraseña");
    By botonLogin = By.id("botonLogin");
    By dashboard = By.id("dashboard");

    public tc_002Page(WebDriver driver) {
        this.driver = driver;
    }

    public void ingresarUsuario(String usuario) {
        WebElement usuarioElement = driver.findElement(campoUsuario);
        usuarioElement.clear();
        usuarioElement.sendKeys(usuario);
    }

    public void ingresarContraseña(String contraseña) {
        WebElement contraseñaElement = driver.findElement(campoContraseña);
        contraseñaElement.clear();
        contraseñaElement.sendKeys(contraseña);
    }

    public void pulsarBotonLogin() {
        driver.findElement(botonLogin).click();
    }

    public void validarRedireccionDashboard() {
        // Verificación de que la redirección fue exitosa
        WebElement dashboardElement = driver.findElement(dashboard);
        Assert.assertTrue(dashboardElement.isDisplayed());
    }
}