package com.heinemann.grpc.apmplanner;


import java.util.Iterator;

import io.grpc.ChannelImpl;
import io.grpc.transport.netty.NegotiationType;
import io.grpc.transport.netty.NettyChannelBuilder;

import com.heinemann.grpc.apmplanner.ApmPlanner.Null;
import com.heinemann.grpc.apmplanner.ApmPlanner.Uas;
import com.heinemann.grpc.apmplanner.ApmPlanner.UasArmed;
import com.heinemann.grpc.apmplanner.ApmPlanner.UasIdentifier;
import com.heinemann.grpc.apmplanner.ApmPlanner.UasMode;
import com.heinemann.grpc.apmplanner.ApmPlanner.UasSubscriber;
import com.heinemann.grpc.apmplanner.UasManagerGrpc.UasManagerBlockingStub;

public class UasManagerClient {

	public static final String HOST = "rigi-lab-03.cs.uvic.ca";
	public static final int PORT = 50051;
	
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
	
	public void go() {
		Null request = Null.newBuilder().build();
		blockingStub.go(request);
	}
	
	public void halt() {
		Null request = Null.newBuilder().build();
		blockingStub.home(request);
	}
	
	public void home() {
		Null request = Null.newBuilder().build();
		blockingStub.home(request);
	}
	
	public void land() {
		Null request = Null.newBuilder().build();
		blockingStub.land(request);
	}
	
	public void launch() {
		Null request = Null.newBuilder().build();
		blockingStub.launch(request);
	}
	
	public void reboot() {
		Null request = Null.newBuilder().build();
		blockingStub.reboot(request);
	}
	
	public void shutdown() {
		Null request = Null.newBuilder().build();
		blockingStub.shutdown(request);
	}
	
	public void setMode(int mode) {
		UasMode uasMode = UasMode.newBuilder().setMode(mode).build();
		blockingStub.setMode(uasMode);
	}
	
	public void setArmed(boolean armed) {
		UasArmed uasArmed = UasArmed.newBuilder().setArmed(armed).build();
		blockingStub.setArmed(uasArmed);
	}
	
	public Iterator<UasSubscriber> getSubscribers() {
		Null request = Null.newBuilder().build();
		Iterator<UasSubscriber> subscribers = blockingStub.getSubscribers(request);
		return subscribers;
	}
	
	public void addSubscriber(String subscriber) {
		UasSubscriber uasSubscriber = UasSubscriber.newBuilder().setSubscriber(subscriber).build();
		blockingStub.addSubscriber(uasSubscriber);
	}
	
	public void removeSubscriber(String subscriber) {
		UasSubscriber uasSubscriber = UasSubscriber.newBuilder().setSubscriber(subscriber).build();
		blockingStub.removeSubscriber(uasSubscriber);
	}
	
	public static void main(String[] args) {
		UasManagerClient client = new UasManagerClient(HOST, PORT);
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
		
		//client.reboot();
	}
}
