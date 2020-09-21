
class SquareMultiArr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int[][] arr= {{1,2,3},{4,5},{6,7,8,9,10},{11}};
        for(int[] x:arr)
        {
        	for(int i:x)
        		System.out.print((i*i)+" ");
        	System.out.println();
        }
	}

}
