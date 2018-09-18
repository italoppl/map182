package adapter.map.facisa.com;

public class ImagemAdapter implements ImagemTarget{
	
	private Imagem img;
	
	@Override
	public void carregarImagem(Imagem imagem) {
		imagem.carregar();
		
	}

	@Override
	public void desenharImagem(Imagem imagem) {
		imagem.desenhar();
		
	}

}
