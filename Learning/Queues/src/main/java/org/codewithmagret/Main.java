package org.codewithmagret;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    static void main() {
        ArrayQueue practiceQueue = new ArrayQueue(5);
//        System.out.println(practiceQueue.isEmpty());

        practiceQueue.enQueue(1);
        practiceQueue.enQueue(2);
        practiceQueue.enQueue(3);
        practiceQueue.enQueue(4);

        System.out.println(practiceQueue.isEmpty());

        System.out.println(practiceQueue.deQueue());
        System.out.println(practiceQueue.deQueue());
        System.out.println(practiceQueue.peek());
        System.out.println(practiceQueue.deQueue());
        System.out.println(practiceQueue.peek());
    }
}
