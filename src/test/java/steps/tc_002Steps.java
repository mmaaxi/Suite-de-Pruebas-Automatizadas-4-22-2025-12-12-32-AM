package steps;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.cucumber.java.en.*;
import pages.tc_002Page;

public class tc_002Steps {
    WebDriver driver;
    tc_002Page loginPage;

    @Given("el usuario está en la página de login")
    public void elUsuarioEstaEnLaPaginaDeLogin() {
        // Configuración del navegador y acceso a la página de login
        System.setProperty("webdriver.chrome.driver", "path/to/chromedriver");
        driver = new ChromeDriver();
        driver.get("https://www.ejemplo.com/login");
        loginPage = new tc_002Page(driver);
    }

    @When("ingresa el usuario {string} y la contraseña {string}")
    public void ingresaElUsuarioYLaContraseña(String usuario, String contraseña) {
        // Ingreso de credenciales en la página de login
        loginPage.ingresarUsuario(usuario);
        loginPage.ingresarContraseña(contraseña);
        loginPage.pulsarBotonLogin();
    }
    
    @Then("es redirigido a la pantalla de dashboard")
    public void esRedirigidoALaPantallaDeDashboard() {
        // Validación de redirección al dashboard
        loginPage.validarRedireccionDashboard();
        driver.quit();
    }
}