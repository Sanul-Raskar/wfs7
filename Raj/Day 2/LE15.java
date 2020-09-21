public class ObjectCount{
    static int count  = 0;
    ObjectCount(){
        count++;
    }
    public static void main(String sadgni[]){
        //lets instenciate the calss 10 times 
        ObjectCount object;
        for(int i=0;i<10;i++){
            //instanciation 
            object = new ObjectCount();
        }
        System.out.println("number of times ObjectCount class is being instencated: "+count);
    }
    
}
