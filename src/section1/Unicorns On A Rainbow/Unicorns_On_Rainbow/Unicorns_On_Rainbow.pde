PImage rainbow;
PImage unicorn;
void setup() {
rainbow = loadImage("rainbow_.jpg");
unicorn = loadImage("unicorn.png");
size(800, 600);
rainbow.resize(width,height);

}

void draw() {
  background(rainbow);
  if(mousePressed){
  image(unicorn, mouseX-200, mouseY-150);
  }
  
}
