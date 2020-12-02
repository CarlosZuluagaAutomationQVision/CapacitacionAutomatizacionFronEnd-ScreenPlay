package interaction;

import static userinterface.OrangeUserInterface.RBT_FEMALE_GENDER;
import static userinterface.OrangeUserInterface.RBT_MALE_GENDER;

import lombok.AllArgsConstructor;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;

@AllArgsConstructor
public class Seleccionar implements Task {

  private final String genero;

  public static Seleccionar genero(String genero) {
    return Tasks.instrumented(Seleccionar.class, genero);
  }

  @Override
  public <T extends Actor> void performAs(T actor) {
    if (genero.equalsIgnoreCase("female")){
      actor.attemptsTo(Click.on(RBT_FEMALE_GENDER));
    }
    else actor.attemptsTo(Click.on(RBT_MALE_GENDER));
  }
}
