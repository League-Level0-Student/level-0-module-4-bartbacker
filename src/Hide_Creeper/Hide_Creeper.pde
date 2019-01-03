PImage minecraft;
PImage creeper;
PImage creeper2;
int x = 600 ;
int y = 550;
void setup(){
size(750,600);
PImage minecraft = loadImage("https://pm1.narvii.com/6729/85c790a46e1f56649f132aa18c68bfbbe3823823v2_hq.jpg");
minecraft.resize(750,600);
background(minecraft);
creeper = loadImage("http://images6.fanpop.com/image/photos/32700000/Creeper-the-minecraft-creeper-32729200-1200-1200.png");
creeper.resize(20,20);
}
void draw(){
 
  if(mousePressed){
   fill(250,0,0);
   ellipse(mouseX,mouseY,30,30);
   
  }
  if(mouseX < 50 && mouseY < 50){
  fill(0,250,0);
   ellipse(mouseX,mouseY,30,30);
   image(creeper, x,y);
  }
  if(mousePressed == mouseX > 595 && mouseY > 545){
  fill(0,250,0);
   ellipse(mouseX,mouseY,30,30);  
   text("u found creeper",300,300);
  }
  }
 boolean isNear(int a, int b) {
if (abs(a - b) < 10)
     return true;
else
     return false;
}
    
  
   


  