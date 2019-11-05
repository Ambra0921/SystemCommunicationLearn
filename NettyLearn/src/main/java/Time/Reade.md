#了解两端

Netty是一个提供异步事件驱动的网络应用框架，用于快速开发高性能、高可靠性的网络服务器和客户端程序。<br/>
Netty是一个NIO框架<br/>
此处只是第一个简单的Netty学习，基础的Discard服务

ChannelInboundHandlerAdapter的基本生命周期



1.added : 将handle添加到上下文中去处理时间<br/>
2.register : 注册<br/>
3.active : 激活<br/>
4.read : 读取消息<br/>
5.readComplete :  读取完毕<br/>
6.inactive <br/>
7.unRegister<br/>
8.removed<br/>
9.exceptionCaught:异常捕捉，不在通用周期内<br/>


##client端

服务端采用基本的socketClient形式进行实现，作用是发送消息，但是不接收服务端的任务回复消息

##Server端

流程：
1.实现 ChannelInboundHandlerAdapter 中的读取消息和异常捕捉
2.定义好服务端的ServerBootstrap。启动服务