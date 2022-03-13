# RepositorioJava
Uso de clases y polimorfismo con Java
Ejercicio de polimorfismo

Crear un proyecto java llamado Proyecto Final, en donde deberás tener 2 package uno llamado “Universidad” y otro “ejecutando”.

En el package “Universidad” cree las siguientes clases Carrera y Estudiante:

Atributos de la clase Carrera:

- codigo de tipo Integer
- nombre de tipo String
- asignaturas de tipo List de tipo String

La clase “Carrera”, deberá ser fuertemente encapsulada (métodos get y set), sus atributos deberán ser privados, adicionalmente cree en esta clase un constructor 
explicito que acepte 2 parámetros, código y nombre (de la carrera) e implemente el método toString.

Atributos de la clase Estudiante:

- nombre de tipo String

- edad de tipo Integer

- carrera de tipo Carrera

La clase estudiante, deberá ser fuertemente encapsulada (métodos get y set), sus atributos deberán ser privados, adicionalmente deberá crear en esta clase un constructor explicito que acepte, todos los parámetros de la clase.

Package “ejecutando”

Carreras

En la clase “EjecutandoSistema” del package “ejecutando”, deberás crear al menos 2 carreras, en primera instancia se crea el código y el nombre de la carrera y luego se añade sus asignaturas. Recuerda que las asignaturas son de tipo List.

En el método main vas agregar dichas asignaturas y luego que tengas tu lista terminada la asignaras a la instancia con el método set.

Estudiantes

Cree al menos 2 estudiantes, asignándole el nombre, edad y alguna de las 2 carreras creadas anteriormente.

Polimorfismo

Cree un método estático llamado “imprimir” que acepte por parámetro una variable de tipo Estudiante. El cual deberá imprimir el nombre del estudiante su edad y la carrera que está cursando.
