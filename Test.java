package test;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Test {

 public static void main(String[] args) {
  
  File file=new File("F://movie.txt");//�����ı��洢��ַ
  file.getParentFile().mkdirs();
  
  FileWriter fw=null;
  try {
   fw=new FileWriter(file);
   fw.write("���ã�\r\n��һ��ѧ����");
  } catch (IOException e) {
   e.printStackTrace();
  }
  finally {
   if(fw!=null)
   {
    try {
     fw.close();
    } catch (IOException e) {
     e.printStackTrace();
    }
   }
  }
 }

}
