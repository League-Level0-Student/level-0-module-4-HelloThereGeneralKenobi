PImage donkey;
PImage tail;
int urmom;
int urdad;
boolean urmomdad = false;

void setup() {
donkey = loadImage("DONKEYWHATAREYOUDOINGINMASWAMP.png");
tail = loadImage("tail.png");
size(551,405);
tail.resize(100,100);

}

void draw() {
rect(0, 0, 30, 30);
rect(454, 75, 40, 40);
if(dist(0, 0, mouseX, mouseY) < 30) {
  background(donkey);
}
else {
 background(0,200,0); 
}
if(mousePressed) {
  int urmom = mouseX - 50;
  int urdad = mouseY - 50;
  background(donkey);
  if(mouseX > 454 && mouseX < 494 && mouseY > 75 && mouseY < 115) {
    image(tail,urmom,urdad);
  }
  
}
//else {
 //urmom = 1000;
 //urdad = 1000;
//}
}