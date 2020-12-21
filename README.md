Ejercicio:

Dentro del paquete comunidadpropietario crea las siguientes clases:

Una clase Finca que sea comparable y que represente los inmuebles o fincas de une dificio.
esta clase tendrá los métodos siguientes:

· String getNombre() -> este método devuelve el nombre de la finca

· String getTipo() -> este método devuelve el tipo de finca

· Double getCuota() -> este método devuelve la cuota de participación

· String toString() -> este método devuelve la representación de "[Nombre: nombreFinca, Tipo: tipoFinca, cuota: cantidadCouta]"

· int compareTo(Object obj) -> este método compara los nombres del objecto actual con el pasado por parámetro donde devuelve lo siguiente:
#  0 si el nombre del objecto actual y el parámetro es igual
#  1 si el nombre del objecto actual es mayor que el parámetrro
# -1 si el nombre del objecto actual es menor que el parámetrro

· boolean equals(Object obj) -> este método devuelve:
# True: si dos fincas son iguales por su nombre
# False: si dos fincas son distintas por su nombre



Una clase Propietario. Esta clase tendrá los siguientes métodos

· String getNombre() -> este mñétodo devuelve el nombre del propietario
· void addFinca() -> este método añade una finca a un propietario
· void removeFinca(String nombre) -> este método elimina una finca del propietario
· List<Finca> getFinca -> este método devuelve una lista de las fincas del propietario
· double cuotaTotal -> este método devuelve la cuota total que debe pagar el popietario por sus fincas
· String toString() -> este método deuvelve la representación del popietario en el siguiente formato:
# "NombrePropietario: 
   1-Finca
   2-Finca
   3-Finca
   ...
   "



 fuera del paquete comunidadpropietario crea y prueba los objectos anteriores eun método principal.
