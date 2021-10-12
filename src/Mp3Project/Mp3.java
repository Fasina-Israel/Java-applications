package Mp3Project;

public class Mp3 {
    private boolean power;
    private Volume volume;
    private PlayList playList;
    private PlayMode playMode;
//    private MusicState musicState = MusicState.STOP;


    public  void setPower(){
       this.power = true;
    }
    public  boolean getOn() {
        return power;
    }

    public void offPower(){
        this.power = false;
    }
    public void playMusic(){

    }
}

