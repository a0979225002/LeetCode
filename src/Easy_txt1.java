import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 * 抓取外部txt檔案資料,更改外部資料後重新創立新txt檔(馬來西亞人寫的)
 */
public class Easy_txt1 {
    private static Scanner x;
    public static void main(String[] args) {
        String filepath = "easy.txt";
        String removeLine = "3333";
        removeRecord(filepath,removeLine);
    }
    public static void removeRecord(String filepath,String removeLine) {
        String tempFile = "temp.txt";
        File oldFile = new File(filepath);
        File newFile = new File(tempFile);
        String no = ""; String ISBN = ""; String title = "";
        try
        {
            PrintWriter pw = new PrintWriter(new BufferedWriter(new FileWriter(filepath)));

            x = new Scanner(new File(filepath));
            while (x.hasNext())
            {
                no = x.next();
                ISBN = x.next();
                title = x.next();
                if (!ISBN.equals(removeLine))
                {
                    pw.println(no + "," + ISBN + ","   + title );
                }
                File dump = new File(filepath);
                newFile.renameTo(dump);
            }
//            x.close();
//            pw.flush();
//            pw.close();
//            oldFile.delete();
        }
        catch (Exception e)
        {
            System.out.println(e.toString());
        }
    }
}

