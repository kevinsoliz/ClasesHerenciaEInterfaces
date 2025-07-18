package com.mytube;

public class VideoProcessor2025 implements VideoProcessor {
    private VideoEncoder encoder;
    private VideoDatabase database;
    private EmailService emailService;

    public VideoProcessor2025(VideoEncoder videoEncoder, VideoDatabase videoDatabase, EmailService emailService) {
        this.encoder = videoEncoder;
        this.database = videoDatabase;
        this.emailService = emailService;
    }

    @Override
    public void process(Video video) {
        encoder.encode(video);
        database.store(video);
        emailService.sendEmail(video.getUser());
    }
}

