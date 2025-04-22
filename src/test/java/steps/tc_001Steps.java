import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import static org.junit.Assert.assertTrue;
import pages.tc_001Page;

public class tc_001Steps {
    private WebDriver driver;
    private tc_001Page page;

    @Given("la aplicación está instalada")
    public void laAplicacionEstaInstalada() {
        // Configuramos el driver del navegador
        System.setProperty("webdriver.chrome.driver", "path/to/chromedriver");
        driver = new ChromeDriver();
        page = new tc_001Page(driver);
    }

    @When("ejecuto la aplicación")
    public void ejecutoLaAplicacion() {
        // Navegamos a la URL de la aplicación
        driver.get("http://url.de.la.aplicacion");
    }

    @Then("la aplicación se inicia correctamente")
    public void laAplicacionSeIniciaCorrectamente() {
        // Verificamos que la aplicación se haya iniciado correctamente
        assertTrue(page.isPageLoaded());
    }

    @Then("muestra la pantalla principal")
    public void muestraLaPantallaPrincipal() {
        // Verificamos que la pantalla principal se muestra
        assertTrue(page.isMainScreenDisplayed());
    }

    // Cerramos el driver después de la ejecución
    @After
    public void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }
}