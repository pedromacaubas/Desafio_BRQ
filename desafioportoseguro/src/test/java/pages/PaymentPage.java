package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class PaymentPage extends BasePage {

    public PaymentPage(WebDriver navegador) {
        super(navegador);
    }

    public PaymentPage clicarBotaoFormaPagamento() {
        ((JavascriptExecutor)navegador).executeScript("scroll(0,700)");
        navegador.findElement(By.xpath("//*[@id=\"HOOK_PAYMENT\"]/div[1]/div/p/a")).click();
        return this;
    }

//*[@id="cart_navigation"]/button
public PaymentPage clicarBotaoIConfirmMyOrder() {
    ((JavascriptExecutor)navegador).executeScript("scroll(0,700)");
    navegador.findElement(By.xpath("//*[@id=\"cart_navigation\"]/button")).click();
    return this;
}

    public String capturarTextoConfirmacao(){
        return navegador.findElement(By.xpath("//*[@id=\"center_column\"]/div/p/strong")).getText ();
    }
}