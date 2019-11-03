import io.qameta.allure.Feature;
import org.testng.annotations.Test;
import pages.MainPagaTires;
import pages.SearchFormCar;
import pages.SearchFormMoto;

public class TiresSearchTest extends BaseTest {

    @Feature("searchPKW")
    @Test(groups = {"Regression"})
    public void searchPKW() {
        MainPagaTires mainPagaTires = new MainPagaTires();
        SearchFormCar searchFormCar = new SearchFormCar();
        mainPagaTires.open();
        mainPagaTires.clickCookiesButton();
        mainPagaTires.clickMenuButtonPKW();
        mainPagaTires.formSeasonWinter();
        searchFormCar.selectionOfParameters();
        mainPagaTires.search();
        mainPagaTires.checkPageURL("https://reifen.pkwteile.de/winterreifen/205-55-r16");
    }

    @Feature("searchOffroadSuv")
    @Test(groups = {"Regression"})
    public void searchOffroadSuv() {
        MainPagaTires mainPagaTires = new MainPagaTires();
        SearchFormCar searchFormCar = new SearchFormCar();
        mainPagaTires.open();
        mainPagaTires.clickCookiesButton();
        mainPagaTires.clickMenuButtonOffroadSuv();
        mainPagaTires.formSeasonSummer();
        searchFormCar.selectionOfParameters();
        mainPagaTires.search();
        mainPagaTires.checkPageURL("https://reifen.pkwteile.de/offroadreifen/sommerreifen/205-55-r16");
    }

    @Feature("searchLLKW")
    @Test(groups = {"Regression"})
    public void searchLLKW() {
        MainPagaTires mainPagaTires = new MainPagaTires();
        SearchFormCar searchFormCar = new SearchFormCar();
        mainPagaTires.open();
        mainPagaTires.clickCookiesButton();
        mainPagaTires.clickMenubuttonLLKW();
        mainPagaTires.formSeasonWinter();
        searchFormCar.selectionOfParameters();
        mainPagaTires.search();
        mainPagaTires.checkPageURL("https://reifen.pkwteile.de/transporterreifen/winterreifen/205-55-r16");
    }

    @Feature("searchMoto")
    @Test(groups = {"Regression"})
    public void searchMoto() {
        MainPagaTires mainPagaTires = new MainPagaTires();
        SearchFormMoto searchFormMoto = new SearchFormMoto();
        mainPagaTires.open();
        mainPagaTires.clickCookiesButton();
        mainPagaTires.clickMenubuttonMotorrad();
        mainPagaTires.formSeasonWinter();
        searchFormMoto.selectionOfParametersMoto();
        mainPagaTires.search();
        mainPagaTires.checkPageURL("https://reifen.pkwteile.de/motorradreifen/winterreifen/140-80-r17");
    }
}
