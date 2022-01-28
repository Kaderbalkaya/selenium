package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.ElementClickInterceptedException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test1 {

    public static void main(String[] args){

        System.setProperty("webdriver.chrome.driver","C:/Users/kader/AppData/Local/Temp/Temp3_chromedriver_win32.zip/chromedriver_win32/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.n11.com/uye-ol");
        driver.manage().window().maximize();

        WebElement nameElement= driver.findElement(By.id("firstName"));
        nameElement.click();
        nameElement.sendKeys("Kader");

        WebElement lastname= driver.findElement(new By.ByCssSelector(".inputField [ id= 'lastName']"));
        lastname.click();
        lastname.sendKeys("BALKAYA");

        WebElement email= driver.findElement(new By.ByCssSelector(".inputField  [id='registrationEmail']"));
        email.click();
        email.sendKeys("kader123@gmail.com");

        WebElement password= driver.findElement(new By.ByCssSelector(".inputField  [id='registrationPassword']"));
        password.click();
        password.sendKeys("Kader123456");

        WebElement passwordagain= driver.findElement(new By.ByCssSelector(".inputField  [id='passwordAgain']"));
        passwordagain.click();
        passwordagain.sendKeys("Kader123456");

        WebElement phonenumber= driver.findElement(new By.ByCssSelector(".inputField [id='phoneNumber']"));
        phonenumber.click();
        phonenumber.sendKeys("432156789");

        WebElement checkbox =driver.findElement(By.id("genderFemale"));
        boolean isEnable = checkbox.isEnabled();
        System.out.println(isEnable);

        WebElement checkboxlabel =driver.findElement(new By.ByCssSelector("label[for='genderFemale']"));

        try {
            checkbox.click();
        }catch (ElementClickInterceptedException e){
            checkboxlabel.click();
            System.out.println("Entered catch block");
        }
        boolean isSelected = checkbox.isSelected();
        System.out.println(isSelected);

        WebElement birthday= driver.findElement(new By.ByCssSelector(".inputField [id='birthDay']"));
        birthday.click();
        birthday.sendKeys("4");

        WebElement birthMonth= driver.findElement(new By.ByCssSelector(".inputField [id='birthMonth']"));
        birthMonth.click();
        birthMonth.sendKeys("Ocak");

        WebElement birthYear= driver.findElement(new By.ByCssSelector(".inputField [id='birthYear']"));
        birthYear.click();
        birthYear.sendKeys("2000");

        WebElement contractlabel = driver.findElement(new By.ByCssSelector("label[for='acceptContract']"));
        boolean isEnabled =contractlabel.isEnabled();
        if (isEnabled){
            contractlabel.click();
            System.out.println("clicked button");
        }
        WebElement contract = driver.findElement(By.id("acceptContract"));

        isSelected = contract.isSelected();
        if (isSelected){
            System.out.println("yes button");
        }





    }

}
