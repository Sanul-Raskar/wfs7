package inheritance;

public class Rectangle extends Shape {
          int length,breadth;

		@Override
		public int area() {
			// TODO Auto-generated method stub
			return length*breadth;
		}

		@Override
		public int perimeter() {
			// TODO Auto-generated method stub
			return 2*(length+breadth);
		}

		public Rectangle(int length, int breadth) {
			super();
			this.length = length;
			this.breadth = breadth;
		}

		public int getLength() {
			return length;
		}

		public void setLength(int length) {
			this.length = length;
		}

		public int getBreadth() {
			return breadth;
		}

		public void setBreadth(int breadth) {
			this.breadth = breadth;
		}
}
