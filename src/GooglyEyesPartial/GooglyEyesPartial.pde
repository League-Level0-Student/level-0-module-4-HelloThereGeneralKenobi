void setup() {
size(800,600);
background(#D8D6D6);
}

void draw() {
 fill(#FFFFFF);
ellipse(300,300,200,200);
ellipse(600,300,200,200);
fill(#000000);
if(mouseX < 250) {
  ellipse(400,400,50,50);
}
else {
  ellipse(mouseX,mouseY,50,50);
}
if(mouseX > 350) {
  mouseX = 350;
}
ellipse(mouseX + 300,mouseY,50,50);
}