PImage donkey;
PImage tail;
int urmom;
int urdad;

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
}
else {
 urmom = 1000;
 urdad = 1000;
}
}