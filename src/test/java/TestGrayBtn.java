import io.qameta.allure.Feature;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import pagesPKW.BeforeSuite;
import pagesPKW.ListingPage;
import pagesPKW.MainPageTyres;

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
        MainPageTyres mainPagaTyres = new MainPageTyres();
        ListingPage listingPage = new ListingPage();
        BeforeSuite beforeSuite = new BeforeSuite();
        beforeSuite.open(url);
        mainPagaTyres.closePopup(mainPagaTyres.btnCookies);
        listingPage.checkGrayBtnOnListing();
    }
}
