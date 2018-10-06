package com.ssi.seek.tool.data;

import java.util.Set;

public class SensitiveWord{
	
	public SensitiveWord(int StringLength, String OutString, Set<String> SensitiveWordSet, int SensitiveWordSize){
		this.setOutString(OutString);
		this.setSensitiveWordSet(SensitiveWordSet);
		this.setSensitiveWordSize(SensitiveWordSize);
		this.setStringLength(StringLength);
	}
	/*Input String’s length*/
	private int StringLength;
	/*转换后的字符串*/
	private String OutString;
	/*检查出的敏感字集合*/
	private Set<String> SensitiveWordSet;
	/*检查出的敏感字个数*/
	private int SensitiveWordSize;
	public int getStringLength() {
		return StringLength;
	}
	public void setStringLength(int stringLength) {
		StringLength = stringLength;
	}
	public String getOutString() {
		return OutString;
	}
	public void setOutString(String outString) {
		OutString = outString;
	}
	public Set<String> getSensitiveWordSet() {
		return SensitiveWordSet;
	}
	public void setSensitiveWordSet(Set<String> sensitiveWordSet) {
		SensitiveWordSet = sensitiveWordSet;
	}
	public int getSensitiveWordSize() {
		return SensitiveWordSize;
	}
	public void setSensitiveWordSize(int sensitiveWordSize) {
		SensitiveWordSize = sensitiveWordSize;
	}
	
	
}