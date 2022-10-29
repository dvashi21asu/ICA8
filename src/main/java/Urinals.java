/*
@author:Dhwanil Vashi
 */

import java.io.*;
import java.util.*;

public class Urinals {
    ArrayList<String> ipdata = new ArrayList<>();
    ArrayList<Integer> countUrinals = new ArrayList<>();

    public static void main(String[] args) throws IOException {
        Urinals uobj = new Urinals();
        String fileLoc = "src/urinal.dat";
        Boolean ip = uobj.opFile(fileLoc);
        System.out.println("urinal.dat File " );
        ArrayList<Integer> cnts = new ArrayList<>();
        cnts = uobj.uriCnt(uobj.ipdata);
        System.out.println("data verified & Output  calculated");
        Boolean op = uobj.addinfile(cnts);
        System.out.println("file generated : rule.txt:");
    }

    public Boolean opFile(String pathStr) {
        try {
            String data;
            File obj = new File(pathStr);
            BufferedReader in = new BufferedReader(new FileReader(obj));

            while ((data = in.readLine()) != null) {
                if (data.equals("EOF") || data.equals("-1")) {
                    break;
                }
                ipdata.add(data);
            }
            in.close();
            return true;

        } catch (FileNotFoundException e) {
            return false;
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public Boolean goodString(String str) { // checks to see if valid string
        return str != null;
    }

    public Boolean addinfile(ArrayList<Integer> sols) throws IOException {
        int counter = 0;
        File fileObj = new File("rule" + counter + ".txt");
        try {
            if (fileObj.createNewFile()) {
                FileWriter fileWriter = new FileWriter(fileObj);
                BufferedWriter buffWriter = new BufferedWriter(fileWriter);
                for (Integer result : sols) {
                    buffWriter.write(result + "");
                    buffWriter.newLine();
                }
                counter++;
                buffWriter.close();
            } else {
                counter++;
                fileObj = new File("rule" + counter + ".txt");
                FileWriter writer = new FileWriter(fileObj);
                BufferedWriter appendresurt = new BufferedWriter(writer);
                for (Integer result : sols) {
                    appendresurt.write(result + "");
                    appendresurt.newLine();
                }
                appendresurt.close();
            }
            return true;
        } catch (IOException E) {
            return false;
        }
    }

    public boolean chkFile(String path) {
        File obj = new File(path);
        return obj.length() == 0;
    }

    public ArrayList<Integer> uriCnt(ArrayList<String> strL) {
        ArrayList<Integer> cntList = new ArrayList<>();
        for (int i = 0; i < strL.size(); i++) {
            String str = strL.get(i);
            int unrCntNo = 0, len = str.length();
            if (str.charAt(0) == '0' && str.charAt(1) == '0') {
                unrCntNo++;
                StringBuffer buffed = new StringBuffer(str);
                buffed.setCharAt(0, '1');
                str = String.valueOf(buffed);
            }
            for (int j = 1; j < len - 1; j++) {
                if (str.charAt(j - 1) == '0' && str.charAt(j + 1) == '0' && str.charAt(j) == '0') {
                    unrCntNo++;
                    StringBuffer buffed0 = new StringBuffer(str);
                    buffed0.setCharAt(len - 1, '1');
                    str = String.valueOf(buffed0);
                }
            }
            if (str.charAt(len - 1) == '0' && str.charAt(len - 2) == '0') {
                unrCntNo++;
                StringBuffer buffed1 = new StringBuffer(str);
                buffed1.setCharAt(len - 1, '1');
                str = String.valueOf(buffed1);
            }
            for (int z = 0; z < len - 1; z++) {
                if (len > 1) {
                    if (str.charAt(z) == '1' && str.charAt(z + 1) == '1') {
                        unrCntNo = -1;
                    }
                }
            }
            cntList.add(unrCntNo);
        }
        return cntList;
    }


}
