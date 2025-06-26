import java.lang.Math;

//isInstanceOf

abstract class Shape {
    abstract float calculateArea(Shape inObj);
    abstract float calculatePerimeter(Shape inObj);
}

class Circle extends Shape {
    float radius;

    float calculateArea(Shape inObj)
    {
        return  Math.PI * Math.pow(inObj.radius, 2);
    }

    float calculatePerimeter(Shape inObj)
    {
        return  2.0 * Math.PI * inObj.radius;
    }
}

class Rectangle extends Shape {
    int length,width;

    float calculateArea(Shape inObj)
    {
        return  inObj.length * inObj.width;
    }

    float calculatePerimeter(Shape inObj)
    {
        return  2.0 * (inObj.length + inObj.width);
    }
}

class Triangle extends Shape{
    int side1,side2,side3;

    float calculateArea(Shape inObj)
    {
        return  Math.sqrt(Math.pow(inObj.side1,2) +
                Math.pow(inObj.side2,2) +
                Math.pow(inObj.side3,2));
    }

    float calculatePerimeter(Shape inObj)
    {
        return  inObj.side1 + inObj.side2 + inObj.side3;
    }
}

public class AbstractClass {
}
