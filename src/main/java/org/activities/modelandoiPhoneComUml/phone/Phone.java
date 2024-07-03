package org.activities.modelandoiPhoneComUml.phone;

import org.activities.modelandoiPhoneComUml.phone.cellphone.Iphone;

import java.net.MalformedURLException;


public class Phone {

    public static void main( String[] args ) throws MalformedURLException {
        Iphone iphone = new Iphone();

        iphone.playMusic();
        iphone.pauseMusic();

        System.out.println("*****");
        
        System.out.println("Alguém está ligando...");
        iphone.answerThePhone();
        System.out.println("Algum tempo depois...");
        iphone.endCall();

    }
}
