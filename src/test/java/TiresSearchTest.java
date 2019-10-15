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
        searchFormCar.checkPageURL("https://reifen.pkwteile.de/winterreifen/255-65-r16");
    }

    @Test
    public void searchOffroadSuv() throws InterruptedException {
        MainPagaTires mainPagaTires = new MainPagaTires(driver);
        SearchFormCar searchFormCar = new SearchFormCar(driver);
        mainPagaTires.open();
        mainPagaTires.cookiesButton();
        mainPagaTires.clickMenuButtonOffroadSuv();
        searchFormCar.formSeasonSummer();
        searchFormCar.width();
        searchFormCar.height();
        searchFormCar.size();
        searchFormCar.search();
        Thread.sleep(5000);
        searchFormCar.checkPageURL("https://reifen.pkwteile.de/offroadreifen/sommerreifen/255-65-r16");
    }
}
