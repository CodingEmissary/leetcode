package com.star.l1116;

import java.util.concurrent.Semaphore;
import java.util.function.IntConsumer;

/**
 * @author star
 * @Date 2019/11/23.
 * @Description: No Description Yet.
 */
public class ZeroEvenOdd {
  private int n;

  Semaphore z = new Semaphore(1);
  Semaphore e = new Semaphore(0);
  Semaphore o = new Semaphore(0);

  public ZeroEvenOdd(int n) {
    this.n = n;
  }

  public void zero(IntConsumer printNumber) throws InterruptedException {
    for (int i = 1; i<=n; i++) {
      z.acquire();
      printNumber.accept(0);
      if ((i & 1) == 0) {
        e.release();
      }else {
        o.release();
      }
    }
  }

  public void even(IntConsumer printNumber) throws InterruptedException {
    for(int i=2; i<=n; i+=2) {
      e.acquire();
      printNumber.accept(i);
      z.release();
    }
  }

  public void odd(IntConsumer printNumber) throws InterruptedException {
    for(int i=1; i<=n; i+=2) {
      o.acquire();
      printNumber.accept(i);
      z.release();
    }
  }
}
