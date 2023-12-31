package triangle;


public class Triangle {


   private double side1;
   private double side2;
   private double side3;

    public Triangle(double side1, double side2, double side3)throws IllegalTriangleException {
        if(!isValidTriangle(side1, side2, side3)){
            throw new IllegalTriangleException("Invalid Triangle");
        }
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }
    
    private boolean isValidTriangle(double side1, double side2, double side3){
        return ((side1+side2)>side3)&&((side2+side3)>side1)&&((side3+side1)>side2);
    }    
}

   class IllegalTriangleException extends Exception

{
     public IllegalTriangleException(String message){
         super(message);
     }
}
