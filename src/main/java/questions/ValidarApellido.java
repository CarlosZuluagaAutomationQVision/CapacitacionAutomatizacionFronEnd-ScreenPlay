package questions;

import static userinterface.OrangeUserInterface.TXT_LAST_NAME;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

public class ValidarApellido implements Question <String>{


  public static ValidarApellido deLosDatosActualizados() {
    return new ValidarApellido();
  }

  @Override
  public String answeredBy(Actor actor) {
    return TXT_LAST_NAME.resolveFor(actor).getValue();
  }
}
