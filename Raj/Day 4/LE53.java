class ArrayIndex{
    public static void main(String a[]){
        int[][] arr= {{1,2,3},{4,5},{6,7,8,9,10},{11}};
        try{
            for(int i=0;i<arr.length;i++){
                for(int j=0;j<arr[i].length+1;j++){
                    //if the index goes out of limit i.e the index be the length of the array -1 
                    System.out.print(arr[i][j]+" ");
                }
                System.out.println();
            }
        }catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Exception caught ");
        }
    }
}
