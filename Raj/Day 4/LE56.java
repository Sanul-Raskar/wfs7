class FinallyDemo{
    public static void main(String sd[]){
        Integer i = 4;
        try{
            //all the cases are written below
            Integer x = i+1;
            i++;
            i = null;
            i++;
        }catch(NullPointerException e){
            e.printStackTrace();
        }finally{
            //this will always run at the end no matter what happnes 
            i = null;
        }
        
    }
}
