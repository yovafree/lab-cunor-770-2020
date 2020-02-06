Proceso sin_titulo
	Escribir "Ingrese la cantidad de números que desea comprobar:"
	Leer n
	
	Escribir "Ingrese el número 1:"
	Leer x
	
	Para z<-2 Hasta n Con Paso 1 Hacer
		Escribir "Ingrese el número ", z,":"
		Leer k
		Si k>x Entonces
			x<-k
		Fin Si
	Fin Para
	
	Escribir "El número mayor es: ", x
FinProceso
