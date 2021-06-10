# Taller-3-SOLID-2021

##Literal 1
En el caso de Helado y Pastel, ambos son postres pero se viola el principio de Open-Close (OCP) que me genera un problema si yo deseo añadir una nueva variedad de postre, ya que tendría que reescribir todo.
La solución fue crear una clase padre llama 'Postre', así no tengo que modificar a la clase base y queda abierto a extender cada que se requiera añadir un nuevo producto.

##Literal 2
aquí se incumplía DIP Dependency Inversion Principle, porque ambas clases (antes de la modificación) dependían de la clase Operaciones Aderezo, dentro de otro paquete. Por esto, se crea un método dentro de postre porque para todos los postres es válido añadir un aderezo, así me ahorro de importar el paquete y la llamada a la función es más sencilla.

##Literal 5
En base al principio de Sustitucion de Liskov, se cambio la Herencia con respecto a las clases en el paquete "Leche", dado que el metodo "usarPastel()" de la clase padre "LecheEntera" resultaba sobrante en la clase hija "LecheDeslactosada", al tener metodos de mas rompe el principio de Sustitucion de Liskov al no poder sustituir las clases "LecheEntera" con "LecheDeslactosada". Por esto se creo una clase padre "Leche" la cual hereda el metodo "usarPostre" al resto de clases para asi evitar errores al usar el manejador de Leche.
