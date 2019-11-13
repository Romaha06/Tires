import io.qameta.allure.Feature;
import org.testng.annotations.Test;
import pagesPKW.MainPagaTires;
import pagesPKW.SearchFormCar;
import pagesPKW.SearchFormMoto;


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
        mainPagaTires.checkTitel("205/55 R16 PKW Winterreifen - billig online kaufen");
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
        mainPagaTires.formSeasonAll();
        mainPagaTires.search();
        mainPagaTires.checkPageURL("https://reifen.pkwteile.de/motorradreifen/ganzjahresreifen/3_50---r10");
    }
}
