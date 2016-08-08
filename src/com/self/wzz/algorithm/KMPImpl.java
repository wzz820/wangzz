package com.self.wzz.algorithm;

public class KMPImpl {
	
	public static int[] get_next(char[] t){
		int[] next = new int[t.length];
		int i = 0,j=-1;
		next[i] = j;
		while(i < t.length-1){
			if(j == -1 || t[i] == t[j]){
				++i;
				++j;
				if(t[i] != t[j]){
					next[i] = j;
				}else{
					next[i] = next[j];
				}
			}else{
				j = next[j];
			}
		}
		return next;
	}
	
	public static int index(char[] s,char[] t,int pos){
		int i = pos;
		int j = 0;
		int[] next = get_next(t);
		while(i <= s.length-1 && j <= t.length-1){
			if(j == -1 || s[i] == t[j]){
				++i;
				++j;
			}else{
				j = next[j];
			}
		}
		if(j > t.length-1){
			return i-t.length;
		}
		return 0;
	}
	
	public static void main(String[] args){
		char[] s = {'a','b','c','d','e','f','g','a','b'};
		char[] t = {'f','g','a'};
		System.out.println(index(s,t,0));
	}
	
}
