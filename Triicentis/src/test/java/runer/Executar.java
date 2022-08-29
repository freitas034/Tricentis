package runer;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import dirvers.Driver;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;	

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "./features", 
		glue = "steps", 
		tags = "@tag", 
		dryRun = false,
		plugin = {"pretty"}, 
		monochrome = true
	
		)

public class Executar extends Driver {
	
	@BeforeClass
	public static void iniciarTeste() {
		 
		String browser = "CHROME";
		String url = "http://sampleapp.tricentis.com/101/app.php";		
		try {
			if (browser == "CHROME") {
				System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");
				driver = new ChromeDriver();
			} else if (browser == "FIREFOX") {
				System.setProperty("webdriver.gecko.driver", "./Driver/geckodriver.exe");
				driver = new FirefoxDriver();
			} else if (browser == "EDGE") {
				System.setProperty("webdriver.edge.driver", "./Driver/msedgedriver.exe");
				driver = new EdgeDriver();
			} else {
				System.out.println("Selecine o navegador: CHROME, FIREFOX OU EDGE.");

			}
			driver.get(url);
			driver.manage().window().maximize();
			
			
			
		} catch (Exception e) {
			System.out.println("----ERROR AO ABRIR NAVEGADOR----" + e.getMessage());

		}
		
	}
	
	@AfterClass
	public static void finalizarTeste() {
		
		try {
			//driver.quit();
			System.out.println("** TESTE FINALIZADO **");
		} catch (Exception e) {
			System.out.println("----ERRO AO FINALIZAR----" + e.getMessage());

		}
	}

}
