package com.shang.demo.javabasic.copy;

/**
 * JAVA对象复制相关知识点
 * 1,直接复制: 实际上复制的是引用 A a1=a2 ,也就是说a1和a2指向的是同一个对象,因此当a1变化的时候,a2里面的变量也会跟着变化
 * 2,浅复制:(复制引用,但是不复制引用的对象),创建一个新对象，然后将当前对象的非静态字段复制到该新对象，如果字段是值类型的，
 * 那么对该字段执行复制;如果该字段是引用类型的话，则复制引用但不复制引用的对象
 * 3,深复制:(复制对象和其引用对象)
 * 深克隆的一种方法:先讲一个实现了Serializable的对象写到一个流中,再从流中读取出来,便可以重建对象
 */
public class Tips{
}