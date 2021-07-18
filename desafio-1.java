

package main.java;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class driver
{
    public static void main(String[] args){
        System.setProperty("webdriver.chrome.driver", "C:\\caminho\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("http://www.unimed.coop.br");

        WebElement caixaDeBusca = driver.findElement(By.id("fragment-oimm-link"));
        caixaDeBusca.click();

        WebElement buscaDetalhada = driver.findElement(By.id("react-tabs-2"));
        buscaDetalhada.click();

        WebElement espeCialidade = driver.findElement(By.className(" css-1hwfws3"));
        WebElement btnEspecialidade = driver.findElement(By.className("ClientInputHelpPopover--icon"));
        btnEspecialidade.click();
        espeCialidade.sendKeys("Clinica Medica");
        espeCialidade.click();

        WebElement campoEstado = driver.findElement(By.className(" css-1hwfws3"));
        WebElement btnEstado = driver.findElement(By.className("css-19bqh2r"));
        btnEstado.click();

        WebElement campoCiDade = driver.findElement(By.className("InputColumn col-lg-6"));
        campoCiDade.click();
        campoCiDade.sendKeys("Rio de Janeiro");
        campoCiDade.click();