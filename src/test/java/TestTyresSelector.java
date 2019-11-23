import io.qameta.allure.Feature;
import org.testng.annotations.Test;
import pagesPKW.MainPagaTyres;
import pagesPKW.SearchFormCar;
import pagesPKW.SearchFormMoto;


public class TestTyresSelector extends BaseTest {

    @Feature("searchPKW")
    @Test(groups = {"Regression"})
    public void searchPKW() {
        MainPagaTyres mainPagaTyres = new MainPagaTyres();
        SearchFormCar searchFormCar = new SearchFormCar();
        mainPagaTyres.open();
        mainPagaTyres.closeCookie();
        mainPagaTyres.clickMenuBtnPKW();
        mainPagaTyres.formSeasonWinter();
        searchFormCar.selectionOfParameters();
        mainPagaTyres.search();
        mainPagaTyres.checkTitle("205/55 R16 PKW Winterreifen - billig online kaufen");
    }

    @Feature("searchSUV")
    @Test(groups = {"Regression"})
    public void searchSUV() {
        MainPagaTyres mainPagaTyres = new MainPagaTyres();
        SearchFormCar searchFormCar = new SearchFormCar();
        mainPagaTyres.open();
        mainPagaTyres.closeCookie();
        mainPagaTyres.clickMenuBtnSUV();
        mainPagaTyres.formSeasonSummer();
        searchFormCar.selectionOfParameters();
        mainPagaTyres.search();
        mainPagaTyres.checkTitle("205/55 R16 Offroad/SUV Sommerreifen - billig online kaufen");
    }

    @Feature("searchLLKW")
    @Test(groups = {"Regression"})
    public void searchLLKW() {
        MainPagaTyres mainPagaTyres = new MainPagaTyres();
        SearchFormCar searchFormCar = new SearchFormCar();
        mainPagaTyres.open();
        mainPagaTyres.closeCookie();
        mainPagaTyres.clickMenuBtnLLKW();
        mainPagaTyres.formSeasonWinter();
        searchFormCar.selectionOfParameters();
        mainPagaTyres.search();
        mainPagaTyres.checkTitle("205/55 R16 Transporter Winterreifen - billig online kaufen");
    }

    @Feature("searchMoto")
    @Test(groups = {"Regression"})
    public void searchMoto() {
        MainPagaTyres mainPagaTyres = new MainPagaTyres();
        SearchFormMoto searchFormMoto = new SearchFormMoto();
        mainPagaTyres.open();
        mainPagaTyres.closeCookie();
        mainPagaTyres.clickMenuBtnMoto();
        mainPagaTyres.formSeasonAll();
        mainPagaTyres.search();
        mainPagaTyres.checkPageURL("https://reifen.pkwteile.de/motorradreifen/ganzjahresreifen/3_50---r10");
    }

}
