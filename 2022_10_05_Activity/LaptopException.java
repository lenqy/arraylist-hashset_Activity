public class LaptopException extends Exception {
    public String Error(){
        return "Opssssss!!! Please input a number.";
    }


    public LaptopException(String message){
        super(message);
    }
    

}