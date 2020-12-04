/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uts.if10k.pkg10119901.fauzanmuhammadabdussalam.no3;

/**
 *
 * @author User
 */
public class HardRock implements PopRock,ProgressiveRock,PsychedelicRock
{
    public void genreHardRock(String artistName)
    {
        System.out.println(artistName + " adalah musisi HardRock");
    }
    
    public void genrePopRock(String artistName)
    {
        System.out.println(artistName + " adalah musisi PopRock");
    }
    
    public void genrePsychedelicRock(String artistName)
    {
        System.out.println(artistName + " adalah musisi PsychedelicRock");
    }
    
    public void genreProgressiveRock(String artistName)
    {
        System.out.println(artistName + " adalah musisi ProgressiveRock");
    }
}
