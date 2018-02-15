package CM10;

import java.util.ArrayList;
import java.util.List;

import javafx.scene.shape.Circle;
import javafx.scene.shape.Rectangle;

public class Example02 {

	public static void main(String[] args) {
		List<Circle> myList1 = new ArrayList<Circle>();

		Circle c1 = new Circle(10);
		Circle c2 = new Circle(15);
		Rectangle r = new Rectangle();


		myList1.add(c1);
		myList1.add(c2);
		//myList1.add(r);

		Object x2 = myList1.get(0);
		Circle x1 = myList1.get(0);

		System.out.println(x1.toString());
		System.out.println(x2.toString());
	}
}
