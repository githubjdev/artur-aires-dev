package artur.pdv.interfaces;

public interface AutenticacaoMultiFator 
                 extends AutenticacaoSenha, AutenticacaoToken
                                            ,AutenticacaoBiometrica{
	
	void registrarMetodo(String metodo);

}
