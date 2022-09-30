# Diccionario

Crea un mini-diccionario español-inglés que contenga, al menos, 20 palabras (con su correspondiente traducción).
Utiliza un objeto de la clase HashMap para almacenar las parejas de palabras. El programa pedirá una palabra en español y dará la correspondiente traducción en inglés.

**AMPLIACIONES**
* El programa tendrá la opción de añadir palabras nuevas al diccionario, con su correspondiente traducción, modificar/corregir las traducciones ya introducidas, o eliminar entradas del diccionario (crear un menú de operaciones).
* El programa permitirá buscar las palabras que empiecen por una determinada letra, mostrando los pares palabra-traducción de todas aquellas palabras encontradas (que empiecen por la letra concreta).
* Una vez creado el diccionario e-i (español-inglés), crea un diccionario con las mismas entradas pero con la traducción inversa i-e (inglés-español) para que el usuario pueda elegir entre uno u otro al entrar en la aplicación.

# ModuloTraductor

Desarrolla el módulo traductor de la interfaz de un programa. Almacena en un HashMap las traducciones de los literales que se mostrarán en la interfaz de un programa que pida al usuario su nombre para saludarlo a continuación.
Al arrancar, el programa permitirá al usuario elegir el idioma en el que se mostrará dicha interfaz.

# Login

Implementa el control de acceso al área restringida de un programa (Login). Se debe pedir un nombre de usuario y una contraseña. Si el usuario introduce los datos correctamente, el programa dirá “Ha accedido al área restringida”. El usuario tendrá un máximo de 3 oportunidades. Si se agotan las oportunidades el programa dirá “Lo siento, no tiene acceso al área restringida”. Los nombres de usuario con sus correspondientes contraseñas deben estar almacenados en una estructura de la clase HashMap.

**AMPLIACIONES**

* Amplía el programa de Login (HashMap II - Actividad 2). Si el usuario no existe, se podrá dar de alta, añadiéndose al HashMap, estando disponible para poder entrar en la aplicación en cualquier momento.

* Amplía el programa anterior para que, si se producen 3 intentos fallidos de contraseña incorrecta, el usuario se quede bloqueado. El bloqueo debe ser permanente (mientras se ejecute el programa, obviamente), es decir, los intentos fallidos no tienen porqué ser seguidos y se almacenarán por usuario.

### Ejemplo:
- El usuario pepe introduce de manera incorrecta la clave, por lo que se almacenará 1 intento fallido para pepe.
- El usuario juan introduce de manera incorrecta la clave, por lo que se almacenará 1 intento fallido para juan.
- El usuario pepe introduce de manera incorrecta la clave, por lo que se almacenarán 2 intentos fallidos para pepe.
- El usuario pepe introduce de manera incorrecta la clave, por lo que se almacenarán 3 intentos fallidos para pepe, por lo que pepe quedará bloqueado.
- El usuario juan introduce de manera incorrecta la clave, por lo que se almacenará 2 intentos fallidos para juan.
- El usuario juan introduce de manera correcta la clave, por lo que se almacenarán 0 intentos fallidos para juan y accederá al sistema.
- El usuario juan cierra sesión.
- El usuario juan introduce de manera incorrecta la clave, por lo que se almacenará 1 intento fallido para juan.
