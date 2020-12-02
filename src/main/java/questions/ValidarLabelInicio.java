package questions;

import static userinterface.OrangeUserInterface.IMG_ORANGE_HRM;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

public class ValidarLabelInicio implements Question<Boolean> {


  public static ValidarLabelInicio enOrange() {
    return new ValidarLabelInicio();
  }

  @Override
  public Boolean answeredBy(Actor actor) {
    return IMG_ORANGE_HRM.resolveFor(actor).isCurrentlyVisible();
  }
}
