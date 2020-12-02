package task;

import static userinterface.OrangeUserInterface.BTN_EDIT_AND_SAVE;
import static userinterface.OrangeUserInterface.TXT_EMPLOYEE_ID;
import static userinterface.OrangeUserInterface.TXT_FIRST_NAME;
import static userinterface.OrangeUserInterface.TXT_LAST_NAME;
import static userinterface.OrangeUserInterface.LBL_MY_INFO;
import static userinterface.OrangeUserInterface.LST_NACIONALIDAD;

import interaction.Seleccionar;
import java.util.Map;
import lombok.AllArgsConstructor;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.SelectFromOptions;

@AllArgsConstructor
public class ActualizarInformacion implements Task {

  private final Map<String, String> mapDatosActualizacion;

  public static ActualizarInformacion enOrange(Map<String, String> mapDatosActualizacion) {
    return Tasks.instrumented(ActualizarInformacion.class, mapDatosActualizacion);
  }

  @Override
  public <T extends Actor> void performAs(T actor) {
    actor.attemptsTo(Click.on(LBL_MY_INFO),
        Click.on(BTN_EDIT_AND_SAVE),
        Click.on(TXT_FIRST_NAME),
        Enter.theValue(mapDatosActualizacion.get("Nombre")).into(TXT_FIRST_NAME),
        Enter.theValue(mapDatosActualizacion.get("Apellido")).into(TXT_LAST_NAME),
        Enter.theValue(mapDatosActualizacion.get("TrabajoId")).into(TXT_EMPLOYEE_ID),
        SelectFromOptions.byVisibleText(mapDatosActualizacion.get("Nacionalidad"))
            .from(LST_NACIONALIDAD),
        Seleccionar.genero(mapDatosActualizacion.get("Genero")),
        Click.on(BTN_EDIT_AND_SAVE));
  }
}
