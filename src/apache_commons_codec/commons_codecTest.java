package apache_commons_codec;

import static org.junit.Assert.*;

import java.io.UnsupportedEncodingException;

import org.apache.commons.codec.EncoderException;
import org.apache.commons.codec.binary.Base64;
import org.apache.commons.codec.digest.DigestUtils;
import org.apache.commons.codec.net.URLCodec;
import org.junit.Test;

public class commons_codecTest {

	/*
	@Test
	void test_judge_1() {
		test1 temp = new test1();
		String str = "123";
		try {
			temp.judge(str);
		}catch(UnsupportedEncodingException e) {
			e.printStackTrace();
		}
	}
	*/

	@Test
	public void test_judge_2() throws UnsupportedEncodingException {
		String str1 = "base64";
		String str2 = "md5";
		String str3 = "urlcodec";
		assertEquals(1, commons_codec.judge(str1));
		assertEquals(2, commons_codec.judge(str2));
		assertEquals(3, commons_codec.judge(str3));
	}
	
	@Test
	public void test_base64() {
		commons_codec temp = new commons_codec();
		String str = "123";
		//MTIz
		assertEquals("MTIz", temp.Base64(str));
		
	}
	
	@Test
	public void test_md5() {
		String str = "123";
		//202cb962ac59075b964b07152d234b70
		str = DigestUtils.md5Hex(str);
		assertEquals("202cb962ac59075b964b07152d234b70", str);
	}
	
	@Test
	public void test_urlcodec() throws EncoderException {
		String str = "123";
		//123
		URLCodec urlcodec = new URLCodec();
		assertEquals("123", urlcodec.encode(str));
	}

}
