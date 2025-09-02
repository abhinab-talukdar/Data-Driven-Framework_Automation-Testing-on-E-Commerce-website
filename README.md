# Data-Driven-Framework_Automation-Testing-on-E-Commerce-website
Test automation framework for TutorialsNinja e-commerce site using Selenium, TestNG, Maven, and Apache POI
# 🧪 DDFrameworkDemo – Data-Driven Test Automation Framework

This is a **data-driven test automation framework** for the [TutorialsNinja](https://tutorialsninja.com/demo/) e-commerce site. Built using **Java**, **Selenium WebDriver**, **TestNG**, and **Apache POI**, the project supports data-driven testing, modular design via the **Page Object Model (POM)**, and includes custom **listeners** and detailed **HTML reports**.

---

## 🧾 Features

- 🚀 Selenium-based browser automation
- 📊 Data-driven testing using Excel
- 🧩 Page Object Model (POM) for maintainable code
- 🛠️ TestNG framework for execution and reporting
- 🖨️ ExtentReports for beautiful HTML test reports
- 🎧 ITestListener implementation for test lifecycle hooks
- 🔧 Base class for WebDriver setup and teardown

---

## 🛠 Tech Stack

| Component       | Usage                                |
|-----------------|----------------------------------------|
| Java            | Main programming language              |
| Selenium WebDriver | Web UI automation                  |
| TestNG          | Test framework with annotations        |
| Apache POI      | Reading data from Excel                |
| ExtentReports   | Reporting tool                         |
| Maven           | Build and dependency management        |

---

## 🗂 Project Structure

```
DDFrameworkDemo/
│
├── src/
│   └── main/
│       └── java/
│           ├── base/                # Base setup class (Base.java)
│           ├── listeners/           # ITestListener implementation (MyListeners.java)
│           ├── pageobjects/         # Page Object classes (e.g., HomePage, LoginPage)
│           └── util/                # Utility classes (e.g., Excel reading, config)
│
│   └── test/
│       └── java/
│           └── TestPackage/         # Test classes (e.g., LoginTest.java)
│
│   └── resource/
│       ├── TutorialsNinjas.xlsx     # Excel data file for test input
│       └── data.properties          # Configuration properties
│
├── Reports/
│   └── extentreport.html            # Generated HTML test report
│
├── testng.xml                       # TestNG suite file
├── pom.xml                          # Maven project file

### ✅ Prerequisites

- Java JDK 8+
- Maven
- ChromeDriver in your system PATH
- IDE (e.g., Eclipse
```


