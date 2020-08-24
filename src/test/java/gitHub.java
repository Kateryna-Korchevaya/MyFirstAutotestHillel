import org.junit.Assert;
import org.junit.Ignore;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class gitHub {
    public static WebDriver driver;

@Ignore
@Test
    public void CreateRepository () throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\dirami\\Downloads\\chromedriver_win32\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://github.com/login");
        CharSequence keysToSend;
        driver.findElement(By.xpath("//*[@id=\"login_field\"]")).sendKeys("kati.korchevaya@gmail.com");
        driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("Yar0slavA");
        driver.findElement(By.xpath("//*[@id=\"login\"]/form/div[4]/input[9]")).click();

        driver.findElement(By.xpath("//*[@id=\"repos-container\"]/h2/a")).click();
        driver.findElement(By.xpath("//*[@id=\"repository_name\"]")).sendKeys("MyFirstAutotestHillel");
        Thread.sleep(5000);

        driver.findElement(By.xpath("//*[contains(text(), 'Create repository')]")).click();

        Thread.sleep(5000);
        WebElement RepositoryName = driver.findElement(By.xpath("//*[contains(text(), 'MyFirstAutotestHillel')]"));
        Assert.assertEquals(true, RepositoryName.isDisplayed());

        driver.quit();
    }

@Ignore
@Test
    public void  PlayOnMusicFile () throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\dirami\\Downloads\\chromedriver_win32\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://passport.i.ua/login/");
        CharSequence keysToSend;
        driver.findElement(By.xpath("/html/body/div[2]/div[2]/form/fieldset/p[2]/input")).sendKeys("k_ati@i.ua");
        driver.findElement(By.xpath("/html/body/div[2]/div[2]/form/fieldset/p[4]/input")).sendKeys("yaroslava");
        driver.findElement(By.xpath("/html/body/div[2]/div[2]/form/input[6]")).click();

        driver.get("https://music.i.ua/");

    driver.findElement(By.xpath("/html/body/div[1]/div[6]/div/div[1]/div[2]/div/div[2]/div[3]/span/form/input[2]")).sendKeys("The beatles help");
    Thread.sleep(5000);
    driver.findElement(By.xpath("/html/body/div[1]/div[6]/div/div[1]/div[2]/div/div[2]/div[3]/span/form/input[6]")).click();

    driver.findElement(By.xpath("//*[contains(text(), 'Help!')]"));
    driver.findElement(By.xpath("/html/body/div[1]/div[6]/div/div[1]/div[2]/div/div[2]/div[3]/span/form/input[6]")).click();
Thread.sleep( 15000);

  driver.findElement(By.linkText("Help!")).click();
  driver.findElement(By.xpath("/html/body/div[1]/div[6]/div[2]/div/div[2]/div[1]/a/span/i")).click();
   Thread.sleep( 15000);

    driver.quit();
    }


@Test
    public void AccountUsersBugret () throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\dirami\\Downloads\\chromedriver_win32\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://users.bugred.ru/user/login/index.html");
        CharSequence keysToSend;

        driver.findElement(By.xpath("/html/body/div[3]/div[1]/div[1]/form/table/tbody/tr[1]/td[2]/input")).sendKeys( "k_ati@i.ua");
        driver.findElement(By.xpath("/html/body/div[3]/div[1]/div[1]/form/table/tbody/tr[2]/td[2]/input")).sendKeys("yaroslava");
        driver.findElement(By.xpath("/html/body/div[3]/div[1]/div[1]/form/table/tbody/tr[3]/td[2]/input")).click();

       Thread.sleep( 5000);
        driver.findElement(By.xpath("/html/body/div[3]/form/table/tbody/tr[4]/td/input")).sendKeys("k_ati@i.ua");
        driver.findElement(By.xpath("/html/body/div[3]/form/table/tbody/tr[5]/td[1]/button")).click();
        Thread.sleep( 5000);

        driver.findElement(By.xpath("/html/body/div[3]/p[1]/a")).click();
        Thread.sleep( 5000);
        driver.findElement(By.xpath("/html/body/div[3]/form/table/tbody/tr[1]/td[2]/input")).sendKeys("Ярослава");
        driver.findElement(By.xpath("/html/body/div[3]/form/table/tbody/tr[2]/td[2]/input")).sendKeys("dirami@gmail.com");
        driver.findElement(By.xpath("/html/body/div[3]/form/table/tbody/tr[3]/td[2]/input")).sendKeys("yasya");
        driver.findElement(By.xpath("/html/body/div[3]/form/table/tbody/tr[21]/td[2]/input")).click();

        Thread.sleep(5000);
        driver.findElement(By.xpath("//*[@id=\"fat-menu\"]/a")).click(); // заходим в личный кабинет и редактируем данные
        driver.findElement(By.xpath("//*[@id=\"fat-menu\"]/ul/li[1]/a")).click();

        //редактировать данные в учетной записи
        driver.findElement(By.xpath("/html/body/div[3]/div[1]/div/div[2]/form/table/tbody/tr[2]/td[2]/input")).sendKeys("katya");

        driver.findElement(By.xpath("//html/body/div[3]/div[1]/div/div[2]/form/table/tbody/tr[3]/td[2]/select")).sendKeys("Женский");

        driver.findElement(By.xpath("/html/body/div[3]/div[1]/div/div[2]/form/table/tbody/tr[4]/td[2]/input")).sendKeys("03041981");

        driver.findElement(By.xpath("/html/body/div[3]/div[1]/div/div[2]/form/table/tbody/tr[5]/td[2]/input")).sendKeys("16082020");

        driver.findElement(By.xpath("/html/body/div[3]/div[1]/div/div[2]/form/table/tbody/tr[6]/td[2]/textarea")).sendKeys("испанский");

        driver.findElement(By.xpath("/html/body/div[3]/div[1]/div/div[2]/form/table/tbody/tr[7]/td[2]/input")).sendKeys("111122223333");

        driver.findElement(By.xpath("/html/body/div[3]/div[1]/div/div[2]/form/table/tbody/tr[8]/td[2]/input")).click();
        Thread.sleep( 5000);

        driver.quit();
    }
}