PImage catPic;
int accel = 2;
int x=298;
int y=296;
int x1=401;
int y1=240;
void setup(){
 size(700,500); 
 catPic=loadImage("cat.png");
 catPic.resize(width, height);
 background(catPic);
}
void draw(){
if(mousePressed){
        println("Mouse’s x-position: " + mouseX + "\n" + "Mouse’s y-position: " + mouseY + "\n");}
fill(255,0,0);
noStroke();
ellipse(x, y, 50, 50);
ellipse(x1, y1, 50, 50);
}
void keyPressed() {
  
    x1+=2*accel;
    y1+=2*accel;
    x+=2*accel;
    y+=2*accel;

}

 
