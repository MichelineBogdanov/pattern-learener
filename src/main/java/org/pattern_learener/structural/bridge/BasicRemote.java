package org.pattern_learener.structural.bridge;

public class BasicRemote implements Remote {

    protected Device device;

    public BasicRemote() {
    }

    public BasicRemote(Device device) {
        this.device = device;
    }

    @Override
    public void power() {
        if (this.device.isPower()) {
            device.powerOff();
        } else {
            device.powerOn();
        }
    }

    @Override
    public void volumeUp() {
        device.volumeUp();
    }

    @Override
    public void volumeDown() {
        device.volumeDown();
    }

    @Override
    public void setChannel(int channel) {
        device.setChannel(channel);
    }
}
