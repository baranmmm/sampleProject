package sampleProject.pages;


import org.openqa.selenium.support.PageFactory;
import sampleProject.utilities.Driver;

public abstract class CommonPageElements extends Driver {

    public CommonPageElements() {
        PageFactory.initElements(driver,this);
    }

}
