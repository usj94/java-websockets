package com.uma.websocket.web;

import javax.websocket.DecodeException;
import javax.websocket.Decoder;
import javax.websocket.EndpointConfig;

import com.google.gson.Gson;
import com.uma.websocket.model.Message;

public class MessageDecoder implements Decoder.Text<Message> {
    private static Gson gson = new Gson();

	@Override
	public void destroy() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void init(EndpointConfig arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Message decode(String s) throws DecodeException {
		 Message message = gson.fromJson(s, Message.class);
	        return message;
	}

	@Override
	public boolean willDecode(String s) {
		  return (s != null);
	}

    
    
    
    
    
    
    
    
    
   
}
