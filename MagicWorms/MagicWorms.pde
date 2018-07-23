
void setup() {
  size (300,300);
  background(300,200,300);
}
void draw(){
fill(0,200,300);
noStroke();
ellipse(getWormX(150),getWormY(150),20,20);  
fill(0,300,200);
ellipse(getWormX(300),getWormY(100),20,20);
fill(100,200,200);
ellipse(getWormX(100),getWormY(500),20,20);
fill(130,200,300);
ellipse(getWormX(250),getWormY(250),20,20);
}

float frequency = .001;
float noiseInterval = PI;

void makeMagical() {
     fill( 0, 0, 0, 10 );
     rect(0, 0, width, height);
     noStroke();
}

float getWormX(int i) {
     return map(noise(i*noiseInterval + frameCount * frequency), 0, 1, 0, width);
}

float getWormY(int i) {
     return map(noise(i*noiseInterval+1 + frameCount * frequency), 0, 1, 0, height);
}