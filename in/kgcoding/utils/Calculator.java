package in.kgcoding.utils;

import in.kgcoding.geametry.Circle;
import in.kgcoding.geametry.Rectangle;

public class Calculator {
  public static void main(String[] args) {
    Circle cir = new Circle(5.5);
    Rectangle rect = new Rectangle(10, 5);

    double cirArea = Math.PI * Math.pow(cir.redius, 2);
    double rectArea = rect.length * rect.breadth;

    System.out.printf("Area of the circle is : %f , Area of the rectangle is : %f  " , cirArea , rectArea);
  }
}
