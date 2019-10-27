import io.qameta.allure.Feature;
import org.testng.annotations.Test;
import pages.MainPagaTires;
import pages.SearchFormCar;

public class TiresSearchTest extends BaseTest {


    @Feature("searchPKW")
    @Test(groups = {"Regression"})
    public void searchPKW() {
        MainPagaTires mainPagaTires = new MainPagaTires();
        SearchFormCar searchFormCar = new SearchFormCar();
        mainPagaTires.open();
        mainPagaTires.cookiesButton();
        mainPagaTires.clickMenuButtonPKW();
        searchFormCar.formSeasonWinter();
        searchFormCar.selectionOfParameters();
        searchFormCar.search();
        searchFormCar.checkPageURL("https://reifen.pkwteile.de/winterreifen/255-65-r17");
    }

    @Feature("searchOffroadSuv")
    @Test(groups = {"Regression"})
    public void searchOffroadSuv() {
        MainPagaTires mainPagaTires = new MainPagaTires();
        SearchFormCar searchFormCar = new SearchFormCar();
        mainPagaTires.open();
        mainPagaTires.cookiesButton();
        mainPagaTires.clickMenuButtonOffroadSuv();
        searchFormCar.formSeasonAll();
        searchFormCar.selectionOfParameters();
        searchFormCar.search();
        searchFormCar.checkPageURL("https://reifen.pkwteile.de/offroadreifen/ganzjahresreifen/255-65-r17");
    }

    @Feature("searchLLKW")
    @Test(groups = {"Regression"})
    public void searchLLKW() {
        MainPagaTires mainPagaTires = new MainPagaTires();
        SearchFormCar searchFormCar = new SearchFormCar();
        mainPagaTires.open();
        mainPagaTires.cookiesButton();
        mainPagaTires.clickMenubuttonLLKW();
        searchFormCar.formSeasonSummer();
        searchFormCar.selectionOfParameters();
        searchFormCar.search();
        searchFormCar.checkPageURL("https://reifen.pkwteile.de/transporterreifen/sommerreifen/255-65-r17");
    }
}
