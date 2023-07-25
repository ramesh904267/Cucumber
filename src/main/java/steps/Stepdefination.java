package steps;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Stepdefination {
	public ChromeDriver driver;
	@Given("Open the browser and launch leaftaps application using {string}")
	public void launchApp(String url) {
		driver = new ChromeDriver();
		driver.get(url);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	}

	
	@Given("Enter the username as {string}")
	public void enterUsername(String uname) {
		driver.findElement(By.id("username")).sendKeys(uname);
	}

	@And("Enter the password as {string}")
	public void enterpassword(String psword) {
		driver.findElement(By.id("password")).sendKeys(psword);
	}

	@When("Click on Login button")
	public void clickLoginButton() {
		driver.findElement(By.className("decorativeSubmit")).click();
	}

	@Then("Homepage should be displayed")
	public void verifyHomepage() {
		String title = driver.getTitle();
		if (title.contains("Leaftaps")) {
			System.out.println("HomePage is Displayed");
		} else {
			System.out.println("HomePage is not Displayed");
		}
	}

	@When("Click on crmsfa link")
	public void clickCrmsfaLink() {
		driver.findElement(By.partialLinkText("CRM/SFA")).click();
	}

	@And("Click Leads Link")
	public void clickLeadLink() {
		driver.findElement(By.linkText("Leads")).click();
	}

	@And("Click CreateLead Link")
	public void clickCreatLeadLink() {
		driver.findElement(By.linkText("Create Lead")).click();
	}

	@Given("Enter the companyName as (.*)$")
	public void enterCompanyName(String cName) {
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys(cName);
	}

	@And("Enter the firstName as (.*)$")
	public void enterFirstName(String fName) {
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys(fName);
	}

	@And("Enter the lastName as (.*)$")
	public void enterLastName(String lName) {
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys(lName);
	}

	@When("Click on CreateLead Button")
	public void clickCreateLeadButton() {
		driver.findElement(By.name("submitButton")).click();
	}

	@Then("ViewLeadsPage should be displayed")
	public void verifyViewLeadPage() {
		String text = driver.findElement(By.id("viewLead_companyName_sp")).getText();
		System.out.println(text);
		if (text.contains("Testleaf")) {
			System.out.println("I confirm the Title has Testleaf");
		} else {
			System.out.println("This Title does not have Testlesf ");
		}

	}
}
