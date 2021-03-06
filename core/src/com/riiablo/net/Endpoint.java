package com.riiablo.net;

import io.netty.channel.ChannelHandlerContext;

public interface Endpoint<T> extends PacketSender<Object> {
  void reset();
  void update(float delta);
  void messageReceived(ChannelHandlerContext ctx, T msg);
}
