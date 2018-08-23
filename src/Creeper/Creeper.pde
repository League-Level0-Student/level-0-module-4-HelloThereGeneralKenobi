PImage Creeper;

void setup() {
size(800,600);
Creeper = loadImage("Creeper.jpg");
Creeper.resize(800,600);
background(Creeper);
}
void draw() {
if(mousePressed) {
 background(Creeper);
 fill(100,0,0);
 ellipse(mouseX, mouseY, 50, 50);
 if(isNear(50,50)) {
    fill(0,100,0);
 ellipse(mouseX, mouseY, 50, 50);
}
}
else {
  background(Creeper);
 fill(100,0,0);
 ellipse(mouseX, mouseY, 50, 50); 
}
}

boolean isNear(int a, int b) {
if (abs(a - b) < 10)
     return true;
else
     return false;
}