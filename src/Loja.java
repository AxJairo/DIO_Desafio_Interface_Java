import equipamentos.Iphone;

public class Loja {
    public static void main(String args[]){
        
        Iphone iphone1 = new Iphone();

        System.out.println("Testando as novas funcionalidades introduzidas pela Apple: ");
        iphone1.ligar("+55(31)912345678");
        iphone1.atender();
        iphone1.iniciarCorreioVoz();
        
        iphone1.adicionarNovaAba();
        iphone1.exibirPagina("dio.me");
        iphone1.atualizarPagina();

        iphone1.selecionarMusica("Cherry Bomb");
        iphone1.tocar();
        iphone1.pausar();


    }
}
