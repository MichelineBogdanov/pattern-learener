package org.pattern_learener.structural.bridge;

public class TV implements Device {
    public int volume;
    public int channel;
    public boolean power;

    @Override
    public void powerOn() {
        this.power = true;
    }

    @Override
    public void powerOff() {
        this.power = false;
    }

    @Override
    public boolean isPower() {
        return this.power;
    }

    @Override
    public int getChannel() {
        return this.channel;
    }

    @Override
    public void setChannel(int channel) {
        this.channel = channel;
    }

    @Override
    public void volumeUp() {
        if (volume < 100) {
            volume++;
        }
    }

    @Override
    public void volumeDown() {
        if (volume > 0) {
            volume--;
        }
    }

    public void printStatus() {
        System.out.println("------------------------------------");
        System.out.println("| I'm TV set.");
        System.out.println("| I'm " + (power ? "enabled" : "disabled"));
        System.out.println("| Current volume is " + volume + "%");
        System.out.println("| Current channel is " + channel);
        System.out.println("------------------------------------\n");
    }

}
