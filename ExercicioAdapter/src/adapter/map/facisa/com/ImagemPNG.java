package adapter.map.facisa.com;

public class ImagemPNG implements Imagem{

	@Override
	public void carregar() {
		System.out.println("Carregando o PNG");
		
	}

	@Override
	public void desenhar() {
		System.out.println("Desenhando o PNG");
		
	}
}
