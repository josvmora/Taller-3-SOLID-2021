# Taller-3-SOLID-2021

##Literal 1
En el caso de Helado y Pastel, ambos son postres pero se viola el principio de Open-Close (OCP) que me genera un problema si yo deseo añadir una nueva variedad de postre, ya que tendría que reescribir todo.
La solución fue crear una clase padre llama 'Postre', así no tengo que modificar a la clase base y queda abierto a extender cada que se requiera añadir un nuevo producto.

##Literal 2
aquí se incumplía DIP Dependency Inversion Principle, porque ambas clases (antes de la modificación) dependían de la clase Operaciones Aderezo, dentro de otro paquete. Por esto, se crea un método dentro de postre porque para todos los postres es válido añadir un aderezo, así me ahorro de importar el paquete y la llamada a la función es más sencilla.
