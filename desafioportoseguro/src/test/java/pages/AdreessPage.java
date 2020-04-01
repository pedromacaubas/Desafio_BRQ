package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AdreessPage extends BasePage {

    public AdreessPage(WebDriver navegador) {
        super(navegador);
    }
    public String capturarTextoEndereco(){
        return navegador.findElement(By.id("address_delivery")).getText ();
    }
    public ShippingPage clicarBotaoProcedtoCheckout() {
        ((JavascriptExecutor)navegador).executeScript("scroll(0,700)");
        navegador.findElement(By.xpath("//*[@id=\"center_column\"]/form/p/button")).click();
        return new ShippingPage (navegador);
    }
//cgv


    //((JavascriptExecutor)navegador).executeScript("scroll(0,400)");



}