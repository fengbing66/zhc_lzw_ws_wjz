package test;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Test {

 public static void main(String[] args) {
  
  File file=new File("F://movie.txt");//创建文本存储地址
  file.getParentFile().mkdirs();
  
  FileWriter fw=null;
  try {
   fw=new FileWriter(file);
   fw.write("您好！\r\n我一名学生！");
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
