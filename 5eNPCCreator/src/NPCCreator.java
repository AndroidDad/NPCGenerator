/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author B0603587
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
        Scanner appearanceScan = new Scanner(new File("src/inputfiles/appearences.txt"));
        Scanner bondScan = new Scanner(new File("src/inputfiles/bonds.txt"));
        Scanner flawsScan = new Scanner(new File("src/inputfiles/flawsandsecrets.txt"));
        Scanner highAbScan = new Scanner(new File("src/inputfiles/highability.txt"));
        Scanner lowAbScan = new Scanner(new File("src/inputfiles/lowability.txt"));
        Scanner idealsScan = new Scanner(new File("src/inputfiles/ideals.txt"));
        Scanner interactionScan = new Scanner(new File("src/inputfiles/interactions.txt"));
        Scanner mannerismScan = new Scanner(new File("src/inputfiles/mannerism.txt"));
        Scanner talentScan = new Scanner(new File("src/inputfiles/talent.txt"));
        
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
        
        
        
        //Instantiate scanners for input files.
        
        
        //TODO call npcGUI
        
    }
    
    
}
