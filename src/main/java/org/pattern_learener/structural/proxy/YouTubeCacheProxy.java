package org.pattern_learener.structural.proxy;

import java.util.HashMap;

/**
 * Заместитель хранит ссылку на объект сервиса. После того как заместитель заканчивает свою работу
 * (например, инициализацию, логирование, защиту или другое), он передаёт вызовы вложенному сервису.
 * Заместитель может сам отвечать за создание и удаление объекта сервиса.
 */
public class YouTubeCacheProxy implements ThirdPartyYouTubeLib {

    private final ThirdPartyYouTubeLib youtubeService;
    private HashMap<String, Video> cachePopular = new HashMap<>();
    private final HashMap<String, Video> cacheAll = new HashMap<>();

    public YouTubeCacheProxy() {
        this.youtubeService = new ThirdPartyYouTubeClass();
    }

    @Override
    public HashMap<String, Video> popularVideos() {
        if (cachePopular.isEmpty()) {
            cachePopular = youtubeService.popularVideos();
        } else {
            System.out.println("Retrieved list from cache.");
        }
        return cachePopular;
    }

    @Override
    public Video getVideo(String videoId) {
        Video video = cacheAll.get(videoId);
        if (video == null) {
            video = youtubeService.getVideo(videoId);
            cacheAll.put(videoId, video);
        } else {
            System.out.println("Retrieved video '" + videoId + "' from cache.");
        }
        return video;
    }

}
