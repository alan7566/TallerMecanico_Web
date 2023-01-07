# TallerMecanico_Web
Mismo proyecto pero version web

# Taller Mecanico

Se desea realizar una aplicación que permita a los mecánicos de un taller, registrar, consultar y actualizar los trabajos (reparaciones y revisiones) que han sido realizados o que están en proceso de realización en el taller para todos los Clientes.

---

Los **Clientes** son personas naturales que poseen un Vehículo. Cuando el
Cliente lleva el Vehículo al taller, se crea un trabajo para el Vehículo del cliente. Cada trabajo se identifica por su“código de trabajo”. El código del trabajo es un
número que se asocia con el trabajo en el momento que se registra. Genere de manera automática un sistema de códigos consecutivos para cada uno de los
trabajos.

Todos los trabajos incluyen el número de horas que van siendo necesarias para su realización. Al crear un trabajo el número de horas por defecto es de cero (0).
El número de horas irá aumentando a medidas que los mecánicos van dedicando tiempo a realizar la reparación o revisión. Cuando el trabajo se termina, se
marca como **“finalizado”** y el número de horas no puede volver a cambiarse. Todos los trabajos incluyen el precio del material utilizado (piezas o pintura), los
trabajos pueden ser revisión o reparación, en la revisión se hace un diagnóstico y se cotiza el trabajo a realizar, en la reparación se incluyen los materiales y su
precio, inicialmente el precio de los materiales es cero (0) y va aumentando a medida que los mecánicos van utilizando material. Una vez que la reparación se
marca como **“finalizada”** no se puede cambiar el precio del material utilizado.

La mano de obra a cobrar por cada trabajo se compone de una parte fija que resulta de multiplicar el número de horas empleadas por el valor de la hora
(**$12.000**).

---

#### Además, dependiendo del tipo de trabajo el costo varía de la siguiente manera:

- Mecánica: su precio se calcula con un valor fijo más el costo del material multiplicado por 1.1
- Latonería y Pintura: su precio se calcula con un valor fijo más el costo del material multiplicado por 1.3
- Revisión: su precio se calcula con un valor fijo.

El sistema debe tener una lista de materiales predefinidos con su nombre descripción y valor. La lista se puede actualizar (agregando un material o modificando un existente).

El taller maneja unos plazos máximos en los que deberían estar terminados los trabajos, los plazos son: **21 días** para reparaciones de latonería y pintura, **14 para
reparaciones mecánicas y 7 para revisiones.**

---

#### La aplicación debe permitir realizar al menos las siguientes **operaciones**:

* [ ]  Registrar un trabajo
* [ ]  Registrar un Cliente y su Vehículo
* [ ]  Aumentar el número de horas a un trabajo
* [ ]  Agregar material a un trabajo
* [ ]  Cambiar el estado del trabajo
* [ ]  Finalizar un trabajo
* [ ]  Mostrar un trabajo
* [ ]  Consultar el plazo máximo
* [ ]  Una lista de todos los trabajos donde se muestran todos los datos, incluyendo: horas, precio, plazo y valor.
* [ ]  Buscar trabajo o cliente por su código o cedula, una lista de todos los clientes.
* [ ]  Plazos
* [ ]  Realizar los calculos

Y otras operaciones que usted identifique necesarias para la solución al problema u otras que de manera creativa usted puede agregar.
