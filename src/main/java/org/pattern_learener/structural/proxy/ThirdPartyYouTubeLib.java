package org.pattern_learener.structural.proxy;

import java.util.HashMap;

/**
 * Интерфейс сервиса определяет общий интерфейс для сервиса и заместителя.
 * Благодаря этому, объект заместителя можно использовать там, где ожидается объект сервиса.
 */
public interface ThirdPartyYouTubeLib {

    HashMap<String, Video> popularVideos();

    Video getVideo(String videoId);

}
