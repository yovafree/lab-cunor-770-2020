int intDelay = 200;
void setup() {
  // initialize digital pin LED_BUILTIN as an output.
  pinMode(13, OUTPUT);
  pinMode(12, OUTPUT);
  pinMode(11, OUTPUT);
}

// the loop function runs over and over again forever
void loop() {
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
