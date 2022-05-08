/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package algos;

import java.util.HashMap;
import java.util.Random;
import javax.swing.JOptionPane;



/**
 *
 * @author perun
 */
public class OneTimePad {
    
    void initMap(){
//        vigenere
        map.put("A", "00");map.put("D", "03");map.put("I", "08");map.put("J", "09");map.put("O", "14");map.put("P", "15");map.put("S", "18");map.put("U", "20");map.put("W", "22");map.put("Y", "24");
        map.put("B", "01");map.put("E", "04");map.put("H", "07");map.put("K", "10");map.put("N", "13");map.put("Q", "16");map.put("T", "19");map.put("V", "21");map.put("X", "23");map.put("Z", "25");map.put(" ", "26");
        map.put("C", "02");map.put("F", "05");map.put("G", "06");map.put("L", "11");map.put("M", "12");map.put("R", "17");
    }
    
    String generateKey(int length){
        Random rand = new Random();
        for(int i = 0;i<length;i++){
            final int x = rand.nextInt(27);
            map.forEach((k,v)->{
                if(x == Integer.valueOf(v)){
                    key = key + k;
                }
            });
        }
        return key;
    }
    
    int calcCipher(char P,char K){
        try{
        int E = (Integer.valueOf(map.get(String.valueOf(P))) + Integer.valueOf(map.get(String.valueOf(K)))) % 27;
        if(E>26){
            E=E-27;
        } 
        return E;
        }catch(java.lang.NumberFormatException e){
            JOptionPane.showMessageDialog(null, "exception occured","input error", 0);
            e.printStackTrace();
        return 0;    
        }catch(Exception e){
            e.printStackTrace();
            return 0;
        }
        
    }
    
    int calcPlain(char E,char K){
        //    Ei = (Pi + Ki) mod 26
//Decryption: Di = (Ei - Ki) mod 26

        try{
        int D = (Integer.valueOf(map.get(String.valueOf(E))) - Integer.valueOf(map.get(String.valueOf(K)))) % 27;
        if(D < 0){
            D=D+27;
        } 
        return D;
        }catch(java.lang.NumberFormatException e){
            JOptionPane.showMessageDialog(null, "exception occured","input error", 0);
        return 0;    
        }catch(Exception e){
            e.printStackTrace();
            return 0;
        }
        
    }
    
    public String[] encrypt(String plain,int len) throws Exception{
        plain = plain.toUpperCase();
        //        pre-requests first
        initMap();
        k = generateKey(len);
//        process the input
        int j = 0;
        for(int i=0; i<plain.length(); i++){
            if(j==k.length()){
                j=0;
            }
              int value = calcCipher(plain.charAt(i), k.charAt(j));
              
              map.forEach((String k,String v)->{
              if(Integer.parseInt(v) == value){
                  cipher = cipher+k;
              }
              });
            j++;
        }
        String[] r = {cipher,k};
        cipher = "";
        key = "";
        k = "";
        return r;
    }
    
    public String decrypt(String nonsense,String key) throws Exception{
        nonsense = nonsense.toUpperCase();
        key = key.toUpperCase();
        plainText = "";
//        pre-requests first
        initMap();
//        process the input
        int j = 0;
        for(int i=0; i<nonsense.length(); i++){
            if(j==key.length()){
                j=0;
            }

              int value = calcPlain(nonsense.charAt(i), key.charAt(j));
//              System.out.println(value);
              map.forEach((String k,String v)->{
              if(Integer.parseInt(v) == value){
                  plainText = plainText+k;
              }
              });
            j++;
        }
        return plainText;
    }

    HashMap<String,String> map = new HashMap<>();
    String cipher = "";
    String plainText = "";
    String key = "";
    String k = "";
   
}
