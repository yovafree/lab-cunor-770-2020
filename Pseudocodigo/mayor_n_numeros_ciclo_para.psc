Proceso sin_titulo
	Escribir "Ingrese la cantidad de n�meros que desea comprobar:"
	Leer n
	
	Escribir "Ingrese el n�mero 1:"
	Leer x
	
	Para z<-2 Hasta n Con Paso 1 Hacer
		Escribir "Ingrese el n�mero ", z,":"
		Leer k
		Si k>x Entonces
			x<-k
		Fin Si
	Fin Para
	
	Escribir "El n�mero mayor es: ", x
FinProceso
