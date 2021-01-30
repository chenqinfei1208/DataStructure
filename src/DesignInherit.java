import java.text.DecimalFormat;
import java.awt.font.FontRenderContext;
import java.awt.geom.Area;
import java.lang.reflect.Array;
import java.util.*;
import java.io.IOException;

public class DesignInherit {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int length = sc.nextInt();
            int width = sc.nextInt();
            int r = sc.nextInt();
            int side = sc.nextInt();

            Rectangle rectangle = new Rectangle(length, width);
            Circle circle = new Circle(r);
            Square square = new Square(side);

            System.out.println(rectangle.GetArea(length, width));

            double AreaCircle = circle.GetArea(r);
            int AreaCircle1 = (int)circle.GetArea(r);
            DecimalFormat df = new DecimalFormat("###.0");
            double temp;
            if (AreaCircle > AreaCircle1){
                temp = Double.parseDouble(df.format(AreaCircle));
                if (temp != AreaCircle)
                    System.out.println(String.format("%.2f", AreaCircle));
                else
                    System.out.println(AreaCircle);
            }
            else
                System.out.println(AreaCircle1);

            System.out.println(square.GetArea(side));
        }
    }

    class shape{
        private int x;
        private int y;

        public shape(int x, int y){
            this.x = x;
            this.y = y;
        }
    }

    class Rectangle extends shape{
        private int length;
        private int width;

        public Rectangle(int length, int width){
            super(length, width);
            this.length = length;
            this.width = width;
        }

        public int GetArea(int length, int width){
            int Area = length * width;
            return Area;
        }
    }

    class Circle extends shape{
        int r;

        public Circle(int r){
            super(r, r);
            this.r = r;
        }

        public double GetArea(int r){
            double Area;
            Area = 3.14 * r * r;
            return Area;
        }
    }

    class Square extends Rectangle{
        int length;

        public Square(int length){
            super(length, length);
            this.length = length;
        }

        public int GetArea(int length){
            int Area;
            Area = length * length;
            return Area;
        }
    }

    