package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CarrinhoPage extends BasePage {
    public CarrinhoPage(WebDriver navegador) {
        super(navegador);
    }
    public CarrinhoPage clicarBotaoProcedtoCheckout() {
        ((JavascriptExecutor)navegador).executeScript("scroll(0,400)");
        navegador.findElement(By.linkText("Proceed to checkout")).click();
        return this;
    }
    public CarrinhoPage preencherCampoEmailAdrees(String email) {
        ((JavascriptExecutor)navegador).executeScript("scroll(0,250)");
        navegador.findElement(By.id("email_create")).sendKeys(email);
        return this;
    }
    public FormSignInPage clicarBotaoCreateAnAccount() {
        ((JavascriptExecutor)navegador).executeScript("scroll(0,250)");
        navegador.findElement(By.id("SubmitCreate")).click();
        return new FormSignInPage(navegador);
    }

    public String capturarTextoProdutoInexistente(){
        return navegador.findElement(By.xpath("//P[@class='alert alert-warning'][contains(text(),'")).getText ();
    }

    public String capturarTextoProduto(){
        return navegador.findElement(By.xpath("//TD[@class='cart_description']")).getText ();
    }


}