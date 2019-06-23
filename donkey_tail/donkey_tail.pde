int tailX = 0;
int taily = 0;

PImage donkey;
PImage tail;
void setup() {

  donkey =loadImage("donkey.jpg");
  tail=loadImage("donkey_tail.png");
  size(640, 557);
  tail.resize(200, 300);
  background(0, 250, 0);
}

void draw() {

  if ((dist(0, 0, mouseX, mouseY)<30)) {

    background(donkey);


    rect(530, 185, 40, 40);
   
  } else { 
    background(0, 60, 0);
  } 
 println(mouseX +" " +mouseY);
 if(mousePressed) {
 if((dist(,) {
 
  if (mousePressed) {
    tailX = mouseX-100;
    taily = mouseY-30;
  }
  if (tailX>0) {
    image(tail, tailX, taily);
  } else {

    image(tail, mouseX-100, mouseY-30);
  }
  noStroke();
  fill(0, 60, 0);
  rect(0, 0, 30, 30);
}
 }
}
