//Make a variable to hold the X co-ordinate of the dot and set it to void setup() {
int x = 100;
  void setup() {
    size(800, 200);
    
  }

void draw() {
    //make it a nice color
    background(#3CACF0);
fill(#FC4F8C);
    //if the mouse is pressed...
if(mousePressed){
    //... change the X co-ordinate so that the dot moves to the right
    x++;
}
    //Draw an ellipse of height and width 10Make sure to use your variable for the X position.
    ellipse( x , 100, 10, 10);
    //Make your dot move really fast so that it can win the race 
       // (you have to figure out what part of your code to change)
    //Use this method to play a ding when your dot crosses the finish line. 
}

import ddf.minim.*;
boolean soundPlayed = false;
void playSound() {
    if (!soundPlayed) {
        Minim minim = new Minim(this);
        AudioSample sound = minim.loadSample("ding2.wav");
        sound.trigger();
        soundPlayed = true;
    }
}
