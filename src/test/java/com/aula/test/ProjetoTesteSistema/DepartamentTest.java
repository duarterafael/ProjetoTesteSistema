package com.aula.test.ProjetoTesteSistema;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DepartamentTest {
	private WebDriver driver;
	
	@Before
	public void setUp() throws Exception {
		driver = new ChromeDriver();
		driver.get("http://localhost:3000/");
		driver.manage().window().maximize();
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void test() {
		String departamentoNome = "Departamento de testes13";
		driver.findElement(By.xpath("//a[contains(text(),'Departaments')]")).click();
		driver.findElement(By.xpath("//button[@id='create_departments_btn']")).click();
		driver.findElement(By.xpath("//input[@name='Department']")).sendKeys(departamentoNome);
		driver.findElement(By.xpath("//button[contains(text(),'Save Changes')]")).click();
		
		List<WebElement> rows = driver.findElements(By.xpath("//tbody/tr/td[2]"));
		
		boolean hasName = false;
		for (WebElement webElement : rows) {
			
			System.out.println(webElement.getText());
			if(departamentoNome.equals(webElement.getText()))
			{
				hasName = true;
				break;
			}
		}
		
		assertEquals(true, hasName);
		
	}

}
