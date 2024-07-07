package Iphone;

public class Iphone implements ReprodutorMusical , AparelhoTelefonico, NavegadorDeInternet {

	@Override
	public void exibirPagina() {
		System.out.println("Exibindo página");
	}

	@Override
	public void adicionarNovaAba() {
		System.out.println("Adicionando nova aba");
	}

	@Override
	public void atualizarPagina() {
		System.out.println("Atualizando página");
	}

	@Override
	public void ampliarTamanhoDaTela() {
		System.out.println("Ampliando tamanho da tela");	
	}

	@Override
	public void adicionarSiteAosFavoritos() {
		System.out.println("Adicionando site aos favoritos");	
	}

	@Override
	public void desbloquearTela() {
		System.out.println("Desbloqueando tela");	
	}

	@Override
	public void fazerLigacao() {
		System.out.println("Realizando ligação");
	}

	@Override
	public void desligar() {
		System.out.println("Desligando o telefone...");	
	}

	@Override
	public void atender() {
		System.out.println("Atendendo a ligação");
	}

	@Override
	public void iniciarCorreioDeVoz() {
		System.out.println("Iniciando correio de voz");	
	}

	@Override
	public void reproduzirVideo() {
		System.out.println("Reproduzindo o vídeo...");
	}

	@Override
	public void enviarEmail() {
		System.out.println("Enviando o e-mail...");	
	}

	@Override
	public void enviarMensagem() {
		System.out.println("Enviando a mensagem...");	
	}

	@Override
	public void tocar() {
		System.out.println("Tocando a música...");	
	}

	@Override
	public void pausar() {
		System.out.println("Pausando a música");	
	}

	@Override
	public void selecionarAlbum() {
		System.out.println("Selecionando álbum...");	
	}

	@Override
	public void selecionarMusica() {
		System.out.println("Selecionando a música...");
	}

	@Override
	public void avaliarAlbum() {
		System.out.println("Avaliando o álbum");
	}

	@Override
	public void aumentarVolume() {
		System.out.println("Aumentando o volume...");	
	}

}