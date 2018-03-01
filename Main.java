package com.company;

import java.util.Scanner;
import java.util.ArrayList;
import com.company.Song.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // adding objects to ArrayList
        ArrayList<Song> SongList = new ArrayList();

        Double TotalLenght = null;
        for (int i = 1; i < 3; i++) {
            Song xx = new Song();
            System.out.println("Please enter Band and name of the " + i + " song");
            xx.setSongName(sc.nextLine());
            System.out.println("Please enter lenght of the " + i + " song");
            xx.setSongLenght(sc.nextDouble());
            //TotalLenght = TotalLenght + xx.getSongLenght();
            System.out.println("Please enter music style of the " + i + " song");
            xx.setSongStyle(sc.nextLine());

            SongList.add(xx);
        }


        Song Sng = new Song();
        // display ArrayList of entered song information
        System.out.println("Your entered list of songs: ");
        System.out.println();
        for (int j = 0; j < SongList.size(); j++) {
            Sng = SongList.get(j);
            System.out.println(Sng.getFullSongInfo());
        }

        System.out.println("The total lenght of entered songs is: " + TotalLenght);

        // Total lenght of entered songs
        /*for (int k = 0; k < SongList.size(); k++) {
            Sng = SongList.get(k);
            System.out.println(Sng.getFullSongInfo());
            System.out.println("The total lenght of entered songs is:");

        }*/
    }
}