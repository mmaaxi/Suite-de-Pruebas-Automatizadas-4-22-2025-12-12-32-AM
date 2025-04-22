package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.By;

public class tc_001Page {
    private WebDriver driver;

    // Constructor
    public tc_001Page(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    // Método para verificar si la página se ha cargado
    public boolean isPageLoaded() {
        return driver.getTitle().contains("Título de la aplicación");
    }

    // Método para verificar si la pantalla principal está mostrada
    public boolean isMainScreenDisplayed() {
        return driver.findElement(By.id("mainScreenElementId")).isDisplayed();
    }
}