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
      
      class IU { mostrarVentana()}
      
      class Dialog { mostrarVelocidad() }
    Controller "1" *-- "1" Model : association
    Controller "1" *-- "1" View : association
    Model "1" *-- "1..n" Coche : association
    View "1" *-- "1" IU : association
    View "1" *-- "1" Dialog : association
      
```

---

## Evento en el View

Cuando ocurre un evento en la vista, el `controller` se tiene que enterar.
Tenemos que tener en cuenta que en el MVC estricto, la vista no se comunica con el modelo.

En el listener del botón llamamos al `controller`




```mermaid

sequenceDiagram
    actor usuario
    participant View
    participant Controller
    participant Model
    
    usuario->>View: click! Crear coche
    View->>Controller: el usuario quiere crear un coche
    activate Controller
    Controller->>Model: crea un coche, porfa
    activate Model
    Model-->>Controller: Coche
    deactivate Model
    Controller->>View: ok, coche creado!
    deactivate Controller
    View-->>usuario: tu coche se creó!
    
     
```
 Arquitectura de la vista.

```mermaid

   sequenceDiagram
   autonumber
    actor usuario
    participant IU
    participant Dialog
    participant View
  
    participant Controller
    participant Model
    
    usuario->>IU: click! Crear coche
    
    IU->>Controller: crea un coche()
     activate Controller
    Controller->>Model: crea un coche
      activate Model
     Model-->> Controller: Coche
    deactivate Model
     
    Controller->>+View: mostrarVelocidad()
     deactivate Controller
     
    View-->>-Dialog:  mostrarVelocidad()
    
          
```
## Evento en la Vista con el Observer

```mermaid
sequenceDiagram
    actor usuario
    participant View
    participant Controller
    participant Model
    participant ObsExceso
    
    usuario->>View: click! Crear coche
    View->>Controller: el usuario quiere crear un coche
    activate Controller
    Controller->>Model: crea un coche, porfa
    activate Model
    Model-->>Controller: Coche
    deactivate Model
    Controller->>View: ok, coche creado!
    deactivate Controller
    View-->>usuario: tu coche se creo!
    
    usuario->>View: click! Subir velocidad
    View->>Controller: el usuario quiere subir la velocidad
    activate Controller
    Controller->>Model: sube la velocidad, porfa
    activate Model
    Model-->>ObsExceso: Sube la Velocidad
    activate ObsExceso
    ObsExceso-->>View: cambio en la velocidad
    View-->usuario: tu coche ha cambiado la velocidad (si la velocidad supera los 120km/h le sale un aviso)
```

---
## Evento con  Observer 

 En este diagrama explico de forma mas especifica.

```mermaid
sequenceDiagram
    autonumber
    actor usuario        
    participant Controller
    participant Model
    participant ObsExceso

    usuario->>IU: click! Crear coche
    IU->>Controller: crearCoche()
    activate Controller
    Controller->>Model: crearCoche
    activate Model
    Model-->>Controller: Coche
    deactivate Model
    Controller->>+View: mostrarVelocidad
    deactivate Controller
    View-->>-Dialog: mostrarVelocidad()
    
    usuario->>IU: click! Subir velocidad
    IU->>Controller: subirVelocidad()
    activate Controller
    Controller->>Model: subirVelocidad()
    deactivate Controller
    activate Model
    Model-->>ObsExceso: Se ha cambiado la Velocidad
    deactivate Model
    activate ObsExceso
    ObsExceso->>+View: mostrarVelocidad() o mostrarExceso()
    deactivate ObsExceso
    View-->>-Dialog: mostrarVelocidad()
```
