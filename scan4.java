package Homework.New;

public class scan4 {
    public static void main(String[] args) {
         class Box {
            private double width;
            private double height;
            private double length;

            public Box(double width, double height, double length) {
                this.width = width;
                this.height = height;
                this.length = length;
                double volume = calculateVolume();
                System.out.println("Объём коробки: " + volume);
            }

            private double calculateVolume() {
                return width * height * length;
            }

            public static void main(String[] args) {
                Box box = new Box(10.0, 5.0, 3.0);
            }


        }
    }
}