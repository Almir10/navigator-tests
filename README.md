# Navigator.ba Test Automation

## 1. O projektu
Ovaj projekat sadrži automatizovane testove za aplikaciju [Navigator.ba](https://www.navigator.ba). Cilj je bio analizirati aplikaciju, napisati test caseove, identifikovati smoke testove, automatizovati ih, i dokumentovati proces.

Projekat uključuje:
- **Smoke testove**: Ključne funkcionalnosti aplikacije testirane su kroz automatizaciju.
- **Testove za različite uređaje**: Desktop i mobilni prikazi.
- **Detaljne korake za instalaciju i pokretanje testova.**

---

## 2. Struktura projekta
Evo kako je projekat organizovan:

```plaintext
navigator-tests/
├── README.md                # Glavni fajl sa opisom projekta i uputstvima
├── TEST_CASES.md            # Detaljan fajl sa test caseovima
|── BUG_REPORTS.md           # Fajl sa pronadjenim bugovima na stranici sa detaljima reprodukcije istih
├── src/
│   ├── test/
│   │   ├── java/
│   │   │   ├── BaseTest.java    # Osnovna test klasa za Selenium
│   │   │   ├── Tests.java       # Automatizovani TestNG Smoke testovi
├── pom.xml                  # Maven fajl za zavisnosti
└── .gitignore               # Ignorisanje privremenih fajlova
```

---

## 3. Uslovi
Prije nego što pokrenete projekat, osigurajte da vaš sistem ima sljedeće:

### **Softver:**
- **Java JDK 11 ili noviji**: [Preuzmi ovdje](https://www.oracle.com/java/technologies/javase-jdk11-downloads.html)
- **Google Chrome ili Firefox**: Za izvršavanje testova kroz Selenium WebDriver.

### **Biblioteke i alati:**
- **Maven**: [Preuzmi ovdje](https://maven.apache.org/download.cgi) (ako već nije instaliran).
- **TestNG**: Već je uključen u dependencies kroz `pom.xml`.

---

## 4. Instalacija
Slijedite korake ispod da postavite projekat na vašem računaru:

### **1. Kloniraj repozitorij:**
```bash
git clone https://github.com/Almir10/navigator-tests.git
cd navigator-tests
```

### **2. Instaliraj Maven (ako nije instaliran):**
1. Preuzmi Maven sa [Apache Maven stranice](https://maven.apache.org/download.cgi).
2. Ekstraktuje fajl i dodajte njegov `bin` direktorij u svoj `PATH` ILI koristite Intelij sa internim Mavenom

Provjeri instalaciju:
```bash
mvn -v
```

### **3. Instaliraj zavisnosti kroz Maven:**
```bash
mvn install
```

### **4. Postavi WebDriver:**
- Preuzmite odgovarajući WebDriver za vaš pretraživač:
    - [ChromeDriver](https://chromedriver.chromium.org/downloads)
    - [GeckoDriver (Firefox)](https://github.com/mozilla/geckodriver/releases)
- Dodaj putanju WebDrivera u `PATH` okruženje ili u `BaseTest` klasi dodati putanju za ChromeDriver.exe fajl

---

## 5. Pokretanje testova

### **Pokretanje kroz Maven**
Maven omogućava standardizovano pokretanje testova. Koristi sljedeće komande:
- **Pokretanje svih testova:**
  ```bash
  mvn test
  ```
- **Pokretanje specifične klase testova (npr. `Tests`):**
  ```bash
  mvn -Dtest=Tests test
  ```

### **Pokretanje kroz IntelliJ IDEA**
Ako se koristi IntelliJ IDEA, testovi možeš pokrenuti direktno:
1. Otvorite klasu testova (npr. `Tests`).
2. Kliknite na zeleno **Run** dugme pored metode ili klase.
3. IntelliJ automatski koristi ugrađeni Maven za izvršenje ako već ne postoji u Path.

---

## 6. Smoke testovi uključuju:
- **TC_001:** Provjera da li se mapa uspješno učitava prilikom otvaranja aplikacije.
- **TC_002:** Provjera da li je mapa vidljiva na mobilnim uređajima.
- **TC_003:** Provjera da li search bar radi sa validnim unosom.
- **TC_004:** Provjera da li selekcija kategorije ažurira mapu sa odgovarajućim lokacijama.

---



### **Autor:**
- **Ime:** Almir
- **GitHub:** [Almir10](https://github.com/Almir10)

---

