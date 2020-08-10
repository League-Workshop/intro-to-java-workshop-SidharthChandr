

void setup() {
  size(600,600);
}

void draw() {
  background(0,255,0);
  if (mousePressed) {
        fill(0,0,255);
        ellipse(300,300,90,90);
  
} else {
    fill(255,0,0);
    rect(200,250,200,90);
        // fill with a different color here
}
  
  
}
