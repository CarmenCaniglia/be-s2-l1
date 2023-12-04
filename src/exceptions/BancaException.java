package exceptions;

public class BancaException extends Exception{
    private String message;

    public BancaException(String message){
        super(message);
        this.message = message;//passo il parametro al costruttore della superclasse Exception
    }

    @Override
    public String getMessage() {
        return message;
    }
}
