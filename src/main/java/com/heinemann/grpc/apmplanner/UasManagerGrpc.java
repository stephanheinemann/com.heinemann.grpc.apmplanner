package com.heinemann.grpc.apmplanner;

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
    comments = "Source: apm_planner.proto")
public class UasManagerGrpc {

  private UasManagerGrpc() {}

  public static final String SERVICE_NAME = "com.heinemann.grpc.apmplanner.UasManager";

  // Static method descriptors that strictly reflect the proto.
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<com.heinemann.grpc.apmplanner.ApmPlanner.Null,
      com.heinemann.grpc.apmplanner.ApmPlanner.UasIdentifier> METHOD_GET_ACTIVE_UAS =
      io.grpc.MethodDescriptor.create(
          io.grpc.MethodDescriptor.MethodType.UNARY,
          generateFullMethodName(
              "com.heinemann.grpc.apmplanner.UasManager", "getActiveUas"),
          io.grpc.protobuf.ProtoUtils.marshaller(com.heinemann.grpc.apmplanner.ApmPlanner.Null.getDefaultInstance()),
          io.grpc.protobuf.ProtoUtils.marshaller(com.heinemann.grpc.apmplanner.ApmPlanner.UasIdentifier.getDefaultInstance()));
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<com.heinemann.grpc.apmplanner.ApmPlanner.UasIdentifier,
      com.heinemann.grpc.apmplanner.ApmPlanner.Null> METHOD_SET_ACTIVE_UAS =
      io.grpc.MethodDescriptor.create(
          io.grpc.MethodDescriptor.MethodType.UNARY,
          generateFullMethodName(
              "com.heinemann.grpc.apmplanner.UasManager", "setActiveUas"),
          io.grpc.protobuf.ProtoUtils.marshaller(com.heinemann.grpc.apmplanner.ApmPlanner.UasIdentifier.getDefaultInstance()),
          io.grpc.protobuf.ProtoUtils.marshaller(com.heinemann.grpc.apmplanner.ApmPlanner.Null.getDefaultInstance()));
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<com.heinemann.grpc.apmplanner.ApmPlanner.UasIdentifier,
      com.heinemann.grpc.apmplanner.ApmPlanner.Uas> METHOD_GET_UAS =
      io.grpc.MethodDescriptor.create(
          io.grpc.MethodDescriptor.MethodType.UNARY,
          generateFullMethodName(
              "com.heinemann.grpc.apmplanner.UasManager", "getUas"),
          io.grpc.protobuf.ProtoUtils.marshaller(com.heinemann.grpc.apmplanner.ApmPlanner.UasIdentifier.getDefaultInstance()),
          io.grpc.protobuf.ProtoUtils.marshaller(com.heinemann.grpc.apmplanner.ApmPlanner.Uas.getDefaultInstance()));
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<com.heinemann.grpc.apmplanner.ApmPlanner.Null,
      com.heinemann.grpc.apmplanner.ApmPlanner.Uas> METHOD_GET_UAS_LIST =
      io.grpc.MethodDescriptor.create(
          io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING,
          generateFullMethodName(
              "com.heinemann.grpc.apmplanner.UasManager", "getUasList"),
          io.grpc.protobuf.ProtoUtils.marshaller(com.heinemann.grpc.apmplanner.ApmPlanner.Null.getDefaultInstance()),
          io.grpc.protobuf.ProtoUtils.marshaller(com.heinemann.grpc.apmplanner.ApmPlanner.Uas.getDefaultInstance()));
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<com.heinemann.grpc.apmplanner.ApmPlanner.Null,
      com.heinemann.grpc.apmplanner.ApmPlanner.Null> METHOD_GO =
      io.grpc.MethodDescriptor.create(
          io.grpc.MethodDescriptor.MethodType.UNARY,
          generateFullMethodName(
              "com.heinemann.grpc.apmplanner.UasManager", "go"),
          io.grpc.protobuf.ProtoUtils.marshaller(com.heinemann.grpc.apmplanner.ApmPlanner.Null.getDefaultInstance()),
          io.grpc.protobuf.ProtoUtils.marshaller(com.heinemann.grpc.apmplanner.ApmPlanner.Null.getDefaultInstance()));
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<com.heinemann.grpc.apmplanner.ApmPlanner.Null,
      com.heinemann.grpc.apmplanner.ApmPlanner.Null> METHOD_HALT =
      io.grpc.MethodDescriptor.create(
          io.grpc.MethodDescriptor.MethodType.UNARY,
          generateFullMethodName(
              "com.heinemann.grpc.apmplanner.UasManager", "halt"),
          io.grpc.protobuf.ProtoUtils.marshaller(com.heinemann.grpc.apmplanner.ApmPlanner.Null.getDefaultInstance()),
          io.grpc.protobuf.ProtoUtils.marshaller(com.heinemann.grpc.apmplanner.ApmPlanner.Null.getDefaultInstance()));
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<com.heinemann.grpc.apmplanner.ApmPlanner.Null,
      com.heinemann.grpc.apmplanner.ApmPlanner.Null> METHOD_HOME =
      io.grpc.MethodDescriptor.create(
          io.grpc.MethodDescriptor.MethodType.UNARY,
          generateFullMethodName(
              "com.heinemann.grpc.apmplanner.UasManager", "home"),
          io.grpc.protobuf.ProtoUtils.marshaller(com.heinemann.grpc.apmplanner.ApmPlanner.Null.getDefaultInstance()),
          io.grpc.protobuf.ProtoUtils.marshaller(com.heinemann.grpc.apmplanner.ApmPlanner.Null.getDefaultInstance()));
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<com.heinemann.grpc.apmplanner.ApmPlanner.Null,
      com.heinemann.grpc.apmplanner.ApmPlanner.Null> METHOD_LAND =
      io.grpc.MethodDescriptor.create(
          io.grpc.MethodDescriptor.MethodType.UNARY,
          generateFullMethodName(
              "com.heinemann.grpc.apmplanner.UasManager", "land"),
          io.grpc.protobuf.ProtoUtils.marshaller(com.heinemann.grpc.apmplanner.ApmPlanner.Null.getDefaultInstance()),
          io.grpc.protobuf.ProtoUtils.marshaller(com.heinemann.grpc.apmplanner.ApmPlanner.Null.getDefaultInstance()));
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<com.heinemann.grpc.apmplanner.ApmPlanner.Null,
      com.heinemann.grpc.apmplanner.ApmPlanner.Null> METHOD_LAUNCH =
      io.grpc.MethodDescriptor.create(
          io.grpc.MethodDescriptor.MethodType.UNARY,
          generateFullMethodName(
              "com.heinemann.grpc.apmplanner.UasManager", "launch"),
          io.grpc.protobuf.ProtoUtils.marshaller(com.heinemann.grpc.apmplanner.ApmPlanner.Null.getDefaultInstance()),
          io.grpc.protobuf.ProtoUtils.marshaller(com.heinemann.grpc.apmplanner.ApmPlanner.Null.getDefaultInstance()));
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<com.heinemann.grpc.apmplanner.ApmPlanner.Null,
      com.heinemann.grpc.apmplanner.ApmPlanner.Null> METHOD_REBOOT =
      io.grpc.MethodDescriptor.create(
          io.grpc.MethodDescriptor.MethodType.UNARY,
          generateFullMethodName(
              "com.heinemann.grpc.apmplanner.UasManager", "reboot"),
          io.grpc.protobuf.ProtoUtils.marshaller(com.heinemann.grpc.apmplanner.ApmPlanner.Null.getDefaultInstance()),
          io.grpc.protobuf.ProtoUtils.marshaller(com.heinemann.grpc.apmplanner.ApmPlanner.Null.getDefaultInstance()));
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<com.heinemann.grpc.apmplanner.ApmPlanner.Null,
      com.heinemann.grpc.apmplanner.ApmPlanner.Null> METHOD_SHUTDOWN =
      io.grpc.MethodDescriptor.create(
          io.grpc.MethodDescriptor.MethodType.UNARY,
          generateFullMethodName(
              "com.heinemann.grpc.apmplanner.UasManager", "shutdown"),
          io.grpc.protobuf.ProtoUtils.marshaller(com.heinemann.grpc.apmplanner.ApmPlanner.Null.getDefaultInstance()),
          io.grpc.protobuf.ProtoUtils.marshaller(com.heinemann.grpc.apmplanner.ApmPlanner.Null.getDefaultInstance()));
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<com.heinemann.grpc.apmplanner.ApmPlanner.UasMode,
      com.heinemann.grpc.apmplanner.ApmPlanner.Null> METHOD_SET_MODE =
      io.grpc.MethodDescriptor.create(
          io.grpc.MethodDescriptor.MethodType.UNARY,
          generateFullMethodName(
              "com.heinemann.grpc.apmplanner.UasManager", "setMode"),
          io.grpc.protobuf.ProtoUtils.marshaller(com.heinemann.grpc.apmplanner.ApmPlanner.UasMode.getDefaultInstance()),
          io.grpc.protobuf.ProtoUtils.marshaller(com.heinemann.grpc.apmplanner.ApmPlanner.Null.getDefaultInstance()));
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<com.heinemann.grpc.apmplanner.ApmPlanner.UasArmed,
      com.heinemann.grpc.apmplanner.ApmPlanner.Null> METHOD_SET_ARMED =
      io.grpc.MethodDescriptor.create(
          io.grpc.MethodDescriptor.MethodType.UNARY,
          generateFullMethodName(
              "com.heinemann.grpc.apmplanner.UasManager", "setArmed"),
          io.grpc.protobuf.ProtoUtils.marshaller(com.heinemann.grpc.apmplanner.ApmPlanner.UasArmed.getDefaultInstance()),
          io.grpc.protobuf.ProtoUtils.marshaller(com.heinemann.grpc.apmplanner.ApmPlanner.Null.getDefaultInstance()));
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<com.heinemann.grpc.apmplanner.ApmPlanner.Null,
      com.heinemann.grpc.apmplanner.ApmPlanner.UasSubscriber> METHOD_GET_SUBSCRIBERS =
      io.grpc.MethodDescriptor.create(
          io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING,
          generateFullMethodName(
              "com.heinemann.grpc.apmplanner.UasManager", "getSubscribers"),
          io.grpc.protobuf.ProtoUtils.marshaller(com.heinemann.grpc.apmplanner.ApmPlanner.Null.getDefaultInstance()),
          io.grpc.protobuf.ProtoUtils.marshaller(com.heinemann.grpc.apmplanner.ApmPlanner.UasSubscriber.getDefaultInstance()));
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<com.heinemann.grpc.apmplanner.ApmPlanner.UasSubscriber,
      com.heinemann.grpc.apmplanner.ApmPlanner.Null> METHOD_ADD_SUBSCRIBER =
      io.grpc.MethodDescriptor.create(
          io.grpc.MethodDescriptor.MethodType.UNARY,
          generateFullMethodName(
              "com.heinemann.grpc.apmplanner.UasManager", "addSubscriber"),
          io.grpc.protobuf.ProtoUtils.marshaller(com.heinemann.grpc.apmplanner.ApmPlanner.UasSubscriber.getDefaultInstance()),
          io.grpc.protobuf.ProtoUtils.marshaller(com.heinemann.grpc.apmplanner.ApmPlanner.Null.getDefaultInstance()));
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<com.heinemann.grpc.apmplanner.ApmPlanner.UasSubscriber,
      com.heinemann.grpc.apmplanner.ApmPlanner.Null> METHOD_REMOVE_SUBSCRIBER =
      io.grpc.MethodDescriptor.create(
          io.grpc.MethodDescriptor.MethodType.UNARY,
          generateFullMethodName(
              "com.heinemann.grpc.apmplanner.UasManager", "removeSubscriber"),
          io.grpc.protobuf.ProtoUtils.marshaller(com.heinemann.grpc.apmplanner.ApmPlanner.UasSubscriber.getDefaultInstance()),
          io.grpc.protobuf.ProtoUtils.marshaller(com.heinemann.grpc.apmplanner.ApmPlanner.Null.getDefaultInstance()));

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static UasManagerStub newStub(io.grpc.Channel channel) {
    return new UasManagerStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static UasManagerBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new UasManagerBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary and streaming output calls on the service
   */
  public static UasManagerFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new UasManagerFutureStub(channel);
  }

  /**
   */
  public static abstract class UasManagerImplBase implements io.grpc.BindableService {

    /**
     */
    public void getActiveUas(com.heinemann.grpc.apmplanner.ApmPlanner.Null request,
        io.grpc.stub.StreamObserver<com.heinemann.grpc.apmplanner.ApmPlanner.UasIdentifier> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_GET_ACTIVE_UAS, responseObserver);
    }

    /**
     */
    public void setActiveUas(com.heinemann.grpc.apmplanner.ApmPlanner.UasIdentifier request,
        io.grpc.stub.StreamObserver<com.heinemann.grpc.apmplanner.ApmPlanner.Null> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_SET_ACTIVE_UAS, responseObserver);
    }

    /**
     */
    public void getUas(com.heinemann.grpc.apmplanner.ApmPlanner.UasIdentifier request,
        io.grpc.stub.StreamObserver<com.heinemann.grpc.apmplanner.ApmPlanner.Uas> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_GET_UAS, responseObserver);
    }

    /**
     */
    public void getUasList(com.heinemann.grpc.apmplanner.ApmPlanner.Null request,
        io.grpc.stub.StreamObserver<com.heinemann.grpc.apmplanner.ApmPlanner.Uas> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_GET_UAS_LIST, responseObserver);
    }

    /**
     */
    public void go(com.heinemann.grpc.apmplanner.ApmPlanner.Null request,
        io.grpc.stub.StreamObserver<com.heinemann.grpc.apmplanner.ApmPlanner.Null> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_GO, responseObserver);
    }

    /**
     */
    public void halt(com.heinemann.grpc.apmplanner.ApmPlanner.Null request,
        io.grpc.stub.StreamObserver<com.heinemann.grpc.apmplanner.ApmPlanner.Null> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_HALT, responseObserver);
    }

    /**
     */
    public void home(com.heinemann.grpc.apmplanner.ApmPlanner.Null request,
        io.grpc.stub.StreamObserver<com.heinemann.grpc.apmplanner.ApmPlanner.Null> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_HOME, responseObserver);
    }

    /**
     */
    public void land(com.heinemann.grpc.apmplanner.ApmPlanner.Null request,
        io.grpc.stub.StreamObserver<com.heinemann.grpc.apmplanner.ApmPlanner.Null> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_LAND, responseObserver);
    }

    /**
     */
    public void launch(com.heinemann.grpc.apmplanner.ApmPlanner.Null request,
        io.grpc.stub.StreamObserver<com.heinemann.grpc.apmplanner.ApmPlanner.Null> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_LAUNCH, responseObserver);
    }

    /**
     */
    public void reboot(com.heinemann.grpc.apmplanner.ApmPlanner.Null request,
        io.grpc.stub.StreamObserver<com.heinemann.grpc.apmplanner.ApmPlanner.Null> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_REBOOT, responseObserver);
    }

    /**
     */
    public void shutdown(com.heinemann.grpc.apmplanner.ApmPlanner.Null request,
        io.grpc.stub.StreamObserver<com.heinemann.grpc.apmplanner.ApmPlanner.Null> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_SHUTDOWN, responseObserver);
    }

    /**
     */
    public void setMode(com.heinemann.grpc.apmplanner.ApmPlanner.UasMode request,
        io.grpc.stub.StreamObserver<com.heinemann.grpc.apmplanner.ApmPlanner.Null> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_SET_MODE, responseObserver);
    }

    /**
     */
    public void setArmed(com.heinemann.grpc.apmplanner.ApmPlanner.UasArmed request,
        io.grpc.stub.StreamObserver<com.heinemann.grpc.apmplanner.ApmPlanner.Null> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_SET_ARMED, responseObserver);
    }

    /**
     */
    public void getSubscribers(com.heinemann.grpc.apmplanner.ApmPlanner.Null request,
        io.grpc.stub.StreamObserver<com.heinemann.grpc.apmplanner.ApmPlanner.UasSubscriber> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_GET_SUBSCRIBERS, responseObserver);
    }

    /**
     */
    public void addSubscriber(com.heinemann.grpc.apmplanner.ApmPlanner.UasSubscriber request,
        io.grpc.stub.StreamObserver<com.heinemann.grpc.apmplanner.ApmPlanner.Null> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_ADD_SUBSCRIBER, responseObserver);
    }

    /**
     */
    public void removeSubscriber(com.heinemann.grpc.apmplanner.ApmPlanner.UasSubscriber request,
        io.grpc.stub.StreamObserver<com.heinemann.grpc.apmplanner.ApmPlanner.Null> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_REMOVE_SUBSCRIBER, responseObserver);
    }

    @java.lang.Override public io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            METHOD_GET_ACTIVE_UAS,
            asyncUnaryCall(
              new MethodHandlers<
                com.heinemann.grpc.apmplanner.ApmPlanner.Null,
                com.heinemann.grpc.apmplanner.ApmPlanner.UasIdentifier>(
                  this, METHODID_GET_ACTIVE_UAS)))
          .addMethod(
            METHOD_SET_ACTIVE_UAS,
            asyncUnaryCall(
              new MethodHandlers<
                com.heinemann.grpc.apmplanner.ApmPlanner.UasIdentifier,
                com.heinemann.grpc.apmplanner.ApmPlanner.Null>(
                  this, METHODID_SET_ACTIVE_UAS)))
          .addMethod(
            METHOD_GET_UAS,
            asyncUnaryCall(
              new MethodHandlers<
                com.heinemann.grpc.apmplanner.ApmPlanner.UasIdentifier,
                com.heinemann.grpc.apmplanner.ApmPlanner.Uas>(
                  this, METHODID_GET_UAS)))
          .addMethod(
            METHOD_GET_UAS_LIST,
            asyncServerStreamingCall(
              new MethodHandlers<
                com.heinemann.grpc.apmplanner.ApmPlanner.Null,
                com.heinemann.grpc.apmplanner.ApmPlanner.Uas>(
                  this, METHODID_GET_UAS_LIST)))
          .addMethod(
            METHOD_GO,
            asyncUnaryCall(
              new MethodHandlers<
                com.heinemann.grpc.apmplanner.ApmPlanner.Null,
                com.heinemann.grpc.apmplanner.ApmPlanner.Null>(
                  this, METHODID_GO)))
          .addMethod(
            METHOD_HALT,
            asyncUnaryCall(
              new MethodHandlers<
                com.heinemann.grpc.apmplanner.ApmPlanner.Null,
                com.heinemann.grpc.apmplanner.ApmPlanner.Null>(
                  this, METHODID_HALT)))
          .addMethod(
            METHOD_HOME,
            asyncUnaryCall(
              new MethodHandlers<
                com.heinemann.grpc.apmplanner.ApmPlanner.Null,
                com.heinemann.grpc.apmplanner.ApmPlanner.Null>(
                  this, METHODID_HOME)))
          .addMethod(
            METHOD_LAND,
            asyncUnaryCall(
              new MethodHandlers<
                com.heinemann.grpc.apmplanner.ApmPlanner.Null,
                com.heinemann.grpc.apmplanner.ApmPlanner.Null>(
                  this, METHODID_LAND)))
          .addMethod(
            METHOD_LAUNCH,
            asyncUnaryCall(
              new MethodHandlers<
                com.heinemann.grpc.apmplanner.ApmPlanner.Null,
                com.heinemann.grpc.apmplanner.ApmPlanner.Null>(
                  this, METHODID_LAUNCH)))
          .addMethod(
            METHOD_REBOOT,
            asyncUnaryCall(
              new MethodHandlers<
                com.heinemann.grpc.apmplanner.ApmPlanner.Null,
                com.heinemann.grpc.apmplanner.ApmPlanner.Null>(
                  this, METHODID_REBOOT)))
          .addMethod(
            METHOD_SHUTDOWN,
            asyncUnaryCall(
              new MethodHandlers<
                com.heinemann.grpc.apmplanner.ApmPlanner.Null,
                com.heinemann.grpc.apmplanner.ApmPlanner.Null>(
                  this, METHODID_SHUTDOWN)))
          .addMethod(
            METHOD_SET_MODE,
            asyncUnaryCall(
              new MethodHandlers<
                com.heinemann.grpc.apmplanner.ApmPlanner.UasMode,
                com.heinemann.grpc.apmplanner.ApmPlanner.Null>(
                  this, METHODID_SET_MODE)))
          .addMethod(
            METHOD_SET_ARMED,
            asyncUnaryCall(
              new MethodHandlers<
                com.heinemann.grpc.apmplanner.ApmPlanner.UasArmed,
                com.heinemann.grpc.apmplanner.ApmPlanner.Null>(
                  this, METHODID_SET_ARMED)))
          .addMethod(
            METHOD_GET_SUBSCRIBERS,
            asyncServerStreamingCall(
              new MethodHandlers<
                com.heinemann.grpc.apmplanner.ApmPlanner.Null,
                com.heinemann.grpc.apmplanner.ApmPlanner.UasSubscriber>(
                  this, METHODID_GET_SUBSCRIBERS)))
          .addMethod(
            METHOD_ADD_SUBSCRIBER,
            asyncUnaryCall(
              new MethodHandlers<
                com.heinemann.grpc.apmplanner.ApmPlanner.UasSubscriber,
                com.heinemann.grpc.apmplanner.ApmPlanner.Null>(
                  this, METHODID_ADD_SUBSCRIBER)))
          .addMethod(
            METHOD_REMOVE_SUBSCRIBER,
            asyncUnaryCall(
              new MethodHandlers<
                com.heinemann.grpc.apmplanner.ApmPlanner.UasSubscriber,
                com.heinemann.grpc.apmplanner.ApmPlanner.Null>(
                  this, METHODID_REMOVE_SUBSCRIBER)))
          .build();
    }
  }

  /**
   */
  public static final class UasManagerStub extends io.grpc.stub.AbstractStub<UasManagerStub> {
    private UasManagerStub(io.grpc.Channel channel) {
      super(channel);
    }

    private UasManagerStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected UasManagerStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new UasManagerStub(channel, callOptions);
    }

    /**
     */
    public void getActiveUas(com.heinemann.grpc.apmplanner.ApmPlanner.Null request,
        io.grpc.stub.StreamObserver<com.heinemann.grpc.apmplanner.ApmPlanner.UasIdentifier> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_GET_ACTIVE_UAS, getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void setActiveUas(com.heinemann.grpc.apmplanner.ApmPlanner.UasIdentifier request,
        io.grpc.stub.StreamObserver<com.heinemann.grpc.apmplanner.ApmPlanner.Null> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_SET_ACTIVE_UAS, getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getUas(com.heinemann.grpc.apmplanner.ApmPlanner.UasIdentifier request,
        io.grpc.stub.StreamObserver<com.heinemann.grpc.apmplanner.ApmPlanner.Uas> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_GET_UAS, getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getUasList(com.heinemann.grpc.apmplanner.ApmPlanner.Null request,
        io.grpc.stub.StreamObserver<com.heinemann.grpc.apmplanner.ApmPlanner.Uas> responseObserver) {
      asyncServerStreamingCall(
          getChannel().newCall(METHOD_GET_UAS_LIST, getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void go(com.heinemann.grpc.apmplanner.ApmPlanner.Null request,
        io.grpc.stub.StreamObserver<com.heinemann.grpc.apmplanner.ApmPlanner.Null> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_GO, getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void halt(com.heinemann.grpc.apmplanner.ApmPlanner.Null request,
        io.grpc.stub.StreamObserver<com.heinemann.grpc.apmplanner.ApmPlanner.Null> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_HALT, getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void home(com.heinemann.grpc.apmplanner.ApmPlanner.Null request,
        io.grpc.stub.StreamObserver<com.heinemann.grpc.apmplanner.ApmPlanner.Null> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_HOME, getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void land(com.heinemann.grpc.apmplanner.ApmPlanner.Null request,
        io.grpc.stub.StreamObserver<com.heinemann.grpc.apmplanner.ApmPlanner.Null> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_LAND, getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void launch(com.heinemann.grpc.apmplanner.ApmPlanner.Null request,
        io.grpc.stub.StreamObserver<com.heinemann.grpc.apmplanner.ApmPlanner.Null> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_LAUNCH, getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void reboot(com.heinemann.grpc.apmplanner.ApmPlanner.Null request,
        io.grpc.stub.StreamObserver<com.heinemann.grpc.apmplanner.ApmPlanner.Null> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_REBOOT, getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void shutdown(com.heinemann.grpc.apmplanner.ApmPlanner.Null request,
        io.grpc.stub.StreamObserver<com.heinemann.grpc.apmplanner.ApmPlanner.Null> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_SHUTDOWN, getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void setMode(com.heinemann.grpc.apmplanner.ApmPlanner.UasMode request,
        io.grpc.stub.StreamObserver<com.heinemann.grpc.apmplanner.ApmPlanner.Null> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_SET_MODE, getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void setArmed(com.heinemann.grpc.apmplanner.ApmPlanner.UasArmed request,
        io.grpc.stub.StreamObserver<com.heinemann.grpc.apmplanner.ApmPlanner.Null> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_SET_ARMED, getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getSubscribers(com.heinemann.grpc.apmplanner.ApmPlanner.Null request,
        io.grpc.stub.StreamObserver<com.heinemann.grpc.apmplanner.ApmPlanner.UasSubscriber> responseObserver) {
      asyncServerStreamingCall(
          getChannel().newCall(METHOD_GET_SUBSCRIBERS, getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void addSubscriber(com.heinemann.grpc.apmplanner.ApmPlanner.UasSubscriber request,
        io.grpc.stub.StreamObserver<com.heinemann.grpc.apmplanner.ApmPlanner.Null> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_ADD_SUBSCRIBER, getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void removeSubscriber(com.heinemann.grpc.apmplanner.ApmPlanner.UasSubscriber request,
        io.grpc.stub.StreamObserver<com.heinemann.grpc.apmplanner.ApmPlanner.Null> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_REMOVE_SUBSCRIBER, getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class UasManagerBlockingStub extends io.grpc.stub.AbstractStub<UasManagerBlockingStub> {
    private UasManagerBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private UasManagerBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected UasManagerBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new UasManagerBlockingStub(channel, callOptions);
    }

    /**
     */
    public com.heinemann.grpc.apmplanner.ApmPlanner.UasIdentifier getActiveUas(com.heinemann.grpc.apmplanner.ApmPlanner.Null request) {
      return blockingUnaryCall(
          getChannel(), METHOD_GET_ACTIVE_UAS, getCallOptions(), request);
    }

    /**
     */
    public com.heinemann.grpc.apmplanner.ApmPlanner.Null setActiveUas(com.heinemann.grpc.apmplanner.ApmPlanner.UasIdentifier request) {
      return blockingUnaryCall(
          getChannel(), METHOD_SET_ACTIVE_UAS, getCallOptions(), request);
    }

    /**
     */
    public com.heinemann.grpc.apmplanner.ApmPlanner.Uas getUas(com.heinemann.grpc.apmplanner.ApmPlanner.UasIdentifier request) {
      return blockingUnaryCall(
          getChannel(), METHOD_GET_UAS, getCallOptions(), request);
    }

    /**
     */
    public java.util.Iterator<com.heinemann.grpc.apmplanner.ApmPlanner.Uas> getUasList(
        com.heinemann.grpc.apmplanner.ApmPlanner.Null request) {
      return blockingServerStreamingCall(
          getChannel(), METHOD_GET_UAS_LIST, getCallOptions(), request);
    }

    /**
     */
    public com.heinemann.grpc.apmplanner.ApmPlanner.Null go(com.heinemann.grpc.apmplanner.ApmPlanner.Null request) {
      return blockingUnaryCall(
          getChannel(), METHOD_GO, getCallOptions(), request);
    }

    /**
     */
    public com.heinemann.grpc.apmplanner.ApmPlanner.Null halt(com.heinemann.grpc.apmplanner.ApmPlanner.Null request) {
      return blockingUnaryCall(
          getChannel(), METHOD_HALT, getCallOptions(), request);
    }

    /**
     */
    public com.heinemann.grpc.apmplanner.ApmPlanner.Null home(com.heinemann.grpc.apmplanner.ApmPlanner.Null request) {
      return blockingUnaryCall(
          getChannel(), METHOD_HOME, getCallOptions(), request);
    }

    /**
     */
    public com.heinemann.grpc.apmplanner.ApmPlanner.Null land(com.heinemann.grpc.apmplanner.ApmPlanner.Null request) {
      return blockingUnaryCall(
          getChannel(), METHOD_LAND, getCallOptions(), request);
    }

    /**
     */
    public com.heinemann.grpc.apmplanner.ApmPlanner.Null launch(com.heinemann.grpc.apmplanner.ApmPlanner.Null request) {
      return blockingUnaryCall(
          getChannel(), METHOD_LAUNCH, getCallOptions(), request);
    }

    /**
     */
    public com.heinemann.grpc.apmplanner.ApmPlanner.Null reboot(com.heinemann.grpc.apmplanner.ApmPlanner.Null request) {
      return blockingUnaryCall(
          getChannel(), METHOD_REBOOT, getCallOptions(), request);
    }

    /**
     */
    public com.heinemann.grpc.apmplanner.ApmPlanner.Null shutdown(com.heinemann.grpc.apmplanner.ApmPlanner.Null request) {
      return blockingUnaryCall(
          getChannel(), METHOD_SHUTDOWN, getCallOptions(), request);
    }

    /**
     */
    public com.heinemann.grpc.apmplanner.ApmPlanner.Null setMode(com.heinemann.grpc.apmplanner.ApmPlanner.UasMode request) {
      return blockingUnaryCall(
          getChannel(), METHOD_SET_MODE, getCallOptions(), request);
    }

    /**
     */
    public com.heinemann.grpc.apmplanner.ApmPlanner.Null setArmed(com.heinemann.grpc.apmplanner.ApmPlanner.UasArmed request) {
      return blockingUnaryCall(
          getChannel(), METHOD_SET_ARMED, getCallOptions(), request);
    }

    /**
     */
    public java.util.Iterator<com.heinemann.grpc.apmplanner.ApmPlanner.UasSubscriber> getSubscribers(
        com.heinemann.grpc.apmplanner.ApmPlanner.Null request) {
      return blockingServerStreamingCall(
          getChannel(), METHOD_GET_SUBSCRIBERS, getCallOptions(), request);
    }

    /**
     */
    public com.heinemann.grpc.apmplanner.ApmPlanner.Null addSubscriber(com.heinemann.grpc.apmplanner.ApmPlanner.UasSubscriber request) {
      return blockingUnaryCall(
          getChannel(), METHOD_ADD_SUBSCRIBER, getCallOptions(), request);
    }

    /**
     */
    public com.heinemann.grpc.apmplanner.ApmPlanner.Null removeSubscriber(com.heinemann.grpc.apmplanner.ApmPlanner.UasSubscriber request) {
      return blockingUnaryCall(
          getChannel(), METHOD_REMOVE_SUBSCRIBER, getCallOptions(), request);
    }
  }

  /**
   */
  public static final class UasManagerFutureStub extends io.grpc.stub.AbstractStub<UasManagerFutureStub> {
    private UasManagerFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private UasManagerFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected UasManagerFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new UasManagerFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.heinemann.grpc.apmplanner.ApmPlanner.UasIdentifier> getActiveUas(
        com.heinemann.grpc.apmplanner.ApmPlanner.Null request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_GET_ACTIVE_UAS, getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.heinemann.grpc.apmplanner.ApmPlanner.Null> setActiveUas(
        com.heinemann.grpc.apmplanner.ApmPlanner.UasIdentifier request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_SET_ACTIVE_UAS, getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.heinemann.grpc.apmplanner.ApmPlanner.Uas> getUas(
        com.heinemann.grpc.apmplanner.ApmPlanner.UasIdentifier request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_GET_UAS, getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.heinemann.grpc.apmplanner.ApmPlanner.Null> go(
        com.heinemann.grpc.apmplanner.ApmPlanner.Null request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_GO, getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.heinemann.grpc.apmplanner.ApmPlanner.Null> halt(
        com.heinemann.grpc.apmplanner.ApmPlanner.Null request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_HALT, getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.heinemann.grpc.apmplanner.ApmPlanner.Null> home(
        com.heinemann.grpc.apmplanner.ApmPlanner.Null request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_HOME, getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.heinemann.grpc.apmplanner.ApmPlanner.Null> land(
        com.heinemann.grpc.apmplanner.ApmPlanner.Null request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_LAND, getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.heinemann.grpc.apmplanner.ApmPlanner.Null> launch(
        com.heinemann.grpc.apmplanner.ApmPlanner.Null request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_LAUNCH, getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.heinemann.grpc.apmplanner.ApmPlanner.Null> reboot(
        com.heinemann.grpc.apmplanner.ApmPlanner.Null request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_REBOOT, getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.heinemann.grpc.apmplanner.ApmPlanner.Null> shutdown(
        com.heinemann.grpc.apmplanner.ApmPlanner.Null request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_SHUTDOWN, getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.heinemann.grpc.apmplanner.ApmPlanner.Null> setMode(
        com.heinemann.grpc.apmplanner.ApmPlanner.UasMode request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_SET_MODE, getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.heinemann.grpc.apmplanner.ApmPlanner.Null> setArmed(
        com.heinemann.grpc.apmplanner.ApmPlanner.UasArmed request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_SET_ARMED, getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.heinemann.grpc.apmplanner.ApmPlanner.Null> addSubscriber(
        com.heinemann.grpc.apmplanner.ApmPlanner.UasSubscriber request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_ADD_SUBSCRIBER, getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.heinemann.grpc.apmplanner.ApmPlanner.Null> removeSubscriber(
        com.heinemann.grpc.apmplanner.ApmPlanner.UasSubscriber request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_REMOVE_SUBSCRIBER, getCallOptions()), request);
    }
  }

  private static final int METHODID_GET_ACTIVE_UAS = 0;
  private static final int METHODID_SET_ACTIVE_UAS = 1;
  private static final int METHODID_GET_UAS = 2;
  private static final int METHODID_GET_UAS_LIST = 3;
  private static final int METHODID_GO = 4;
  private static final int METHODID_HALT = 5;
  private static final int METHODID_HOME = 6;
  private static final int METHODID_LAND = 7;
  private static final int METHODID_LAUNCH = 8;
  private static final int METHODID_REBOOT = 9;
  private static final int METHODID_SHUTDOWN = 10;
  private static final int METHODID_SET_MODE = 11;
  private static final int METHODID_SET_ARMED = 12;
  private static final int METHODID_GET_SUBSCRIBERS = 13;
  private static final int METHODID_ADD_SUBSCRIBER = 14;
  private static final int METHODID_REMOVE_SUBSCRIBER = 15;

  private static class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final UasManagerImplBase serviceImpl;
    private final int methodId;

    public MethodHandlers(UasManagerImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_GET_ACTIVE_UAS:
          serviceImpl.getActiveUas((com.heinemann.grpc.apmplanner.ApmPlanner.Null) request,
              (io.grpc.stub.StreamObserver<com.heinemann.grpc.apmplanner.ApmPlanner.UasIdentifier>) responseObserver);
          break;
        case METHODID_SET_ACTIVE_UAS:
          serviceImpl.setActiveUas((com.heinemann.grpc.apmplanner.ApmPlanner.UasIdentifier) request,
              (io.grpc.stub.StreamObserver<com.heinemann.grpc.apmplanner.ApmPlanner.Null>) responseObserver);
          break;
        case METHODID_GET_UAS:
          serviceImpl.getUas((com.heinemann.grpc.apmplanner.ApmPlanner.UasIdentifier) request,
              (io.grpc.stub.StreamObserver<com.heinemann.grpc.apmplanner.ApmPlanner.Uas>) responseObserver);
          break;
        case METHODID_GET_UAS_LIST:
          serviceImpl.getUasList((com.heinemann.grpc.apmplanner.ApmPlanner.Null) request,
              (io.grpc.stub.StreamObserver<com.heinemann.grpc.apmplanner.ApmPlanner.Uas>) responseObserver);
          break;
        case METHODID_GO:
          serviceImpl.go((com.heinemann.grpc.apmplanner.ApmPlanner.Null) request,
              (io.grpc.stub.StreamObserver<com.heinemann.grpc.apmplanner.ApmPlanner.Null>) responseObserver);
          break;
        case METHODID_HALT:
          serviceImpl.halt((com.heinemann.grpc.apmplanner.ApmPlanner.Null) request,
              (io.grpc.stub.StreamObserver<com.heinemann.grpc.apmplanner.ApmPlanner.Null>) responseObserver);
          break;
        case METHODID_HOME:
          serviceImpl.home((com.heinemann.grpc.apmplanner.ApmPlanner.Null) request,
              (io.grpc.stub.StreamObserver<com.heinemann.grpc.apmplanner.ApmPlanner.Null>) responseObserver);
          break;
        case METHODID_LAND:
          serviceImpl.land((com.heinemann.grpc.apmplanner.ApmPlanner.Null) request,
              (io.grpc.stub.StreamObserver<com.heinemann.grpc.apmplanner.ApmPlanner.Null>) responseObserver);
          break;
        case METHODID_LAUNCH:
          serviceImpl.launch((com.heinemann.grpc.apmplanner.ApmPlanner.Null) request,
              (io.grpc.stub.StreamObserver<com.heinemann.grpc.apmplanner.ApmPlanner.Null>) responseObserver);
          break;
        case METHODID_REBOOT:
          serviceImpl.reboot((com.heinemann.grpc.apmplanner.ApmPlanner.Null) request,
              (io.grpc.stub.StreamObserver<com.heinemann.grpc.apmplanner.ApmPlanner.Null>) responseObserver);
          break;
        case METHODID_SHUTDOWN:
          serviceImpl.shutdown((com.heinemann.grpc.apmplanner.ApmPlanner.Null) request,
              (io.grpc.stub.StreamObserver<com.heinemann.grpc.apmplanner.ApmPlanner.Null>) responseObserver);
          break;
        case METHODID_SET_MODE:
          serviceImpl.setMode((com.heinemann.grpc.apmplanner.ApmPlanner.UasMode) request,
              (io.grpc.stub.StreamObserver<com.heinemann.grpc.apmplanner.ApmPlanner.Null>) responseObserver);
          break;
        case METHODID_SET_ARMED:
          serviceImpl.setArmed((com.heinemann.grpc.apmplanner.ApmPlanner.UasArmed) request,
              (io.grpc.stub.StreamObserver<com.heinemann.grpc.apmplanner.ApmPlanner.Null>) responseObserver);
          break;
        case METHODID_GET_SUBSCRIBERS:
          serviceImpl.getSubscribers((com.heinemann.grpc.apmplanner.ApmPlanner.Null) request,
              (io.grpc.stub.StreamObserver<com.heinemann.grpc.apmplanner.ApmPlanner.UasSubscriber>) responseObserver);
          break;
        case METHODID_ADD_SUBSCRIBER:
          serviceImpl.addSubscriber((com.heinemann.grpc.apmplanner.ApmPlanner.UasSubscriber) request,
              (io.grpc.stub.StreamObserver<com.heinemann.grpc.apmplanner.ApmPlanner.Null>) responseObserver);
          break;
        case METHODID_REMOVE_SUBSCRIBER:
          serviceImpl.removeSubscriber((com.heinemann.grpc.apmplanner.ApmPlanner.UasSubscriber) request,
              (io.grpc.stub.StreamObserver<com.heinemann.grpc.apmplanner.ApmPlanner.Null>) responseObserver);
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
        METHOD_GET_ACTIVE_UAS,
        METHOD_SET_ACTIVE_UAS,
        METHOD_GET_UAS,
        METHOD_GET_UAS_LIST,
        METHOD_GO,
        METHOD_HALT,
        METHOD_HOME,
        METHOD_LAND,
        METHOD_LAUNCH,
        METHOD_REBOOT,
        METHOD_SHUTDOWN,
        METHOD_SET_MODE,
        METHOD_SET_ARMED,
        METHOD_GET_SUBSCRIBERS,
        METHOD_ADD_SUBSCRIBER,
        METHOD_REMOVE_SUBSCRIBER);
  }

}
