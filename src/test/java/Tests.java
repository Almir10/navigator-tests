
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.List;

public class Tests extends BaseTest {



    // ==========================================
    // TC_001: Provjera da li se mapa učitava prilikom pokretanja
    // ==========================================


    @Test
    public void TC_001_CheckMapLoadOnStartup() {

        WebElement mapElement = driver.findElement(By.cssSelector(".ember-view.navigator-map.leaflet-container.leaflet-fade-anim"));
        Assert.assertTrue(mapElement.isDisplayed(), "Mapa nije vidljiva prilikom otvaranja aplikacije!");

        WebElement mapTile = driver.findElement(By.cssSelector(".leaflet-tile"));
        Assert.assertTrue(mapTile.isDisplayed(), "Osnovni sloj mape nije učitan!");

        List<WebElement> mapMarkers = driver.findElements(By.cssSelector(".leaflet-marker-icon"));
        Assert.assertTrue(mapMarkers.size() > 0, "Nema markera na mapi nakon učitavanja!");
    }



    // ==========================================
    // TC_002: Provjera da li je mapa vidljiva na mobilnim uređajima
    // ==========================================

    @Test
    public void TC_002_CheckMapOnMobileView() {

        driver.manage().window().setSize(new Dimension(375, 812)); // iPhone X rezolucija

        WebElement mapElement = driver.findElement(By.cssSelector(".ember-view.navigator-map.leaflet-container.leaflet-fade-anim"));
        Assert.assertTrue(mapElement.isDisplayed(), "Mapa nije vidljiva u mobilnom prikazu!");

        WebElement mapTile = driver.findElement(By.cssSelector(".leaflet-tile"));
        Assert.assertTrue(mapTile.isDisplayed(), "Osnovni sloj mape nije učitan u mobilnom prikazu!");

        List<WebElement> mapMarkers = driver.findElements(By.cssSelector(".leaflet-marker-icon"));
        Assert.assertTrue(mapMarkers.size() > 0, "Nema markera na mapi u mobilnom prikazu!");
    }



    // ==========================================
    // TC_003: Search Bar - Provjera sa validnim unosom
    // ==========================================

    @Test
    public void TC_003_SearchBar_ValidInput() {

        driver.findElement(By.id("ember564")).sendKeys("Atlanbh");
        driver.findElement(By.xpath("//a[@data-ember-action='571']")).click();

        List<WebElement> resultsList = driver.findElements(By.cssSelector(".content"));

        Assert.assertTrue(resultsList.size() > 0, "Nema rezultata pretrage!");

        boolean matchFound = false;
        for (WebElement result : resultsList) {
            String name = result.findElement(By.cssSelector(".name")).getText();
            if (name.contains("Atlantbh")) {
                matchFound = true;
                break;
            }
        }

        Assert.assertTrue(matchFound, "Nijedan rezultat ne sadrži očekivano ime 'Atlantbh'!");
    }



    // ==========================================
    // TC_004: Kategorije (Filter Categories) - Provjera da li se pojavljuju markeri na mapi prilikom selekcije kategorije
    // ==========================================

    @Test
    public void TC_004_FilterByCategory() {
        List<WebElement> categories = driver.findElements(By.cssSelector(".content .name"));
        boolean categoryClicked = false;

        for (WebElement category : categories) {
            String categoryName = category.getText();
            if (categoryName.equalsIgnoreCase("KAFA")) {
                category.click();
                categoryClicked = true;
                break;
            }
        }

        Assert.assertTrue(categoryClicked, "Kategorija 'KAFA' nije pronađena ili nije kliknuta!");

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(driver -> driver.findElements(By.cssSelector(".leaflet-marker-icon")).size() > 0);

        List<WebElement> markers = driver.findElements(By.cssSelector(".leaflet-marker-icon"));
        Assert.assertTrue(markers.size() > 0, "Nakon odabira kategorije 'KAFA', nijedan marker nije pronađen na mapi!");
    }


    // ==========================================
    // TC_005: Provjera da li stranica ima tačan prikaz na različitim ekranima putem provjere da li je vidljiv search bar i kategorije
    // ==========================================

    @Test
    public void TC_005_CheckMobileAndDesktopView() {

        // Mobilni prikaz
        driver.manage().window().setSize(new Dimension(375, 812)); // iPhone X rezolucija

        WebElement categoriesListMobile = driver.findElement(By.cssSelector(".menu_content_list.categories"));
        Assert.assertTrue(categoriesListMobile.isDisplayed(), "Lista kategorija nije prikazana u mobilnom prikazu!");

        List<WebElement> categoriesMobile = categoriesListMobile.findElements(By.tagName("li"));
        Assert.assertTrue(categoriesMobile.size() > 0, "Lista kategorija je prazna u mobilnom prikazu!");

        WebElement searchBarMobile = driver.findElement(By.cssSelector("input.ember-text-field.tt-query"));
        Assert.assertTrue(searchBarMobile.isDisplayed(), "Search bar nije vidljiv u mobilnom prikazu!");

        // Desktop prikaz
        driver.manage().window().setSize(new Dimension(1920, 1080)); // Tipična desktop rezolucija

        WebElement categoriesListDesktop = driver.findElement(By.cssSelector(".menu_content_list.categories"));
        Assert.assertTrue(categoriesListDesktop.isDisplayed(), "Lista kategorija nije prikazana u desktop prikazu!");

        List<WebElement> categoriesDesktop = categoriesListDesktop.findElements(By.tagName("li"));
        Assert.assertTrue(categoriesDesktop.size() > 0, "Lista kategorija je prazna u desktop prikazu!");

        WebElement searchBarDesktop = driver.findElement(By.cssSelector("input.ember-text-field.tt-query"));
        Assert.assertTrue(searchBarDesktop.isDisplayed(), "Search bar nije vidljiv u desktop prikazu!");
    }


}