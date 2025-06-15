package org.pattern_learener.structural.bridge;

public class AdvancedRemote extends BasicRemote {

    public AdvancedRemote(Device device) {
        super(device);
    }

    public void mute() {
        for (int i = 0; i < 100; i++) {
            this.device.volumeDown();
        }
    }

}
