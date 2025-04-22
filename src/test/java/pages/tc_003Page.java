package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class tc_003Page {
    private WebDriver driver;
    private By usuarioField = By.id("usuario");
    private By contraseñaField = By.id("contraseña");
    private By loginButton = By.id("login");
    private By mensajeError = By.id("mensajeError");

    public tc_003Page(WebDriver driver) {
        this.driver = driver;
    }

    public void navegarPaginaLogin() {
        driver.get("https://pagina_de_ejemplo.com/login");
    }

    public void ingresarCredenciales(String usuario, String contraseña) {
        WebElement usuarioElement = driver.findElement(usuarioField);
        usuarioElement.clear();
        usuarioElement.sendKeys(usuario);

        WebElement contraseñaElement = driver.findElement(contraseñaField);
        contraseñaElement.clear();
        contraseñaElement.sendKeys(contraseña);
    }

    public void hacerClickEnLogin() {
        driver.findElement(loginButton).click();
    }

    public boolean mensajeErrorVisible() {
        return driver.findElement(mensajeError).isDisplayed();
    }
}