package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HomePage extends BasePage {

    public HomePage(WebDriver navegador) {
        super(navegador);
    }

    public HomePage preencherCampoBusca(String produto) {
        navegador.findElement(By.id("search_query_top")).click();
        navegador.findElement(By.id("search_query_top")).sendKeys(produto);
        return this;
    }
    public HomePage clicarBotaoConsultar() {
        navegador.findElement(By.xpath("(//BUTTON[@type='submit'])[1]")).click();
        return this ;
    }
    public HomePage escolhaProduto(String produto) {
        preencherCampoBusca(produto);
        clicarBotaoConsultar();
        return this ;
    }
    public HomePage addCarrinho() {
        ((JavascriptExecutor)navegador).executeScript("scroll(0,400)");
        WebElement element = navegador.findElement(By.xpath("(//IMG[@class='replace-2x img-responsive'])[9]"));
        Actions builder = new Actions(navegador);
        builder.moveToElement(element).perform();
        navegador.findElement(By.xpath("//SPAN[text()='Add to cart']")).click();
        return this;
    }
    public CarrinhoPage clicarBotaoProcedToCheckout() {

        WebDriverWait aguardaBotaoAddToCart = new WebDriverWait(navegador, 10);
        aguardaBotaoAddToCart.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@id='layer_cart']/div/div[2]/div[4]/a/span")));
        navegador.findElement(By.xpath("//div[@id='layer_cart']/div/div[2]/div[4]/a/span")).click();

        return new CarrinhoPage(navegador);
    }
    public String capturarTextoProdutoInexistente(){
        return navegador.findElement(By.xpath("//P[@class='alert alert-warning'][contains(text(),'\n" +
                "\t\t\t\t\tNo results were found for your search')]")).getText ();
    }
}