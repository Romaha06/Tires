import io.qameta.allure.Feature;
import org.testng.annotations.Test;
import pagesPKW.*;


public class TestTyresSelector extends BaseTest {


    @Feature("searchPKW")
    @Test(groups = {"Regression"})
    public void searchPKW() {
        MainPagaTyres mainPagaTyres = new MainPagaTyres();
        SearchFormCar searchFormCar = new SearchFormCar();
        BeforeSuite beforeSuite = new BeforeSuite();
        beforeSuite.open("https://reifen.pkwteile.de");
        mainPagaTyres.closePopup(mainPagaTyres.btnCookies);
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
        BeforeSuite beforeSuite = new BeforeSuite();
        beforeSuite.open("https://reifen.pkwteile.de");
        mainPagaTyres.closePopup(mainPagaTyres.btnCookies);
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
        BeforeSuite beforeSuite = new BeforeSuite();
        beforeSuite.open("https://reifen.pkwteile.de");
        mainPagaTyres.closePopup(mainPagaTyres.btnCookies);
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
        BeforeSuite beforeSuite = new BeforeSuite();
        beforeSuite.open("https://reifen.pkwteile.de");
        mainPagaTyres.closePopup(mainPagaTyres.btnCookies);
        mainPagaTyres.clickMenuBtnMoto();
        mainPagaTyres.formSeasonAll();
        mainPagaTyres.search();
        mainPagaTyres.checkPageURL("https://reifen.pkwteile.de/motorradreifen/ganzjahresreifen/3_50---r10");
    }

}
