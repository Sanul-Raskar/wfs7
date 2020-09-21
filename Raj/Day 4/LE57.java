class FinallytDemo{
    static String Increment(Integer value){
        Integer initialValue = value;
        try{
            value++;
            value = null;
            value++;
        }catch(NullPointerException e){
            e.printStackTrace();
            value = initialValue;
        }finally{
            //this will always run no matter what.
            return String.valueOf(value);
        }
    }
    public static void main(String sd[]){
        Integer i = 4;
        String value = Increment(i);
        System.out.println("value: " + value);
    }
}
