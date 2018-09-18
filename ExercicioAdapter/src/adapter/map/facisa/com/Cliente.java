package adapter.map.facisa.com;

public class Cliente {
	public static void main(String[] args) {
		ImagemAdapter img = new ImagemAdapter();
		Imagem imgPng = new ImagemPNG();
		Imagem imgJpeg = new ImagemJpeg();
		Imagem imgBMP = new ImagemBMP();
		img.desenharImagem(imgPng);
		img.desenharImagem(imgJpeg);
		img.desenharImagem(imgBMP);
	}
}
