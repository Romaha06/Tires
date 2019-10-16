import org.testng.annotations.Test;

public class TiresSearchTest extends BasePage {


    @Test
    public void searchPKW() throws InterruptedException {
        MainPagaTires mainPagaTires = new MainPagaTires(driver);
        SearchFormCar searchFormCar = new SearchFormCar(driver);
        mainPagaTires.open();
        mainPagaTires.cookiesButton();
        mainPagaTires.clickMenuButtonPKW();
        searchFormCar.formSeasonWinter();
        searchFormCar.width();
        searchFormCar.height();
        searchFormCar.size();
        searchFormCar.search();
        Thread.sleep(5000);
        searchFormCar.checkPageURL("https://reifen.pkwteile.de/winterreifen/255-65-r17");
    }

    @Test
    public void searchOffroadSuv() throws InterruptedException {
        MainPagaTires mainPagaTires = new MainPagaTires(driver);
        SearchFormCar searchFormCar = new SearchFormCar(driver);
        mainPagaTires.open();
        mainPagaTires.cookiesButton();
        mainPagaTires.clickMenuButtonOffroadSuv();
        searchFormCar.formSeasonAll();
        searchFormCar.width();
        searchFormCar.height();
        searchFormCar.size();
        searchFormCar.search();
        Thread.sleep(5000);
        searchFormCar.checkPageURL("https://reifen.pkwteile.de/offroadreifen/ganzjahresreifen/255-65-r17");
    }

    @Test
    public void searchLLKW() throws InterruptedException {
        MainPagaTires mainPagaTires = new MainPagaTires(driver);
        SearchFormCar searchFormCar = new SearchFormCar(driver);
        mainPagaTires.open();
        mainPagaTires.cookiesButton();
        mainPagaTires.clickMenubuttonLLKW();
        searchFormCar.formSeasonSummer();
        searchFormCar.width();
        searchFormCar.height();
        searchFormCar.size();
        searchFormCar.search();
        Thread.sleep(5000);
        searchFormCar.checkPageURL("https://reifen.pkwteile.de/transporterreifen/sommerreifen/255-65-r17");

    }
}
