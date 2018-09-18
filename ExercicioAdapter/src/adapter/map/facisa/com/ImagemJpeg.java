package adapter.map.facisa.com;

public class ImagemJpeg implements Imagem{

	@Override
	public void carregar() {
		System.out.println("Carregando Jpeg");
		
	}

	@Override
	public void desenhar() {
		System.out.println("Desenhando o Jpeg");
		
	}

}
