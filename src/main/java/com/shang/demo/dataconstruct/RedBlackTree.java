package com.shang.demo.dataconstruct;

/**
 * 红黑树相关信息
 * 是一种特殊的二叉查找树
 * 红黑树的每个节点上都有存储位表示节点的颜色,可以是红色,也可以是黑色
 */
public class RedBlackTree {

    /**
     * 特性:
     * 1 每个节点要么是黑色要么是红色
     * 2 根节点是黑色
     * 3 每个(NIL或NULL)的叶子节点都是黑色
     * 4 如果一个节点是红色,则他的叶子节点必须全都是黑色
     * 5 从一个节点到其子,孙节点的所有路径上包含的黑色节点的数目相同
     */


    /**
     * 左旋:
     * 意思是将X的右孩子设置为X的父亲节点,意味着"将被旋转的叶子节点变成一个左节点
     */
    
    /**
     * 左旋:
     * 意思是将X的左孩子设置为X的父亲节点,意味着"将被旋转的叶子节点编程一个右节点
     */

    /**
     * 添加:
     * 第一步: 将红黑树当作一颗二叉查找树，将节点插入。
     * 第二步:将插入的节点着色为"红色"。
     * 根据被插入节点的父节点的情况，可以将"当节点z被着色为红色节点，并插入二叉树"划分为三种情况来处理。
     * 1 情况说明:被插入的节点是根节点。处理方法:直接把此节点涂为黑色。
     * 2 情况说明:被插入的节点的父节点是黑色。处理方法:什么也不需要做。节点被插入后，仍然是红黑树
     * 情况说明:被插入的节点的父节点是红色。这种情况下，被插入节点是一定存在非空祖父节点 的;进一步的讲，
     * 被插入节点也一定存在叔叔节点(即使叔叔节点为空，我们也视之为存在，空节点本身就是黑色节点)。
     * 理解这点之后，我们依据"叔叔节点的情况"，将这种情况进一步划分为 3 种情况(Case)
     */
}
