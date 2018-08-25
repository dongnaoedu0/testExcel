package com;

import java.io.File;
import java.util.HashMap;
import jxl.Sheet;
import jxl.Workbook;

public class getCellorRow{

	public void displayc(String name,int k,int i,int j,String key){
		
	    File file = new File("case/"+name+".xls");
	    try{
	      //建立文件
	      Workbook book = Workbook.getWorkbook(file);
	      //获取第一个表
	      Sheet sheet = book.getSheet(k-1);
	      
	    
	       // 创建一个MAP用来存储读取的值
	       HashMap<String, Object> map = new HashMap<String, Object>();
	       map.put(key, sheet.getCell(i, j).getContents());
	       System.out.println(map);
	       
	       
	       

	    }catch(Exception e){
	      e.printStackTrace();
	    }
	  
	}
	public static void main(String[] args) {
		getCellorRow gt=new getCellorRow();
		gt.displayc("helloExcel", 1, 0, 1, "name");
		
	}
}