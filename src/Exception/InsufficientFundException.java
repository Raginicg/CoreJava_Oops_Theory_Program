package Exception;

public class InsufficientFundException extends RuntimeException {
	InsufficientFundException(String msg){
		super(msg);
	}
}
