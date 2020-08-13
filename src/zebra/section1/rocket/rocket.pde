int rocketX = 400;
int rocketY = 600;
int x = (int)random(50,800);
int y = 50;

void setup() {
  background(0, 0, 40);
  size(800, 800);
}

void draw() {
  background(0, 0, 0);
  fill(255, 255, 255);
  x=x;
  y=y+10;
  // 1. ▼ Write code BELOW this line to make stars ▼ 
  //    Example:
  fill(#FFF703);
  circle(x, y, 50);
  if(y>800){
    y=50;
    x = (int)random(50,700);
  }




  

  fill(random(255), 0, 0);
  circle(rocketX, rocketY + 130, 90);
  fill(248, 128, 0);
  circle(rocketX, rocketY + 115, 70);
  fill(255, 153, 0);
  circle(rocketX, rocketY + 95, 35);
  fill(100, 100, 100);
  triangle(rocketX, rocketY + 10, rocketX + 50, rocketY + 100, rocketX - 50, rocketY + 100);
  // 2. ▼ Write code BELOW this line to make the rocket blast off ▼ 
    
 


  

}
