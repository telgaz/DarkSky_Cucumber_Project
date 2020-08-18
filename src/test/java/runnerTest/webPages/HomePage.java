package runnerTest.webPages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utils.BasePage;

public class HomePage extends ElementUtil{





    By todayMin=By.xpath("(//span[@class='minTemp'])[position()=1]");
    By todayMax=By.xpath("(//span[@class='maxTemp'])[position()=1]");
    By today=By.xpath("(//span[@class='name'])[position()=1]");
   // By today=By.xpath("span[contains(text(),'Today')]");
    By assertionMin=By.xpath("(//span[@class='temp'])[1]");
    By assertionMax=By.xpath("(//span[@class='temp'])[2]");

    public String getLoginPageTitle(){

        return getPageTitle();
    }

       public void goClickTodayBtn(){


           scrollDownPage(750, BasePage.get());
           clickOn(today);

       }

    public void compareMinDegrees() {

        WebElement minimum=findWebElement(todayMin);
        String minDegree=minimum.getText();
        System.out.println(minDegree);

        webAction(assertionMin);
        WebElement assertMin=findWebElement(assertionMin);
        String min=assertMin.getText();
        System.out.println(min);


     //   Assert.assertEquals(minDegree, min);
    }

    public void compareMaxDegrees() {

       WebElement max=findWebElement(todayMax);

        String maxDegree=max.getText();
        System.out.println(maxDegree);

        webAction(assertionMax);

        WebElement assertMax=findWebElement(assertionMax);
        String maximum=assertMax.getText();
        System.out.println(maximum);

     //   Assert.assertEquals(maxDegree, maximum);

    }
}
