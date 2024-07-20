package src;

import java.util.ArrayList;
import java.util.Scanner;

public class DataStrcu_Car {

    static void Displaymenu() {
        System.out.print("\n"
                + "to  Add    Car enter 1 \n"
                + "to  remove Car enter 2 \n"
                + "to  Display    enter 3 \n"
                + "to Exit the program   enter 4 \n");
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        ArrayList<Car> carList = new ArrayList();

        while (true) {
            Displaymenu();
            System.out.print("Enter your choice >> ");
            int choice = input.nextInt();
            switch (choice) {
                case 1:
                    Car car = new Car();
                    System.out.println("Enter Model");
                    car.setModel(input.next());
                    System.out.println("Enter type");
                    car.setType(input.next());
                    System.out.println("Enter colorl");
                    car.setColor(input.next());
                    System.out.println("Enter Price");
                    car.setPrice((int) input.nextFloat());

                    carList.add(car);

                case 2:

                    System.out.println("Enter number to remove index: ");

                    int x = input.nextInt();

                    System.out.println(carList.remove(x));

                case 3:
                    for (int i = 0; i < carList.size(); i++) {

                        System.out.println(carList.get(i));

                    }
            }
        }

    }
}
