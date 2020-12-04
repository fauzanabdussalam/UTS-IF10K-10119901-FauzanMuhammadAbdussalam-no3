/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uts.if10k.pkg10119901.fauzanmuhammadabdussalam.no3;

/**
 *
 * @author
 * NAMA     : Fauzan Muhammad Abdussalam
 * KELAS    : IF-10K
 * NIM      : 10119901
 * Deskripsi Program : UTS No.3 (Genre Musik)
 *
 */
public class UTSIF10K10119901FauzanMuhammadAbdussalamNo3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        // TODO code application logic here
        MusicGenre mg = new MusicGenre();
        
        Rnb rnb = new Rnb();
        
        mg.setArtistName("Jimmy Hendrik");
        rnb.genreBlues(mg.getArtistName());
        mg.setArtistName("Chad Baker");
        rnb.genreJazz(mg.getArtistName());
        
        Rockabilly rbl = new Rockabilly();
        mg.setArtistName("Elvis Presle");
        rbl.genreRockabilly(mg.getArtistName());
        
        HardRock hr = new HardRock();
        mg.setArtistName("DreamTheater");
        hr.genreProgressiveRock(mg.getArtistName());
        mg.setArtistName("TheDoors");
        hr.genrePsychedelicRock(mg.getArtistName());
        mg.setArtistName("Kiss");
        hr.genrePopRock(mg.getArtistName());
        
        Metal m = new Metal();
        mg.setArtistName("MXPX");
        m.genrePunk(mg.getArtistName());
        mg.setArtistName("Metallica");
        m.genreHeavyMetal(mg.getArtistName());
        
        Grindcore gm = new Grindcore();
        mg.setArtistName("Mesin Tempur");
        gm.genreGrindcore(mg.getArtistName());
        
        DeathMetal dm = new DeathMetal();
        mg.setArtistName("JASAD");
        dm.genreDeathMetal(mg.getArtistName());
        
        DeathCoreKepiting dck = new DeathCoreKepiting();
        mg.setArtistName("Revenge The Fate");
        dck.genreDeathCoreKepiting(mg.getArtistName());
        
        BlackMetal bm = new BlackMetal();
        mg.setArtistName("Behemoth");
        bm.genreBlackMetal(mg.getArtistName());
        
        NewSkul ns = new NewSkul();
        mg.setArtistName("HATEBREED");
        ns.genreNewSkul(mg.getArtistName());
    }
    
}
