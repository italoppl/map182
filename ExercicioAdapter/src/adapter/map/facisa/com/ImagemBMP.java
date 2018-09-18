package adapter.map.facisa.com;

public class ImagemBMP implements Imagem{

	@Override
	public void carregar() {
		System.out.println("Carregando o BMP");
		
	}

	@Override
	public void desenhar() {
		System.out.println("Desenhando o BMP");
		
	}

}
