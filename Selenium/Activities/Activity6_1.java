public class Activity6_1 {

    public static void main(String[] args) {
        WebDriver driver = new FirefoxDriver();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        
        driver.get("https://training-support.net/selenium/dynamic-controls");

        WebElement checkbox = driver.findElement(By.xpath("//div[@id='dynamicCheckbox']/input"));
        WebElement toggleCheckboxButton = driver.findElement(By.xpath("//button[@id='toggleCheckbox']"));
        
        toggleCheckboxButton.click();
        
        wait.until(ExpectedConditions.invisibilityOf(checkbox));
        
        toggleCheckboxButton.click();
        
        wait.until(ExpectedConditions.visibilityOf(checkbox));
        checkbox.click();
        
        driver.close();
    }

}