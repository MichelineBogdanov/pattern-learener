package org.pattern_learener.structural.facade;

public class BitrateReader {

    public static VideoFile read(VideoFile file, Codec codec) {
        System.out.println("BitrateReader: reading file...");
        return file;
    }

    public static VideoFile convert(VideoFile buffer, Codec codec) {
        System.out.println("BitrateReader: writing file...");
        if (codec instanceof MPEG4CompressionCodec) {
            buffer.setCodecType("mp4");
        } else {
            buffer.setCodecType("ogg");
        }
        return buffer;
    }

}
