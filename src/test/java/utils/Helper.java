package utils;

import java.util.Random;

public class Helper {

    public static String getRandom24HourTime() {
        Random random = new Random();
        int hour = random.nextInt(24);
        int minute = random.nextInt(60);

        String hourString = String.format("%02d", hour);
        String minuteString = String.format("%02d", minute);

        String time = hourString + ":" + minuteString;
        System.out.println("Random 24h time: " + time);
        return time;
    }


    public static String generateRandomString(int length) {
        String ALPHANUMERIC = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";
        StringBuilder sb = new StringBuilder(length);
        Random random = new Random();

        for (int i = 0; i < length; i++) {
            int index = random.nextInt(ALPHANUMERIC.length());
            char randomChar = ALPHANUMERIC.charAt(index);
            sb.append(randomChar);
        }

        String random_string = sb.toString();
        System.out.println("Random string: " + random_string);
        return random_string;
    }


}
