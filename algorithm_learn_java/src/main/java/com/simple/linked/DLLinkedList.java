package com.simple.linked;

/**
 * @Author Simple.Mu
 * @Date 2023/4/10 22:33
 * @Description
 */
public class DLLinkedList {

    /**
     * 头节点
     * @param node
     */
    private GoodsNode head = new GoodsNode(0, "", 0.0);


    /**
     * 添加节点(尾插法)
     * @param goodsNode
     */
    public void add(GoodsNode goodsNode) {
        GoodsNode temp = head;
        while (true) {
            if(temp.next == null) {
                break;
            }
            temp = temp.next;
        }
        temp.next = goodsNode;
    }


    /**
     *  按照商品编号ID值进行添加,升序
     */
    public void addOrder(GoodsNode goodsNode) {
        GoodsNode temp = head;
        boolean duplicate = false;
        while (true) {
            if(temp.next == null) {
                break;
            }

            if(temp.next.getId() > goodsNode.getId()) {
                break;
            }else if(temp.next.getId() == goodsNode.getId()) {
                duplicate = true;
                break;
            }

            temp = temp.next;
        }

        if(duplicate) {
            System.out.println("已经存在该商品");
        }else {
            goodsNode.next = temp.next;
            temp.next = goodsNode;
        }

    }


    /**
     * 修改节点
     * 1.先找到目标节点
     * 2.update
     */

    public void updateNode(GoodsNode goodsNode) {
        /**
         * 空链表
         */
        if(head.next == null) {
            System.out.println("链表为空");
            return;
        }

        GoodsNode temp = head.next;


        //标识是否找到了节点
        boolean find = false;
        while (true) {
            if(temp == null) {
                break;
            }

            if(temp.getId() == goodsNode.getId()) {
                find = true;
                break;
            }
            temp = temp.next;
        }

        if(find) {
            //修改节点
            temp.setName(goodsNode.getName());
            temp.setPrice(goodsNode.getPrice());
        }else {
            System.out.println("链表中未找到目标节点");
        }
    }
}
