import io.qameta.allure.Feature;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import pagesPKW.ListingPage;
import pagesPKW.MainPagaTyres;

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
        MainPagaTyres mainPagaTires = new MainPagaTyres();
        ListingPage listingPage = new ListingPage();
        listingPage.open(url);
        mainPagaTires.closeCookie();
        listingPage.addToBasket();
    }

    @Feature("addToBasketFromProdPage")
    @Test(groups = {"Regression"}, dataProvider = "data-provider")
    public void addToBasketFromProdPage(String url) {
        MainPagaTyres mainPagaTires = new MainPagaTyres();
        ListingPage listingPage = new ListingPage();
        listingPage.open(url);
        mainPagaTires.closeCookie();
        listingPage.addToBasketFromProdPage();
    }

    @Feature("addToBasketFromBlockTop")
    @Test(groups = {"Regression"})
    public void addToBasketFromBlockTop() {
        MainPagaTyres mainPagaTires = new MainPagaTyres();
        mainPagaTires.open();
        mainPagaTires.closeCookie();
        mainPagaTires.addToBasketFromBlockTop();
    }
}
