package common;

import javax.print.DocFlavor.BYTE_ARRAY;

public class CheckValueBeforeCasting {
	public static void main(String[] args) {
		int i = 128;
//		System.out.println(Byte.MAX_VALUE); //byte
//		System.out.println(Byte.MIN_VALUE);
//		맥스에서 민범위에서 벗어나지않겠다할떄 바이비 바이아이
		if (i > Byte.MAX_VALUE || i < Byte.MIN_VALUE)
		System.out.println("byte타입으로 변환불가.");
		}else {			
		byte b = (byte)	i; 
		System.out.println(b);
		
//		55p
		
}
}
