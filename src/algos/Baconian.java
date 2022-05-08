/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package algos;


import java.util.LinkedList;
import java.util.Queue;

/**
 *
 * @author c2
 */
public class Baconian {
    public String encrypt(String plain,int depth){
        
    int iterator = 0;
    int leng = plain.length();
    boolean goingdown = true;
    String cipher = "";
    int map[] = new int[plain.length()];
    
    
        for(int i=0;i<leng;i++){     
    if(goingdown){
        map[i]=iterator;
        if(iterator == depth-1){
            iterator-=1;
            goingdown = false;
        }else{
            iterator++;
        }
    }else{
        map[i]=iterator;
        if(iterator == 0){
            iterator++;
            goingdown = true;
        }else{
            iterator--;
        }
    }
}
        //for concatinating the cipher
        for(int a=0; a<depth;a++){
            for(int j = 0 ; j <map.length;j++){
            if(map[j] == a){
                cipher= cipher + plain.charAt(j);
            }
        }
        }
        return cipher;
    }
    
    public String decrypt(String cipher,int depth) throws Exception{

    int iterator = 0;
    int leng = cipher.length();
    boolean goingdown = true;
    String plain = "";
    int map[] = new int[cipher.length()];
    char plainHolder[] = new char[cipher.length()];
    Queue<Character> collection = new LinkedList<>();
    
    
        for(int i=0;i<leng;i++){     
    if(goingdown){
        map[i]=iterator;
        if(iterator == depth-1){
            iterator-=1;
            goingdown = false;
        }else{
            iterator++;
        }
    }else{
        map[i]=iterator;
        if(iterator == 0){
            iterator++;
            goingdown = true;
        }else{
            iterator--;
        }
    }
}
        //to convert the cipher into queue for processing purpose
        for(char c: cipher.toCharArray()){
        collection.offer(c);
        }
        
        
        //assembling the whole text back
        
        for(int flag=0;flag<depth;flag++){
        for(int i=0;i< cipher.length();i++){
            if(map[i] == flag){
                map[i] = -1;
                plainHolder[i] = collection.poll();
                
            }
        }}
        for(int i=0;i<cipher.length();i++){
            plain = plain+plainHolder[i];
        }
    return plain;
}

    int anchi = 0 ;
}

