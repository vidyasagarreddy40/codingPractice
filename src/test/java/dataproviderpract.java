import org.openqa.selenium.Alert;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import org.testng.asserts.Assertion;
import org.testng.asserts.SoftAssert;

import java.lang.reflect.Method;

public class dataproviderpract {
    

    @DataProvider(name = "data")
    public Object[][] dpmethod() {

        return new Object[][]{{2, 3, 5}, {4, 5, 7}};

    }

    @Test(dataProvider = "data")
    public void sum1(int a, int b, int result) {
        int sum = a + b;

        System.out.println(sum);

        Assert.assertEquals(sum, result);
    }


    @DataProvider(name = "multiData")
    public Object[][] getData(Method m) {

        switch (m.getName()) {

            case "sum":
                return new Object[][]{{2, 3, 4}, {4, 7, 12}};

            case "sub":
                return new Object[][]{{2, 3, -1}, {6, 5, 2}};
        }
        return null;
    }

    @Test(dataProvider = "multiData")
    public void sum(int a, int b, int result) {
        int sum = a + b;

        Assert.assertEquals(sum, result);
    }

    @Test(dataProvider = "multiData")
    public void sub(int a, int b, int result) {

        SoftAssert softAssert = new SoftAssert();
        int sub = a - b;
        Assert.assertEquals(sub, result);
    }


    @Test(threadPoolSize = 4, invocationCount = 4, timeOut = 1000)
    public void aacount() {

        System.out.print("hi" + " ");


    }

}
