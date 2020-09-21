public class ExceptionsDemo{
    public static void main(String a[]){
        try{
           //create NegativeArraySizeException
           int arr[] = new int[-10];// the size of the array is negative 
           //create ArrayIndexOutOfBoundsException
           arr = new int[10];//creating a new array
           int x = arr[11];
           int y = arr[-1];
           //create StringIndexOutOfBoundsException
           String string = "0123456789"; // size of String is 10
           char c =  string.charAt(-1);
           c = string.charAt(11);
           //create IndexOutOfBoundsException
           //this exception is the superclass of ArrayIndexOutOfBoundsException and StringIndexOutOfBoundsException so this class can be used to catch both type of exception
           //create NullPointerException
           Integer i = null;
           String s =String.valueOf(i.toString()); // accessing the value which is pointing to null refrence
           //create ArithmeticException
           int xy = 5/0;
        }catch (NegativeArraySizeException e){
            e.printStackTrace();
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Exception caught ");
        } catch(StringIndexOutOfBoundsException e){
            e.printStackTrace();
        }catch(IndexOutOfBoundsException e){
            e.printStackTrace();
        }
        catch(NullPointerException e){
            e.printStackTrace();
        }catch(ArithmeticException e){
            e.printStackTrace();
        }
           
        
    }
}
