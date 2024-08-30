package com.fortune.Fortunes;

import java.io.File;
import java.io.FileReader;
import java.util.Random;

public class FortuneTeller{
    
    static String filePath = "./src/main/resources/static/fortunes.txt";
    static int fileLength=359069;
    public static Fortune getFortune(){
        Fortune res = new Fortune();
        File f = new File(filePath);
        if(f.exists()){
            Random rand = new Random();
            int start = rand.nextInt(fileLength+1-40);
            StringBuilder temp = new StringBuilder();
            try(FileReader fr = new FileReader(f)){
                fr.skip(start);
                int ch = fr.read();
                while(ch!=37){
                    ch = fr.read();
                }
                ch = fr.read();
                while(ch!=37){
                    ch = fr.read();   
                    if(ch==37||ch==45){
                        break;
                    }
                    temp.append((char)ch);
                }
                res.fortune = temp.toString().strip();
                temp.delete(0, temp.length()); 
                if(ch!=37){
                    while(ch!=37){
                        ch = fr.read();
                        temp.append((char)ch); 
                    }
                    temp.setLength(temp.length() - 2);
                    res.author=temp.toString().strip();
                } 
                else{
                    res.author = "";
                }               
            } catch(Exception e){
                res.fortune = "error";
                res.author = "error";
                return res;
            }
        }
        else{
            res.fortune = "error";
            res.author = "error";
            return res;
        }
        return res;
    }
}