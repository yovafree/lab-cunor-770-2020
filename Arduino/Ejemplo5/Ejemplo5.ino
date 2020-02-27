
int led = 0;
int pin = 13;
int sentido = 1;
int rebote = 0;
void setup() {
  pinMode(13,OUTPUT);
  pinMode(12,OUTPUT);
  pinMode(11,OUTPUT);
  pinMode(10,INPUT);
}

void loop() {
  int lectura = digitalRead(10);
  if (lectura == 1 && rebote==0){
    rebote=1;
    led++;
    if (led>3){
      led==0;
    }
  }
  if (lectura == 0 && rebote ==1){
    rebote=0;
  }

  
  
  if (led == 1){
    pin = 13;
  }
  
  if (led==2){
    pin = 12;
  }
  
  if (led==3){
    pin = 11;
  }
  
  digitalWrite(pin,HIGH);
  delay(400);
  digitalWrite(pin,LOW);
  delay(400);
}
