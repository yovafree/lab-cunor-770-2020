Proceso sin_titulo
	Escribir "Ingrese el multiplicando: "
	Leer n1
	Escribir "Ingrese el multiplicador: "
	Leer n2
	tot<-0
	
	Si n2>0 & n1>0 | n2<0 & n1<0  Entonces
		Si n1<0 & n2<0 Entonces
			Para x<-n2 Hasta -1 Con Paso 1 Hacer
				tot<-tot+n1
			Fin Para
		Sino
			Para x<-1 Hasta n2 Con Paso 1 Hacer
				tot<-tot+n1
			Fin Para
		FinSi
		
	Sino
		Si n1<0 Entonces
			Para x<-1 Hasta n2 Con Paso 1 Hacer
				tot<-tot+n1
			Fin Para
		Sino
			Para x<-n2 Hasta -1 Con Paso 1 Hacer
				tot<-tot+n1
			Fin Para	
		FinSi
		
	Fin Si
	
	
	Escribir "El resultado de: ",n1, " * ", n2, " = ", tot
FinProceso
