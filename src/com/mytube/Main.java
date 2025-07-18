package com.mytube;

public class Main {

    public static void main(String[] args) {
        var video = new Video();
        video.setFileName("birthday.mp4");
        video.setTitle("Jennifer's birthday");
        video.setUser(new User("john@domain.com"));

        var processor = new VideoProcessor2025(new VideoEncoder2025(), new VideoDatabase2025(), new EmailService2025());
        processor.process(video);
    }
}
