package com.simple.linked;

/**
 * @Author Simple.Mu
 * @Date 2023/4/11 20:21
 * @Description
 */
public class LinkedTest {

    public static void main(String[] args) {

        DLLinkedList linkedList = new DLLinkedList();

        GoodsNode goodsNode1 = new GoodsNode(1,"商品1", 1.0);
        GoodsNode goodsNode2 = new GoodsNode(2,"商品2",2.0);
        GoodsNode goodsNode3 = new GoodsNode(3,"商品3",3.0);
        GoodsNode goodsNode4 = new GoodsNode(4,"商品4",4.0);

        linkedList.addOrder(goodsNode4);
        linkedList.addOrder(goodsNode1);
        linkedList.addOrder(goodsNode3);
        linkedList.addOrder(goodsNode2);


        linkedList.updateNode(new GoodsNode(4,"商品4",55.0));
        linkedList.list();

        System.out.println(linkedList.getLength());


        DualLinkedList dualLinkedList = new DualLinkedList();
        BookNode bookNode1 = new BookNode(1, "书籍1", 1.0);
        BookNode bookNode2 = new BookNode(2, "书籍2", 2.0);
        BookNode bookNode3 = new BookNode(3, "书籍3", 3.0);
        BookNode bookNode4 = new BookNode(4, "书籍4", 4.0);

        dualLinkedList.add(bookNode1);
        dualLinkedList.add(bookNode2);
        dualLinkedList.add(bookNode3);
        dualLinkedList.add(bookNode4);

        System.out.println();

    }
}
