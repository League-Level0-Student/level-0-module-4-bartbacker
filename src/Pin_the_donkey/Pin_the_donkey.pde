import ddf.minim.*;          //at the very top of your sketch
AudioSample woohoo;          //at the top of your sketch
boolean playSound = true;  //at the top of your sketch
int X = -30;
int Y = -30;
PImage donkey;
PImage tail;
PImage W;
void setup(){
  Minim minim = new Minim(this);     //In the setup method
woohoo = minim.loadSample("/Users/League/Google Drive/league-sounds/homer-woohoo.wav");     //In setup. Change the file name if you need to
W = loadImage("http://michaelhilton.org.uk/wp-content/uploads/2014/09/white.jpg");
tail = loadImage("http://clipart.coolclips.com/480/vectors/tf05062/CoolClips_anim1180.png");  
  size(800,750);
  W.resize(800,750);
  tail.resize(100,200);
}
void draw(){
  background (W);
image(tail, X-60, Y-20);
  rect(0, 0, 30, 30);
  if(dist(0, 0, mouseX, mouseY) < 30){
   donkey = loadImage("https://cdn.britannica.com/s:300x300/68/143568-004-DF87F418.jpg");
   donkey.resize(800,750);
   background (donkey);
   rect(700, 300, 40, 40);
   textSize(24);
text("Pin tail on donkay!",100,20);
}
if(mousePressed){
  X = mouseX;
  Y = mouseY;
}
if(mousePressed == X >= 700 && Y >= 300){
  woohoo.trigger();
  playSound = false;
}
}