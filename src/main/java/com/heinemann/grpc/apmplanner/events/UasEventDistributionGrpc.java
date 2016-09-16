package com.heinemann.grpc.apmplanner.events;

import static io.grpc.stub.ClientCalls.asyncUnaryCall;
import static io.grpc.stub.ClientCalls.asyncServerStreamingCall;
import static io.grpc.stub.ClientCalls.asyncClientStreamingCall;
import static io.grpc.stub.ClientCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ClientCalls.blockingUnaryCall;
import static io.grpc.stub.ClientCalls.blockingServerStreamingCall;
import static io.grpc.stub.ClientCalls.futureUnaryCall;
import static io.grpc.MethodDescriptor.generateFullMethodName;
import static io.grpc.stub.ServerCalls.asyncUnaryCall;
import static io.grpc.stub.ServerCalls.asyncServerStreamingCall;
import static io.grpc.stub.ServerCalls.asyncClientStreamingCall;
import static io.grpc.stub.ServerCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedStreamingCall;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.0.1)",
    comments = "Source: apm_events.proto")
public class UasEventDistributionGrpc {

  private UasEventDistributionGrpc() {}

  public static final String SERVICE_NAME = "com.heinemann.grpc.apmplanner.events.UasEventDistribution";

  // Static method descriptors that strictly reflect the proto.
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<com.heinemann.grpc.apmplanner.events.ApmEvents.UasEvent,
      com.heinemann.grpc.apmplanner.events.ApmEvents.Null> METHOD_FIRE =
      io.grpc.MethodDescriptor.create(
          io.grpc.MethodDescriptor.MethodType.UNARY,
          generateFullMethodName(
              "com.heinemann.grpc.apmplanner.events.UasEventDistribution", "fire"),
          io.grpc.protobuf.ProtoUtils.marshaller(com.heinemann.grpc.apmplanner.events.ApmEvents.UasEvent.getDefaultInstance()),
          io.grpc.protobuf.ProtoUtils.marshaller(com.heinemann.grpc.apmplanner.events.ApmEvents.Null.getDefaultInstance()));

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static UasEventDistributionStub newStub(io.grpc.Channel channel) {
    return new UasEventDistributionStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static UasEventDistributionBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new UasEventDistributionBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary and streaming output calls on the service
   */
  public static UasEventDistributionFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new UasEventDistributionFutureStub(channel);
  }

  /**
   */
  public static abstract class UasEventDistributionImplBase implements io.grpc.BindableService {

    /**
     */
    public void fire(com.heinemann.grpc.apmplanner.events.ApmEvents.UasEvent request,
        io.grpc.stub.StreamObserver<com.heinemann.grpc.apmplanner.events.ApmEvents.Null> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_FIRE, responseObserver);
    }

    @java.lang.Override public io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            METHOD_FIRE,
            asyncUnaryCall(
              new MethodHandlers<
                com.heinemann.grpc.apmplanner.events.ApmEvents.UasEvent,
                com.heinemann.grpc.apmplanner.events.ApmEvents.Null>(
                  this, METHODID_FIRE)))
          .build();
    }
  }

  /**
   */
  public static final class UasEventDistributionStub extends io.grpc.stub.AbstractStub<UasEventDistributionStub> {
    private UasEventDistributionStub(io.grpc.Channel channel) {
      super(channel);
    }

    private UasEventDistributionStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected UasEventDistributionStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new UasEventDistributionStub(channel, callOptions);
    }

    /**
     */
    public void fire(com.heinemann.grpc.apmplanner.events.ApmEvents.UasEvent request,
        io.grpc.stub.StreamObserver<com.heinemann.grpc.apmplanner.events.ApmEvents.Null> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_FIRE, getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class UasEventDistributionBlockingStub extends io.grpc.stub.AbstractStub<UasEventDistributionBlockingStub> {
    private UasEventDistributionBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private UasEventDistributionBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected UasEventDistributionBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new UasEventDistributionBlockingStub(channel, callOptions);
    }

    /**
     */
    public com.heinemann.grpc.apmplanner.events.ApmEvents.Null fire(com.heinemann.grpc.apmplanner.events.ApmEvents.UasEvent request) {
      return blockingUnaryCall(
          getChannel(), METHOD_FIRE, getCallOptions(), request);
    }
  }

  /**
   */
  public static final class UasEventDistributionFutureStub extends io.grpc.stub.AbstractStub<UasEventDistributionFutureStub> {
    private UasEventDistributionFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private UasEventDistributionFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected UasEventDistributionFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new UasEventDistributionFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.heinemann.grpc.apmplanner.events.ApmEvents.Null> fire(
        com.heinemann.grpc.apmplanner.events.ApmEvents.UasEvent request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_FIRE, getCallOptions()), request);
    }
  }

  private static final int METHODID_FIRE = 0;

  private static class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final UasEventDistributionImplBase serviceImpl;
    private final int methodId;

    public MethodHandlers(UasEventDistributionImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_FIRE:
          serviceImpl.fire((com.heinemann.grpc.apmplanner.events.ApmEvents.UasEvent) request,
              (io.grpc.stub.StreamObserver<com.heinemann.grpc.apmplanner.events.ApmEvents.Null>) responseObserver);
          break;
        default:
          throw new AssertionError();
      }
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public io.grpc.stub.StreamObserver<Req> invoke(
        io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        default:
          throw new AssertionError();
      }
    }
  }

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    return new io.grpc.ServiceDescriptor(SERVICE_NAME,
        METHOD_FIRE);
  }

}
