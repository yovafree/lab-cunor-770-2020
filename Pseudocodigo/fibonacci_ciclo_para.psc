Proceso sin_titulo
	a<-1
	b<-0
	Escribir "Ingrese cuantos números fibonacci desea: "
	Leer k
	
	Para x<-1 Hasta k Con Paso 1 Hacer
		Escribir b
		aux <- a+b
		a<-b
		b<-aux
	Fin Para
FinProceso
