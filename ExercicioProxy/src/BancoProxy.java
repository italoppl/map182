
public class BancoProxy implements BancoUsuarios{
	
	private String usuario;
	private String senha;
	private int quantidadeDeUsuarios;
	private int usuariosConectados;
	
	public  BancoProxy(String usuario, String senha) {
		this.usuario = usuario;
		this.senha = senha;
		this.quantidadeDeUsuarios = (int)(Math.random() * 100);
		this.usuariosConectados = (int) (Math.random() * 10);
	}
	
	public boolean temPermissao() {
		if(usuario == "admin" && senha == "admin") {
			return true;
		}else {
			return false;
		}
	}

	@Override
	public int getNumeroDeUsuarios() {
		if(temPermissao()) {
			return this.quantidadeDeUsuarios;
		}
		return 0;
	}

	@Override
	public int getUsuariosConectados() {
		if(temPermissao()) {
			return this.usuariosConectados;
		}
		return 0;
	}

}
