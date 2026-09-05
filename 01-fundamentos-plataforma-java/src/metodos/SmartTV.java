package metodos;

public class SmartTV {
    boolean ligada = false;
    int canal = 1;
    int volume = 25;


    //Desligar ou ligar a TV
    public void ligar(){
        ligada = true;
    }
    public void desligar(){
        ligada = false;
    }

    //Diminuir/Aumentar Volume
    public void aumentarVolume(){
        volume++;
    }
    public void diminuirVolume(){
        volume--;
    }

    // Diminuir/Aumentar/Mudar Canal
    public void mudarCanal(int mudarCanal){
        canal = mudarCanal;
    }
    public void aumentarCanal(){
        canal++;
    }
    public void diminuirCanal(){
        canal--;
    }


    //Print:

    public String toString(){
        return String.format("A TV está:" + ligada + "\nCanal atual: " + canal + "\nVolume: " + volume);
    }

}




