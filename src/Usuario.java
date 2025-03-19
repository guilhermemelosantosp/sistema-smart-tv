public class Usuario {
    public static void main(String[] args) throws Exception {
    
        SmartTv smartTv = new SmartTv();

        System.out.println("Tv Ligada ? " + smartTv.ligada);
        System.out.println("Canal Atual: " + smartTv.canal);
        System.out.println("Volume Atual: " + smartTv.volume);

        smartTv.ligarTv();
        System.out.println("Novo Status Tv Ligada ? " + smartTv.ligada);

        smartTv.desligarTv();
        System.out.println("Novo Status Tv Ligada ? " + smartTv.ligada);

        smartTv.aumentarVolume();
        smartTv.aumentarVolume();
        smartTv.aumentarVolume();
        smartTv.diminuirVolume();
        System.out.println("Volume Atual: " + smartTv.volume);

        smartTv.aumentarCanal();
        smartTv.aumentarCanal();
        smartTv.aumentarCanal();
        smartTv.diminuirCanal();
        smartTv.aumentarCanal();
        System.out.println("Canal Atual : "+ smartTv.canal);
        smartTv.mudarCanal();

        System.out.println("Canal Atual : " + smartTv.canal);
    }
}