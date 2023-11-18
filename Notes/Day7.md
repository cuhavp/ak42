

# Web Elements

- [ ] Text box
- [ ] Button
- [ ] Label
- [ ] Checkbox
- [ ] Dropdown
- [ ] Hyperlink
- [ ] Table (*) `Java Stream: Filter/Map/Sort/Max/Min`
- [ ] JS Alert
- [ ] Frame
- [ ] Date Picker ??

# Inspect Element: Approaches: runnable > specified meaning or UI text > shortest
=> Brainstorming questions(
    - TagName
    - Attributes
    - Text
  )

- [ ] By.id
- [ ] By.name
- [ ] By.className
- [ ] By.linkText
- [ ] *By.cssSelector*
- [ ] *By.xpath*
# Interactions

## findElement()
- [ ] Click
- [ ] SenKeys
- [ ] GetText
----

## Actions
- [ ] Hover
- [ ] DragAndDrop
- [ ] Right Click <> Context Click
- [ ] KeyUp/keyDown

## Capture Screenshot 
- combine with testNG to capture screenshot when test fails

## Waits - per page
- [ ] Implicit wait `Thread.sleep(10000)`
- [ ] Explicit wait `WebDriverWait(driver, maximum_time_out)`

# TestNG
```java
    @Before()
    - Class: open Browser
    
    @Test()
        - Selenium as Actions
        - Asserts as Validation
        
    @After()
    - Method: capture screen when fail
    - Class: close browser
```
- Test Plan as XML file 
```xml
<suite name="UI">
    <test name="login">
        <classes>
            <class name="Login"/>
        </classes>
    </test>
</suite>
```