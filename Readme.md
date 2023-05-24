# Arquitectura MVC

Aplicación que trabaja con objetos coches, modifica la velocidad, busca el coche mediante la matricula
y la muestra

---

## Diagrama de clases:


```mermaid
classDiagram
    class Coche {
       
     String matricula;
    String modelo;
    int velocidad;
    boolean aireAcondicionado;
    int numeroDePuertas;
    boolean tapizadoDeCuero;
    }
      class Controller{
       crearCoche(String,String,boolea,boolean,int,int ) 
       aumentarVelocidad(String,int ) 
       disminuirVelocidad(String,int )
        Coche buscarCoche(String ) 
      }
      class View {+mostrarCoche(String,String,boolean,boolean,int ,int)}
      class Model {
          ArrayList~Coche~: parking
          +crearCoche(String, String,String)
          +getCoche(String)
          +cambiarVelocidad(String,int)
          +getVelocidad(String)
      }
      
      class IU { crearVentana()}
      
     class Dialog { mostrarMensaje() }
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
Ahora la parte de la Arquitectura de la vista, son tres clases

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

