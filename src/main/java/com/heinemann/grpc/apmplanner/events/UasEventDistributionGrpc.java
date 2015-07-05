package com.heinemann.grpc.apmplanner.events;

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
public class UasEventDistributionGrpc {

  private static final io.grpc.stub.Method<com.heinemann.grpc.apmplanner.events.ApmEvents.UasEvent,
      com.heinemann.grpc.apmplanner.events.ApmEvents.Null> METHOD_FIRE =
      io.grpc.stub.Method.create(
          io.grpc.MethodType.UNARY, "fire",
          io.grpc.protobuf.ProtoUtils.marshaller(com.heinemann.grpc.apmplanner.events.ApmEvents.UasEvent.PARSER),
          io.grpc.protobuf.ProtoUtils.marshaller(com.heinemann.grpc.apmplanner.events.ApmEvents.Null.PARSER));

  public static UasEventDistributionStub newStub(io.grpc.Channel channel) {
    return new UasEventDistributionStub(channel, CONFIG);
  }

  public static UasEventDistributionBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new UasEventDistributionBlockingStub(channel, CONFIG);
  }

  public static UasEventDistributionFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new UasEventDistributionFutureStub(channel, CONFIG);
  }

  public static final UasEventDistributionServiceDescriptor CONFIG =
      new UasEventDistributionServiceDescriptor();

  @javax.annotation.concurrent.Immutable
  public static class UasEventDistributionServiceDescriptor extends
      io.grpc.stub.AbstractServiceDescriptor<UasEventDistributionServiceDescriptor> {
    public final io.grpc.MethodDescriptor<com.heinemann.grpc.apmplanner.events.ApmEvents.UasEvent,
        com.heinemann.grpc.apmplanner.events.ApmEvents.Null> fire;

    private UasEventDistributionServiceDescriptor() {
      fire = createMethodDescriptor(
          "com.heinemann.grpc.apmplanner.events.UasEventDistribution", METHOD_FIRE);
    }

    @SuppressWarnings("unchecked")
    private UasEventDistributionServiceDescriptor(
        java.util.Map<java.lang.String, io.grpc.MethodDescriptor<?, ?>> methodMap) {
      fire = (io.grpc.MethodDescriptor<com.heinemann.grpc.apmplanner.events.ApmEvents.UasEvent,
          com.heinemann.grpc.apmplanner.events.ApmEvents.Null>) methodMap.get(
          CONFIG.fire.getName());
    }

    @java.lang.Override
    protected UasEventDistributionServiceDescriptor build(
        java.util.Map<java.lang.String, io.grpc.MethodDescriptor<?, ?>> methodMap) {
      return new UasEventDistributionServiceDescriptor(methodMap);
    }

    @java.lang.Override
    public com.google.common.collect.ImmutableList<io.grpc.MethodDescriptor<?, ?>> methods() {
      return com.google.common.collect.ImmutableList.<io.grpc.MethodDescriptor<?, ?>>of(
          fire);
    }
  }

  public static interface UasEventDistribution {

    public void fire(com.heinemann.grpc.apmplanner.events.ApmEvents.UasEvent request,
        io.grpc.stub.StreamObserver<com.heinemann.grpc.apmplanner.events.ApmEvents.Null> responseObserver);
  }

  public static interface UasEventDistributionBlockingClient {

    public com.heinemann.grpc.apmplanner.events.ApmEvents.Null fire(com.heinemann.grpc.apmplanner.events.ApmEvents.UasEvent request);
  }

  public static interface UasEventDistributionFutureClient {

    public com.google.common.util.concurrent.ListenableFuture<com.heinemann.grpc.apmplanner.events.ApmEvents.Null> fire(
        com.heinemann.grpc.apmplanner.events.ApmEvents.UasEvent request);
  }

  public static class UasEventDistributionStub extends
      io.grpc.stub.AbstractStub<UasEventDistributionStub, UasEventDistributionServiceDescriptor>
      implements UasEventDistribution {
    private UasEventDistributionStub(io.grpc.Channel channel,
        UasEventDistributionServiceDescriptor config) {
      super(channel, config);
    }

    @java.lang.Override
    protected UasEventDistributionStub build(io.grpc.Channel channel,
        UasEventDistributionServiceDescriptor config) {
      return new UasEventDistributionStub(channel, config);
    }

    @java.lang.Override
    public void fire(com.heinemann.grpc.apmplanner.events.ApmEvents.UasEvent request,
        io.grpc.stub.StreamObserver<com.heinemann.grpc.apmplanner.events.ApmEvents.Null> responseObserver) {
      asyncUnaryCall(
          channel.newCall(config.fire), request, responseObserver);
    }
  }

  public static class UasEventDistributionBlockingStub extends
      io.grpc.stub.AbstractStub<UasEventDistributionBlockingStub, UasEventDistributionServiceDescriptor>
      implements UasEventDistributionBlockingClient {
    private UasEventDistributionBlockingStub(io.grpc.Channel channel,
        UasEventDistributionServiceDescriptor config) {
      super(channel, config);
    }

    @java.lang.Override
    protected UasEventDistributionBlockingStub build(io.grpc.Channel channel,
        UasEventDistributionServiceDescriptor config) {
      return new UasEventDistributionBlockingStub(channel, config);
    }

    @java.lang.Override
    public com.heinemann.grpc.apmplanner.events.ApmEvents.Null fire(com.heinemann.grpc.apmplanner.events.ApmEvents.UasEvent request) {
      return blockingUnaryCall(
          channel.newCall(config.fire), request);
    }
  }

  public static class UasEventDistributionFutureStub extends
      io.grpc.stub.AbstractStub<UasEventDistributionFutureStub, UasEventDistributionServiceDescriptor>
      implements UasEventDistributionFutureClient {
    private UasEventDistributionFutureStub(io.grpc.Channel channel,
        UasEventDistributionServiceDescriptor config) {
      super(channel, config);
    }

    @java.lang.Override
    protected UasEventDistributionFutureStub build(io.grpc.Channel channel,
        UasEventDistributionServiceDescriptor config) {
      return new UasEventDistributionFutureStub(channel, config);
    }

    @java.lang.Override
    public com.google.common.util.concurrent.ListenableFuture<com.heinemann.grpc.apmplanner.events.ApmEvents.Null> fire(
        com.heinemann.grpc.apmplanner.events.ApmEvents.UasEvent request) {
      return unaryFutureCall(
          channel.newCall(config.fire), request);
    }
  }

  public static io.grpc.ServerServiceDefinition bindService(
      final UasEventDistribution serviceImpl) {
    return io.grpc.ServerServiceDefinition.builder("com.heinemann.grpc.apmplanner.events.UasEventDistribution")
      .addMethod(createMethodDefinition(
          METHOD_FIRE,
          asyncUnaryRequestCall(
            new io.grpc.stub.ServerCalls.UnaryRequestMethod<
                com.heinemann.grpc.apmplanner.events.ApmEvents.UasEvent,
                com.heinemann.grpc.apmplanner.events.ApmEvents.Null>() {
              @java.lang.Override
              public void invoke(
                  com.heinemann.grpc.apmplanner.events.ApmEvents.UasEvent request,
                  io.grpc.stub.StreamObserver<com.heinemann.grpc.apmplanner.events.ApmEvents.Null> responseObserver) {
                serviceImpl.fire(request, responseObserver);
              }
            }))).build();
  }
}
