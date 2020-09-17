class ArraySum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int[] arr1= {10,23,46,20,78};
        int[] arr2= {8,90,11,4,99};
        int[] res=new int[arr1.length];
        for(int i=0;i<arr1.length;i++)
        	res[i]=arr1[i]+arr2[i];
        System.out.println(" Array Sum ");
        for(int x: res)
        	System.out.print(x+" ");
	}

}
