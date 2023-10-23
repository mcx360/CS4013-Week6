package tutorial4;

public class Rectangle extends GeometricObject{
    private double width;
    private double height;

    public Rectangle(){

    }

    public Rectangle(double width,double height){
        this.height = height;
        this.width = width;
    }

    public double getArea(){
        return width*height;
    }

    public double getPerimeter(){
        return (width*2)+(height*2);
    }

    @Override
    public String toString(){
        return "Area: "+getArea()+"\nPerimeter: "+getPerimeter();
    }
}
