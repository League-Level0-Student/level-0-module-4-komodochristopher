

int x=56;
int y=400;

PImage creeperhead;
PImage creeper;
void setup() {

creeper= loadImage("creeper.jpg");
size(1000,1000);
creeperhead = loadImage("creeperhead.png");
creeperhead.resize(4,4);
}

void draw(){
 image(creeper,0,0,1000,1000);
  image(creeperhead,x,y);
  ellipse(mouseX,mouseY,7,7);
  fill()
  
 
  
  
  
  
  
}
