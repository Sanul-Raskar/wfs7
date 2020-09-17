package com.vechicle;

public class Road {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Vechile v1=new Truck("BH10HL0981", "TATA", "Red", 8, 2, "All India");
        Vechile v2=new Bus("BH01AL0976", "TATA", "Blue", 6, "Govt.", "Roadways");
        Vechile v3=new Car("BH86RB6790", "Maruti", "Silver", 4, 6, "Taxi");
        v1.speed();
        v1.mileage();
        v2.speed();
        v2.mileage();
        v3.speed();
        v3.mileage();
	}

}
