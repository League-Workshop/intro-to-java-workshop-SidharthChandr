PImage mustache;
PImage friend;
void setup() {
friend = loadImage("face.jpg");
mustache = loadImage("mustace.png");
size(800, 600);
friend.resize(width,height);
}

void draw() {
background(friend);
if(mouseButton == LEFT){
  image(mustache, mouseX-125, mouseY-100);
}
if (mouseButton == RIGHT){
  image(mustache,250,100);
}


}
