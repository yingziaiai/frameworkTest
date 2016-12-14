package com.rmi.function;
//http://blog.csdn.net/zhaowen25/article/details/45443951
/*
 * RPC是远程过程调用的简称，广泛应用在大规模分布式应用中，作用是有助于系统的垂直拆分，
 * 使系统更易拓展。Java中的RPC框架比较多，各有特色，
 * 广泛使用的有RMI、Hessian、Dubbo等。RPC还有一个特点就是能够跨语言，本文只以JAVA语言里的RPC为例。
 */
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

//RMI服务端  
public class Server {  

 public static void main(String[] args) {  
     // 注册管理器  
     Registry registry = null;  
     try {  
         // 创建一个服务注册管理器  
         registry = LocateRegistry.createRegistry(8088);  

     } catch (RemoteException e) {  
           
     }  
     try {  
         // 创建一个服务  
         ServiceImpl server = new ServiceImpl();  
         // 将服务绑定命名  
         registry.rebind("vince", server);  
           
         System.out.println("bind server");  
     } catch (RemoteException e) {  
           
     }  
 }  
}  
