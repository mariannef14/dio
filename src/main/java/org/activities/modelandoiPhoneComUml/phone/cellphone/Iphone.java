package org.activities.modelandoiPhoneComUml.phone.cellphone;

import org.activities.modelandoiPhoneComUml.phone.call.PhoneCall;
import org.activities.modelandoiPhoneComUml.phone.internet.InternetBrowser;
import org.activities.modelandoiPhoneComUml.phone.music.MusicPlayer;


public class Iphone implements MusicPlayer, InternetBrowser, PhoneCall {

    //MusicPlayer
    @Override
    public void playMusic(){
        selectMusic();
        System.out.println("Tocando música...");
    }

    @Override
    public void pauseMusic(){
        System.out.println("Pausando música...");
    }

    @Override
    public void selectMusic(){
        System.out.println("Selecionando música...");
    }


    //InternetBrowser
    @Override
    public void displayPage() {
        addNewTab();
        System.out.println("Exibindo página...");
    }

    @Override
    public void addNewTab() {
        System.out.println("Abrindo uma nova guia...");
    }

    @Override
    public void updatePage() {
        System.out.println("Recarregando página...");
    }


    //PhoneCall
    @Override
    public void call() {
        System.out.println("Ligando para alguém...");
    }

    @Override
    public void answerThePhone() {
        System.out.println("Atendendo a ligação...");
    }

    public void endCall(){
        System.out.println("Encerrando chamada...");
    }

    @Override
    public void voicemail() {
        System.out.println("Mensagem adicionada no correio de voz...");
    }

}
