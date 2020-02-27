int led = 13, sentido=1, pausa=200;
int cont = 0;
int programa = 1;
void setup() {
  pinMode(13,OUTPUT);
  pinMode(12,OUTPUT);
  pinMode(11,OUTPUT);
}

void loop() {
  cont++;
  if (programa==1){
    subprograma1();
  }
  
  if(programa==2){
    subprograma2();
  }

  if (cont==5){
    cont=0;
    if (programa==1){
      programa=2;
    }else if (programa==2){
      programa=1;
    }
  }
}

void subprograma1(){
  digitalWrite(led,1);
  delay(pausa);
  digitalWrite(led,0);
  delay(pausa);
  
  if (sentido == 1){
    led--;
    if (led==10){
      led=12;  
      sentido=2;
    }
  }else if(sentido ==2){
    led++;
    if (led==14){
      led=12;  
      sentido=1;
    }
  }  
}

void subprograma2(){
  digitalWrite(13,1);
  digitalWrite(11,1);
  delay(pausa);
  digitalWrite(13,0);
  digitalWrite(11,0);
  delay(pausa);
  digitalWrite(12,1);
  delay(pausa);
  digitalWrite(12,0);
  delay(pausa);
    
}
