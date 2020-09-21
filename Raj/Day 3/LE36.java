package com.city;

import com.vechicle.Bus;
import com.vechicle.Car;
import com.vechicle.Truck;
import com.vechicle.Vechile;

class City   {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Vechile v1=new Truck("BH10HL0981", "TATA", "Red", 8, 2, "All India");
	        Vechile v2=new Bus("BH01AL0976", "TATA", "Blue", 6, "Govt.", "Roadways");
	        Vechile v3=new Car("BH86RB6790", "Maruti", "Silver", 4, 6, "Taxi");
	        v1.display();
	        v2.display();
	        v3.display();
	}

}
