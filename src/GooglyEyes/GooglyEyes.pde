void setup() {
size(800,600);
background(#D8D6D6);
}

void draw() {
int urmom = mouseX;
int urdad = mouseY;
 fill(#FFFFFF);
ellipse(300,300,200,200);
ellipse(600,300,200,200);
fill(#000000);
if(mouseX < 250) {
  urmom = 250;
}
if(mouseX > 350) {
 urmom = 350; 
}
if(mouseY < 250) {
 urdad = 250; 
}

if(mouseY > 350) {
 urdad = 350; 
}
  ellipse(urmom,urdad,50,50);
  ellipse(urmom + 300, urdad, 50,50);
}