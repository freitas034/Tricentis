package pages;

import static org.junit.Assert.assertEquals;

import org.openqa.selenium.By;

import dirvers.Driver;

public class Metodos extends Driver {

	public void preencher(By elemento, String texto) {

		try {
			driver.findElement(elemento).sendKeys(texto);

		} catch (Exception e) {
			System.out.println("----ERROR AO PREENCHER----" + e.getMessage());

		}

	}

	public void validar(By elemento, String textoEsperado) {

		try {
			Thread.sleep(3000);
			String textoCapturado = driver.findElement(elemento).getText();
			assertEquals(textoEsperado, textoCapturado);
		} catch (Exception e) {
			System.err.println("Sending e-mail success!" + e.getMessage());
		}

	}

	public void click(By elemento) {

		try {
			driver.findElement(elemento).click();

		} catch (Exception e) {
			System.out.println("----ERROR AO CLICAR----" + e.getMessage());

		}

	}

	public void submit(By elemento) {
		try {
			driver.findElement(elemento).submit();

		} catch (Exception e) {
			System.out.println("----ERROR AO DAR SUBMIT----" + e.getMessage());

		}

	}

	public void pausa(int tempo) throws InterruptedException {
		try {
			Thread.sleep(tempo);

		} catch (Exception e) {
			System.out.println("----ERROR AO PAUSAR----" + e.getMessage());

		}

	}

}
