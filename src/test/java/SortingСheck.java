import io.qameta.allure.Feature;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import pagesPKW.BeforeSuite;
import pagesPKW.ListingPage;

public class SortingСheck extends BaseTest {

    @DataProvider(name = "data-provider")
    public Object[][] dataProviderData() {
        return new Object[][]{
                {"https://reifen.pkwteile.de/winterreifen/205-55-r16"},
                {"https://reifen.pkwteile.de/winterreifen/205-55-r16?page=2"},
                {"https://reifen.pkwteile.de/winterreifen/205-55-r16?page=3"}
        };
    }


    @Feature("Sort prices per page")
    @Test(groups = {"Regression"}, dataProvider = "data-provider")
    public void checkSortingByPrice(String url){
        ListingPage listingPage = new ListingPage();
        BeforeSuite beforeSuite = new BeforeSuite();
        beforeSuite.open(url);
        listingPage.checkSortingByPrice(true);
    }
}
