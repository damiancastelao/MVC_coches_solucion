# EXAMEN 3RA EVALUACION

### Enunciado

El exámen tienes que hacerlo en una rama (nombre de la rama ex3) de tu proyecto de MVC coches. En el que tienes que tener implementado subir/bajar velocidad.

Implementa la funcionalidad de buscar un coche dado de alta y mostrar sus datos, incluyendo la velocidad. Respeta la arquitectura MVC

    -Crea un issue exponiendo la funcionalidad
    -Realiza las modificaciones
    -Crea un pull Request para la rama principal
    -Mientras codificas, documenta


#### Pasos

    1- He creado un Issue en Github donde propongo el cambio del nuevo método getCoche()

    2- Implemento esta motificación añadiendo un nuevo boton llamado getCoche() y llamando desde el Listener
            al método getCoche del controller
        Este mismo método en el controller, llama al método getCoche del Model y al método mosrar coche de vista

    3- Desde esta rama creo un pull request a la rama principal

    4- realizo un javaDoc de estas modificaciones

---
## Diagrama de clases:

```mermaid
classDiagram
    class Coche {
        String: matricula
        String: modelo
        Integer: velocidad
    }
      class Controller{
          +main()
      }
      class View {+muestraVelocidad(String, Integer)}
      class Model {
          ArrayList~Coche~: parking
          +crearCoche(String, String, String)
          +getCoche(String)
          +subirVelocidad(String, Integer):Integer
          +bajarVelocidad(String, Integer):Integer
          +getVelocidad(String)
      }
    Controller "1" *-- "1" Model : association
    Controller "1" *-- "1" View : association
    Model "1" *-- "1..n" Coche : association
      
```

---

## Diagrama de Secuencia

Aquí se muestra el diagrama de secuencia en el cual añadimos el método de getCoche()

```mermaid
sequenceDiagram
    participant Model
    participant Controller
    participant View
    Controller->>Model: crearCoche("Mercedes", "BXK 1234")
    activate Model
    Model-->>Controller: Coche creado
    deactivate Model
    Controller->>+View: muestraVelocidad("BXK 1234", velocidad)
    activate View
    View->>-View: System.out.println(velocidad)
    View-->>Controller: boolean
    deactivate View
    Controller->>Model: bajarVelocidad("BXK 1234")
    activate Model
    Model-->>Controller: Velocidad bajada
    deactivate Model
    Controller->>+View: muestraVelocidad("BXK 1234", velocidad)
    activate View
    View->>-View: System.out.println(velocidad)
    View-->>Controller: boolean
    deactivate View
    Controller->>Model: subirVelocidad("BXK 1234")
    activate Model
    Model-->>Controller: Velocidad subida
    deactivate Model
    Controller->>+View: muestraVelocidad("BXK 1234", velocidad)
    activate View
    View->>-View: System.out.println(velocidad)
    View-->>Controller: boolean
    deactivate View
    Controller->>Model: getCoche("BXK 1234")
    activate Model
    Model-->>Controller: Coche obtenido
    deactivate Model
    Controller->>+View: muestraCoche(coche)
    activate View
    View->>-View: System.out.println(coche)
    View-->>Controller: boolean
    deactivate View

```
