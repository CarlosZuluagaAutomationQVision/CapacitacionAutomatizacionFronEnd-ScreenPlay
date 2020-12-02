package stepdefinitions;

import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Entonces;
import java.util.Map;
import net.serenitybdd.screenplay.GivenWhenThen;
import org.hamcrest.Matchers;
import questions.ValidarApellido;
import questions.ValidarPrimerNombre;
import task.ActualizarInformacion;

public class ActualizarDatosStepDefinition {

  @Cuando("realice la actualización de sus datos personales")
  public void actualizarDatosOrange(Map<String, String> mapDatosActualizacion) {
    theActorInTheSpotlight().attemptsTo(ActualizarInformacion.enOrange(mapDatosActualizacion));
  }

  @Entonces("puede ver sus datos actualizados en el formulario")
  public void validarDatosActualizados(Map<String, String> mapDatosActualizacion) {
    theActorInTheSpotlight().should(GivenWhenThen
        .seeThat(ValidarPrimerNombre.deLosDatosActualizados(),
            Matchers.equalTo(mapDatosActualizacion.get("Nombre"))));
    theActorInTheSpotlight().should(GivenWhenThen
        .seeThat(ValidarApellido.deLosDatosActualizados(),
            Matchers.equalTo(mapDatosActualizacion.get("Apellido"))));
  }
}
