#language: es

Característica: Actualizar información personal en Orange
  Yo como usuario del aplicativo Orange
  Deseo actualizar mis datos personales
  Para garantizar que mi información personal mantiene actualizada

  Esquema del escenario: Actualización de datos personales en la pagina de Orange
    Dado que Carlos abre la pagina de 'Orange'
    Cuando se registre con el usuario 'Admin' contraseña 'admin123'
    Y realice la actualización de sus datos personales
      | Nombre       | <FirsName>    |
      | Apellido     | <LastName>    |
      | TrabajoId    | <EmployeeId>  |
      | Nacionalidad | <Nationality> |
      | Genero       | <Gender>      |
    Entonces puede ver sus datos actualizados en el formulario
      | Nombre       | <FirsName>    |
      | Apellido     | <LastName>    |
      | TrabajoId    | <EmployeeId>  |
      | Nacionalidad | <Nationality> |

    Ejemplos:
      | FirsName | LastName | EmployeeId | Nationality | Gender |
      | Violeta  | Zuluaga  | 1000       | Colombian   | female |
      | Andres   | Gomez    | 500        | Chilean     | male   |