import processing.core.PApplet;

public class Sketch extends PApplet {
	
	
  /**
   * Called once at the beginning of execution, put your size all in this method
   */
  public void settings() {
	// Size of the sketch
    size(400, 400);
  }

  /** 
   * Colour of the background
   */
  public void setup() {
    background(255, 255, 255);
  }

  /**
   * Called repeatedly, anything drawn to the screen goes here
   */
  public void draw() {
	  
	// Vertical lines for quadrant 2
    stroke(0);
    strokeWeight(2);
    for (int intLineX = width / 20; intLineX < width / 2; intLineX+= width / 20){
      line(intLineX, 0, intLineX, width / 2);
    }

    // Horizontal lines for quadrant 2
    for (int intLineY = height / 20; intLineY <= height / 2; intLineY+= height / 20){
      line(0, intLineY, height / 2, intLineY);
    }
   
    // Rows of circles in quadrant 1
    strokeWeight(1);
    fill(194, 19, 162);
    for (double dblEllipseA = width * 23 / 40; dblEllipseA <= width * 19 / 20; dblEllipseA+= width * 7 / 80){
      for (double dblEllipseB = height * 3 / 40; dblEllipseB <= height * 9 / 20; dblEllipseB+= height * 7 / 80){
      ellipse((int)dblEllipseA, (int)dblEllipseB, width / 20, height / 20);
    }
  }

    // Gradient in quadrant 3
    for (int intGradientColour = 0; intGradientColour <= width / 2; intGradientColour++){
      stroke((int)(intGradientColour * 255 * 2 / width));
      line(intGradientColour, height / 2, intGradientColour, height);
      }
      
    // The flower petals in quadrent 4
    for (int intPetalNum = 0; intPetalNum < 8; intPetalNum++){
      fill(255, 165, 0);
      pushMatrix();
      translate((float)(0.75 * width), (float)(height * 0.75));

      rotate (-intPetalNum * PI/4);
      translate((float)(width / 12), 0);
      strokeWeight(2);
      ellipse(0, 0, (float)(width / 6), (float)(height / 22));
      popMatrix();
    }

    // Middle section of the flower
    strokeWeight(0);
    fill(32, 92, 34);
    ellipse((width / 4) * 3, (height / 4) * 3, width / 10, width / 10);

  }

}
  