package userinterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class InicioSesionUserInterface {

  public static final Target TXT_USUARIO = Target.the("Ingresar Nombre Usuario").located(By.id("txtUsername"));
  public static final Target TXT_CONTRASENIA = Target.the("Ingresar Contraseña Usuario").located(By.id("txtPassword"));

}
