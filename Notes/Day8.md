# Page Object Model

```
1. Open browser
2. Navigate to https://www.calculator.net/bmi-calculator.html
3. Select metric unit tab
4. Fill calculator with age, gender, weight, height
5. Validate result is correct
```
## Linear Script

```java
    @Test
    void tc10(){
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.calculator.net/bmi-calculator.html");

        driver.findElement(By.xpath("//a[.='Metric Units']")).click();
        driver.findElement(By.cssSelector("[value=Clear]")).click();

        driver.findElement(By.id("cage")).sendKeys("25");
        if( !driver.findElement(By.id("csex1")).isSelected()) {
            driver.findElement(By.id("csex1")).click();
        }

        driver.findElement(By.id("cheightmeter")).sendKeys("180");
        driver.findElement(By.id("ckg")).sendKeys("65");
        driver.findElement(By.cssSelector("[value=Calculate]")).click();


        String result =  driver.findElement(By.cssSelector(".rightresult b")).getText();

        Assert.assertEquals(result,"BMI = 20.1 kg/m2");
    }
```


## Page Object Model ==> hide all locators on Test Case
```java
    @Test
    void tc10(){
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.calculator.net/bmi-calculator.html");

        BMIPage bmiPage = new BMIPage(driver);
        bmiPage.selectMetricTab();
        bmiPage.clearForm();
        bmiPage.fillForm("25","male","180","65");
        
        Assert.assertEquals(bmiPage.getResult(),"BMI = 20.1 kg/m2");
    }
```
```java
public class BMIPage {
    WebDriver driver;
    By metricTab = By.xpath("//a[.='Metric Units']");
    By clearBtn = By.cssSelector("[value=Clear]");
    By ageTxt = By.id("cage");
    By maleRadioBtn = By.id("csex1");
    By femaleRadioBtn = By.id("csex2");
    By heightTxt = By.id("cheightmeter");
    By weightTxt = By.id("ckg");
    By calculateBtn = By.cssSelector("[value=Calculate]");
    By resultLbl = By.cssSelector(".rightresult b");

    public BMIPage(WebDriver driver) {
        this.driver = driver;
    }

    public void selectMetricTab(){
        driver.findElement(metricTab).click();
    }
    public void clearForm(){
        driver.findElement(clearBtn).click();
    }
    public void fillForm(String age,String gender,String height,String weight){
        driver.findElement(ageTxt).sendKeys(age);

        if(gender.equalsIgnoreCase("male")){
            if( !driver.findElement(maleRadioBtn).isSelected()) {
                driver.findElement(maleRadioBtn).click();
            }
        }else {
            if( !driver.findElement(femaleRadioBtn).isSelected()) {
                driver.findElement(femaleRadioBtn).click();
            }
        }
        driver.findElement(heightTxt).sendKeys(height);
        driver.findElement(weightTxt).sendKeys(weight);
        driver.findElement(calculateBtn).click();

    }
    public String getResult(){
        return driver.findElement(resultLbl).getText();
    }
}

```