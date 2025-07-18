package com.mytube;

public class VideoProcessor2025 implements VideoProcessor {
    private VideoEncoder encoder;
    private VideoDatabase database;
    private NotificationService notificationService;

    public VideoProcessor2025(VideoEncoder videoEncoder, VideoDatabase videoDatabase, NotificationService notificationService) {
        this.encoder = videoEncoder;
        this.database = videoDatabase;
        this.notificationService = notificationService;
    }

    @Override
    public void process(Video video) {
        encoder.encode(video);
        database.store(video);
        notificationService.sendEmail(video.getUser());
    }
}

