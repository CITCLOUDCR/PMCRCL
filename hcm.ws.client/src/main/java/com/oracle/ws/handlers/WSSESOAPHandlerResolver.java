package com.oracle.ws.handlers;

import java.util.ArrayList;
import java.util.List;

import javax.xml.ws.handler.Handler;
import javax.xml.ws.handler.HandlerResolver;
import javax.xml.ws.handler.PortInfo;

public class WSSESOAPHandlerResolver implements HandlerResolver {

	WSSESOAPHandler wsse=null;
	public WSSESOAPHandlerResolver(WSSESOAPHandler wsse) {
		this.wsse = wsse; 
	}
	
	//@Override
	public List<Handler> getHandlerChain(PortInfo portInfo) {
		List<Handler> handlerList = new ArrayList<Handler>();
		handlerList.add(this.wsse);
		return handlerList;
	}

}
