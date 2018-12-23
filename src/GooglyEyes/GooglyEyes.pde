PImage face;
void setup(){
face = loadImage("https://www.lifewire.com/thmb/vDB3ply4rHJG_BDWeD0AbuRu-EU=/768x0/filters:no_upscale():max_bytes(150000):strip_icc()/Simpsons_09_Homer_V2F_hires1-56e1eccc5f9b5854a9f89a63.jpg");
size(800,600);
face.resize(800,600);
background(face);
}
void draw(){
background(face);
fill(255,255,255);
ellipse(405,130,65,45);
fill(0,0,0);
ellipse(mouseX+60,mouseY,10,10);
fill(255,255,255);
ellipse(345,130,65,45);
fill(0,0,0);
ellipse(mouseX,mouseY,10,10);
if(mouseX > 345 + 20){
  mouseX = 365;
}
  if(mouseX < 345 - 20){
  mouseX = 321;
}
if(mouseY > 130 + 20){
  mouseY = 135;
}
if(mouseY < 130 - 20){
  mouseY = 130;
}
}
  