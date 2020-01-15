import io.qameta.allure.Feature;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import pagesPKW.BeforeSuite;
import pagesPKW.ListingPage;
import pagesPKW.MainPageTyres;

public class TestAddToBasket extends BaseTest {

    @DataProvider(name = "data-provider")
    public Object[][] dataProviderData() {
        return new Object[][]{
                {"https://reifen.pkwteile.de/sommerreifen"},
                {"https://reifen.pkwteile.de/winterreifen"},
                {"https://reifen.pkwteile.de/ganzjahresreifen"}
        };
    }

    @Feature("addToBasket")
    @Test(groups = {"Regression"}, dataProvider = "data-provider")
    public void addToBasket(String url) {
        MainPageTyres mainPagaTyres = new MainPageTyres();
        ListingPage listingPage = new ListingPage();
        BeforeSuite beforeSuite = new BeforeSuite();
        beforeSuite.open(url);
        mainPagaTyres.closePopup(mainPagaTyres.btnCookies);
        listingPage.addToBasket();
    }

    @Feature("addToBasketFromProdPage")
    @Test(groups = {"Regression"}, dataProvider = "data-provider")
    public void addToBasketFromProdPage(String url) {
        MainPageTyres mainPagaTyres = new MainPageTyres();
        ListingPage listingPage = new ListingPage();
        BeforeSuite beforeSuite = new BeforeSuite();
        beforeSuite.open(url);
        mainPagaTyres.closePopup(mainPagaTyres.btnCookies);
        listingPage.addToBasketFromProdPage();

    }

    @Feature("addToBasketFromBlockTop")
    @Test(groups = {"Regression"})
    public void addToBasketFromBlockTop() {
        MainPageTyres mainPagaTyres = new MainPageTyres();
        BeforeSuite beforeSuite = new BeforeSuite();
        beforeSuite.open("https://reifen.pkwteile.de/");
        mainPagaTyres.closePopup(mainPagaTyres.btnCookies);
        mainPagaTyres.addToBasketFromBlockTop();
    }
}
