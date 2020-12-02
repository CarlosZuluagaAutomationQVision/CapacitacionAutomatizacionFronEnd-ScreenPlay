package userinterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class OrangeUserInterface {

  public static final Target IMG_ORANGE_HRM = Target.the("Imagen Pagina Inicio").located(By.xpath("//div[@id='branding']//img[@src='/webres_5faa8393a82311.28834036/themes/default/images/logo.png']"));
  public static final Target LBL_MY_INFO = Target.the("Label My Info").located(By.id("menu_pim_viewMyDetails"));
  public static final Target BTN_EDIT_AND_SAVE = Target.the("Label My Info").located(By.id("btnSave"));
  public static final Target TXT_FIRST_NAME = Target.the("Label My Info").located(By.id("personal_txtEmpFirstName"));
  public static final Target TXT_LAST_NAME = Target.the("Label My Info").located(By.id("personal_txtEmpLastName"));
  public static final Target TXT_EMPLOYEE_ID = Target.the("Label My Info").located(By.id("personal_txtEmployeeId"));
  public static final Target LST_NACIONALIDAD = Target.the("Campo para seleccionar la nacionalidad").located(By.id("personal_cmbNation"));
  public static final Target RBT_MALE_GENDER = Target.the("Campo para seleccionar la nacionalidad").located(By.id("personal_optGender_1"));
  public static final Target RBT_FEMALE_GENDER = Target.the("Campo para seleccionar la nacionalidad").located(By.id("personal_optGender_2"));
}
