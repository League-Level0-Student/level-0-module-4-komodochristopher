int x=0;
int y=0;
PImage face;
void setup() {
  size(400, 600);
  background(0, 255, 0);
  face = loadImage("mario-2-1.png");
  face.resize(300, 300);
}

void draw() {
 x=mouseX;
 y=mouseY;
 if(x<160){
   x=160;
 }
 
  
 
 if(y>360){
   y=360;
 }
  if(x>190){
   x=190;
 }
 if(y<340){
   y=340;
 }
  background(0, 250, 0);                
  fill(255, 255, 255);
  image(face, 60, 200);
  ellipse(175, 350, 50, 50);
  ellipse(250, 350, 50, 50);


  fill(0, 0, 0);
  ellipse(x+80, y, 20, 20);

  ellipse(x, y, 20, 20);


  if (mousePressed);
}
