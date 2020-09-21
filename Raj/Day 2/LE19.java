class ArrayClass{
	int val;
	ArrayClass(){}
	ArrayClass (int x){
		this.val = x;
	}
	public static void main(String notUsefull[]){
		ArrayClass arr[] = {new ArrayClass(1),new ArrayClass(2),new ArrayClass(3),
		new ArrayClass(4),new ArrayClass(5),new ArrayClass(6),new ArrayClass(7),new ArrayClass(8)};
		ArrayClass copy[] = new ArrayClass[arr.length];
		for(int i=0;i<arr.length;i++){
			copy[i] = new ArrayClass(arr[i].val);
 		}
		for(int i=0;i<copy.length;i++){
			System.out.print(copy[i].val+" ");
		}
	}

}
