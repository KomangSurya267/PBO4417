public class TV {
    int channel = 1; // Default channel is 1
    int volumeLevel = 1; // Default volume level is 1
    boolean on = false; // TV is off

    public TV() {
    }

    public void nyalakan() {
        on = true;
    }

    public void matikan() {
        on = false;
    }

    public void setChannel(int newChannel) {
        if (on && newChannel >= 1 && newChannel <= 120) {
            channel = newChannel;
        }
    }

    public void setVolume(int newVolumeLevel) {
        if (on && newVolumeLevel >= 1 && newVolumeLevel <= 7) {
            volumeLevel = newVolumeLevel;
        }
    }

    public void channelUp() {
        if (on && channel < 120) {
            channel++;
        }
    }

    public void channelDown() {
        if (on && channel > 1) {
            channel--;
        }
    }

    public void volumeBesar() {
        if (on && volumeLevel < 7) {
            volumeLevel++;
        }
    }

    public void volumeKecil() {
        if (on && volumeLevel > 1) {
            volumeLevel--;
        }
    }
}