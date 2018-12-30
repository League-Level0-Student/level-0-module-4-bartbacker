PImage minecraft;
PImage creeper;
void setup(){
size(750,600);
PImage minecraft = loadImage("https://pm1.narvii.com/6729/85c790a46e1f56649f132aa18c68bfbbe3823823v2_hq.jpg");
minecraft.resize(750,600);
background(minecraft);
creeper = loadImage("http://images6.fanpop.com/image/photos/32700000/Creeper-the-minecraft-creeper-32729200-1200-1200.png");
creeper.resize(100,100);

}
void draw(){
  image(creeper, mouseX-50, mouseY-50);
  
  
  
  
  
}