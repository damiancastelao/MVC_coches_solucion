# Examen 
Creamos la rama con el comando git checkout -b ex3 y le implementamos la funcionalidad de buscar un coche 
dado de alta y mostrar sus datos incluyendo la velocidad. Para hacer esto en la clase controller añadimos
un nuevo bloque de codigo para mostrar los datos del coche. busca un coche en el modelo utilizando la matrícula especificada ("SBC 1234"). 
Si se encuentra un coche con esa matrícula, se imprimen en la consola sus datos, incluyendo la velocidad. 
En caso de no encontrar un coche con esa matrícula, se muestra un mensaje indicando que no se encontró ningún coche.
Y en clase Model se agregó el método getCoche el cual nos permite obtener un objeto Coche a partir de su matricula

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
          +subirVelocidad(String, Integer)
          +bajarVelocidad(String, Integer)
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
    Controller->>Model: Puedes aumenterle la velocidad?
    activate Model
    Model-->>Controller: Subida!
    deactivate Model
    Controller->>+View: Muestra la velocidad, porfa
    activate View
    View->>-View: Mostrando velocidad
    View-->>Controller: Listo!
    deactivate View
    Controller->>Model: Puedes bajarle la velocidad?
    activate Model
    Model-->>Controller: Bajada!
    deactivate Model
    Controller->>+View: Muestra la velocidad, porfa
    activate View
    View->>-View: Mostrando velocidad
    View-->>Controller: Listo!
    deactivate View
```


El mismo diagrama con los nombres de los métodos:


```mermaid
sequenceDiagram
    participant Model
    participant Controller
    participant View
    Controller->>Model: crearCoche("LaFerrari", "SBC 1234")
    activate Model
    Model-->>Controller: Coche
    deactivate Model
    Controller->>+View: muestraVelocidad("SBC 1234", velocidad)
    activate View
    View->>-View: System.out.println()
    View-->>Controller: boolean
    deactivate View
    Controller->>Model: cambiarVelocidad("SBC 1234", velocidadSubir)
    activate Model
    Model-->>Controller: Velocidad
    deactivate Model
    Controller->>+View: muestraVelocidad("SBC 1234", velocidad)
    activate View
    View->>-View: System.out.println()
    View-->>Controller: boolean
    deactivate View
    Controller->>Model: subirVelocidad("SBC 1234", velocidadSubir)
    activate Model
    Model-->>Controller: Velocidad
    deactivate Model
    Controller->>+View: muestraVelocidad("SBC 1234", velocidad)
    activate View
    View->>-View: System.out.println()
    View-->>Controller: boolean
    deactivate View
    Controller->>Model: bajarVelocidad("SBC 1234", velocidadSubir)
    activate Model
    Model-->>Controller: Velocidad
    deactivate Model
    Controller->>+View: muestraVelocidad("SBC 1234", velocidad)
    activate View
    View->>-View: System.out.println()
    View-->>Controller: boolean
    deactivate View
  
```