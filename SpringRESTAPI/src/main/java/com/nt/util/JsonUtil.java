package com.nt.util;

import org.codehaus.jackson.JsonParseException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;

public class JsonUtil {
	public static String convertJavaToJson(Object obj){
		String jsonStr="{}";
		ObjectMapper mapper=new ObjectMapper();
		try{
			jsonStr=mapper.writeValueAsString(obj);
		}catch(Exception e){
			e.printStackTrace();
		}
		return jsonStr;
	}
	 public static <T> T convertJsonToJava(String jsonStr,Class<T> targetClazz){
    	 T response=null;
    	 ObjectMapper mapper=new ObjectMapper();
    	 try{
    		 response=mapper.readValue(jsonStr, targetClazz);
    	 }catch(JsonParseException e){
    		 e.printStackTrace();
    	 }catch(JsonMappingException jme){
    		 jme.printStackTrace();
    	 }catch (Exception e) {
			// TODO: handle exception
    		 e.printStackTrace();
		}
    	 return response;
     }

}
