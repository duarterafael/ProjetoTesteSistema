package com.aula.test.ProjetoTesteSistema;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        WebDriver drive = new ChromeDriver();
    	drive.get("http://localhost:3000/");
    	
    }
}
