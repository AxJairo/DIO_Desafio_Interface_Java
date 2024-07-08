package equipamentos;

public class Iphone implements AparelhoTelefonico, NavegadorInternet, ReprodutorMusical {
    public void ligar(String numero){
        System.out.println("Fazendo uma ligação para o número " + numero + " em um Iphone!");
    }

    public void atender(){
        System.out.println("Atendendo uma ligação em um Iphone!");
    }

    public void iniciarCorreioVoz(){
        System.out.println("Escutando o correio de voz em um Iphone!");
    }

    public void exibirPagina(String url){
        System.out.println("Abrindo a página " + url + " em um Iphone!");
    }

    public void adicionarNovaAba(){
        System.out.println("Abrindo uma nova aba em um Iphone!");
    }

    public void atualizarPagina(){
        System.out.println("Atualizando a página em um Iphone!");
    }

    public void tocar(){
        System.out.println("Tocando uma música em um Iphone!");
    }

    public void pausar(){
        System.out.println("Pausando uma música em um Iphone!");
    }

    public void selecionarMusica(String musica){
        System.out.println("Escolhendo a música " + musica + " em um Iphone!");
    }
}
