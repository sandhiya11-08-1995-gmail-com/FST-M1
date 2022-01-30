public class Activity4_2 {
    public static void main(String[] args) {
    
        WebDriver driver = new FirefoxDriver();

        driver.get("https://www.training-support.net/selenium/simple-form");

        String pageTitle = driver.getTitle();
        System.out.println(pageTitle);

        WebElement firstName = driver.findElement(By.xpath("//input[@id = 'firstName']"));
        WebElement lastName = driver.findElement(By.xpath("//input[@id = 'lastName']"));

        firstName.sendKeys("Sastika");
        lastName.sendKeys("Sristika");

        driver.findElement(By.xpath("//input[@id = 'email']")).sendKeys("test@example.com");

        driver.findElement(By.xpath("//input[@id = 'number']")).sendKeys("1234567890");

        driver.findElement(By.xpath("//textarea")).sendKeys("This is my message");

        driver.findElement(By.xpath("//input[contains(@class, 'green')]")).click();
    }
}