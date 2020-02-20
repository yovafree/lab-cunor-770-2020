Proceso n_numeros_primos
	Escribir "Ingrese la cantidad de números a mostrar:"
	Leer n
	x<-0
	cont<-0
	siPrimo <- 0
	
	Repetir
		cont<-cont+1
		siPrimo <- 0
		Para z<-1 Hasta cont Con Paso 1 Hacer
			res <- cont%z
			
			Si res=0 Entonces
				siPrimo<-siPrimo+1
			Fin Si
		Fin Para
		
		Si siPrimo = 2 Entonces
			x<-x+1
			Escribir x , " -> ", cont
		FinSi
	Hasta Que x=n
FinProceso
