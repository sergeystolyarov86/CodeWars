package Stolyarov_S;

public class HumanReadableTime {
    public static void main(String[] args) {
        System.out.println(makeReadable(52222));
    }

    public static String makeReadable(int seconds) {

//        String sec = Integer.toString(0);
//        String min = Integer.toString(0);
//        String hour = Integer.toString(0);
//        String time = null;
//        if (seconds < 60) sec = Integer.toString(seconds);
//        if (seconds > 59) {
//            min = Integer.toString(seconds / 60);
//            sec = Integer.toString(seconds % 60);
//
//        }
//        if (Integer.parseInt(min) > 59) {
//            min = Integer.toString(Integer.parseInt(min) % 60);
//            hour = Integer.toString(seconds / 3600);
//
//        }
//        if (Integer.parseInt(sec) < 10) sec = "0" + sec;
//        if (Integer.parseInt(min) < 10) min = "0" + min;
//        if (Integer.parseInt(hour) < 10) hour = "0" + hour;
//        time = hour + ":" + min + ":" + sec;
//        return time;

        int minutes = seconds/60;
        int ss = seconds%60;
        int hh = minutes/60;
        int mm = minutes%60;
        return String.format("%02d:%02d:%02d",hh,mm,ss);

    }
}

