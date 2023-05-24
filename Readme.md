# Arquitectura MVC

Aplicación que trabaja con objetos coches, modifica la velocidad y la muestra

### ejercicios


Crea tu rama de desarrollo
Realiza una modificación que en vez de cambiar la velocidad, haya dos métodos:
subirVelocidad(String matricula, Integer v), sube la velocidad en 'v' unidades
bajarVelocidad(String matricula, Integer v), baja la velocidad en 'v' unidades
Modifica el diagrama de clases y secuencia
realiza un pull request al repositorio original



SUBIR Y BAJAR
---
EL PROXIMO cambio realizado son dos metodos de subir y bajar velocidad, para esto en la Interfaz de Usuario,
añadimos dos botones uno de subir la velocidad en 10kmh y otro par abajar la velocidad en 10kmh


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

Ejemplo básico del procedimiento, sin utilizar los nombres de los métodos


```mermaid
sequenceDiagram
    participant Model
    participant Controller
    participant View
    Controller->>Model: Puedes crear un coche?
    activate Model
    Model-->>Controller: Creado!
    deactivate Model
    Controller->>+View: Muestra la velocidad, porfa
    activate View
    View->>-View: Mostrando velocidad
    View-->>Controller: Listo!
    deactivate View
```

El mismo diagrama con los nombres de los métodos

```mermaid
sequenceDiagram
    participant Model
    participant Controller
    participant View
    Controller->>Model: crearCoche("Mercedes", "BXK 1234")
    activate Model
    Model-->>Controller: Coche
    deactivate Model
    Controller->>+View: muestraVelocidad("BXK 1234", velocidad)
    activate View
    View->>-View: System.out.println()
    View-->>Controller: boolean
    deactivate View
```



## BAJAR Y SUBIR VELOCIDAD
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
```
