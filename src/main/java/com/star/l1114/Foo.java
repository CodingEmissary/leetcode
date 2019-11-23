package com.star.l1114;

import java.util.concurrent.CountDownLatch;

/**
 * @author star
 * @Date 2019/11/23.
 * @Description: No Description Yet.
 */
public class Foo {

  private CountDownLatch l1;
  private CountDownLatch l2;
  public Foo() {
    l1 = new CountDownLatch(1);
    l2 = new CountDownLatch(1);
  }

  public void first(Runnable printFirst) throws InterruptedException {

    printFirst.run();
    l1.countDown();
  }

  public void second(Runnable printSecond) throws InterruptedException {

    l1.await();
    printSecond.run();
    l2.countDown();
  }

  public void third(Runnable printThird) throws InterruptedException {
    l2.await();
    printThird.run();
  }

}
