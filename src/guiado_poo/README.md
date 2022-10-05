# [1. Implementar una clase Juego con las siguientes características:](https://github.com/gabzafra/DAM2_ACTIVIDADES/tree/master/src/guiado_poo/parte1)
## Atributos
. Tiene como atributo público un entero que indica el número de vidas que le quedan al jugador en la partida actual: numeroVidas
## Métodos
. Tiene como método el constructor que acepta un parámetro de tipo entero que indica el número de vidas iniciales con las que parte el jugador.
. Tiene un método muestraVidasRestantes que visualiza por pantalla el número de vidas que le quedan al jugador en la partida actual.
. Además esta clase tiene también el método main que debe realizar lo siguiente:
- Crea una instancia de la clase Juego indicando que el número de vidas es 5.
- Llama al método muestraVidasRestantes del objeto creado.
- Resta una vida al valor del atributo con las vidas y vuelve a llamar a muestraVidasRestantes.
- Crea otra instancia de la clase Juego indicando que el número de vidas es también de 5.
- Llama al método muestraVidasRestantes de la nueva instancia y luego al de la instancia anterior
[# 2. Ocultación de atributos:](https://github.com/gabzafra/DAM2_ACTIVIDADES/tree/master/src/guiado_poo/parte2)
## Atributos
. Debe ocultarse a cualquier otra clase el atributo con las vidas. Para poder modificar este atributo, se crearán los dos nuevos métodos que se explican más adelante.
. Crear un nuevo atributo, también privado, que guarde el número de vidas que inicialmente se le pasaron al constructor del objeto. Este atributo se utilizará para poder reiniciar el juego: vidasIniciales
. Crear otro atributo también privado y de tipo entero que guarde el récord. A diferencia de los anteriores (que son atributos de instancia) éste es un atributo de clase (static), por lo que será común a todos los juegos que se implementen. Inicialmente este atributo tendrá el valor 0: record
## Métodos
. Añadir un método quitaVida que disminuya en 1 el número de vidas del jugador y devuelva un boolean indicando si al jugador le quedan más vidas o no. En caso de que al jugador no le queden más vidas, este método debe mostrar un mensaje “Juego Terminado” por pantalla.
. Añadir un método reiniciaPartida que asigne al atributo vidas el número de vidas que se habían indicado al llamar al constructor del objeto. Para ello utilizará el nuevo atributo que se ha añadido.
. Añadir un método actualizaRecord que compare el valor actual de récord con el número de vidas restantes. Si el número de vidas restantes es igual al récord, mostrará un mensaje indicando que se ha alcanzado el récord. Si el número de vidas restante es mayor que el récord, actualizará el récord y mostrará un mensaje diciendo que éste se ha batido y cuál es su nuevo valor. Si el número de vidas es menor, no hará nada.
Para probar la ocultación, la función main se va a poner ahora en una clase aparte llamada Aplicacion en un fichero Aplicacion.java dentro del mismo paquete:
Antes de modificar esta función, comprobar que ahora el compilador nos muestra un mensaje de error al intentar modificar directamente el atributo con las vidas. A continuación proceder con las modificaciones que siguen:
. Llamar al método quitaVida de una de las instancias de la clase Juego y a continuación al método muestraVidasRestantes.
. Posteriormente llamar al método reiniciaPartida y de nuevo al método muestraVidasRestantes.
. Llamar al método actualizaRecord de la primera instancia de Juego y a continuación llamar a este mismo método pero en la segunda instancia.
[# 3. Herencia y Polimorfismo](https://github.com/gabzafra/DAM2_ACTIVIDADES/tree/master/src/guiado_poo/parte3)
# Parte 1:
## Clase Juego
. Añadirle un método abstracto juega que no tome parámetros y que tendrán que implementar las clases derivadas.
. La clase Juego ahora pasa a ser una clase abstracta por lo que ya no se podrán crear instancias de la misma.
. La función main ya no estará dentro de esta clase.
## Clase JuegoAdivinaNumero
. Deriva (extiende o hereda) de la clase Juego.
. Tiene un constructor que toma dos parámetros de tipo entero. El primero es el número de vidas que, a su vez, se lo pasará al constructor de la clase base. El segundo parámetro es un número a adivinar entre 0 y 10.
. Implementa el método juega de la clase base:
. Llama al método reiniciaPartida que ha heredado.
. Muestra un mensaje al usuario pidiendo que adivine un número entre el 0 y el 10.
. Lee un entero del teclado y lo compara con el valor predefinido por el programador:
- Si es igual, muestra un mensaje “Acertaste!!” y, tras llamar a actualizaRecord, sale del método.
- Si es diferente, llama al método quitaVida heredado.
- Si el método quitaVida devuelve true, significa que aún le quedan más vidas al jugador por lo que se muestra un mensaje indicando si el número a adivinar es mayor o menor y se le pide que lo intente de nuevo.
- Si el método quitaVida devuelve false significa que ya no le quedan más vidas
al jugador, con lo que sale del método juega.
## Clase Aplicacion
. Contiene un método main que, tras crear una instancia de la nueva clase JuegoAdivinaNumero que se ha creado, llama al método juega.
# Parte 2:
## Clase JuegoAdivinaNumero
. Añade un nuevo método validaNumero que toma como parámetro el número introducido por el usuario y devuelve un boolean que, en este caso, será siempre true.
. En el método juega se pedirá un nuevo número por teclado si el método validaNumero devuelve false, en este caso, no restará vida.
## Clase JuegoAdivinaPar
. Deriva de la clase JuegoAdivinaNumero
. Redefine el método validaNumero devolviendo true si el número es par. Si el número es impar, muestra un mensaje de error por pantalla y devuelve false.
## Clase JuegoAdivinaImpar
. Deriva de la clase JuegoAdivinaNumero
. Redefine el método validaNumero devolviendo true si el número es impar. Si el número es par, muestra un mensaje de error por pantalla y devuelve false.
## Clase Aplicacion
. El método main crea una instancia de cada uno de los tres juegos creados: JuegoAdivinaNumero, JuegoAdivinaPar y JuegoAdivinaImpar. Como número de vidas de cada juego se pondrá 3 y como número a adivinar un número cualquiera, otro par y otro impar respectivamente, todos comprendidos entre el 0 y el 10.
. Llama al método juega de cada una de las tres instancias.
[# 4. Interfaces](https://github.com/gabzafra/DAM2_ACTIVIDADES/tree/master/src/guiado_poo/parte4)
# Parte 1:
## Clase Juego
Se eliminará su método abstracto Juega, pero la clase se seguirá manteniendo como abstracta ya que no interesa que se creen instancias de ellas directamente.
## Interfaz Jugable
. Dispondrá de un método juega que cumplirá el mismo objetivo que el que se ha quitado a la clase Juego.
. Se incorporará un método muestraNombre que no tome ningún parámetro y que obligue a las clases que implementen la interfaz a mostrar un mensaje por pantalla con el nombre del juego.
. Se incorporará un método muestraInfo que no tome ningún parámetro y que obligue a las clases que implementen la interfaz a mostrar un mensaje por pantalla con una descripción de cómo jugar al juego.
## Clase JuegoAdivinaNumero
. Debe implementar la interfaz Jugable
. El método muestraNombre visualizará por pantalla el texto “Adivina un número”
. El método muestraInfo visualizará por pantalla una descripción de cómo se juega al juego, informando del número de intentos que se le dan al jugador.
## Clase JuegoAdivinaPar
. Redefine el método muestraNombre para que visualice por pantalla el texto “Adivina un número par”
. Redefine el método muestraInfo
## Clase JuegoAdivinaImpar
. Redene el método muestraNombre para que visualice por pantalla el texto “Adivina un número impar”
. Redefine el método muestraInfo
## Clase Aplicacion
. En el método main creará un objeto de cada uno de los juegos mencionados.
. A continuación llama los métodos muestraNombre, muestraInfo y juega de cada uno de los tres objetos creados.
# Parte 2:
## Clase Aplicacion
## Método eligeJuego
- Método público y estático que no toma parámetros y devuelve un objeto del tipo Jugable.
- Crea un objeto de cada uno de los tres juegos implementados.
- Crea un array de tres elementos de tipo interfaz Jugable.
- Rellena este array con los objetos creados para los distintos juegos.
- A partir de este momento, sólo se trabajará con este array de tipo interfaz Jugable para referirse a cualquiera de los juegos.
- Muestra un menú por pantalla con el nombre de los tres juegos y pide al usuario que elija un juego introduciendo un número entre 0 y 2. Si el número introducido no es válido, seguirá pidiendo al usuario un número válido.
- Devuelve el elemento del array correspondiente al número introducido por el usuario.
## Método main
- Llama al método eligeJuego para obtener una referencia de tipo interfaz Jugable al juego seleccionado por el usuario.
- Llama al método muestraNombre de este juego.
- A continuación llama al método muestraInfo del juego.
- Llama al método juega del mismo para comenzar una nueva partida.
- Finalmente, tras concluir la partida, pregunta al usuario si desea jugar de nuevo y en caso afirmativo vuelve a repetir los pasos anteriores. 
