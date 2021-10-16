package algorithm;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;

public class CountTxt {

	public static void readFile(File file) throws IOException {
        
        InputStream is;
        InputStreamReader ip;
        BufferedReader bf;
        try {
            is = new FileInputStream(file);
            ip = new InputStreamReader(is);
            bf = new BufferedReader(ip);
            
            String[] content;
            Map<String,Integer> map = new HashMap<String,Integer>();
            Map<String,BigDecimal> map2 = new HashMap<String,BigDecimal>();//大數字用bigdecimal精度更佳
            
            String lineContent = bf.readLine();

            while((lineContent = bf.readLine()) !=null) {
                System.out.println(lineContent);            
                content = lineContent.split("\\|");//直線分隔需要轉譯

                String branch_id = content[2];
                String source_type = content[1];
                BigDecimal deal_amt = new BigDecimal(content[7]);
                
                if(content[2].equals("TBB")) continue;

                if(map.containsKey(content[1]) ) {
                    int value = map.get(content[1]);
                    value++;
                    map.put(content[1], value);
                }
                else {
                    map.put(content[1], 1);
                }
                
                if(map2.containsKey(content[1])  ) {
                    BigDecimal value = map2.get(content[1]);
                    value.add(new BigDecimal(content[7]));
                    map2.put(content[1], value);
                }
                else  {
                    map2.put(content[1], new BigDecimal(content[7]));
                }
               
            }
            System.out.println(map.toString());
            System.out.println(map2.toString());
        } catch (NumberFormatException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (FileNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        /*is.close();
        ip.close();
        bf.close(); 用try包了這些就不用關掉*/
    }
    
    public static void main(String[] args) throws IOException {
        // TODO Auto-generated method stub
        String filename = "C:\\Users\\2020062901\\Documents\\JackyExamResources\\exam3\\CR3000_DETAIL.TXT";
        File file = new File(filename);
        readFile(file);
            
        
    }
}
