# Arquitectura MVC

Aplicación que trabaja con objetos coches, modifica la velocidad y la muestra

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
          +cambiarVelocidad(String, Integer)
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

---

## Proceso desarrollador - @acastineiraduran
1. Creé una nueva rama llamada "angel"
2. En la clase `Model` añado los métodos `subirVelocidad()` y `bajarVelocidad()`.
3. Añado el javadoc explicando la función de los métodos
4. Modifico los diagramas

> No modifiqué los diagramas originales (que realmente sería lo más óptimo) 
> para que posteriormente cuando lo estudie, tenga todo el proceso en el documento
> y me sea más fácil de comprender.
### Diagrama de clases:

```mermaid
sequenceDiagram
    participant Model
    participant Controller
    participant View
    Controller->>Model: crearCoche("Mercedes", "BXK 1234")
    activate Model
    Model-->>Controller: Coche
    deactivate Model
    
    Controller->>Model: bajarVelocidad("BXK 1234", 5)
    activate Model
    Model-->>Controller: v
    deactivate Model
    
    Controller->>Model: subirVelocidad("BXK 1234", 3)
    activate Model
    Model-->>Controller: v
    deactivate Model
    
    Controller->>+View: muestraVelocidad("BXK 1234", v)
    activate View
    View->>-View: System.out.println()
    View-->>Controller: boolean
    deactivate View
    
```

### Diagrama de Secuencia:

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
          +cambiarVelocidad(String, Integer)
          +getVelocidad(String)
          +subirVelocidad(String, Integer)
          +bajarVelocidad(String, Integer)
      }
    Controller "1" *-- "1" Model : association
    Controller "1" *-- "1" View : association
    Model "1" *-- "1..n" Coche : association
      
```