public class SmartTv {
    boolean ligada =false;
    int canal =1;
    int volume =25;

    public void ligarTv(){
        ligada =true;
    }

    public void desligarTv(){
        ligada =false;
    }

    public void aumentarVolume(){
        volume++;
        System.out.println("Aumentando volume para " + volume);
    }
    
    public void diminuirVolume(){
        volume--;
        System.out.println("Diminuindo volume para " + volume);
 
    }

    public void aumentarCanal(){
        canal++;
        System.out.println("Aumentando canal para " + canal);
    }

    public void diminuirCanal(){
        canal--;
        System.out.println("Diminuindo canal para " + canal);
    }

    public void mudarCanal(){
        canal = 13;
        System.out.println("Foi mudado para o canal 13");
    }
}
