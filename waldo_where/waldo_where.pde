int x=0;
int y=0;
PImage waldo;
void setup() {
  
  waldo =loadImage("waldo.jpg"); // Change this to match your file name.
  size(1400, 880);
  background(0,250,0);

  doh = minim.loadSample("doh.mp3"); //drag and drop from project onto sketch
  woohoo = minim.loadSample("wooho.mp3"); //drag and drop from project onto sketch } 
}

void draw() {
  image(waldo,0,0,1400,880);
 
  x=mouseX;
  y=mouseY;
  
  ellipse(360,360,30,30);
  
  
  
  
  
  
      // Use this print statement to find out the coordinates of Waldo
      // println("X: " + mouseX + " Y: " + mouseY); 

      // If the mouse is on Waldo, print “Waldo found!”

      // If Waldo is found, also use the method below to play “Woohoo”
      // Change the name of the sound file if you need to 
      // If the mouse is pressed and they’re not on Waldo, play “Doh”
      // Change the name of the sound file if you need to 
}

void playWoohoo() {
     woohoo.stop();
     woohoo.trigger();
}

void playDoh() {
     doh.stop();
     doh.trigger();
}

import ddf.minim.*;
Minim minim = new Minim(this); 
AudioSample doh;
AudioSample woohoo;
