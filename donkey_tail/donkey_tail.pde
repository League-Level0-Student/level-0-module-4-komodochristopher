PImage donkey;

void setup() {
  
  donkey =loadImage("donkey.jpg");
   size(1400, 880);
  background(0,250,0);
  
}

void draw() {
image(donkey,0,0,1400,880);  
}
