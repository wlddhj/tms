/**
 * 
 */
package com.hhz.tms.util;

import java.io.IOException;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.SerializerProvider;


/**
 * @author huangjian
 * @param <T>
 *
 */
public class  MyCustomSerializer<T> extends JsonSerializer<T> {

	@Override
	public void serialize(T value, JsonGenerator jgen, SerializerProvider provider) throws IOException,
			JsonProcessingException {
		// TODO Auto-generated method stub
		
	}

}
