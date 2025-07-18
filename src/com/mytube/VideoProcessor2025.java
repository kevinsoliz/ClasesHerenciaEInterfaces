package com.mytube;

public class VideoProcessor2025 {
    private VideoEncoder encoder;
    private VideoDatabase database;
    private EmailService emailService;

    public VideoProcessor2025(VideoEncoder videoEncoder, VideoDatabase videoDatabase, EmailService emailService) {
        this.encoder = videoEncoder;
        this.database = videoDatabase;
        this.emailService = emailService;
    }

    public void process(Video video) {
        encoder.encode(video);
        database.store(video);
        emailService.sendEmail(video.getUser());
    }
}

