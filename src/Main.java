import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println("******************Circle****************");
        Circle c1 = new Circle();
        c1.setRadius(4.5);
        System.out.println("The circle radius: " +c1.getRadius()+"\n" + " and the area is = "
                + c1.calculateArea() + "\n"+" and its circumference = " + c1.calculateCircumference());


        System.out.println("\n");

        System.out.println("******************Rectangle****************");
        Rectangle r1 = new Rectangle(12,13);

        System.out.println("The rectangle width: " +r1.getWidth() +"\n"+ " and height: "+ r1.getHeight()+"\n"+
                " it is area = " + r1.calculateArea() + "\n"+" and its perimeter = " + r1.calculateCircumference());



        System.out.println();
        System.out.println();

        System.out.println("******************Triangle****************");
        Triangle t1 = new Triangle(5,7);


        System.out.println("The triangle height: " +t1.getHeight() +"\n"+ " and base: "+ t1.getBase()+"\n"+
                " it is area = " + t1.calculateArea()+"\n" + " and its perimeter = " + t1.calculateCircumference());


        // /////////////////////////////////////////////////////////////////////////////////////////////

    Scanner kb = new Scanner(System.in);
    System.out.println("Choose Your shape to calculate Area of shape and circumference of shape");
    System.out.println("1-Circle");
    System.out.println("2- Rectangle");
    System.out.println("3-Triangle");
    int userChoice = kb.nextInt();
    switch (userChoice) {

        case 1:
            Circle c2 = new Circle();
            System.out.println("enter the radius of circle");
            double radius = kb.nextDouble();
            c2.setRadius(radius);
            System.out.println("The circle radius: " + c2.getRadius() + "\n" + " and the area is = "
                    + c2.calculateArea() + "\n" + " and its circumference = " + c2.calculateCircumference());

            break;

        case 2:
            Rectangle r2 = new Rectangle();
            System.out.println("Enter high of rectangle");
            double h = kb.nextDouble();
            System.out.println("enter width of rectangle");
            double w = kb.nextDouble();
            r2.setHeight(h);
            r2.setWidth(w);
            System.out.println("The rectangle width: " + r2.getWidth() + "\n" + " and height: " + r2.getHeight() + "\n" +
                    " it is area = " + r2.calculateArea() + "\n" + " and its perimeter = " + r2.calculateCircumference());
            break;

        case 3:
            Triangle t2 = new Triangle();
            System.out.println("Enter high of triangle");
            double h2 = kb.nextDouble();
            t2.setHeight(h2);
            System.out.println("enter base of triangle");
            double b = kb.nextDouble();
            t2.setBase(b);

            System.out.println("The triangle height: " + t2.getHeight() + "\n" + " and base: " + t2.getBase() + "\n" +
                    " it is area = " + t2.calculateArea() + "\n" + " and its perimeter = " + t2.calculateCircumference());

            break;

        default:
            System.out.println("wrong option !");


    }
    



    }//end main
}