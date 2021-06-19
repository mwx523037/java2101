package FanShe;

import java.io.*;

public class Test1 {
    public static void main(String[] args) throws IOException {
        FileInputStream fileInputStream=null;
        try {
           fileInputStream=new FileInputStream("F:\\考试.74\\PaiXu.java");
            //  获取文件目录
            byte[]bytes=new byte[300];
            int len=fileInputStream.read(bytes);
            System.out.println(len);
                String str=new String(bytes,0,len,"utf-8");
            System.out.println(str);
            for (int a:bytes){
               // System.out.println((char)a);
            }
            int a=fileInputStream.read();
            System.out.println(a);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            fileInputStream.close();
        }
    }
}
