package com.ssi.seek.tool;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import com.ssi.seek.tool.data.SensitiveWord;

/** 
 *  敏感词过滤 工具类   -- 【匹配度高，可以使用】
 *  《高效精准》敏感字&词过滤：http://blog.csdn.net/hubiao_0618/article/details/45076871
 * @author Tisawudii modified for Web verification.
 * @version 0.2
 */  
public class SensitiveWordCheck {  
    private StringBuilder replaceAll;//初始化  
    private String encoding = "UTF-8";  
    private String replceStr = "*";  
    private int replceSize = 500;  
    private String fileName = "CensorWords.txt";  
    private List<String> arrayList;  
    public static Set<String> sensitiveWordSet;//包含的敏感词列表，过滤掉重复项
    public List<String> sensitiveWordList;//包含的敏感词列表，包括重复项，统计次数
    
    /** 
     * 文件要求路径在src或resource下，默认文件名为CensorWords.txt 
     * @param fileName 词库文件名(含后缀) 
     */  
    public SensitiveWordCheck(String fileName)  
    {  
        this.fileName = fileName;  
    }  
      
    /** 
     * @param replceStr 敏感词被转换的字符 
     * @param replceSize 初始转义容量 
     */  
    public SensitiveWordCheck(String replceStr,int replceSize)  
    {  
        this.replceStr = fileName;  
        this.replceSize = replceSize;  
    }  
      
    public SensitiveWordCheck()  
    {  
    }  
    
    /** 
     * @param str 将要被过滤信息 
     * @return 过滤后的信息 
     */  
    public SensitiveWord filterInfo(String str)  
    {  	
    	int StringLength = str.length();//StringLength
    	
    	sensitiveWordSet = new HashSet<String>();
    	sensitiveWordList= new ArrayList<>();
        StringBuilder buffer = new StringBuilder(str);  
        HashMap<Integer, Integer> hash = new HashMap<Integer, Integer>(arrayList.size());  
        String temp;  
        for(int x = 0; x < arrayList.size();x++)  
        {  
            temp = arrayList.get(x);  
            int findIndexSize = 0;  
            for(int start = -1;(start=buffer.indexOf(temp,findIndexSize)) > -1;)  
            {
                findIndexSize = start+temp.length();//从已找到的后面开始找  
                Integer mapStart = hash.get(start);//起始位置  
                if(mapStart == null || (mapStart != null && findIndexSize > mapStart))//满足1个，即可更新map  
                {  
                    hash.put(start, findIndexSize);
                }  
            }  
        }  
        Collection<Integer> values = hash.keySet();  
        for(Integer startIndex : values)  
        {  
            Integer endIndex = hash.get(startIndex);  
            //获取敏感词，并加入列表，用来统计数量
            String sensitive = buffer.substring(startIndex, endIndex);
            if (!sensitive.contains("*")) {//添加敏感词到集合
            	sensitiveWordSet.add(sensitive);
            	sensitiveWordList.add(sensitive);
			}
            buffer.replace(startIndex, endIndex, replaceAll.substring(0,endIndex-startIndex));
        }  
        hash.clear();
        
        String OutString = buffer.toString();//OutString
        Set<String> SensitiveWordSet = sensitiveWordSet;//SensitiveWordSet
        int SensitiveWordSize = SensitiveWordSet.size();//SensitiveWordSize
        SensitiveWord Sword = new SensitiveWord(StringLength, OutString, SensitiveWordSet, SensitiveWordSize);
        
        return Sword;
    }  
    /** 
     *   初始化敏感词库 
     */  
    public void InitializationWork()  
    {  
        replaceAll = new StringBuilder(replceSize);  
        for(int x=0;x < replceSize;x++)  
        {  
            replaceAll.append(replceStr);  
        }  
        //加载词库  
        arrayList = new ArrayList<String>();  
        InputStreamReader read = null;  
        BufferedReader bufferedReader = null;  
        try {  
            read = new InputStreamReader(SensitiveWordCheck.class.getClassLoader().getResourceAsStream(fileName),encoding);  
            bufferedReader = new BufferedReader(read);  
            for(String txt = null;(txt = bufferedReader.readLine()) != null;){  
                if(!arrayList.contains(txt))  
                    arrayList.add(txt);  
            }  
        } catch (UnsupportedEncodingException e) {  
            e.printStackTrace();  
        } catch (IOException e) {  
            e.printStackTrace();  
        }finally{  
            try {  
                if(null != bufferedReader)  
                bufferedReader.close();  
            } catch (IOException e) {  
                e.printStackTrace();  
            }  
            try {  
                if(null != read)  
                read.close();  
            } catch (IOException e) {  
                e.printStackTrace();  
            }  
        }  
    }  
    
    public StringBuilder getReplaceAll() {  
        return replaceAll;  
    }  
    public void setReplaceAll(StringBuilder replaceAll) {  
        this.replaceAll = replaceAll;  
    }  
    public String getReplceStr() {  
        return replceStr;  
    }  
    public void setReplceStr(String replceStr) {  
        this.replceStr = replceStr;  
    }  
    public int getReplceSize() {  
        return replceSize;  
    }  
    public void setReplceSize(int replceSize) {  
        this.replceSize = replceSize;  
    }  
    public String getFileName() {  
        return fileName;  
    }  
    public void setFileName(String fileName) {  
        this.fileName = fileName;  
    }  
    public List<String> getArrayList() {  
        return arrayList;  
    }  
    public void setArrayList(List<String> arrayList) {  
        this.arrayList = arrayList;  
    }  
    public String getEncoding() {  
        return encoding;  
    }  
    public void setEncoding(String encoding) {  
        this.encoding = encoding;  
    }  
    
    public static void main(String[] args){
    	long startNumber = System.currentTimeMillis();
		SensitiveWordCheck sw = new SensitiveWordCheck("CensorWords.txt");  
	    sw.InitializationWork();
	    String str = "什么破网站bitch";
	    /**
	     * 字符串的长度
	     * */
	    System.out.println("字符串长度："+str.length());
	    /**
	     * 将字符串进行转换
	     * */
	    //sw.filterInfo(str);  
	    long endNumber = System.currentTimeMillis();
	    System.out.println("语句中包含敏感词的个数为：" + sw.filterInfo(str).getSensitiveWordSet().size() + "。包含：" + sw.filterInfo(str).getSensitiveWordSet());
	    System.out.println("总共耗时:"+(endNumber-startNumber)+"ms");
	    System.out.println("替换后的字符串为:\n"+sw.filterInfo(str).getOutString());
	}
}  

