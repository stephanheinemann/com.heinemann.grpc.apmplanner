package com.heinemann.grpc.apmplanner;


import java.util.Iterator;

import io.grpc.ChannelImpl;
import io.grpc.transport.netty.NegotiationType;
import io.grpc.transport.netty.NettyChannelBuilder;

import com.heinemann.grpc.apmplanner.ApmPlanner.Null;
import com.heinemann.grpc.apmplanner.ApmPlanner.Uas;
import com.heinemann.grpc.apmplanner.ApmPlanner.UasIdentifier;
import com.heinemann.grpc.apmplanner.ApmPlanner.UasMode;
import com.heinemann.grpc.apmplanner.UasManagerGrpc.UasManagerBlockingStub;

public class UasManagerClient {

	private final ChannelImpl channel;
	private final UasManagerBlockingStub blockingStub;

	public UasManagerClient(String host, int port) {
		channel = NettyChannelBuilder.forAddress(host, port)
				.negotiationType(NegotiationType.PLAINTEXT).build();
		blockingStub = UasManagerGrpc.newBlockingStub(channel);
	}
	
	public int getActiveUas() {
		Null request = Null.newBuilder().build();
	    UasIdentifier uasIdentifier = blockingStub.getActiveUas(request);
		return uasIdentifier.getIdentifier();
	}
	
	public Uas getUas(int identifier) {
		UasIdentifier uasIdentifier = UasIdentifier.newBuilder().setIdentifier(identifier).build();
		return blockingStub.getUas(uasIdentifier);
	}
	
	public Iterator<Uas> getUasList() {
		Null request = Null.newBuilder().build();
		Iterator<Uas> uasList = blockingStub.getUasList(request);
		return uasList;
	}
	
	public void reboot() {
		Null request = Null.newBuilder().build();
		blockingStub.reboot(request);
	}
	
	public void setMode(int mode) {
		UasMode uasMode = UasMode.newBuilder().setMode(mode).build();
		blockingStub.setMode(uasMode);
	}
	
	public static void main(String[] args) {
		UasManagerClient client = new UasManagerClient("rigi-lab-03.cs.uvic.ca", 50051);
		//System.out.println("identifier = " + client.getActiveUas());
		
		Iterator<Uas> uasIterator = client.getUasList();
		while (uasIterator.hasNext()) {
			Uas uas = uasIterator.next();
			System.out.println(uas);
		}
		
		/*
		Uas uas = client.getUas(client.getActiveUas());
		System.out.println(uas.getIdentifier());
		System.out.println(uas.getName());
		System.out.println(uas.getBatterySpecs());
		*/
		
		client.reboot();
	}
}