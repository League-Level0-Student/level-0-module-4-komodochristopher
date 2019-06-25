import ddf.minim.*;          //at the very top of your sketch
AudioSample woohooSound;          //at the top of your sketch
boolean playSound = true;          //at the top of your sketch




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
  
  Minim minim = new Minim(this);     
woohooSound = minim.loadSample("Homer Simpson woohoo sound effect.mp3"); 

}

void draw() {

  if ((dist(0, 0, mouseX, mouseY)<30)) {
    if (playSound) {
     woohooSound.trigger();
     playSound = false;
}

    background(donkey);


    rect(530, 185, 40, 40);
   
  } else { 
    background(0, 60, 0);
  } 


 
  if (mousePressed) {
    tailX = mouseX-100;
    taily = mouseY-30;
    if(dist(560,205,mouseX-100,mouseY-30)<20) {
        if (playSound) {
     woohooSound.trigger();
     playSound = false;
    }
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
