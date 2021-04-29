package sampleProject.step_definitions;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import sampleProject.utilities.CommonSteps;
import sampleProject.utilities.Driver;

public class Hooks {

//    @Before("@db")
//    public void dbHook() {
//        System.out.println("creating database connection");
//        DBUtils.createConnection();
//
//    }
//
//    @After("@db")
//    public void afterDbHook() {
//        System.out.println("closing database connection");
//        DBUtils.destroyConnection();
//
//    }
//
    @Before
    public void setUp() {
        Driver.get();
    }

    @After
    public void tearDown(Scenario scenario) {
        byte[] picture;
        if (scenario.isFailed()) {
            // take screenshot and save it in /failed
            picture = CommonSteps.takeScreenshot("failed/" + scenario.getName());
        } else {
            // take screenshot and put it in /passed folder
            picture = CommonSteps.takeScreenshot("passed/" + scenario.getName());
        }

        scenario.attach(picture, "image/png", scenario.getName());
        Driver.closeDriver();
    }






}

