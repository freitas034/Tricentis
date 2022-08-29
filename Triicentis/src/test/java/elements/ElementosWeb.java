package elements;

import org.openqa.selenium.By;

public class ElementosWeb {

	//Page 1
	private By make = By.xpath("/html/body/div[1]/div/div[1]/div/div/form/div/section[1]/div[1]/select/option[3]");
	private By model = By.xpath("/html/body/div[1]/div/div[1]/div/div/form/div/section[1]/div[2]/select/option[5]");
	private By cylinder = By.xpath("/html/body/div[1]/div/div[1]/div/div/form/div/section[1]/div[3]/input");
	private By performance = By.xpath("/html/body/div[1]/div/div[1]/div/div/form/div/section[1]/div[4]/input");
	private By data = By.xpath("/html/body/div[1]/div/div[1]/div/div/form/div/section[1]/div[5]/input");
	private By seats = By.xpath("/html/body/div[1]/div/div[1]/div/div/form/div/section[1]/div[6]/select/option[2]");
	private By handDrive = By.xpath("/html/body/div[1]/div/div[1]/div/div/form/div/section[1]/div[7]/p/label[1]/span");
	private By number = By.xpath("/html/body/div[1]/div/div[1]/div/div/form/div/section[1]/div[8]/select/option[2]");
	private By fuel = By.xpath("/html/body/div[1]/div/div[1]/div/div/form/div/section[1]/div[9]/select/option[2]");
	private By payload = By.xpath("/html/body/div[1]/div/div[1]/div/div/form/div/section[1]/div[10]/input");
	private By weight = By.xpath("/html/body/div[1]/div/div[1]/div/div/form/div/section[1]/div[11]/input");
	private By lastPrice = By.xpath("/html/body/div[1]/div/div[1]/div/div/form/div/section[1]/div[12]/input");
	private By license = By.xpath("/html/body/div[1]/div/div[1]/div/div/form/div/section[1]/div[13]/input");
	private By anual = By.xpath("/html/body/div[1]/div/div[1]/div/div/form/div/section[1]/div[14]/input");
	private By next = By.xpath("/html/body/div[1]/div/div[1]/div/div/form/div/section[1]/div[15]/button");

	//Page 2
	private By firstName = By.xpath("/html/body/div[1]/div/div[1]/div/div/form/div/section[2]/div[1]/input");
	private By lastName = By.xpath("/html/body/div[1]/div/div[1]/div/div/form/div/section[2]/div[2]/input");
	private By dateBirth = By.xpath("/html/body/div[1]/div/div[1]/div/div/form/div/section[2]/div[3]/input");
	private By gender = By.xpath("/html/body/div[1]/div/div[1]/div/div/form/div/section[2]/div[4]/p/label[1]/span");
	private By streetAddress = By.xpath("/html/body/div[1]/div/div[1]/div/div/form/div/section[2]/div[5]/input");
	private By country = By.xpath("/html/body/div[1]/div/div[1]/div/div/form/div/section[2]/div[6]/select/option[2]");
	private By zipCode = By.xpath("/html/body/div[1]/div/div[1]/div/div/form/div/section[2]/div[7]/input");
	private By city = By.xpath("/html/body/div[1]/div/div[1]/div/div/form/div/section[2]/div[8]/input");
	private By occupation = By.xpath("/html/body/div[1]/div/div[1]/div/div/form/div/section[2]/div[9]/select/option[2]");
	private By hobbies = By.xpath("/html/body/div[1]/div/div[1]/div/div/form/div/section[2]/div[10]/p/label[5]/span");
	private By webSite = By.xpath("/html/body/div[1]/div/div[1]/div/div/form/div/section[2]/div[11]/input");
	private By next2 = By.xpath("/html/body/div[1]/div/div[1]/div/div/form/div/section[2]/div[13]/button[2]");

	//Page 3
	private By startDate = By.xpath("/html/body/div[1]/div/div[1]/div/div/form/div/section[3]/div[1]/input");
	private By insurance = By.xpath("/html/body/div[1]/div/div[1]/div/div/form/div/section[3]/div[2]/select/option[2]");
	private By merit = By.xpath("/html/body/div[1]/div/div[1]/div/div/form/div/section[3]/div[3]/select/option[2]");
	private By damage = By.xpath("/html/body/div[1]/div/div[1]/div/div/form/div/section[3]/div[4]/select/option[2]");
	private By opitional = By.xpath("/html/body/div[1]/div/div[1]/div/div/form/div/section[3]/div[5]/p/label[1]/span");
	private By courtesy = By.xpath("/html/body/div[1]/div/div[1]/div/div/form/div/section[3]/div[6]/select/option[2]");
	private By next3 = By.xpath("/html/body/div[1]/div/div[1]/div/div/form/div/section[3]/div[7]/button[2]");
	//Page 4
	private By silver = By.xpath("/html/body/div[1]/div/div[1]/div/div/form/div/section[4]/section/div[1]/table/tfoot/tr/th[2]/label[1]/span");
	private By next4 = By.xpath("/html/body/div[1]/div/div[1]/div/div/form/div/section[4]/section/div[2]/div[2]/button[2]");
	//Page 5
	private By email = By.xpath("/html/body/div[1]/div/div[1]/div/div/form/div/section[5]/section/div[1]/input");
	private By phone = By.xpath("/html/body/div[1]/div/div[1]/div/div/form/div/section[5]/section/div[2]/input");
	private By userName = By.xpath("/html/body/div[1]/div/div[1]/div/div/form/div/section[5]/section/div[3]/input");
	private By password = By.xpath("/html/body/div[1]/div/div[1]/div/div/form/div/section[5]/section/div[4]/input");
	private By confirmpassword = By.xpath("/html/body/div[1]/div/div[1]/div/div/form/div/section[5]/section/div[5]/input");
	private By sendEmail = By.xpath("/html/body/div[1]/div/div[1]/div/div/form/div/section[5]/section/div[7]/button[2]");
	private By confirmemail = By.xpath("/html/body/div[4]/h2");


	
	public By getCaixaDeTexto() {
		return make;
	}

	public By click() {
		return model;	
	}
	

	public By getPerformance() {
		return performance;
	}

	public By model() {
		
		return model;
	}

	public By cylinder() {
		return cylinder;
	}



	public By getData() {
		return data;
	}

	public By getSeats() {
		return seats;
	}

	public By getHandDrive() {
		return handDrive;
	}

	public By getNumber() {
		return number;
	}

	public By getFuel() {
		return fuel;
	}

	public By getPayload() {
		return payload;
	}

	public By getWeight() {
		return weight;
	}

	public By getLastPrice() {
		return lastPrice;
	}

	public By getLicense() {
		return license;
	}

	public By getAnual() {
		return anual;
	}

	public By getNext() {
		return next;
	}

	public By getFirstName() {
		return firstName;
	}

	public By getLastName() {
		return lastName;
	}

	public By getDateBirth() {
		return dateBirth;
	}

	public By getGender() {
		return gender;
	}

	public By getStreetAddress() {
		return streetAddress;
	}

	public By getCountry() {
		return country;
	}

	public By getZipCode() {
		return zipCode;
	}

	public By getCity() {
		return city;
	}

	public By getOccupation() {
		return occupation;
	}

	public By getHobbies() {
		return hobbies;
	}

	public By getWebSite() {
		return webSite;
	}

	public By getNext2() {
		return next2;
	}

	public By getStartDate() {
		return startDate;
	}

	public By getInsurance() {
		return insurance;
	}

	public By getMerit() {
		return merit;
	}

	public By getDamage() {
		return damage;
	}

	public By getOpitional() {
		return opitional;
	}

	public By getCourtesy() {
		return courtesy;
	}

	public By getNext3() {
		return next3;
	}

	public By getSilver() {
		return silver;
	}

	public By getNext4() {
		return next4;
	}

	public By getEmail() {
		return email;
	}


	public By getPhone() {
		return phone;
	}

	public By getUserName() {
		return userName;
	}

	public By getPassword() {
		return password;
	}

	public By getConfirmpassword() {
		return confirmpassword;
	}

	public By getSendEmail() {
		return sendEmail;
	}

	public By getConfirmemail() {
		return confirmemail;
	}


	}
