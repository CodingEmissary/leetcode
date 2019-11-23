package com.star.l1115;

import java.util.concurrent.Semaphore;

/**
 * @author star
 * @Date 2019/11/23.
 * @Description: No Description Yet.
 */
public class FooBar {

  private int n;
  private final Semaphore semaphoreFoo = new Semaphore(0);
  private final Semaphore semaphoreBar = new Semaphore(0);

  public FooBar(int n) {
    this.n = n;
  }

  public void foo(Runnable printFoo) throws InterruptedException {
    for (int i = 0; i < n; i++) {
        printFoo.run();
        semaphoreBar.release();
        semaphoreFoo.acquire();
    }
  }

  public void bar(Runnable printBar) throws InterruptedException {
    for (int i = 0; i < n; i++) {
      semaphoreBar.acquire();
      printBar.run();
      semaphoreFoo.release();
    }
  }
}
