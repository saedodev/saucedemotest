# SauceDemo UI Automation Testing

Framework Automation Testing Website SauceDemo menggunakan Java, Selenium WebDriver, Cucumber, JUnit 5, dan Gradle.

---

## Teknologi

- Java 21
- Selenium WebDriver 4
- Cucumber 7
- JUnit 5
- Gradle
- ChromeDriver

---

## Design Pattern

Project ini menggunakan **Page Object Model (POM)** sehingga setiap halaman website dipisahkan menjadi class tersendiri.

```
pages/
├── LoginPage.java
├── InventoryPage.java
├── CartPage.java
└── CheckoutPage.java
```

---

## Project Structure

```
src
├── main
│   └── java
│       ├── driver
│       ├── pages
│       └── utils
│
└── test
    ├── java
    │   ├── stepdef
    │   └── runner
    │
    └── resources
        └── features
```

---

## Test Scenarios

### Login

- Login berhasil
- Password salah
- Username kosong
- Password kosong

### Inventory

- Detail Product
- Add Product to Cart
- Remove Product dari Inventory

### Cart

- View Cart
- Remove Product
- Continue Shopping

### Checkout

- Checkout berhasil
- Checkout dengan data kosong

---

## Cara Menjalankan

Clone repository

```bash
git clone https://github.com/USERNAME/saucedemoTest.git
```

Masuk ke project

```bash
cd saucedemoTest
```

Jalankan test

Windows

```bash
gradlew test
```

Linux/Mac

```bash
./gradlew test
```

---

## Test Report

Gradle Report

```
build/reports/tests/test/index.html
```

Cucumber Report

```
build/reports/cucumber/report.html
```

---

## Framework

- Selenium WebDriver
- Cucumber
- JUnit 5
- Gradle
- Page Object Model

---

## Author

Sayid Ridho