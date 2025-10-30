public class Rectangle  extends  Shape{
   private  double height;
   private  double width;

    public Rectangle(double height, double width) {
        this.height = height;
        this.width = width;
    }

    public  Rectangle (){

    }


    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    @Override
    public double calculateArea() {
        return width*height;
    }

    @Override
    public double calculateCircumference() {
        return 2*(width + height);
    }




}
