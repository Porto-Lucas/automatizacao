// Configura e gerenciar a execução dos testes de aceitação escritos em Gherkin
package runner;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resources/features",
        glue = {"steps", "hook"},
        tags = "@regressivo", //iniciará a execução de todos os testes marcados com a tag @regressivo
        plugin = {"html:target/cucumber-reports.html"} // Utilizada para gerar um relatório em formato HTML, que será salvo no diretório target como cucumber-reports.html
)
public class TestRunner {
}