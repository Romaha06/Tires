import io.qameta.allure.Feature;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import pagesPKW.ListingPage;
import pagesPKW.MainPagaTires;
import pagesPKW.SearchFormCar;
import pagesPKW.SearchFormMoto;


public class TiresSearchTest extends BaseTest {

    @DataProvider(name = "data-provider")
    public Object[][] dataProviderData(){
        return new Object[][]{
                {"https://www.pkwteile.de/ersatzteile-suche?keyword=Sto%C3%9Fd%C3%A4mpfer"},
                {"https://reifen.pkwteile.de/sommerreifen"},
                {"https://reifen.pkwteile.de/winterreifen"},
                {"https://reifen.pkwteile.de/ganzjahresreifen"}
        };
    }

    @Feature("Check gray buttons")
    @Test(groups = {"Regression", "SKIP"},dataProvider="data-provider")
    public void checkGrayBtnOnListing(String url) {
        MainPagaTires mainPagaTires = new MainPagaTires();
        mainPagaTires.open(url);
        mainPagaTires.closeCookie();
        new ListingPage().checkGrayBtnOnListing();
    }

    @Feature("searchPKW")
    @Test(groups = {"Regression"})
    public void searchPKW() {
        MainPagaTires mainPagaTires = new MainPagaTires();
        SearchFormCar searchFormCar = new SearchFormCar();
        mainPagaTires.open();
        mainPagaTires.closeCookie();
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
        mainPagaTires.closeCookie();
        mainPagaTires.clickMenuButtonOffroadSuv();
        mainPagaTires.formSeasonSummer();
        searchFormCar.selectionOfParameters();
        mainPagaTires.search();
        mainPagaTires.checkTitel("205/55 R16 Offroad/SUV Sommerreifen - billig online kaufen");
    }

    @Feature("searchLLKW")
    @Test(groups = {"Regression"})
    public void searchLLKW() {
        MainPagaTires mainPagaTires = new MainPagaTires();
        SearchFormCar searchFormCar = new SearchFormCar();
        mainPagaTires.open();
        mainPagaTires.closeCookie();
        mainPagaTires.clickMenubuttonLLKW();
        mainPagaTires.formSeasonWinter();
        searchFormCar.selectionOfParameters();
        mainPagaTires.search();
        mainPagaTires.checkTitel("205/55 R16 Transporter Winterreifen - billig online kaufen");
    }

    @Feature("searchMoto")
    @Test(groups = {"Regression"})
    public void searchMoto() {
        MainPagaTires mainPagaTires = new MainPagaTires();
        SearchFormMoto searchFormMoto = new SearchFormMoto();
        mainPagaTires.open();
        mainPagaTires.closeCookie();
        mainPagaTires.clickMenubuttonMotorrad();
        mainPagaTires.formSeasonAll();
        mainPagaTires.search();
        mainPagaTires.checkPageURL("https://reifen.pkwteile.de/motorradreifen/ganzjahresreifen/3_50---r10");
    }
}
