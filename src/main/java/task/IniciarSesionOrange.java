package task;

import static userinterface.InicioSesionUserInterface.TXT_CONTRASENIA;
import static userinterface.InicioSesionUserInterface.TXT_USUARIO;

import lombok.AllArgsConstructor;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import org.openqa.selenium.Keys;

@AllArgsConstructor
public class IniciarSesionOrange implements Task {

  private final String usuario;
  private final String contrasenia;

  public static IniciarSesionOrange conUsuario(String usuario, String contrasenia) {
    return Tasks.instrumented(IniciarSesionOrange.class, usuario, contrasenia);

  }

  @Override
  public <T extends Actor> void performAs(T actor) {
    actor.attemptsTo(Click.on(TXT_USUARIO),
        Enter.theValue(usuario).into(TXT_USUARIO).thenHit(Keys.TAB),
        Click.on(TXT_CONTRASENIA),
        Enter.theValue(contrasenia).into(TXT_CONTRASENIA).thenHit(Keys.ENTER));
  }
}
