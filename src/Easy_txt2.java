import java.io.*;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Easy_txt2 {
    /**
     * 抓取外部txt檔案資料,更改外部資料後重新創立新txt檔(自己寫的)
     */

    final String oldFilePath = "./easy.txt";
    final String newFilePath = "./easy2.txt";

    public static void main(String[] args) {
        Easy_txt2  easyTxt2 = new Easy_txt2();

        easyTxt2.create_New_File();

        easyTxt2.saveAsNewFile();
    }

    /**
     * 新建檔案
     */
    public void create_New_File(){
        File file = new File(oldFilePath);
        try {
            file.createNewFile();
            OutputStream out = new FileOutputStream(file);

            List<String> list = new ArrayList<>();

            list.add("1, 1234, javago\n");
            list.add("2, 1357, cookrecipe\n");
            list.add("3, 2468, simpleEnglish\n");
            list.add("4，3333，，French\n");
            list.add("5, 9090, cvw\n");

            for (String a : list){
                byte b[] = a.getBytes();
                out.write(b);
            }

            out.close();
            out.flush();
            System.out.println("新增完畢");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /**
     * 另存檔案
     */
    public void saveAsNewFile(){
        File file = new File(newFilePath);

        try {
            file.createNewFile();
            OutputStream out = new FileOutputStream(file);

            List<String> list = getTxtFile();

            list.remove(list.size()-1);//刪除list中最後一個資料

            for (String a : list){
                byte b[] = a.getBytes();
                out.write(b);
                out.write("\n".getBytes());
            }

            out.close();
            out.flush();
            System.out.println("結束");
        } catch (IOException e) {
            e.printStackTrace();
        }


    }

    /**
     * 讀取新建的檔案
     * @return
     */
    public List<String> getTxtFile(){
        BufferedReader br = null;
        List<String> list = null;
        try {
            br = new BufferedReader(new InputStreamReader(new FileInputStream(oldFilePath)));

            String read = null;
            list = new LinkedList<>();
            while ((read = br.readLine())!=null){
                System.out.println(read);
                list.add(read);//將讀取到的字串加入list中
            }

            br.close();

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        return list;
    }

}
