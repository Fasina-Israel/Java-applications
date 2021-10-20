package Mp3Project;

public class Mp3 {
    private boolean power;
    private Volume volume;
    private PlayList playList;
    private MusicState musicState = MusicState.STOP;
    private PlayMode playMode =PlayMode.LINEAR;


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
    public void playingMode(){
        this.playMode = playMode;
    }
}

