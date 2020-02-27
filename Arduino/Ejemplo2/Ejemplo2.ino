int intDelay = 200;
int serie = 0;
void setup() {
  // initialize digital pin LED_BUILTIN as an output.
  pinMode(13, OUTPUT);
  pinMode(12, OUTPUT);
  pinMode(11, OUTPUT);
}

// the loop function runs over and over again forever
void loop() {
  serie++;
  if (serie == 3){
    serie1();
  }else if (serie==6){
    serie2();
  }else if (serie > 6){
    serie=0;
  }
}

void serie1(){
  digitalWrite(13, HIGH);
  delay(intDelay);
  digitalWrite(13, LOW);
  delay(intDelay);
  digitalWrite(12, HIGH);
  delay(intDelay);
  digitalWrite(12, LOW);
  delay(intDelay);
  digitalWrite(11, HIGH);
  delay(intDelay);
  digitalWrite(11, LOW);
  delay(intDelay);
}

void serie2(){
  digitalWrite(13, HIGH);
  digitalWrite(11, HIGH);
  delay(intDelay);
  digitalWrite(11, LOW);
  digitalWrite(13, LOW);
  delay(intDelay);
  digitalWrite(12, HIGH);
  delay(intDelay);
  digitalWrite(12, LOW);
  delay(intDelay);
}
