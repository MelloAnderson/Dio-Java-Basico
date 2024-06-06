
public class SmartTv {
    boolean ligada = false;
    int canal = 1;
    int volume = 25;
   
    public void ligar(){
        ligada=true;
    }
    public void desligar(){
        ligada=false;
    }
    public void aumentarVolume(){
        //volume = volume +1;
        volume++;
    }
    public void diminuirVolume(){
        //volume = volume -1;
        volume--;
    }
    public void aumentarCanal(){
        //Canal = Canal +1
        canal++;
    }
    public void diminuirCanal(){
        //Canal = Canal -1
        canal--;
    }
    public void mudarCanal(int novoCanal){
        canal = novoCanal;
    }

    }
