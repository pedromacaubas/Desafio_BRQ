# Desafio-BRQ
 Repositório referente ao desafio BRQ
## Pré-requisitos

1. JDK 1.8.0_231
java version "1.8.0_231"
Java(TM) SE Runtime Environment (build 1.8.0_231-b11)
Java HotSpot(TM) 64-Bit Server VM (build 25.231-b11, mixed mode)
Link para download: http://www.oracle.com/technetwork/pt/java/javase/downloads/jdk8-downloads-2133151.html

2. IDE Intellij (ou similar, eclipse, netbeans etc...) 
link para download: https://www.jetbrains.com/idea/download/#section=windows

3. Realizar download do projeto Inmetrics e abri-lo na IDE (ao abrir o projeto todas as dependências vão estar dentro do arquivo pom.xml, não precisando realizar o download do selenium junit etc...)

4. Realizar o download do driver do navegador (execução dos testes foram feitos no navegador chrome)
link para download: https://sites.google.com/a/chromium.org/chromedriver/downloads

Outros Drivers 

https://github.com/mozilla/geckodriver/releases (Firefox) 

http://selenium-release.storage.googleapis.com/index.html?path=3.6 (Internet Explorer) 

5. Na page Web contém o método public static WebDriver createChrome(), nele é onde criado o driver do chrome, alterar de: C:\Users\PedroSilvaMacaubas\Drivers\chromedriver.exe para: o local onde foi realizado o download do driver, ou um local de preferência

6. Na estrutura de diretório src\main\resources contém os  arquivo ConsultaCEP.csv,ConsultaItem,ConsultaItemEspecifico clicar com o botão direito em seguida clicar em Copy Path, ir na estrutura de diretório src\test\java\tests\ e nas classes de teste (BuscaCEP,BuscaProduto,AddProdutoCarrinho) alterar a linha @DataLoader(filePaths = "C:\Desafio_PortoSeguroBRQ\desafioportoseguro\src\main\resources\MeuCarrinho.csv"); para o conteúdo copiado quando foi clicado em Copy Path nos arquivos 

7. Para realizar o screenshot também é necessário alterar o caminho em todas as classes de testes, no local especificado abaixo: 
String screenshotArquivo = "C:\\Evidencias\\Evidencias\" + Generator.dataHoraParaArquivo () + test.getMethodName() + ".png";


## Guia de instalação

1. Instalação Intellij - basta realizar o download da versão community, após o download, basta avançar, escolher o projeto Inmetrics, ou iniciar e abri-lo posteriormente

## Passo a passo para execução

#### O projeto foi desenvolvimeto no padrão Page Object

1. \src\test\java\pages:

Estão as páginas por onde se passou a execução, exemplo: HomePage, AdressPage,Payment dentre outras, nelas os métodos, nesses métodos são encontrados os elementos, por id, xpath, class e suas respectivas ações, exemplo realizar um click no elemento, um preenchimeto através do sendkeys etc...

2. \src\test\java\suporte:

Nesse diretório as classes para criar o navegador, realizar o screenshot e a generator onde contém o método para salvar arquivos data e hora local.

3. \src\test\java\tests:

Está as classes de testes (MeuCarrinho,ConfirmarCompra, etc...) nele consta a execução em si, onde estão as anotation @before, @test e @after, também contém outras anotation, como a @DataLoader que carrega o arquivo .csv, fazendo com que vários testes sejam executados de uma única vez, além disso, irá conter a chamada de todos os métodos pertencentes as classes do diretório pages, contém a suíte ExecucaoSuite onde executa todos os testes.

4. Execução

Nas classes de testes, basta em public class clicar no ícone (>) que está destacado e em seguida clicar em Run, por exemplo: Run  'AddProdutoCarrinho'. 

Obs: Em todos os testes, através da anotaion DataLoader as informações são buscadas no arquivos, então se quiser executar mais de um teste, basta atribuir mais uma linha em dos arquivos (MeuCarrinho.csv,ConfirmarCompra.csv, etc...):

Atribuir quantas linhas desejar, seguindo o padrão abaixo:

Exemplo:

testAddProdutoCarrinho,produto,Duration(ms),Duration(ms),Duration(ms),Duration(ms),Duration(ms),Duration(ms),Duration(ms),Duration(ms),Duration(ms),Duration(ms),Duration(ms),Duration(ms),Duration(ms),Duration(ms),Duration(ms),Duration(ms),Duration(ms),Duration(ms),Duration(ms),Duration(ms),Duration(ms),Duration(ms),Duration(ms),Duration(ms),Duration(ms),Duration(ms)
"",Faded Short Sleeve T-shirts,7651.0,7651.0,7651.0,7651.0,7651.0,7651.0,7651.0,7651.0,7651.0,7651.0,7651.0,7651.0,7651.0,7651.0,7651.0,7651.0,7651.0,7651.0,7651.0,7651.0,7651.0,7651.0,7651.0,7651.0,7651.0,7651.0


#### Assista ao vídeo da execução da automação
[![Automação](http://img.youtube.com/vi/QDW7zEisEVU/0.jpg)](https://youtu.be/QDW7zEisEVU "Video de introdução")

A documentação com os cenários segue em anexo

###### Autor

Pedro Silva Macaubas








