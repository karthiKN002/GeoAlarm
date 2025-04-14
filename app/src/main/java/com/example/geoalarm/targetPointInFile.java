package com.example.geoalarm;

public class targetPointInFile implements java.io.Serializable {
    String targetName;
    double myLatitude, myLongtitude;
    int circleRadius; //in meter
    String sendEmailToAddress;
    boolean sendEmail;
    int volume;
    boolean saved;
    boolean clicked;
    boolean arrived;

    targetPointInFile(){
        targetName = "";
        myLatitude =0;
        myLongtitude = 0;
        circleRadius =0;
        sendEmail =false;
        sendEmailToAddress = "";
        volume = 15;
        saved = true;
        clicked = false;
        arrived = false;
    }
}
