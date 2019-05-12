PImage face;
    void setup(){
        size(400,600);
        background(0,255,0);
         face = loadImage("mario-2-1.png");
           face.resize(300,300);        
    }

    void draw(){
     
    background(0,250,0);                
   fill(255,255,255);
   image(face, 60, 200);
      ellipse(175,350,50,50);
       ellipse(250,350,50,50);
    
    
    fill(0,0,0);
       ellipse(mouseX+80,mouseY,20,20);
        
    ellipse(mouseX,mouseY,20,20);
        if(mousePressed);
       
                                
    }
    
