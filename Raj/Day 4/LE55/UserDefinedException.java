class UserDefinedException{
    public static void main(String a[]){
        Product p = new Product(-1,"milk");
        try{
            if(p.getQuantity()<0)
                throw new ProductNotFoundException("product count is less then Zeros");
        } catch (ProductNotFoundException ex) {
            System.out.println("Error Message: "+ex.getMessage());
            ex.printStackTrace();
        }
    }
}
