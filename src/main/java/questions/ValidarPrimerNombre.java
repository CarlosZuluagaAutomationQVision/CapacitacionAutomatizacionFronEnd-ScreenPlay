package questions;

import static userinterface.OrangeUserInterface.TXT_FIRST_NAME;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

public class ValidarPrimerNombre implements Question<String> {


  public static ValidarPrimerNombre deLosDatosActualizados() {
    return new ValidarPrimerNombre();
  }

  @Override
  public String answeredBy(Actor actor) {
    return TXT_FIRST_NAME.resolveFor(actor).getValue();
  }
}
