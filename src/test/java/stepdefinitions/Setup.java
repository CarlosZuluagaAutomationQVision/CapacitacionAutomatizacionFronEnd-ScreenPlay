package stepdefinitions;

import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;

import io.cucumber.java.Before;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import net.thucydides.core.annotations.Managed;
import org.openqa.selenium.WebDriver;

public class Setup {

  @Before
  public void configurarActor(){
    OnStage.setTheStage(new OnlineCast());
    theActorCalled("Carlos");
  }

  @Managed(driver = "chrome", uniqueSession = true)
  WebDriver driver;
}
