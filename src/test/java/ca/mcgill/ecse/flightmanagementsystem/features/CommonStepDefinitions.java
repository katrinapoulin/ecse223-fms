package ca.mcgill.ecse.flightmanagementsystem.features;

import ca.mcgill.ecse.flightmanagementsystem.application.FMSApplication;
import io.cucumber.java.After;

public class CommonStepDefinitions {
  /**
   * Method used to delete the current SnowShoeTour system instance before the next test. This is
   * effective for all scenarios in all feature files
   */
  @After
  public void tearDown() {
    FMSApplication.getFMS().delete();
  }
}
