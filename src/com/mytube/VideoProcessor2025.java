package com.mytube;

public class VideoProcessor2025 {
    private VideoEncoder encoder;
    private VideoDatabase database;
    private EmailService emailService;
    private Video video;

    public VideoProcessor2025(VideoEncoder videoEncoder, VideoDatabase videoDatabase, EmailService emailService, Video video) {
        this.encoder = videoEncoder;
        this.database = videoDatabase;
        this.emailService = emailService;
        this.video = video;
    }

    public void process(Video video) {
        encoder.encode(video);
        database.store(video);
        emailService.sendEmail(video.getUser());
    }
}

