package steps;

import elements.ElementosWeb;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.Metodos;

public class EnterVehicle {

	Metodos metodo = new Metodos();
	ElementosWeb elementos = new ElementosWeb();

	@Given("eu esteja no site")
	public void eu_esteja_no_site() {
		System.out.println("Estou no site");

	}

	@Given("clicar na caixa de texto")
	public void clicar_na_caixa_de_texto() throws InterruptedException {
		//Page 1
		metodo.click(elementos.getCaixaDeTexto());
		metodo.click(elementos.model());
		metodo.preencher(elementos.cylinder(), "800");
		metodo.preencher(elementos.getPerformance(), "120");
		metodo.click(elementos.getData());
		metodo.preencher(elementos.getData(), "08/01/2022");
		metodo.click(elementos.getSeats());
		metodo.click(elementos.getHandDrive());
		metodo.click(elementos.getNumber());
		metodo.click(elementos.getFuel());
		metodo.preencher(elementos.getPayload(), "200");
		metodo.preencher(elementos.getWeight(), "500");
		metodo.preencher(elementos.getLastPrice(), "20000");
		metodo.preencher(elementos.getLicense(), "10");
		metodo.preencher(elementos.getAnual(), "10000");
		metodo.pausa(1000);
		metodo.click(elementos.getNext());
		//Page2 
		metodo.preencher(elementos.getFirstName(), "Paulo");
		metodo.preencher(elementos.getLastName(), "Silva");
		metodo.preencher(elementos.getDateBirth(), "10/10/1990");
		metodo.click(elementos.getGender());
		metodo.preencher(elementos.getStreetAddress(), "Rua Plutão");
		metodo.click(elementos.getCountry());
		metodo.preencher(elementos.getZipCode(), "38405000");
		metodo.preencher(elementos.getCity(), "Uberlândia");
		metodo.click(elementos.getOccupation());
		metodo.click(elementos.getHobbies());
		metodo.preencher(elementos.getWebSite(), "www.meusite.com.br");
		metodo.pausa(1000);
		metodo.click(elementos.getNext2());
		//Page 3
		metodo.preencher(elementos.getStartDate(), "10/10/2022");
		metodo.click(elementos.getInsurance());
		metodo.click(elementos.getMerit());
		metodo.click(elementos.getDamage());
		metodo.click(elementos.getOpitional());
		metodo.click(elementos.getCourtesy());
		metodo.pausa(1000);
		metodo.click(elementos.getNext3());
		//Page 4
		metodo.click(elementos.getSilver());
		metodo.pausa(1000);
		metodo.click(elementos.getNext4());
		//Page 5
		metodo.preencher(elementos.getEmail(), "paulosilva2022@gmail.com");
		metodo.preencher(elementos.getPhone(), "5534997115656");
		metodo.preencher(elementos.getUserName(), "PaulinhoSilva");
		metodo.preencher(elementos.getPassword(), "Paulosilva1");
		metodo.preencher(elementos.getConfirmpassword(), "Paulosilva1");
		metodo.pausa(1000);
		metodo.click(elementos.getSendEmail());
		metodo.pausa(10000);
		metodo.validar(elementos.getConfirmemail(), "Sending e-mail success!");
	}

	@When("escrever o texto")
	public void escrever_o_texto() {

	}

	@Then("validar o resultado")
	public void validar_o_resultado() {

	}

}
