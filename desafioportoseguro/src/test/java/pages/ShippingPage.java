package pages;

import org.junit.After;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ShippingPage extends BasePage {

    public ShippingPage(WebDriver navegador) {
        super(navegador);
    }
    public String capturarTextoEndereco(){
        return navegador.findElement(By.id("address_delivery")).getText ();
    }
    public ShippingPage clicarBotaoProcedtoCheckout() {
        ((JavascriptExecutor)navegador).executeScript("scroll(0,700)");
        navegador.findElement(By.xpath("//*[@id=\"center_column\"]/form/p/button")).click();
        return this;
    }
//cgv
public ShippingPage clicarCheckButton() {

    navegador.findElement(By.id("cgv")).click();
    return this;
}
    public PaymentPage clicarBotaoProcedToCheckout() {

        WebDriverWait aguardaBotaoAddToCartd = new WebDriverWait(navegador, 10);
        aguardaBotaoAddToCartd.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"form\"]/p/button/span")));
        navegador.findElement(By.xpath("//*[@id=\"form\"]/p/button/span")).click();
        return new PaymentPage(navegador);
    }

    //((JavascriptExecutor)navegador).executeScript("scroll(0,400)");



}