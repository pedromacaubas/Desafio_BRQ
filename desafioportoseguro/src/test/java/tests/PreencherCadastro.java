package tests;

import org.easetech.easytest.annotation.DataLoader;
import org.easetech.easytest.annotation.Param;
import org.easetech.easytest.runner.DataDrivenTestRunner;
import org.junit.After;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.TestName;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;
import pages.HomePage;
import suporte.Generator;
import suporte.Screenshot;
import suporte.Web;
import static org.junit.Assert.assertEquals;

@RunWith(DataDrivenTestRunner.class) // com essa anotation estou dizendo para usar a biblioteca DataDrivenTestRunner
@DataLoader(filePaths ="C:\\Desafio_PortoSeguroBRQ\\desafioportoseguro\\src\\main\\resources\\PreencherCadastro.csv")// filePaths são os arquivos que queremos utilizar, coloquei

public class PreencherCadastro {
    // variavel do tipo webdriver
    private WebDriver navegador;
@Rule
    public TestName test = new TestName();
@Before
    public void setUp(){

      //chamando direto a página
      navegador = Web.createChrome ();
}

    @Test
    public void testPreencherCadastro(
            @Param( name="produto")String produto,
            @Param( name="email")String email,
            @Param( name="firstname")String firstname,
            @Param( name="lastname")String lastname,
            @Param( name="password")String password,
            @Param( name="endereco")String endereco,
            @Param( name="cidade")String cidade,
            @Param( name="cep")String cep,
            @Param( name="telefone")String telefone,
            @Param( name="myaddress")String myaddress
    ){
        String texto = new HomePage( navegador )
                .escolhaProduto(produto)
                .addCarrinho()
                .clicarBotaoProcedToCheckout()
                .clicarBotaoProcedtoCheckout()
                .preencherCampoEmailAdrees(email)
                .clicarBotaoCreateAnAccount()
                .preencherForm( firstname,lastname, password,
                        endereco,cidade,cep,telefone,myaddress)
                .clicarBotaoRegister()
                .capturarTextoEndereco();
        assertEquals ( "YOUR DELIVERY ADDRESS\n" +
                "TestePrimeiroNome TesteUltimoNome\n" +
                "TesteRua\n" +
                "TesteCidade, Arizona 09260\n" +
                "United States\n" +
                "0000000\n" +
                "Update",texto);
        //String screenshotArquivo = "C:\\Evidencias\\Evidencias" + Generator.dataHoraParaArquivo () + test.getMethodName() + ".png";
        // Screenshot.tirar ( navegador, screenshotArquivo);
    }


    @After
    public void tearDown(){

        navegador.quit ();
    }
}
