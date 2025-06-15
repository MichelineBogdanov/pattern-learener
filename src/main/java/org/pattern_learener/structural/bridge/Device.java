package org.pattern_learener.structural.bridge;

public interface Device {

    void powerOn();

    void powerOff();

    boolean isPower();

    int getChannel();

    void setChannel(int channel);

    void volumeUp();

    void volumeDown();

}
