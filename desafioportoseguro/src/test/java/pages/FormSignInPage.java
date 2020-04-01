package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class FormSignInPage extends BasePage {

    public FormSignInPage(WebDriver navegador) {
        super(navegador);
    }

    public FormSignInPage clicarRadioButton() {
        navegador.findElement(By.id("id_gender1")).click();
        return this;
    }
    public FormSignInPage preencherCampoFirstName(String firstname) {
        ((JavascriptExecutor)navegador).executeScript("scroll(0,250)");
        navegador.findElement(By.id("customer_firstname")).sendKeys(firstname);
        return this;
    }
    public FormSignInPage preencherCampoLastName(String lastname) {
        navegador.findElement(By.id("customer_lastname")).sendKeys(lastname);
        return this;
    }
    public FormSignInPage preencherCampoPassword(String password) {
        navegador.findElement(By.id("passwd")).sendKeys(password);
        return this;
    }
    public FormSignInPage selecionarDia() {
        navegador.findElement(By.id("days")).click();
        WebElement element = navegador.findElement(By.id("days"));
        Select combo = new Select(element);
        combo.selectByIndex(3);
        return this;
    }
    public FormSignInPage selecionarMes() {
        WebElement element = navegador.findElement(By.id("months"));
        Select combo = new Select(element);
        combo.selectByIndex(3);
        return this;
    }
    public FormSignInPage selecionarAno() {
        WebElement element = navegador.findElement(By.id("years"));
        Select combo = new Select(element);
        combo.selectByIndex(3);
        return this;
    }
    public FormSignInPage preencherCampoAdress(String endereco) {
        navegador.findElement(By.id("address1")).sendKeys(endereco);
        return this;
    }
    public FormSignInPage preencherCampoCity(String cidade) {
        navegador.findElement(By.id("city")).sendKeys(cidade);
        return this;
    }
    public FormSignInPage selecionarState() {
        WebElement element = navegador.findElement(By.id("id_state"));
        Select combo = new Select(element);
        combo.selectByIndex(3);
        return this;
    }
    public FormSignInPage preencherPostalCode(String cep) {
        navegador.findElement(By.id("postcode")).sendKeys(cep);
        return this;
    }
    public FormSignInPage selecionarCountry() {
        WebElement element = navegador.findElement(By.id("id_country"));
        Select combo = new Select(element);
        combo.selectByVisibleText("United States");
        return this;
    }
    public FormSignInPage selecionarMobilePhone(String telefone) {
        navegador.findElement(By.id("phone_mobile")).sendKeys(telefone);

        return this;
    }
    public FormSignInPage preencherCampoMyAddress(String myaddress) {
        navegador.findElement(By.id("alias")).sendKeys(myaddress);
        return this;
    }
    public FormSignInPage preencherForm(String fisrtname, String lastname,String password, String endereco,String cidade,
                                           String cep,String telefone,String myaddress){
        clicarRadioButton();
        preencherCampoFirstName(fisrtname);
        preencherCampoLastName(lastname);
        preencherCampoPassword(password);
        selecionarDia();
        selecionarMes();
        selecionarAno();
        preencherCampoAdress(endereco);
        preencherCampoCity(cidade);
        preencherPostalCode(cep);
        selecionarState();
        selecionarCountry();
        selecionarMobilePhone(telefone);
        preencherCampoMyAddress(myaddress);

        return this;
    }

    public AdreessPage clicarBotaoRegister() {
        navegador.findElement(By.id("submitAccount")).click();

        return new AdreessPage(navegador);
    }



}