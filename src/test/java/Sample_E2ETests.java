
import org.testng.Assert;
import org.testng.annotations.Test;
import mainpage.MainPageActions;
import util.Constants;
import util.DataInitializer;

import java.io.IOException;

public class Sample_E2ETests


{

    @Test
    public void sampleTest() throws IOException, InterruptedException {

        // Data Setup
        DataInitializer dataInitializer = new DataInitializer();
        dataInitializer.setEnvValues();

        // Perform action on the file
        MainPageActions mainPageActions = new MainPageActions();
        String actualMinuetResult = mainPageActions.sampleMainPageAction(Constants.APP_PATH);
        String expectedResult = "success";
        Assert.assertEquals(expectedResult, actualMinuetResult);


    }
}
