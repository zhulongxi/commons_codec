package apache_commons_codec;

import java.util.Scanner;

import java.io.UnsupportedEncodingException;

import org.apache.commons.codec.binary.Base64;
import org.apache.commons.codec.digest.DigestUtils;
import org.apache.commons.codec.net.URLCodec;

public class commons_codec {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("输入编码方式：");
		String code_way = in.nextLine();
		int result = 0;
		try {
			result = commons_codec.judge(code_way);
		}
		catch(UnsupportedEncodingException e) {
			e.printStackTrace();
		}
		System.out.println("输入字符串：");
		String str = in.nextLine();
		commons_codec temp = new commons_codec();
		String catch_return = null;
		switch(result) {
		case 1:
			catch_return = temp.Base64(str);
			System.out.println("==========Base64==========");
			System.out.println("Base64 编码后：" + catch_return);
			break;
		case 2:
			catch_return = temp.MD5(str);
			System.out.println("==========MD5==========");
			System.out.println("MD5编码后：" + catch_return);
			break;
		case 3:
			catch_return = temp.UrlCodec(str);
			System.out.println("==========URLCodec==========");
			System.out.println("URLCodec编码后：" + catch_return);
			break;
		}
		if(catch_return == null) {
			System.out.println("error!");
		}
	}
	
	public static int judge(String str) throws UnsupportedEncodingException {
		if(str.equalsIgnoreCase("Base64")) {
			return 1;
		}
		if(str.equalsIgnoreCase("MD5")) {
			return 2;
		}
		if(str.equalsIgnoreCase("URLCodec")) {
			return 3;
		}
		else
			throw new UnsupportedEncodingException("没有该编码方式");
	}
	
	public String Base64(String str) {
		Base64 base64 = new Base64();
		try {
			str = base64.encodeToString(str.getBytes("UTF-8"));
		}
		catch(UnsupportedEncodingException e){
			e.printStackTrace();
		}
		
		return str;
	}
	
	public String MD5(String str) {
		str = DigestUtils.md5Hex(str);
		
		return str;
	}

	public String UrlCodec(String str) {
		URLCodec urlcodec = new URLCodec();
		try {
			str = urlcodec.encode(str, "UTF-8");
		}
		catch(UnsupportedEncodingException e) {
			e.printStackTrace();
		}
		
		return str;
	}
	
}
