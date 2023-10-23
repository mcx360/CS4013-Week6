package tutorial4;

public class Triangle extends GeometricObject{
    private double s1 = 1.0;
    private double s2 = 1.0;
    private double s3 = 1.0;

    public Triangle(){

    }

    public Triangle(double s1,double s2,double s3){
        this.s1 = s1;
        this.s2 = s2;
        this.s3 = s3;
    }

    public double getArea(){
        double p = getPerimeter();
        return Math.sqrt(p*(p-s1)*(p-s2)*(p-s3));
    }

    public double getPerimeter(){
        return s1+s2+s3;
    }

    @Override
    public String toString(){
        return "Area: "+getArea()+"\nPerimeter: "+getPerimeter();
    }
    
}
