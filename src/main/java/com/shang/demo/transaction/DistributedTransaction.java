package com.shang.demo.transaction;

/**
 * 分布式事务
 * 是指: 会涉及到操作多个数据库的事务,在分布式系统中,各个节点之间在物理上相互独立,通过网络进行沟通和协调.
 */
public class DistributedTransaction {


    /**
     * 两阶段提交协议
     * 为了使基于分布式系统架构下的所有的节点在进行事务提交时保持一致性而设计的一种算法
     * 引入一个协调者的组件来统一掌控所有节点(称做参与者)的操作结果,
     * 并最终指示这些节点是否要把操作结果进行真正的提交(比如将更新后的数据写入磁盘等)
     * 概括:参与者将操作的成败通知协调者,再由协调者根据所有参与者的反馈情况决定参与者是提交操作还是终止操作
     *
     * 缺点:
     *  1,执行的过程中,所有参与节点都是事务阻塞型的,
     *  2,由于协调者的重要性,一旦协调者发生故障参与者会一直阻塞下去
     *  3,当协调者向参与者发送 commit 请求之后，发生了局部网络异常或者在发送 commit请求过程中协调者发生了故障，
     *  导致只有一部分参与者接受到了commit请求。于是整个分布式系统便出现了数据部一致性的现象(脑裂现象)
     *  4,协调者再发出 commit 消息之后宕机，而唯一接收到这条消息的参与者同时也宕机了。
     *  那么即使协调者通过选举协议产生了新的协调者，这条事务的状态也是不确定的，没人知道事务是否被已经提交
     */


    /**
     * 三阶段提交协议
     * 引入了超时机制,同时在协调者和参与者中都引入超时机制
     * CanCommit阶段:协调者向参与者发送commit请求,参与者如果可以提交就返回Yes响应,否则就返回no响应
     * PreCommit阶段:假如有任何一个参与者向协调者发送了no响应,或者等待超时之后就会执行事务中断,如果全是yes事务会预执行
     * DoCommit阶段:该阶段进行真正的事务提交:1,协调者发送提交请求2,参与者提交事务3,参与者响应反馈4,协调者确定完成事务
     */
}
