package genericexception;

public class CustomException extends RuntimeException{
    private String message;
    public CustomException(String message){
        this.message=message;
    }

    @Override
    public String toString() {
        return "CustomException{" +
                "message='" + message + '\'' +
                '}';
    }
}
