package exerciciosDeFixacao.tratamentoDeExcecoes.model.exceptions;

public class WithdrawException extends RuntimeException{

    public WithdrawException(String message){
        super(message);
    }
}
