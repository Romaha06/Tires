import io.qameta.allure.Feature;
import org.testng.annotations.Test;
import pagesPKW.MainPagaTyres;
import pagesPKW.SearchFormCar;
import pagesPKW.SearchFormMoto;


public class TestTiresSelector extends BaseTest {

    @Feature("searchPKW")
    @Test(groups = {"Regression"})
    public void searchPKW() {
        MainPagaTyres mainPagaTires = new MainPagaTyres();
        SearchFormCar searchFormCar = new SearchFormCar();
        mainPagaTires.open();
        mainPagaTires.closeCookie();
        mainPagaTires.clickMenuBtnPKW();
        mainPagaTires.formSeasonWinter();
        searchFormCar.selectionOfParameters();
        mainPagaTires.search();
        mainPagaTires.checkTitle("205/55 R16 PKW Winterreifen - billig online kaufen");
    }

    @Feature("searchSUV")
    @Test(groups = {"Regression"})
    public void searchSUV() {
        MainPagaTyres mainPagaTires = new MainPagaTyres();
        SearchFormCar searchFormCar = new SearchFormCar();
        mainPagaTires.open();
        mainPagaTires.closeCookie();
        mainPagaTires.clickMenuBtnSUV();
        mainPagaTires.formSeasonSummer();
        searchFormCar.selectionOfParameters();
        mainPagaTires.search();
        mainPagaTires.checkTitle("205/55 R16 Offroad/SUV Sommerreifen - billig online kaufen");
    }

    @Feature("searchLLKW")
    @Test(groups = {"Regression"})
    public void searchLLKW() {
        MainPagaTyres mainPagaTires = new MainPagaTyres();
        SearchFormCar searchFormCar = new SearchFormCar();
        mainPagaTires.open();
        mainPagaTires.closeCookie();
        mainPagaTires.clickMenuBtnLLKW();
        mainPagaTires.formSeasonWinter();
        searchFormCar.selectionOfParameters();
        mainPagaTires.search();
        mainPagaTires.checkTitle("205/55 R16 Transporter Winterreifen - billig online kaufen");
    }

    @Feature("searchMoto")
    @Test(groups = {"Regression"})
    public void searchMoto() {
        MainPagaTyres mainPagaTires = new MainPagaTyres();
        SearchFormMoto searchFormMoto = new SearchFormMoto();
        mainPagaTires.open();
        mainPagaTires.closeCookie();
        mainPagaTires.clickMenuBtnMoto();
        mainPagaTires.formSeasonAll();
        mainPagaTires.search();
        mainPagaTires.checkPageURL("https://reifen.pkwteile.de/motorradreifen/ganzjahresreifen/3_50---r10");
    }

}
