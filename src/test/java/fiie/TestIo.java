package fiie;

import org.apache.commons.io.FileUtils;
import org.apache.commons.io.IOUtils;

import java.io.*;

/**
 * @Author: 88397353
 * @Date: 2019/5/27
 */
public class TestIo {
    // 判断文件夹是否存在
    public static void judeDirExists(File file) {

        if (file.exists()) {
            if (file.isDirectory()) {
                System.out.println("dir exists");
            } else {
                System.out.println("the same name file exists, can not create dir");
            }
        } else {
            System.out.println("dir not exists, create it ...");
            file.mkdir();
        }

    }

    /**
     * 一个文件写到另一个文件,常用于图像,字节流
     */

    private static void writeF1(String path) {
        File f1 = new File(path);
        File out = new File("D:\\opt\\file\\image.txt");
        byte[] buf = new byte[1024];
        FileInputStream fis = null;
        FileOutputStream fos = null;
        try {
            if (!out.exists()) {

                out.createNewFile();
            }
            fis = new FileInputStream(f1);
            fos = new FileOutputStream(out);

            int len = fis.read(buf);
            while (len != -1) {
                fos.write(buf, 0, len);
                len = fis.read(buf);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                fis.close();
                fos.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        System.out.println("=============writeF1 Compete================");
    }

    /**
     * 一个文件写入另一个文件适用于文件
     *
     * @param path
     */
    private static void writeF2(String path) {
        File f1 = new File(path);
        File out = new File("D:\\opt\\file\\conf.txt");
        BufferedWriter bw = null;
        BufferedReader br = null;
        try {
            if (!out.exists()) {

                out.createNewFile();
            }
            InputStreamReader inStream = new InputStreamReader(new FileInputStream(f1), "gbk");
            OutputStreamWriter writerStream = new OutputStreamWriter(new FileOutputStream(out), "UTF-8");
            br = new BufferedReader(inStream);
            bw = new BufferedWriter(writerStream);
//            bw.write("this is string"); 字符串写入
//            bw.write("\r\n"); 换行
//            bw.close();
            String lineWriter = null;
            while ((lineWriter = br.readLine()) != null) {
                bw.write(lineWriter);
                bw.newLine();
                bw.flush();
            }

        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                br.close();
                bw.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        System.out.println("=============writeF2 Compete================");
    }

    private static void ioUtil(String path) {
        File f1 = new File(path);
        File out = new File("D:\\opt\\file\\ioUtil.txt");
        try {
            IOUtils.copy(new FileInputStream(f1), new FileOutputStream(out));
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println("=============ioUtil Compete================");
    }

    private static void fileUtil(String path) {
        File f1 = new File(path);
        File out = new File("D:\\opt\\file\\fileUtil.txt");
        try {
            FileUtils.copyFile(f1,out);
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println("=============fileUtil Compete================");
    }

    public static void main(String[] args) {
        String filePath = "D:\\opt\\file\\source.txt";
        writeF1(filePath);
        writeF2(filePath);
        ioUtil(filePath);
        fileUtil(filePath);
    }
}
