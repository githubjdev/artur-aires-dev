package artur.pdv.interfaces;

public class MainTesteAutenticacao {
	
	
	
	public static void main(String[] args) {
		 UsuarioSistema user = new UsuarioSistema();
		 user.registrarMetodo("Senha");
		
		 System.out.println("======Senha ok? ======" + user.autenticarPorSenha("admin", "123"));
		
	   
		 user.registrarMetodo("Token");
		 System.out.println("======Token OK? ======" + user.autenticarPorToken("TK-999"));

		 
		 user.registrarMetodo("Biometria");
		 System.out.println("======BNiometria OK======? " + user.autenticarPorBiometria("BIO-OK"));
		
		
		
	}

}
