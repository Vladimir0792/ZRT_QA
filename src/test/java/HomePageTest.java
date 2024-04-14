import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import java.time.Duration;
import java.util.List;

import static org.openqa.selenium.By.xpath;

public class HomePageTest extends AbstractClass {


    @Test
    @DisplayName("1. Наличие названия страницы Test home page ")
    void getPageName() {
        driver.get("http://localhost:5000/");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        WebElement pageName = driver.findElement(xpath("//h1[@class='title']"));
        Assertions.assertEquals("Test home page", pageName.getText());
    }

    @Test
    @DisplayName("2. Наличие кнопки 'Home' на странице Test home page ")
    void getButtonHome() {
        driver.get("http://localhost:5000/");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        WebElement buttonHome = driver.findElement(By.cssSelector("a.navbar-item "));
        Assertions.assertEquals("Home", buttonHome.getText());
    }

    @Test
    @DisplayName("3.Наличие кнопки 'Login'  на странице Test home page")
    void getButtonLogin() {
        driver.get("http://localhost:5000/");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        List<WebElement> buttonLogin = driver.findElements(By.cssSelector("a.navbar-item"));
        Assertions.assertEquals("Login", buttonLogin.get(1).getText());
    }

    @Test
    @DisplayName("4.Наличие кнопки 'Sign Up'  на странице Test home page")
    void getButtonSignUp() {
        driver.get("http://localhost:5000/");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        List<WebElement> buttonSignUp = driver.findElements(By.cssSelector("a.navbar-item"));
        Assertions.assertEquals("Sign Up", buttonSignUp.get(2).getText());
    }

    @Test
    @DisplayName("5. Валидность окна 'Login' на странице Test home page при клике на кнопку 'Login'")
    void getFrameLogin() {
        driver.get("http://localhost:5000/");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        WebElement buttonLogin = driver.findElement(xpath("//*[contains(text(),'Login')]"));
        buttonLogin.click();
        WebElement frameButtonLogin = driver.findElement(xpath("//h3[@class='title']"));
        Assertions.assertEquals("Login", frameButtonLogin.getText());
    }

    @Test
    @DisplayName("6. Валидность  окна 'Sign Up' на странице Test home page при клике на кнопку 'Sigh Up'")
    void getFrameSignUp() {
        driver.get("http://localhost:5000/");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        WebElement buttonSignUp = driver.findElement(xpath("//*[contains(text(),'Sign Up')]"));
        buttonSignUp.click();
        WebElement frameButtonSignUp = driver.findElement(xpath("//h3[@class='title']"));
        Assertions.assertEquals("Sign Up", frameButtonSignUp.getText());
    }

    @Test
    @DisplayName("7.Валидность  поля ввода 'Email' в окне 'Login' при авторизации пользователя.")
    void getEmailFieldInLoginFrame() throws InterruptedException {
        driver.get("http://localhost:5000/");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        WebElement buttonLogin = driver.findElement(xpath("//*[contains(text(),'Login')]"));
        buttonLogin.click();
        Thread.sleep(3000L);
        WebElement fieldEmail = driver.findElement(By.cssSelector("input.input.is-large"));
        Assertions.assertTrue(fieldEmail.isEnabled());
    }

    @Test
    @DisplayName("8. Валидность  поля ввода 'Password' в окне 'Login' при авторизации пользователя.")
    void getPassFieldInLoginFrame() throws InterruptedException {
        driver.get("http://localhost:5000/");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        WebElement buttonLogin = driver.findElement(xpath("//*[contains(text(),'Login')]"));
        buttonLogin.click();
        Thread.sleep(3000L);
        List<WebElement> fieldPass = driver.findElements(By.cssSelector("input.input.is-large"));
        Assertions.assertTrue(fieldPass.get(1).isEnabled());
    }

    @Test
    @DisplayName("9. Наличие поля ввода 'Email' в окне 'Sign Up' при регистрации пользователя.")
    void getEmailFieldInSignUpFrame() throws InterruptedException {
        driver.get("http://localhost:5000/");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        WebElement buttonSignUp = driver.findElement(xpath("//*[contains(text(),'Sign Up')]"));
        buttonSignUp.click();
        Thread.sleep(3000L);
        WebElement fieldEmail = driver.findElement(xpath("//input[@type='email']"));
        Assertions.assertTrue(fieldEmail.isEnabled());
    }

    @Test
    @DisplayName("10. Валидность поля ввода 'Name' в окне 'Sign Up' при регистрации пользователя.")
    void getFieldNameInSignUpFrame() throws InterruptedException {
        driver.get("http://localhost:5000/");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        WebElement buttonSignUp = driver.findElement(xpath("//*[contains(text(),'Sign Up')]"));
        buttonSignUp.click();
        Thread.sleep(3000L);
        WebElement fieldName = driver.findElement(By.cssSelector("input.input.is-large"));
        Assertions.assertTrue(fieldName.isEnabled());
    }

    @Test
    @DisplayName("11. Валидность  поля ввода 'Password' в окне 'Sign Up' при регистрации пользователя.")
    void getFieldPassInSignUpFrame() throws InterruptedException {
        driver.get("http://localhost:5000/");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        WebElement buttonSignUp = driver.findElement(xpath("//*[contains(text(),'Sign Up')]"));
        buttonSignUp.click();
        Thread.sleep(3000L);
        WebElement fieldPass = driver.findElement(xpath("//input[@type='password']"));
        Assertions.assertTrue(fieldPass.isEnabled());
    }

    @Test
    @DisplayName("12. Обновление страницы 'Test home page' при клике на кнопку 'Home'")
    void getUpdateTestHomePage() throws InterruptedException {
        driver.get("http://localhost:5000/");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        WebElement buttonLogin = driver.findElement(xpath("//*[contains(text(),'Login')]"));
        buttonLogin.click();
        Thread.sleep(3000L);
        WebElement buttonHome = driver.findElement(By.cssSelector("a.navbar-item "));
        buttonHome.click();
        WebElement pageName = driver.findElement(xpath("//h1[@class='title']"));
        Assertions.assertEquals("Test home page", pageName.getText());
    }

    @Disabled
    @Test
    @DisplayName("13. Наличие сообщения об ошибке при авторизации пользователя с пустыми полями на странице")
    void getMessageErrorInAuthorization() throws InterruptedException {
        driver.get("http://localhost:5000/");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        WebElement buttonLogin = driver.findElement(xpath("//*[contains(text(),'Login')]"));
        buttonLogin.click();
        WebElement buttonLoginToAuthorization = driver.findElement(
                xpath("//button[@class='button is-block is-info is-large is-fullwidth']"));
        buttonLoginToAuthorization.click();
        Thread.sleep(3000l);
        WebElement frameNotification = driver.findElement(xpath("//div[@class='notification is-danger']"));
        Assertions.assertEquals("Please check your login details and try again.", frameNotification.getText());
    }

    @Test
    @DisplayName("14. Наличие сообщения об ошибке при регистрации пользователя с пустыми полями на странице ")
    void getMessageErrorInSignUpFrame() throws InterruptedException {
        driver.get("http://localhost:5000/");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        WebElement buttonSignUp = driver.findElement(xpath("//*[contains(text(),'Sign Up')]"));
        buttonSignUp.click();
        Thread.sleep(3000L);
        WebElement buttonSignUpRegistration = driver.
                findElement(By.xpath("//button[@class='button is-block is-info is-large is-fullwidth']"));
        buttonSignUpRegistration.click();
        Thread.sleep(3000L);
        WebElement frameNotification = driver.findElement(By.xpath("//div[@class='notification is-danger']"));
        Assertions.assertEquals("Email address already exists. Go to login page.", frameNotification.getText());
    }

    @Disabled
    @Test
    @DisplayName("15.Наличие сообщения об ошибке при авторизации  с пустыми полями и заполненым чекбоксом на странице ")
    void getMessageErrorWithCheckBox() throws InterruptedException {
        driver.get("http://localhost:5000/");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        WebElement buttonLogin = driver.findElement(xpath("//*[contains(text(),'Login')]"));
        buttonLogin.click();
        WebElement checkBox = driver.findElement(By.xpath("//input[@type='checkbox']"));
        checkBox.click();
        WebElement buttonLoginToAuthorization = driver.findElement(
                xpath("//button[@class='button is-block is-info is-large is-fullwidth']"));
        buttonLoginToAuthorization.click();
        WebElement frameNotification = wait
                .until(ExpectedConditions
                        .presenceOfElementLocated(xpath("//div[@class='notification is-danger']")));
        Assertions.assertEquals("Please check your login details and try again.", frameNotification.getText());
    }

    @Disabled
    @Test
    @DisplayName("16.Отсутствие возможности авторизации с пустыми полями и чекбоксом в окне 'Login'")
    void getErrorThrowAuthorizationWithEmptyParams() {
        driver.get("http://localhost:5000/");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        WebElement buttonLogin = driver.findElement(xpath("//*[contains(text(),'Login')]"));
        buttonLogin.click();
        WebElement buttonLoginToAuthorization = driver.findElement(
                xpath("//button[@class='button is-block is-info is-large is-fullwidth']"));
        buttonLoginToAuthorization.click();
        WebElement frameNotification = wait
                .until(ExpectedConditions
                        .presenceOfElementLocated(xpath("//div[@class='notification is-danger']")));
        Assertions.assertEquals("Please check your login details and try again.", frameNotification.getText());
    }

    @Disabled
    @Test
    @DisplayName("17. Отсутствие возможности авторизации с пустыми полями и заполненым чекбоксом в окне 'Login'")
    void getErrorThrowAuthorizationWithEmptyParamsWithCheckBox() {
        driver.get("http://localhost:5000/");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        WebElement buttonLogin = driver.findElement(xpath("//*[contains(text(),'Login')]"));
        buttonLogin.click();
        WebElement checkBox = driver.findElement(By.xpath("//input[@type='checkbox']"));
        checkBox.click();
        WebElement buttonLoginToAuthorization = driver.findElement(
                xpath("//button[@class='button is-block is-info is-large is-fullwidth']"));
        buttonLoginToAuthorization.click();
        WebElement frameNotification = wait
                .until(ExpectedConditions
                        .presenceOfElementLocated(xpath("//div[@class='notification is-danger']")));
        Assertions.assertEquals("Please check your login details and try again.", frameNotification.getText());
    }

    @Test
    @DisplayName("18. Отсутствие возможности авторизации  при незаполненом 'Email'")
    void getErrorThrowAuthorizationWithEmptyEmail() throws InterruptedException {
        driver.get("http://localhost:5000/");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        WebElement buttonLogin = driver.findElement(xpath("//*[contains(text(),'Login')]"));
        buttonLogin.click();
        WebElement fieldPass = driver.findElement(By.xpath("//input[@type='password']"));
        fieldPass.sendKeys("123456");
        WebElement checkBox = driver.findElement(By.xpath("//input[@type='checkbox']"));
        checkBox.click();
        WebElement buttonLoginToAuthorization = driver.findElement(
                xpath("//button[@class='button is-block is-info is-large is-fullwidth']"));
        buttonLoginToAuthorization.click();
        Thread.sleep(3000l);
        WebElement frameNotification = driver.
                findElement(By.
                        xpath("//div[@class='notification is-danger']"));
        Assertions.assertEquals("Please check your login details and try again.", frameNotification.getText());
    }

    @Test
    @DisplayName("19.Отсутствие возможности авторизациипри отсуствии ввода 'Password'")
    void getErrorThrowAuthorizationWithEmptyPass() throws InterruptedException {
        driver.get("http://localhost:5000/");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        WebElement buttonLogin = driver.findElement(xpath("//*[contains(text(),'Login')]"));
        buttonLogin.click();
        WebElement fieldEmail = driver.findElement(By.xpath("//input[@type='email']"));
        fieldEmail.sendKeys("vova@mail.ru");
        WebElement checkBox = driver.findElement(By.xpath("//input[@type='checkbox']"));
        checkBox.click();
        WebElement buttonLoginToAuthorization = driver.findElement(
                xpath("//button[@class='button is-block is-info is-large is-fullwidth']"));
        buttonLoginToAuthorization.click();
        Thread.sleep(3000l);
        WebElement frameNotification = driver.
                findElement(By.
                        xpath("//div[@class='notification is-danger']"));
        Assertions.assertEquals("Please check your login details and try again.", frameNotification.getText());
    }

    @Test
    @DisplayName("20.Успешная авторизация  при заполнении всех полей в окне 'Login'")
    void getSuccessAuthorizationInLoginFrame() throws InterruptedException {
        driver.get("http://localhost:5000/");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        HomePage homePage = new HomePage(driver);
        homePage.getAuthorizationInPage(getLogin(),getPassword());
        WebElement pageTitle = driver.findElement(By.xpath("//h1[@class='title']"));
        Assertions.assertEquals("Welcome, Vladimir!", pageTitle.getText());
    }

    @Test
    @DisplayName("21. Успешная регистрация  пользователя при заполнении всех полей в окне 'Sign Up'")
    void getSuccessRegistrationInSignUpFrame() throws InterruptedException {
        driver.get("http://localhost:5000/");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        WebElement buttonSignUp = driver.findElement(xpath("//*[contains(text(),'Sign Up')]"));
        buttonSignUp.click();
        WebElement fieldEmail = driver.findElement(xpath("//input[@type='email']"));
        fieldEmail.sendKeys("vova@mail.ru");
        WebElement fieldName = driver.findElement(By.xpath("//input[@type='text']"));
        fieldName.sendKeys("Vladimir");
        WebElement fieldPass = driver.findElement(xpath("//input[@type='password']"));
        fieldPass.sendKeys("123456");
        WebElement buttonSignUpToSignUp = driver.findElement(By
                .xpath("//button[@class='button is-block is-info is-large is-fullwidth']"));
        buttonSignUpToSignUp.click();
        Thread.sleep(3000l);
        WebElement buttonHome = driver.findElement(By.cssSelector("a.navbar-item "));
        buttonHome.click();
        WebElement buttonLogin = driver.findElement(xpath("//*[contains(text(),'Login')]"));
        buttonLogin.click();
        WebElement fieldEmailToLog = wait.until(ExpectedConditions
                .presenceOfElementLocated(By.xpath("//input[@type='email']")));
        fieldEmailToLog.sendKeys("vova@mail.ru");
        WebElement fieldPassToLog = wait.until(ExpectedConditions
                .presenceOfElementLocated(By.xpath("//input[@type='password']")));
        fieldPassToLog.sendKeys("123456");
        WebElement buttonLoginToAuthorization = driver.findElement(
                xpath("//button[@class='button is-block is-info is-large is-fullwidth']"));
        buttonLoginToAuthorization.click();
        Thread.sleep(3000l);
        WebElement pageTitle = driver.findElement(By.xpath("//h1[@class='title']"));
        Assertions.assertEquals("Welcome, Vladimir!", pageTitle.getText());
    }

    @Test
    @DisplayName("21. Успешный выход из аккаунта пользователя на главную страницу 'Test home Page'")
    void getExitFromAccount() throws InterruptedException {
        driver.get("http://localhost:5000/");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        WebElement buttonLogin = driver.findElement(xpath("//*[contains(text(),'Login')]"));
        buttonLogin.click();
        Thread.sleep(5000l);
        WebElement fieldEmail = wait.until(ExpectedConditions
                .presenceOfElementLocated(By.xpath("//input[@type='email']")));
        fieldEmail.sendKeys("vova@mail.ru");

        WebElement fieldPass = wait.until(ExpectedConditions
                .presenceOfElementLocated(By.xpath("//input[@type='password']")));
        fieldPass.sendKeys("123456");
        WebElement buttonLoginToAuthorization = driver.findElement(
                xpath("//button[@class='button is-block is-info is-large is-fullwidth']"));
        buttonLoginToAuthorization.click();
        WebElement buttonLogOut = driver.findElement(xpath("//*[contains(text(),'Logout')]"));
        buttonLogOut.click();
        WebElement titlePage = driver.findElement(xpath("//h1[@class='title']"));
        Assertions.assertEquals("Test home page", titlePage.getText());
    }
}




