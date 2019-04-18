
import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.BeforeClass;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class paramTest {
    air a;
    @BeforeMethod
    public void initialize() {
        a=new air();
    }
    @DataProvider(name = "test1")
    public static Object[][] primeNumbers() {
        return new Object[][] {
                { "in","T","A", "J",3333,3,198,90,1499.85},
                //{ "in","T","A", "J",3333,3,264,90,2499.75},
                //{ "in","T","A", "W",3333,3,264,90,1499.85},
                { "in","T","A", "W",3333,3,243,90,2499.75},
                { "in","T","A", "W",3333,3,243,90,2499.75},
                { "in","T","A", "W",3333,3,243,90,2499.75}
        };
    }

    @Test(dataProvider = "test1")
    public void initial(String linetype1,String jicang1,String cusclass1,String vip1,int ticketvalue1,int luggage1,int circle,int kgsum,double expectedtotal) {
        a.linetype1=linetype1;
        a.jicang1=jicang1 ;
        a.cusclass1=cusclass1 ;
        a.vip1=vip1 ;
        a.ticketvalue1=ticketvalue1;
        a.luggage1=luggage1;
        a.circle=circle;
        a.kgsum=kgsum;
        a.expectedtotal=expectedtotal;
        boolean c=false;
        if(expectedtotal==a.sum()) {
            c=true;
        }
        Assert.assertEquals(c,true);
    }


}
