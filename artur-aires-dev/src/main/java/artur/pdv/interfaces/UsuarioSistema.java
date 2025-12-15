package artur.pdv.interfaces;

public class UsuarioSistema implements AutenticacaoMultiFator {

	@Override
	public boolean autenticarPorSenha(String usuario, String senha) {
		 System.out.println("Autenticando por senha...");
		 return "admin".equals(usuario) && "123".equals(senha);
	}

	@Override
	public boolean autenticarPorToken(String token) {
		System.out.println("Autenticando por token...");
		 return token != null && token.startsWith("TK-");

	}

	@Override
	public boolean autenticarPorBiometria(String biometria) {
		System.out.println("Autenticando por biometria...");
		return "BIO-OK".equals(biometria);
	}

	@Override
	public void registrarMetodo(String metodo) {
		System.out.println("Registrando método: " + metodo);
	}

}
