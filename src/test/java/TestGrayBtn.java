import io.qameta.allure.Feature;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import pagesPKW.ListingPage;
import pagesPKW.MainPagaTyres;

public class TestGrayBtn extends BaseTest {


    @DataProvider(name = "data-provider")
    public Object[][] dataProviderData() {
        return new Object[][]{
                {"https://reifen.pkwteile.de/sommerreifen"},
                {"https://reifen.pkwteile.de/winterreifen"},
                {"https://reifen.pkwteile.de/ganzjahresreifen"}
        };
    }

    @Feature("Check gray buttons")
    @Test(groups = {"Regression", "SKIP"}, dataProvider = "data-provider")
    public void checkGrayBtnOnListing(String url) {
        MainPagaTyres mainPagaTyres = new MainPagaTyres();
        ListingPage listingPage = new ListingPage();
        listingPage.open(url);
        mainPagaTyres.closePopup(mainPagaTyres.btnCookies);
        listingPage.checkGrayBtnOnListing();
    }
}
