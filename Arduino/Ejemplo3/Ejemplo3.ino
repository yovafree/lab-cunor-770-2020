int led = 13, sentido=1, pausa=200;

void setup() {
  pinMode(13,OUTPUT);
  pinMode(12,OUTPUT);
  pinMode(11,OUTPUT);
}

void loop() {
  digitalWrite(led,1);
  delay(pausa);
  digitalWrite(led,0);
  delay(pausa);
  
  if (sentido == 1){
    led--;
    if (led==10){
      led=11;  
      sentido=2;
    }
  }else if(sentido ==2){
    led++;
    if (led==14){
      led=13;  
      sentido=1;
    }
  }
  
}
