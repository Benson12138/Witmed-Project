package cn.Benson.witmed.util.message;

import cn.Benson.witmed.util.Constants;
import com.cloopen.rest.sdk.CCPRestSmsSDK;
import sun.applet.Main;

import java.util.HashMap;
import java.util.Set;

/**
 * 容联云短信发送工具类
 */
public class CloopenSMSUtil {
	/**
	 * 发送验证码短信
	 * @param cellphone
	 * @param verification
	 * @throws Exception
	 */
	public static void sendVerificationCode(String cellphone,String verificationCode)
			throws Exception{
		HashMap<String, Object> result = null;
		CCPRestSmsSDK restAPI = new CCPRestSmsSDK();
		restAPI.init(Constants.CLOOPEN_SERVER_URL, Constants.CLOOPEN_SERVER_PORT);
		// 初始化服务器地址和端口，生产环境配置成app.cloopen.com，端口是8883.
		restAPI.setAccount(Constants.CLOOPEN_ACCOUNT_SID, Constants.CLOOPEN_ACCOUNT_TOKEN);
		// 初始化主账号名称和主账号令牌，登陆云通讯网站后，可在控制首页中看到开发者主账号ACCOUNT SID和主账号令牌AUTH TOKEN。
		restAPI.setAppId(Constants.CLOOPEN_APP_ID);
		// 请使用管理控制台中已创建应用的APPID。
		result = restAPI.sendTemplateSMS(cellphone,Constants.CLOOPEN_TEMPLATE_ID ,
				new String[]{verificationCode, String.valueOf(Constants.VERIFICATION_EXPIRE_MILLIS/1000/60)});
		System.out.println("SDKTestGetSubAccounts result=" + result);
		if("000000".equals(result.get("statusCode"))){
			//正常返回输出data包体信息（map）
			HashMap<String,Object> data = (HashMap<String, Object>) result.get("data");
			Set<String> keySet = data.keySet();
			for(String key:keySet){
				Object object = data.get(key);
				System.out.println(key +" = "+object);
			}
		}else{
			//异常返回输出错误码和错误信息
			System.out.println("错误码=" + result.get("statusCode") +" 错误信息= "+result.get("statusMsg"));
		}
	}

	public static void main(String[] args) throws Exception {
		sendVerificationCode("18706714326","123456");
	}
}
