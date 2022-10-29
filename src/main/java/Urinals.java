/*
@author:Dhwanil Vashi
 */

import java.io.*;
import java.util.*;

public class Urinals {
    ArrayList<String> inputs = new ArrayList<>();
    ArrayList<Integer> countUrinals = new ArrayList<>();

    public static void main(String[] args) {

    }

    public Boolean opFile(String addressStr){
        try{
            String str;
            File fileObj = new File(addressStr);
            Scanner scannerC = new Scanner(fileObj);
            while(scannerC.hasNextLine()){
                str = scannerC.nextLine();
                inputs.add(str);
            }
            scannerC.close();
            return true;

        } catch (FileNotFoundException e) {
            return false;
        }
    }
    public Boolean goodString(String str) { // checks to see if valid string
        return str!=null;
}
    public ArrayList<Integer> urinalCount(ArrayList<String> strList){
        int count;
        for(int i=0;i<strList.size();i++){
            String str = strList.get(i);
            count = 0;
            for(int j=0;j<str.length();j++){
                if(j==0){
                    if(str.charAt(0)=='0' && str.charAt(1)=='0'){
                        count++;
                    }
                }

            }
            countUrinals.add(count);
        }
        return countUrinals;

}



}
