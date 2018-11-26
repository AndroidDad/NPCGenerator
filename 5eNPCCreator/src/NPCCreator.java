/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author B0603587 and K1110172
 */
    import java.io.*;
    import java.util.*;
public class NPCCreator {
    
    protected static ArrayList<String> appearanceList = new ArrayList();
    protected static ArrayList<String> bondList = new ArrayList();
    protected static ArrayList<String> flawsList = new ArrayList();
    protected static ArrayList<String> highAbList = new ArrayList();
    protected static ArrayList<String> lowAbList = new ArrayList();
    protected static ArrayList<String> idealsList = new ArrayList();
    protected static ArrayList<String> interactionsList = new ArrayList();
    protected static ArrayList<String> mannerismList = new ArrayList();
    protected static ArrayList<String> talentList = new ArrayList();
    
    
    public NPCCreator() throws java.io.FileNotFoundException {
        Scanner appearanceScan = new Scanner(this.getClass().getResourceAsStream("inputfiles/appearences.txt"));
        Scanner bondScan = new Scanner(this.getClass().getResourceAsStream("inputfiles/bonds.txt"));
        Scanner flawsScan = new Scanner(this.getClass().getResourceAsStream("inputfiles/flawsandsecrets.txt"));
        Scanner highAbScan = new Scanner(this.getClass().getResourceAsStream("inputfiles/highability.txt"));
        Scanner lowAbScan = new Scanner(this.getClass().getResourceAsStream("inputfiles/lowability.txt"));
        Scanner idealsScan = new Scanner(this.getClass().getResourceAsStream("inputfiles/ideals.txt"));
        Scanner interactionScan = new Scanner(this.getClass().getResourceAsStream("inputfiles/interactions.txt"));
        Scanner mannerismScan = new Scanner(this.getClass().getResourceAsStream("inputfiles/mannerism.txt"));
        Scanner talentScan = new Scanner(this.getClass().getResourceAsStream("inputfiles/talent.txt"));
        
        //Fill ArrayLists with parsed data.
        while (appearanceScan.hasNext()){
            appearanceList.add(appearanceScan.nextLine());
        }
        while (bondScan.hasNext()){
            bondList.add(bondScan.nextLine());
        }
        while (flawsScan.hasNext()){
            flawsList.add(flawsScan.nextLine());
        }
        while (highAbScan.hasNext()){
            highAbList.add(highAbScan.nextLine());
        }
        while (lowAbScan.hasNext()){
            lowAbList.add(lowAbScan.nextLine());
        }
        while (idealsScan.hasNext()){
            idealsList.add(idealsScan.nextLine());
        }
        while (interactionScan.hasNext()){
            interactionsList.add(interactionScan.nextLine());
        }
        while (mannerismScan.hasNext()){
            mannerismList.add(mannerismScan.nextLine());
        }
        while (talentScan.hasNext()){
            talentList.add(talentScan.nextLine());
        }
    }
    
    
    public static void main(String[] args) throws java.io.FileNotFoundException {
      
    }
    
    
}
