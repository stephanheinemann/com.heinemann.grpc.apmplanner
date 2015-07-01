package com.heinemann.grpc.apmplanner;

import static io.grpc.stub.ClientCalls.createMethodDescriptor;
import static io.grpc.stub.ClientCalls.asyncUnaryCall;
import static io.grpc.stub.ClientCalls.asyncServerStreamingCall;
import static io.grpc.stub.ClientCalls.asyncClientStreamingCall;
import static io.grpc.stub.ClientCalls.duplexStreamingCall;
import static io.grpc.stub.ClientCalls.blockingUnaryCall;
import static io.grpc.stub.ClientCalls.blockingServerStreamingCall;
import static io.grpc.stub.ClientCalls.unaryFutureCall;
import static io.grpc.stub.ServerCalls.createMethodDefinition;
import static io.grpc.stub.ServerCalls.asyncUnaryRequestCall;
import static io.grpc.stub.ServerCalls.asyncStreamingRequestCall;

@javax.annotation.Generated("by gRPC proto compiler")
public class UasManagerGrpc {

  private static final io.grpc.stub.Method<com.heinemann.grpc.apmplanner.ApmPlanner.Null,
      com.heinemann.grpc.apmplanner.ApmPlanner.UasIdentifier> METHOD_GET_ACTIVE_UAS =
      io.grpc.stub.Method.create(
          io.grpc.MethodType.UNARY, "getActiveUas",
          io.grpc.protobuf.ProtoUtils.marshaller(com.heinemann.grpc.apmplanner.ApmPlanner.Null.PARSER),
          io.grpc.protobuf.ProtoUtils.marshaller(com.heinemann.grpc.apmplanner.ApmPlanner.UasIdentifier.PARSER));
  private static final io.grpc.stub.Method<com.heinemann.grpc.apmplanner.ApmPlanner.UasIdentifier,
      com.heinemann.grpc.apmplanner.ApmPlanner.Null> METHOD_SET_ACTIVE_UAS =
      io.grpc.stub.Method.create(
          io.grpc.MethodType.UNARY, "setActiveUas",
          io.grpc.protobuf.ProtoUtils.marshaller(com.heinemann.grpc.apmplanner.ApmPlanner.UasIdentifier.PARSER),
          io.grpc.protobuf.ProtoUtils.marshaller(com.heinemann.grpc.apmplanner.ApmPlanner.Null.PARSER));
  private static final io.grpc.stub.Method<com.heinemann.grpc.apmplanner.ApmPlanner.UasIdentifier,
      com.heinemann.grpc.apmplanner.ApmPlanner.Uas> METHOD_GET_UAS =
      io.grpc.stub.Method.create(
          io.grpc.MethodType.UNARY, "getUas",
          io.grpc.protobuf.ProtoUtils.marshaller(com.heinemann.grpc.apmplanner.ApmPlanner.UasIdentifier.PARSER),
          io.grpc.protobuf.ProtoUtils.marshaller(com.heinemann.grpc.apmplanner.ApmPlanner.Uas.PARSER));
  private static final io.grpc.stub.Method<com.heinemann.grpc.apmplanner.ApmPlanner.Null,
      com.heinemann.grpc.apmplanner.ApmPlanner.Uas> METHOD_GET_UAS_LIST =
      io.grpc.stub.Method.create(
          io.grpc.MethodType.SERVER_STREAMING, "getUasList",
          io.grpc.protobuf.ProtoUtils.marshaller(com.heinemann.grpc.apmplanner.ApmPlanner.Null.PARSER),
          io.grpc.protobuf.ProtoUtils.marshaller(com.heinemann.grpc.apmplanner.ApmPlanner.Uas.PARSER));
  private static final io.grpc.stub.Method<com.heinemann.grpc.apmplanner.ApmPlanner.Null,
      com.heinemann.grpc.apmplanner.ApmPlanner.Null> METHOD_GO =
      io.grpc.stub.Method.create(
          io.grpc.MethodType.UNARY, "go",
          io.grpc.protobuf.ProtoUtils.marshaller(com.heinemann.grpc.apmplanner.ApmPlanner.Null.PARSER),
          io.grpc.protobuf.ProtoUtils.marshaller(com.heinemann.grpc.apmplanner.ApmPlanner.Null.PARSER));
  private static final io.grpc.stub.Method<com.heinemann.grpc.apmplanner.ApmPlanner.Null,
      com.heinemann.grpc.apmplanner.ApmPlanner.Null> METHOD_HALT =
      io.grpc.stub.Method.create(
          io.grpc.MethodType.UNARY, "halt",
          io.grpc.protobuf.ProtoUtils.marshaller(com.heinemann.grpc.apmplanner.ApmPlanner.Null.PARSER),
          io.grpc.protobuf.ProtoUtils.marshaller(com.heinemann.grpc.apmplanner.ApmPlanner.Null.PARSER));
  private static final io.grpc.stub.Method<com.heinemann.grpc.apmplanner.ApmPlanner.Null,
      com.heinemann.grpc.apmplanner.ApmPlanner.Null> METHOD_HOME =
      io.grpc.stub.Method.create(
          io.grpc.MethodType.UNARY, "home",
          io.grpc.protobuf.ProtoUtils.marshaller(com.heinemann.grpc.apmplanner.ApmPlanner.Null.PARSER),
          io.grpc.protobuf.ProtoUtils.marshaller(com.heinemann.grpc.apmplanner.ApmPlanner.Null.PARSER));
  private static final io.grpc.stub.Method<com.heinemann.grpc.apmplanner.ApmPlanner.Null,
      com.heinemann.grpc.apmplanner.ApmPlanner.Null> METHOD_LAND =
      io.grpc.stub.Method.create(
          io.grpc.MethodType.UNARY, "land",
          io.grpc.protobuf.ProtoUtils.marshaller(com.heinemann.grpc.apmplanner.ApmPlanner.Null.PARSER),
          io.grpc.protobuf.ProtoUtils.marshaller(com.heinemann.grpc.apmplanner.ApmPlanner.Null.PARSER));
  private static final io.grpc.stub.Method<com.heinemann.grpc.apmplanner.ApmPlanner.Null,
      com.heinemann.grpc.apmplanner.ApmPlanner.Null> METHOD_LAUNCH =
      io.grpc.stub.Method.create(
          io.grpc.MethodType.UNARY, "launch",
          io.grpc.protobuf.ProtoUtils.marshaller(com.heinemann.grpc.apmplanner.ApmPlanner.Null.PARSER),
          io.grpc.protobuf.ProtoUtils.marshaller(com.heinemann.grpc.apmplanner.ApmPlanner.Null.PARSER));
  private static final io.grpc.stub.Method<com.heinemann.grpc.apmplanner.ApmPlanner.Null,
      com.heinemann.grpc.apmplanner.ApmPlanner.Null> METHOD_REBOOT =
      io.grpc.stub.Method.create(
          io.grpc.MethodType.UNARY, "reboot",
          io.grpc.protobuf.ProtoUtils.marshaller(com.heinemann.grpc.apmplanner.ApmPlanner.Null.PARSER),
          io.grpc.protobuf.ProtoUtils.marshaller(com.heinemann.grpc.apmplanner.ApmPlanner.Null.PARSER));
  private static final io.grpc.stub.Method<com.heinemann.grpc.apmplanner.ApmPlanner.Null,
      com.heinemann.grpc.apmplanner.ApmPlanner.Null> METHOD_SHUTDOWN =
      io.grpc.stub.Method.create(
          io.grpc.MethodType.UNARY, "shutdown",
          io.grpc.protobuf.ProtoUtils.marshaller(com.heinemann.grpc.apmplanner.ApmPlanner.Null.PARSER),
          io.grpc.protobuf.ProtoUtils.marshaller(com.heinemann.grpc.apmplanner.ApmPlanner.Null.PARSER));
  private static final io.grpc.stub.Method<com.heinemann.grpc.apmplanner.ApmPlanner.UasMode,
      com.heinemann.grpc.apmplanner.ApmPlanner.Null> METHOD_SET_MODE =
      io.grpc.stub.Method.create(
          io.grpc.MethodType.UNARY, "setMode",
          io.grpc.protobuf.ProtoUtils.marshaller(com.heinemann.grpc.apmplanner.ApmPlanner.UasMode.PARSER),
          io.grpc.protobuf.ProtoUtils.marshaller(com.heinemann.grpc.apmplanner.ApmPlanner.Null.PARSER));

  public static UasManagerStub newStub(io.grpc.Channel channel) {
    return new UasManagerStub(channel, CONFIG);
  }

  public static UasManagerBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new UasManagerBlockingStub(channel, CONFIG);
  }

  public static UasManagerFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new UasManagerFutureStub(channel, CONFIG);
  }

  public static final UasManagerServiceDescriptor CONFIG =
      new UasManagerServiceDescriptor();

  @javax.annotation.concurrent.Immutable
  public static class UasManagerServiceDescriptor extends
      io.grpc.stub.AbstractServiceDescriptor<UasManagerServiceDescriptor> {
    public final io.grpc.MethodDescriptor<com.heinemann.grpc.apmplanner.ApmPlanner.Null,
        com.heinemann.grpc.apmplanner.ApmPlanner.UasIdentifier> getActiveUas;
    public final io.grpc.MethodDescriptor<com.heinemann.grpc.apmplanner.ApmPlanner.UasIdentifier,
        com.heinemann.grpc.apmplanner.ApmPlanner.Null> setActiveUas;
    public final io.grpc.MethodDescriptor<com.heinemann.grpc.apmplanner.ApmPlanner.UasIdentifier,
        com.heinemann.grpc.apmplanner.ApmPlanner.Uas> getUas;
    public final io.grpc.MethodDescriptor<com.heinemann.grpc.apmplanner.ApmPlanner.Null,
        com.heinemann.grpc.apmplanner.ApmPlanner.Uas> getUasList;
    public final io.grpc.MethodDescriptor<com.heinemann.grpc.apmplanner.ApmPlanner.Null,
        com.heinemann.grpc.apmplanner.ApmPlanner.Null> go;
    public final io.grpc.MethodDescriptor<com.heinemann.grpc.apmplanner.ApmPlanner.Null,
        com.heinemann.grpc.apmplanner.ApmPlanner.Null> halt;
    public final io.grpc.MethodDescriptor<com.heinemann.grpc.apmplanner.ApmPlanner.Null,
        com.heinemann.grpc.apmplanner.ApmPlanner.Null> home;
    public final io.grpc.MethodDescriptor<com.heinemann.grpc.apmplanner.ApmPlanner.Null,
        com.heinemann.grpc.apmplanner.ApmPlanner.Null> land;
    public final io.grpc.MethodDescriptor<com.heinemann.grpc.apmplanner.ApmPlanner.Null,
        com.heinemann.grpc.apmplanner.ApmPlanner.Null> launch;
    public final io.grpc.MethodDescriptor<com.heinemann.grpc.apmplanner.ApmPlanner.Null,
        com.heinemann.grpc.apmplanner.ApmPlanner.Null> reboot;
    public final io.grpc.MethodDescriptor<com.heinemann.grpc.apmplanner.ApmPlanner.Null,
        com.heinemann.grpc.apmplanner.ApmPlanner.Null> shutdown;
    public final io.grpc.MethodDescriptor<com.heinemann.grpc.apmplanner.ApmPlanner.UasMode,
        com.heinemann.grpc.apmplanner.ApmPlanner.Null> setMode;

    private UasManagerServiceDescriptor() {
      getActiveUas = createMethodDescriptor(
          "com.heinemann.grpc.apmplanner.UasManager", METHOD_GET_ACTIVE_UAS);
      setActiveUas = createMethodDescriptor(
          "com.heinemann.grpc.apmplanner.UasManager", METHOD_SET_ACTIVE_UAS);
      getUas = createMethodDescriptor(
          "com.heinemann.grpc.apmplanner.UasManager", METHOD_GET_UAS);
      getUasList = createMethodDescriptor(
          "com.heinemann.grpc.apmplanner.UasManager", METHOD_GET_UAS_LIST);
      go = createMethodDescriptor(
          "com.heinemann.grpc.apmplanner.UasManager", METHOD_GO);
      halt = createMethodDescriptor(
          "com.heinemann.grpc.apmplanner.UasManager", METHOD_HALT);
      home = createMethodDescriptor(
          "com.heinemann.grpc.apmplanner.UasManager", METHOD_HOME);
      land = createMethodDescriptor(
          "com.heinemann.grpc.apmplanner.UasManager", METHOD_LAND);
      launch = createMethodDescriptor(
          "com.heinemann.grpc.apmplanner.UasManager", METHOD_LAUNCH);
      reboot = createMethodDescriptor(
          "com.heinemann.grpc.apmplanner.UasManager", METHOD_REBOOT);
      shutdown = createMethodDescriptor(
          "com.heinemann.grpc.apmplanner.UasManager", METHOD_SHUTDOWN);
      setMode = createMethodDescriptor(
          "com.heinemann.grpc.apmplanner.UasManager", METHOD_SET_MODE);
    }

    @SuppressWarnings("unchecked")
    private UasManagerServiceDescriptor(
        java.util.Map<java.lang.String, io.grpc.MethodDescriptor<?, ?>> methodMap) {
      getActiveUas = (io.grpc.MethodDescriptor<com.heinemann.grpc.apmplanner.ApmPlanner.Null,
          com.heinemann.grpc.apmplanner.ApmPlanner.UasIdentifier>) methodMap.get(
          CONFIG.getActiveUas.getName());
      setActiveUas = (io.grpc.MethodDescriptor<com.heinemann.grpc.apmplanner.ApmPlanner.UasIdentifier,
          com.heinemann.grpc.apmplanner.ApmPlanner.Null>) methodMap.get(
          CONFIG.setActiveUas.getName());
      getUas = (io.grpc.MethodDescriptor<com.heinemann.grpc.apmplanner.ApmPlanner.UasIdentifier,
          com.heinemann.grpc.apmplanner.ApmPlanner.Uas>) methodMap.get(
          CONFIG.getUas.getName());
      getUasList = (io.grpc.MethodDescriptor<com.heinemann.grpc.apmplanner.ApmPlanner.Null,
          com.heinemann.grpc.apmplanner.ApmPlanner.Uas>) methodMap.get(
          CONFIG.getUasList.getName());
      go = (io.grpc.MethodDescriptor<com.heinemann.grpc.apmplanner.ApmPlanner.Null,
          com.heinemann.grpc.apmplanner.ApmPlanner.Null>) methodMap.get(
          CONFIG.go.getName());
      halt = (io.grpc.MethodDescriptor<com.heinemann.grpc.apmplanner.ApmPlanner.Null,
          com.heinemann.grpc.apmplanner.ApmPlanner.Null>) methodMap.get(
          CONFIG.halt.getName());
      home = (io.grpc.MethodDescriptor<com.heinemann.grpc.apmplanner.ApmPlanner.Null,
          com.heinemann.grpc.apmplanner.ApmPlanner.Null>) methodMap.get(
          CONFIG.home.getName());
      land = (io.grpc.MethodDescriptor<com.heinemann.grpc.apmplanner.ApmPlanner.Null,
          com.heinemann.grpc.apmplanner.ApmPlanner.Null>) methodMap.get(
          CONFIG.land.getName());
      launch = (io.grpc.MethodDescriptor<com.heinemann.grpc.apmplanner.ApmPlanner.Null,
          com.heinemann.grpc.apmplanner.ApmPlanner.Null>) methodMap.get(
          CONFIG.launch.getName());
      reboot = (io.grpc.MethodDescriptor<com.heinemann.grpc.apmplanner.ApmPlanner.Null,
          com.heinemann.grpc.apmplanner.ApmPlanner.Null>) methodMap.get(
          CONFIG.reboot.getName());
      shutdown = (io.grpc.MethodDescriptor<com.heinemann.grpc.apmplanner.ApmPlanner.Null,
          com.heinemann.grpc.apmplanner.ApmPlanner.Null>) methodMap.get(
          CONFIG.shutdown.getName());
      setMode = (io.grpc.MethodDescriptor<com.heinemann.grpc.apmplanner.ApmPlanner.UasMode,
          com.heinemann.grpc.apmplanner.ApmPlanner.Null>) methodMap.get(
          CONFIG.setMode.getName());
    }

    @java.lang.Override
    protected UasManagerServiceDescriptor build(
        java.util.Map<java.lang.String, io.grpc.MethodDescriptor<?, ?>> methodMap) {
      return new UasManagerServiceDescriptor(methodMap);
    }

    @java.lang.Override
    public com.google.common.collect.ImmutableList<io.grpc.MethodDescriptor<?, ?>> methods() {
      return com.google.common.collect.ImmutableList.<io.grpc.MethodDescriptor<?, ?>>of(
          getActiveUas,
          setActiveUas,
          getUas,
          getUasList,
          go,
          halt,
          home,
          land,
          launch,
          reboot,
          shutdown,
          setMode);
    }
  }

  public static interface UasManager {

    public void getActiveUas(com.heinemann.grpc.apmplanner.ApmPlanner.Null request,
        io.grpc.stub.StreamObserver<com.heinemann.grpc.apmplanner.ApmPlanner.UasIdentifier> responseObserver);

    public void setActiveUas(com.heinemann.grpc.apmplanner.ApmPlanner.UasIdentifier request,
        io.grpc.stub.StreamObserver<com.heinemann.grpc.apmplanner.ApmPlanner.Null> responseObserver);

    public void getUas(com.heinemann.grpc.apmplanner.ApmPlanner.UasIdentifier request,
        io.grpc.stub.StreamObserver<com.heinemann.grpc.apmplanner.ApmPlanner.Uas> responseObserver);

    public void getUasList(com.heinemann.grpc.apmplanner.ApmPlanner.Null request,
        io.grpc.stub.StreamObserver<com.heinemann.grpc.apmplanner.ApmPlanner.Uas> responseObserver);

    public void go(com.heinemann.grpc.apmplanner.ApmPlanner.Null request,
        io.grpc.stub.StreamObserver<com.heinemann.grpc.apmplanner.ApmPlanner.Null> responseObserver);

    public void halt(com.heinemann.grpc.apmplanner.ApmPlanner.Null request,
        io.grpc.stub.StreamObserver<com.heinemann.grpc.apmplanner.ApmPlanner.Null> responseObserver);

    public void home(com.heinemann.grpc.apmplanner.ApmPlanner.Null request,
        io.grpc.stub.StreamObserver<com.heinemann.grpc.apmplanner.ApmPlanner.Null> responseObserver);

    public void land(com.heinemann.grpc.apmplanner.ApmPlanner.Null request,
        io.grpc.stub.StreamObserver<com.heinemann.grpc.apmplanner.ApmPlanner.Null> responseObserver);

    public void launch(com.heinemann.grpc.apmplanner.ApmPlanner.Null request,
        io.grpc.stub.StreamObserver<com.heinemann.grpc.apmplanner.ApmPlanner.Null> responseObserver);

    public void reboot(com.heinemann.grpc.apmplanner.ApmPlanner.Null request,
        io.grpc.stub.StreamObserver<com.heinemann.grpc.apmplanner.ApmPlanner.Null> responseObserver);

    public void shutdown(com.heinemann.grpc.apmplanner.ApmPlanner.Null request,
        io.grpc.stub.StreamObserver<com.heinemann.grpc.apmplanner.ApmPlanner.Null> responseObserver);

    public void setMode(com.heinemann.grpc.apmplanner.ApmPlanner.UasMode request,
        io.grpc.stub.StreamObserver<com.heinemann.grpc.apmplanner.ApmPlanner.Null> responseObserver);
  }

  public static interface UasManagerBlockingClient {

    public com.heinemann.grpc.apmplanner.ApmPlanner.UasIdentifier getActiveUas(com.heinemann.grpc.apmplanner.ApmPlanner.Null request);

    public com.heinemann.grpc.apmplanner.ApmPlanner.Null setActiveUas(com.heinemann.grpc.apmplanner.ApmPlanner.UasIdentifier request);

    public com.heinemann.grpc.apmplanner.ApmPlanner.Uas getUas(com.heinemann.grpc.apmplanner.ApmPlanner.UasIdentifier request);

    public java.util.Iterator<com.heinemann.grpc.apmplanner.ApmPlanner.Uas> getUasList(
        com.heinemann.grpc.apmplanner.ApmPlanner.Null request);

    public com.heinemann.grpc.apmplanner.ApmPlanner.Null go(com.heinemann.grpc.apmplanner.ApmPlanner.Null request);

    public com.heinemann.grpc.apmplanner.ApmPlanner.Null halt(com.heinemann.grpc.apmplanner.ApmPlanner.Null request);

    public com.heinemann.grpc.apmplanner.ApmPlanner.Null home(com.heinemann.grpc.apmplanner.ApmPlanner.Null request);

    public com.heinemann.grpc.apmplanner.ApmPlanner.Null land(com.heinemann.grpc.apmplanner.ApmPlanner.Null request);

    public com.heinemann.grpc.apmplanner.ApmPlanner.Null launch(com.heinemann.grpc.apmplanner.ApmPlanner.Null request);

    public com.heinemann.grpc.apmplanner.ApmPlanner.Null reboot(com.heinemann.grpc.apmplanner.ApmPlanner.Null request);

    public com.heinemann.grpc.apmplanner.ApmPlanner.Null shutdown(com.heinemann.grpc.apmplanner.ApmPlanner.Null request);

    public com.heinemann.grpc.apmplanner.ApmPlanner.Null setMode(com.heinemann.grpc.apmplanner.ApmPlanner.UasMode request);
  }

  public static interface UasManagerFutureClient {

    public com.google.common.util.concurrent.ListenableFuture<com.heinemann.grpc.apmplanner.ApmPlanner.UasIdentifier> getActiveUas(
        com.heinemann.grpc.apmplanner.ApmPlanner.Null request);

    public com.google.common.util.concurrent.ListenableFuture<com.heinemann.grpc.apmplanner.ApmPlanner.Null> setActiveUas(
        com.heinemann.grpc.apmplanner.ApmPlanner.UasIdentifier request);

    public com.google.common.util.concurrent.ListenableFuture<com.heinemann.grpc.apmplanner.ApmPlanner.Uas> getUas(
        com.heinemann.grpc.apmplanner.ApmPlanner.UasIdentifier request);

    public com.google.common.util.concurrent.ListenableFuture<com.heinemann.grpc.apmplanner.ApmPlanner.Null> go(
        com.heinemann.grpc.apmplanner.ApmPlanner.Null request);

    public com.google.common.util.concurrent.ListenableFuture<com.heinemann.grpc.apmplanner.ApmPlanner.Null> halt(
        com.heinemann.grpc.apmplanner.ApmPlanner.Null request);

    public com.google.common.util.concurrent.ListenableFuture<com.heinemann.grpc.apmplanner.ApmPlanner.Null> home(
        com.heinemann.grpc.apmplanner.ApmPlanner.Null request);

    public com.google.common.util.concurrent.ListenableFuture<com.heinemann.grpc.apmplanner.ApmPlanner.Null> land(
        com.heinemann.grpc.apmplanner.ApmPlanner.Null request);

    public com.google.common.util.concurrent.ListenableFuture<com.heinemann.grpc.apmplanner.ApmPlanner.Null> launch(
        com.heinemann.grpc.apmplanner.ApmPlanner.Null request);

    public com.google.common.util.concurrent.ListenableFuture<com.heinemann.grpc.apmplanner.ApmPlanner.Null> reboot(
        com.heinemann.grpc.apmplanner.ApmPlanner.Null request);

    public com.google.common.util.concurrent.ListenableFuture<com.heinemann.grpc.apmplanner.ApmPlanner.Null> shutdown(
        com.heinemann.grpc.apmplanner.ApmPlanner.Null request);

    public com.google.common.util.concurrent.ListenableFuture<com.heinemann.grpc.apmplanner.ApmPlanner.Null> setMode(
        com.heinemann.grpc.apmplanner.ApmPlanner.UasMode request);
  }

  public static class UasManagerStub extends
      io.grpc.stub.AbstractStub<UasManagerStub, UasManagerServiceDescriptor>
      implements UasManager {
    private UasManagerStub(io.grpc.Channel channel,
        UasManagerServiceDescriptor config) {
      super(channel, config);
    }

    @java.lang.Override
    protected UasManagerStub build(io.grpc.Channel channel,
        UasManagerServiceDescriptor config) {
      return new UasManagerStub(channel, config);
    }

    @java.lang.Override
    public void getActiveUas(com.heinemann.grpc.apmplanner.ApmPlanner.Null request,
        io.grpc.stub.StreamObserver<com.heinemann.grpc.apmplanner.ApmPlanner.UasIdentifier> responseObserver) {
      asyncUnaryCall(
          channel.newCall(config.getActiveUas), request, responseObserver);
    }

    @java.lang.Override
    public void setActiveUas(com.heinemann.grpc.apmplanner.ApmPlanner.UasIdentifier request,
        io.grpc.stub.StreamObserver<com.heinemann.grpc.apmplanner.ApmPlanner.Null> responseObserver) {
      asyncUnaryCall(
          channel.newCall(config.setActiveUas), request, responseObserver);
    }

    @java.lang.Override
    public void getUas(com.heinemann.grpc.apmplanner.ApmPlanner.UasIdentifier request,
        io.grpc.stub.StreamObserver<com.heinemann.grpc.apmplanner.ApmPlanner.Uas> responseObserver) {
      asyncUnaryCall(
          channel.newCall(config.getUas), request, responseObserver);
    }

    @java.lang.Override
    public void getUasList(com.heinemann.grpc.apmplanner.ApmPlanner.Null request,
        io.grpc.stub.StreamObserver<com.heinemann.grpc.apmplanner.ApmPlanner.Uas> responseObserver) {
      asyncServerStreamingCall(
          channel.newCall(config.getUasList), request, responseObserver);
    }

    @java.lang.Override
    public void go(com.heinemann.grpc.apmplanner.ApmPlanner.Null request,
        io.grpc.stub.StreamObserver<com.heinemann.grpc.apmplanner.ApmPlanner.Null> responseObserver) {
      asyncUnaryCall(
          channel.newCall(config.go), request, responseObserver);
    }

    @java.lang.Override
    public void halt(com.heinemann.grpc.apmplanner.ApmPlanner.Null request,
        io.grpc.stub.StreamObserver<com.heinemann.grpc.apmplanner.ApmPlanner.Null> responseObserver) {
      asyncUnaryCall(
          channel.newCall(config.halt), request, responseObserver);
    }

    @java.lang.Override
    public void home(com.heinemann.grpc.apmplanner.ApmPlanner.Null request,
        io.grpc.stub.StreamObserver<com.heinemann.grpc.apmplanner.ApmPlanner.Null> responseObserver) {
      asyncUnaryCall(
          channel.newCall(config.home), request, responseObserver);
    }

    @java.lang.Override
    public void land(com.heinemann.grpc.apmplanner.ApmPlanner.Null request,
        io.grpc.stub.StreamObserver<com.heinemann.grpc.apmplanner.ApmPlanner.Null> responseObserver) {
      asyncUnaryCall(
          channel.newCall(config.land), request, responseObserver);
    }

    @java.lang.Override
    public void launch(com.heinemann.grpc.apmplanner.ApmPlanner.Null request,
        io.grpc.stub.StreamObserver<com.heinemann.grpc.apmplanner.ApmPlanner.Null> responseObserver) {
      asyncUnaryCall(
          channel.newCall(config.launch), request, responseObserver);
    }

    @java.lang.Override
    public void reboot(com.heinemann.grpc.apmplanner.ApmPlanner.Null request,
        io.grpc.stub.StreamObserver<com.heinemann.grpc.apmplanner.ApmPlanner.Null> responseObserver) {
      asyncUnaryCall(
          channel.newCall(config.reboot), request, responseObserver);
    }

    @java.lang.Override
    public void shutdown(com.heinemann.grpc.apmplanner.ApmPlanner.Null request,
        io.grpc.stub.StreamObserver<com.heinemann.grpc.apmplanner.ApmPlanner.Null> responseObserver) {
      asyncUnaryCall(
          channel.newCall(config.shutdown), request, responseObserver);
    }

    @java.lang.Override
    public void setMode(com.heinemann.grpc.apmplanner.ApmPlanner.UasMode request,
        io.grpc.stub.StreamObserver<com.heinemann.grpc.apmplanner.ApmPlanner.Null> responseObserver) {
      asyncUnaryCall(
          channel.newCall(config.setMode), request, responseObserver);
    }
  }

  public static class UasManagerBlockingStub extends
      io.grpc.stub.AbstractStub<UasManagerBlockingStub, UasManagerServiceDescriptor>
      implements UasManagerBlockingClient {
    private UasManagerBlockingStub(io.grpc.Channel channel,
        UasManagerServiceDescriptor config) {
      super(channel, config);
    }

    @java.lang.Override
    protected UasManagerBlockingStub build(io.grpc.Channel channel,
        UasManagerServiceDescriptor config) {
      return new UasManagerBlockingStub(channel, config);
    }

    @java.lang.Override
    public com.heinemann.grpc.apmplanner.ApmPlanner.UasIdentifier getActiveUas(com.heinemann.grpc.apmplanner.ApmPlanner.Null request) {
      return blockingUnaryCall(
          channel.newCall(config.getActiveUas), request);
    }

    @java.lang.Override
    public com.heinemann.grpc.apmplanner.ApmPlanner.Null setActiveUas(com.heinemann.grpc.apmplanner.ApmPlanner.UasIdentifier request) {
      return blockingUnaryCall(
          channel.newCall(config.setActiveUas), request);
    }

    @java.lang.Override
    public com.heinemann.grpc.apmplanner.ApmPlanner.Uas getUas(com.heinemann.grpc.apmplanner.ApmPlanner.UasIdentifier request) {
      return blockingUnaryCall(
          channel.newCall(config.getUas), request);
    }

    @java.lang.Override
    public java.util.Iterator<com.heinemann.grpc.apmplanner.ApmPlanner.Uas> getUasList(
        com.heinemann.grpc.apmplanner.ApmPlanner.Null request) {
      return blockingServerStreamingCall(
          channel.newCall(config.getUasList), request);
    }

    @java.lang.Override
    public com.heinemann.grpc.apmplanner.ApmPlanner.Null go(com.heinemann.grpc.apmplanner.ApmPlanner.Null request) {
      return blockingUnaryCall(
          channel.newCall(config.go), request);
    }

    @java.lang.Override
    public com.heinemann.grpc.apmplanner.ApmPlanner.Null halt(com.heinemann.grpc.apmplanner.ApmPlanner.Null request) {
      return blockingUnaryCall(
          channel.newCall(config.halt), request);
    }

    @java.lang.Override
    public com.heinemann.grpc.apmplanner.ApmPlanner.Null home(com.heinemann.grpc.apmplanner.ApmPlanner.Null request) {
      return blockingUnaryCall(
          channel.newCall(config.home), request);
    }

    @java.lang.Override
    public com.heinemann.grpc.apmplanner.ApmPlanner.Null land(com.heinemann.grpc.apmplanner.ApmPlanner.Null request) {
      return blockingUnaryCall(
          channel.newCall(config.land), request);
    }

    @java.lang.Override
    public com.heinemann.grpc.apmplanner.ApmPlanner.Null launch(com.heinemann.grpc.apmplanner.ApmPlanner.Null request) {
      return blockingUnaryCall(
          channel.newCall(config.launch), request);
    }

    @java.lang.Override
    public com.heinemann.grpc.apmplanner.ApmPlanner.Null reboot(com.heinemann.grpc.apmplanner.ApmPlanner.Null request) {
      return blockingUnaryCall(
          channel.newCall(config.reboot), request);
    }

    @java.lang.Override
    public com.heinemann.grpc.apmplanner.ApmPlanner.Null shutdown(com.heinemann.grpc.apmplanner.ApmPlanner.Null request) {
      return blockingUnaryCall(
          channel.newCall(config.shutdown), request);
    }

    @java.lang.Override
    public com.heinemann.grpc.apmplanner.ApmPlanner.Null setMode(com.heinemann.grpc.apmplanner.ApmPlanner.UasMode request) {
      return blockingUnaryCall(
          channel.newCall(config.setMode), request);
    }
  }

  public static class UasManagerFutureStub extends
      io.grpc.stub.AbstractStub<UasManagerFutureStub, UasManagerServiceDescriptor>
      implements UasManagerFutureClient {
    private UasManagerFutureStub(io.grpc.Channel channel,
        UasManagerServiceDescriptor config) {
      super(channel, config);
    }

    @java.lang.Override
    protected UasManagerFutureStub build(io.grpc.Channel channel,
        UasManagerServiceDescriptor config) {
      return new UasManagerFutureStub(channel, config);
    }

    @java.lang.Override
    public com.google.common.util.concurrent.ListenableFuture<com.heinemann.grpc.apmplanner.ApmPlanner.UasIdentifier> getActiveUas(
        com.heinemann.grpc.apmplanner.ApmPlanner.Null request) {
      return unaryFutureCall(
          channel.newCall(config.getActiveUas), request);
    }

    @java.lang.Override
    public com.google.common.util.concurrent.ListenableFuture<com.heinemann.grpc.apmplanner.ApmPlanner.Null> setActiveUas(
        com.heinemann.grpc.apmplanner.ApmPlanner.UasIdentifier request) {
      return unaryFutureCall(
          channel.newCall(config.setActiveUas), request);
    }

    @java.lang.Override
    public com.google.common.util.concurrent.ListenableFuture<com.heinemann.grpc.apmplanner.ApmPlanner.Uas> getUas(
        com.heinemann.grpc.apmplanner.ApmPlanner.UasIdentifier request) {
      return unaryFutureCall(
          channel.newCall(config.getUas), request);
    }

    @java.lang.Override
    public com.google.common.util.concurrent.ListenableFuture<com.heinemann.grpc.apmplanner.ApmPlanner.Null> go(
        com.heinemann.grpc.apmplanner.ApmPlanner.Null request) {
      return unaryFutureCall(
          channel.newCall(config.go), request);
    }

    @java.lang.Override
    public com.google.common.util.concurrent.ListenableFuture<com.heinemann.grpc.apmplanner.ApmPlanner.Null> halt(
        com.heinemann.grpc.apmplanner.ApmPlanner.Null request) {
      return unaryFutureCall(
          channel.newCall(config.halt), request);
    }

    @java.lang.Override
    public com.google.common.util.concurrent.ListenableFuture<com.heinemann.grpc.apmplanner.ApmPlanner.Null> home(
        com.heinemann.grpc.apmplanner.ApmPlanner.Null request) {
      return unaryFutureCall(
          channel.newCall(config.home), request);
    }

    @java.lang.Override
    public com.google.common.util.concurrent.ListenableFuture<com.heinemann.grpc.apmplanner.ApmPlanner.Null> land(
        com.heinemann.grpc.apmplanner.ApmPlanner.Null request) {
      return unaryFutureCall(
          channel.newCall(config.land), request);
    }

    @java.lang.Override
    public com.google.common.util.concurrent.ListenableFuture<com.heinemann.grpc.apmplanner.ApmPlanner.Null> launch(
        com.heinemann.grpc.apmplanner.ApmPlanner.Null request) {
      return unaryFutureCall(
          channel.newCall(config.launch), request);
    }

    @java.lang.Override
    public com.google.common.util.concurrent.ListenableFuture<com.heinemann.grpc.apmplanner.ApmPlanner.Null> reboot(
        com.heinemann.grpc.apmplanner.ApmPlanner.Null request) {
      return unaryFutureCall(
          channel.newCall(config.reboot), request);
    }

    @java.lang.Override
    public com.google.common.util.concurrent.ListenableFuture<com.heinemann.grpc.apmplanner.ApmPlanner.Null> shutdown(
        com.heinemann.grpc.apmplanner.ApmPlanner.Null request) {
      return unaryFutureCall(
          channel.newCall(config.shutdown), request);
    }

    @java.lang.Override
    public com.google.common.util.concurrent.ListenableFuture<com.heinemann.grpc.apmplanner.ApmPlanner.Null> setMode(
        com.heinemann.grpc.apmplanner.ApmPlanner.UasMode request) {
      return unaryFutureCall(
          channel.newCall(config.setMode), request);
    }
  }

  public static io.grpc.ServerServiceDefinition bindService(
      final UasManager serviceImpl) {
    return io.grpc.ServerServiceDefinition.builder("com.heinemann.grpc.apmplanner.UasManager")
      .addMethod(createMethodDefinition(
          METHOD_GET_ACTIVE_UAS,
          asyncUnaryRequestCall(
            new io.grpc.stub.ServerCalls.UnaryRequestMethod<
                com.heinemann.grpc.apmplanner.ApmPlanner.Null,
                com.heinemann.grpc.apmplanner.ApmPlanner.UasIdentifier>() {
              @java.lang.Override
              public void invoke(
                  com.heinemann.grpc.apmplanner.ApmPlanner.Null request,
                  io.grpc.stub.StreamObserver<com.heinemann.grpc.apmplanner.ApmPlanner.UasIdentifier> responseObserver) {
                serviceImpl.getActiveUas(request, responseObserver);
              }
            })))
      .addMethod(createMethodDefinition(
          METHOD_SET_ACTIVE_UAS,
          asyncUnaryRequestCall(
            new io.grpc.stub.ServerCalls.UnaryRequestMethod<
                com.heinemann.grpc.apmplanner.ApmPlanner.UasIdentifier,
                com.heinemann.grpc.apmplanner.ApmPlanner.Null>() {
              @java.lang.Override
              public void invoke(
                  com.heinemann.grpc.apmplanner.ApmPlanner.UasIdentifier request,
                  io.grpc.stub.StreamObserver<com.heinemann.grpc.apmplanner.ApmPlanner.Null> responseObserver) {
                serviceImpl.setActiveUas(request, responseObserver);
              }
            })))
      .addMethod(createMethodDefinition(
          METHOD_GET_UAS,
          asyncUnaryRequestCall(
            new io.grpc.stub.ServerCalls.UnaryRequestMethod<
                com.heinemann.grpc.apmplanner.ApmPlanner.UasIdentifier,
                com.heinemann.grpc.apmplanner.ApmPlanner.Uas>() {
              @java.lang.Override
              public void invoke(
                  com.heinemann.grpc.apmplanner.ApmPlanner.UasIdentifier request,
                  io.grpc.stub.StreamObserver<com.heinemann.grpc.apmplanner.ApmPlanner.Uas> responseObserver) {
                serviceImpl.getUas(request, responseObserver);
              }
            })))
      .addMethod(createMethodDefinition(
          METHOD_GET_UAS_LIST,
          asyncUnaryRequestCall(
            new io.grpc.stub.ServerCalls.UnaryRequestMethod<
                com.heinemann.grpc.apmplanner.ApmPlanner.Null,
                com.heinemann.grpc.apmplanner.ApmPlanner.Uas>() {
              @java.lang.Override
              public void invoke(
                  com.heinemann.grpc.apmplanner.ApmPlanner.Null request,
                  io.grpc.stub.StreamObserver<com.heinemann.grpc.apmplanner.ApmPlanner.Uas> responseObserver) {
                serviceImpl.getUasList(request, responseObserver);
              }
            })))
      .addMethod(createMethodDefinition(
          METHOD_GO,
          asyncUnaryRequestCall(
            new io.grpc.stub.ServerCalls.UnaryRequestMethod<
                com.heinemann.grpc.apmplanner.ApmPlanner.Null,
                com.heinemann.grpc.apmplanner.ApmPlanner.Null>() {
              @java.lang.Override
              public void invoke(
                  com.heinemann.grpc.apmplanner.ApmPlanner.Null request,
                  io.grpc.stub.StreamObserver<com.heinemann.grpc.apmplanner.ApmPlanner.Null> responseObserver) {
                serviceImpl.go(request, responseObserver);
              }
            })))
      .addMethod(createMethodDefinition(
          METHOD_HALT,
          asyncUnaryRequestCall(
            new io.grpc.stub.ServerCalls.UnaryRequestMethod<
                com.heinemann.grpc.apmplanner.ApmPlanner.Null,
                com.heinemann.grpc.apmplanner.ApmPlanner.Null>() {
              @java.lang.Override
              public void invoke(
                  com.heinemann.grpc.apmplanner.ApmPlanner.Null request,
                  io.grpc.stub.StreamObserver<com.heinemann.grpc.apmplanner.ApmPlanner.Null> responseObserver) {
                serviceImpl.halt(request, responseObserver);
              }
            })))
      .addMethod(createMethodDefinition(
          METHOD_HOME,
          asyncUnaryRequestCall(
            new io.grpc.stub.ServerCalls.UnaryRequestMethod<
                com.heinemann.grpc.apmplanner.ApmPlanner.Null,
                com.heinemann.grpc.apmplanner.ApmPlanner.Null>() {
              @java.lang.Override
              public void invoke(
                  com.heinemann.grpc.apmplanner.ApmPlanner.Null request,
                  io.grpc.stub.StreamObserver<com.heinemann.grpc.apmplanner.ApmPlanner.Null> responseObserver) {
                serviceImpl.home(request, responseObserver);
              }
            })))
      .addMethod(createMethodDefinition(
          METHOD_LAND,
          asyncUnaryRequestCall(
            new io.grpc.stub.ServerCalls.UnaryRequestMethod<
                com.heinemann.grpc.apmplanner.ApmPlanner.Null,
                com.heinemann.grpc.apmplanner.ApmPlanner.Null>() {
              @java.lang.Override
              public void invoke(
                  com.heinemann.grpc.apmplanner.ApmPlanner.Null request,
                  io.grpc.stub.StreamObserver<com.heinemann.grpc.apmplanner.ApmPlanner.Null> responseObserver) {
                serviceImpl.land(request, responseObserver);
              }
            })))
      .addMethod(createMethodDefinition(
          METHOD_LAUNCH,
          asyncUnaryRequestCall(
            new io.grpc.stub.ServerCalls.UnaryRequestMethod<
                com.heinemann.grpc.apmplanner.ApmPlanner.Null,
                com.heinemann.grpc.apmplanner.ApmPlanner.Null>() {
              @java.lang.Override
              public void invoke(
                  com.heinemann.grpc.apmplanner.ApmPlanner.Null request,
                  io.grpc.stub.StreamObserver<com.heinemann.grpc.apmplanner.ApmPlanner.Null> responseObserver) {
                serviceImpl.launch(request, responseObserver);
              }
            })))
      .addMethod(createMethodDefinition(
          METHOD_REBOOT,
          asyncUnaryRequestCall(
            new io.grpc.stub.ServerCalls.UnaryRequestMethod<
                com.heinemann.grpc.apmplanner.ApmPlanner.Null,
                com.heinemann.grpc.apmplanner.ApmPlanner.Null>() {
              @java.lang.Override
              public void invoke(
                  com.heinemann.grpc.apmplanner.ApmPlanner.Null request,
                  io.grpc.stub.StreamObserver<com.heinemann.grpc.apmplanner.ApmPlanner.Null> responseObserver) {
                serviceImpl.reboot(request, responseObserver);
              }
            })))
      .addMethod(createMethodDefinition(
          METHOD_SHUTDOWN,
          asyncUnaryRequestCall(
            new io.grpc.stub.ServerCalls.UnaryRequestMethod<
                com.heinemann.grpc.apmplanner.ApmPlanner.Null,
                com.heinemann.grpc.apmplanner.ApmPlanner.Null>() {
              @java.lang.Override
              public void invoke(
                  com.heinemann.grpc.apmplanner.ApmPlanner.Null request,
                  io.grpc.stub.StreamObserver<com.heinemann.grpc.apmplanner.ApmPlanner.Null> responseObserver) {
                serviceImpl.shutdown(request, responseObserver);
              }
            })))
      .addMethod(createMethodDefinition(
          METHOD_SET_MODE,
          asyncUnaryRequestCall(
            new io.grpc.stub.ServerCalls.UnaryRequestMethod<
                com.heinemann.grpc.apmplanner.ApmPlanner.UasMode,
                com.heinemann.grpc.apmplanner.ApmPlanner.Null>() {
              @java.lang.Override
              public void invoke(
                  com.heinemann.grpc.apmplanner.ApmPlanner.UasMode request,
                  io.grpc.stub.StreamObserver<com.heinemann.grpc.apmplanner.ApmPlanner.Null> responseObserver) {
                serviceImpl.setMode(request, responseObserver);
              }
            }))).build();
  }
}
