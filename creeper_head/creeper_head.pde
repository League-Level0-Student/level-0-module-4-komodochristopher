
int clickerX=0;
int clickerY=0;
int x=56;
int y=400;

PImage creeperhead;
PImage creeper;


void setup() {

creeper= loadImage("creeper.jpg");
size(1000,1000);
creeperhead = loadImage("creeperhead.png");
creeperhead.resize(4,4);
creeper.resize(1000,1000);
}

void draw(){
 background(creeper);
  image(creeperhead,x,y);
  if((dist(56,400,clickerX,clickerY)<40)){
      System.out.println("you have found the creeper!!!");
  fill(#00FC12);
  }else{
    fill(#FC004C);

  }
  ellipse(clickerX,clickerY,4,4);

  if(mousePressed) {
clickerX = mouseX;
clickerY = mouseY;
if(clickerX>0){

  
}
}
  
  
  }
  
 
  
  
 
  
  
  boolean isNear(int a, int b) {
if (abs(a - b) < 10)
     return true;
else
     return false;
  }
