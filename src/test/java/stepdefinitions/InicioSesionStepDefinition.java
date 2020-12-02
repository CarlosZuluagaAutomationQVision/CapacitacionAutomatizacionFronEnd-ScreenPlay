package stepdefinitions;

import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Entonces;
import net.serenitybdd.screenplay.GivenWhenThen;
import questions.ValidarLabelInicio;
import task.Abrir;
import task.IniciarSesionOrange;

public class InicioSesionStepDefinition {

  @Dado("que Carlos abre la pagina de {string}")
  public void abrirPagina(String nombrePagina) {
    theActorInTheSpotlight().attemptsTo(Abrir.pagina(nombrePagina.toUpperCase()));
  }


  @Cuando("se registre con el usuario {string} contraseña {string}")
  public void iniciarSesion(String usuario, String contrasenia) {
    theActorInTheSpotlight().attemptsTo(IniciarSesionOrange.conUsuario(usuario, contrasenia));
  }


  @Entonces("puede ver el label de la pagina de inicio")
  public void validarInicioSesion() {
    theActorInTheSpotlight().should(GivenWhenThen.seeThat(ValidarLabelInicio.enOrange()));
  }

}
