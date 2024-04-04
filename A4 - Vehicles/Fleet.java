import java.util.*;
import java.util.Scanner;
import java.io.*;
public class Fleet{

	public static void main(String[] args) throws Exception {

		ArrayList<Vehicle> cars = new ArrayList<Vehicle>();
		Scanner input = new Scanner(System.in);

		System.out.print("What's the name of your DB text file? ");
			String db = input.next();

		Scanner dBread = new Scanner(new File(db));


		while(dBread.hasNext()){	//BEGIN LOOP

			String vc = dBread.next();

			if(vc.equals("A"))
			{
				Car car1 = new Car();
					car1.setMake(dBread.next());
					car1.setModel(dBread.next());
					car1.setWeight(dBread.nextInt());
					car1.setColor(dBread.next());
					car1.setYear(dBread.nextInt());
					car1.setMPG(dBread.nextDouble());
					car1.setSeating(dBread.nextInt());
					car1.setVclass("A");
				cars.add(car1);
			} else if(vc.equals("T")){
				Truck car2 = new Truck();
					car2.setMake(dBread.next());
					car2.setModel(dBread.next());
					car2.setWeight(dBread.nextInt());
					car2.setColor(dBread.next());
					car2.setYear(dBread.nextInt());
					car2.setMPG(dBread.nextDouble());
					car2.setSeating(dBread.nextInt());
					car2.setHauling(dBread.nextInt());
					car2.setVclass("T");
				cars.add(car2);
			} else if(vc.equals("MC")){
				Motorcycle car3 = new Motorcycle();
					car3.setMake(dBread.next());
					car3.setModel(dBread.next());
					car3.setWeight(dBread.nextInt());
					car3.setColor(dBread.next());
					car3.setYear(dBread.nextInt());
					car3.setMPG(dBread.nextDouble());
					car3.setVclass("MC");
				cars.add(car3);
			}

		}//END LOOP

		System.out.println("What vehicle class would you like to list?(A: Automobile, T: Truck, MC: Motorcycle) ");
			String search = input.next();

			int count = 0;
			for(Vehicle car : cars)
			{
				String type = car.getVclass();
				if(type.equals(search)){
					count++;
					car.stats();
				}


			}
			System.out.println(count + " vehicles of the " + search + " class have been found and returned by your search");
		}

		}
