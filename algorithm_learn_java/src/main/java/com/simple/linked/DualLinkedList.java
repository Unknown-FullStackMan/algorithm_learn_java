package com.simple.linked;

/**
 * @Author Simple.Mu
 * @Date 2023/4/11 20:45
 * @Description
 */
public class DualLinkedList {

    private BookNode head = new BookNode(0, "", 0.0);


    /**
     * 添加节点(尾插法)
     * @param bookNode
     */
    public void add(BookNode bookNode) {
        BookNode temp = head;
        while (true) {
            if(temp.next == null) {
                break;
            }
            temp = temp.next;
        }
        temp.next = bookNode;
        bookNode.pre = temp;
    }

    /**
     * 修改节点
     * 1.先找到目标节点
     * 2.update
     */

    public void updateNode(BookNode bookNode) {
        /**
         * 空链表
         */
        if(head.next == null) {
            System.out.println("链表为空");
            return;
        }

        BookNode temp = head.next;
        //标识是否找到了节点
        boolean find = false;
        while (true) {
            if(temp == null) {
                break;
            }

            if(temp.getId() == bookNode.getId()) {
                find = true;
                break;
            }
            temp = temp.next;
        }

        if(find) {
            //修改节点
            temp.setName(bookNode.getName());
            temp.setPrice(bookNode.getPrice());
        }else {
            System.out.println("链表中未找到目标节点");
        }
    }


    /**
     * 删除节点
     */
    public void delNode(int id) {
        if(head.next == null) {
            System.out.println("链表为空");
            return;
        }

        BookNode temp = head.next;
        boolean find = false;
        while (true) {
            if(temp == null) {
                break;
            }

            if(temp.getId() == id) {
                find = true;
                break;
            }
            temp = temp.next;
        }

        if(find) {
            temp.pre.next = temp.next;
            if(temp.next != null) {
                temp.next.pre = temp.pre;
            }
        }else {
            System.out.println("链表中未找到目标节点");
        }
    }
}
