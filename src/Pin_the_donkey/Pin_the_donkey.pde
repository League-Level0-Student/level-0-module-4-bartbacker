PImage donkey;
PImage tail;

void setup(){
  
donkey = loadImage("https://cdn.britannica.com/s:300x300/68/143568-004-DF87F418.jpg");     
tail = loadImage("https://thetailcompany.com/wp-content/uploads/2017/01/Donkey-tail.jpg");  
  size(300,206);
}
void draw(){
  
  background (donkey);
image(tail, mouseX, mouseY);
  rect(0, 0, 30, 30);
  rect(454, 75, 40, 40);
}