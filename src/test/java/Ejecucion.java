import net.bytebuddy.implementation.bytecode.Throw;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Ejecucion {

    public static void main(String[] args) throws InterruptedException {

        //---- Primer video

        ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.addArguments("--start-maximized"); //---- para maximizar la pagina wed
        WebDriver driver = new ChromeDriver(chromeOptions);

        driver.get("https://demoqa.com/");

        String title = driver.getTitle();
        System.out.println(title + "Título de la página");


         // ----- Segundo Video

        JavascriptExecutor jsExecutor = (JavascriptExecutor) driver;
        jsExecutor.executeScript("window.scrollBy(0, 500)");

        Thread.sleep(2000);

        //--- Es para que cuando cargue la pagina epere 2 segundos y ejecute el siguiente paso

        driver.findElement(By.xpath("//*[@id='app']/div/div/div[2]/div/div[1]/div/div[3]/h5")).click();
        System.out.println("dio click en elementos");

        /*jsExecutor.executeScript("window.scrollBy(0, 30)");
        Thread.sleep(2000);
        driver.findElement(By.xpath("//*[@id='item-2']/span")).click();
        System.out.println("dio click en Radio Button");

        Thread.sleep(2000);
        driver.findElement(By.xpath("//*[@id='app']/div/div/div[2]/div[2]/div[2]/div[2]/label")).click();
        System.out.println("dio click en yes");

        Thread.sleep(2000);
        String texto = driver.findElement(By.xpath("//*[@id='app']/div/div/div[1]/div")).getText();
        System.out.println(texto + " --Título de la página");*/

        //---- Tercer video

        Thread.sleep(2000);
        driver.findElement(By.xpath("//*[@id='item-0']/span")).click();
        System.out.println("Click en Text Box");

        Thread.sleep(2000);
        driver.findElement(By.xpath("//*[@id='userName']")).sendKeys("EPICO1");
        System.out.println("Ingresó nombre");

        Thread.sleep(2000);
        driver.findElement(By.xpath("//*[@id='userEmail']")).sendKeys("test@test.com.co");
        System.out.println("Ingresó email");

        Thread.sleep(2000);
        driver.findElement(By.xpath("//*[@id='currentAddress']")).sendKeys("calle 1 1 1");
        System.out.println("Ingresó address");

        jsExecutor.executeScript("window.scrollBy(0, 300)");

        Thread.sleep(2000);
        driver.findElement(By.xpath("//*[@id='submit']")).click();
        System.out.println("Envió el formulario y finalizo");




        driver.quit();

    }

}
