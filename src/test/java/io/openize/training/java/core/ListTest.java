package io.openize.training.java.core;

import org.apache.commons.lang3.time.StopWatch;
import org.junit.Test;

import java.util.*;

public class ListTest {

    private static final int SIZE = 10_000_000;

    @Test
    public void loadTest_Add_ArrayList() {
        StopWatch timer = new StopWatch();

        timer.start();
        ArrayList<Integer> list = new ArrayList<>();
        fillList(list);
        timer.stop();

        System.out.println("ArrayList (Add): " + timer.getNanoTime());
    }

    @Test
    public void loadTest_Add_LinkedList() {
        StopWatch timer = new StopWatch();

        timer.start();
        LinkedList<Integer> list = new LinkedList<>();
        fillList(list);
        timer.stop();

        System.out.println("LinkedList (Add): " + timer.getNanoTime());
    }

    @Test
    public void loadTest_Add_Vector() {
        StopWatch timer = new StopWatch();

        timer.start();
        Vector<Integer> list = new Vector<>();
        fillList(list);
        timer.stop();

        System.out.println("Vector (Add): " + timer.getNanoTime());
    }

    @Test
    public void loadTest_GetFirstElement_ArrayList() {
        ArrayList<Integer> list = new ArrayList<>();
        fillList(list);

        StopWatch timer = new StopWatch();
        timer.start();
        getFirstElementList(list);
        timer.stop();

        System.out.println("ArrayList (get FirstElement): " + (timer.getNanoTime() / 1000));
    }

    @Test
    public void loadTest_GetFirstElement_LinkedList() {
        LinkedList<Integer> list = new LinkedList<>();
        fillList(list);

        StopWatch timer = new StopWatch();
        timer.start();
        getFirstElementList(list);
        timer.stop();

        System.out.println("Linked (get FirstElement): " + (timer.getNanoTime() / 1000));
    }

    @Test
    public void loadTest_GetFirstElement_Vector() {
        Vector<Integer> list = new Vector<>();
        fillList(list);

        StopWatch timer = new StopWatch();
        timer.start();
        getFirstElementList(list);
        timer.stop();

        System.out.println("Vector (get FirstElement): " + (timer.getNanoTime() / 1000));
    }

    @Test
    public void loadTest_GetMiddleElement_ArrayList() {
        ArrayList<Integer> list = new ArrayList<>();
        fillList(list);

        StopWatch timer = new StopWatch();
        timer.start();
        getMiddleElementList(list);
        timer.stop();

        System.out.println("ArrayList (get MiddleElement): " + (timer.getNanoTime() / 1000));
    }

    @Test
    public void loadTest_GetMiddleElement_LinkedList() {
        LinkedList<Integer> list = new LinkedList<>();
        fillList(list);

        StopWatch timer = new StopWatch();
        timer.start();
        getMiddleElementList(list);
        timer.stop();

        System.out.println("Linked (get MiddleElement): " + (timer.getNanoTime() / 1000));
    }

    @Test
    public void loadTest_GetMiddleElement_Vector() {
        Vector<Integer> list = new Vector<>();
        fillList(list);

        StopWatch timer = new StopWatch();
        timer.start();
        getMiddleElementList(list);
        timer.stop();

        System.out.println("Vector (get MiddleElement): " + (timer.getNanoTime() / 1000));
    }

    @Test
    public void loadTest_GetLastElement_ArrayList() {
        ArrayList<Integer> list = new ArrayList<>();
        fillList(list);

        StopWatch timer = new StopWatch();
        timer.start();
        getLastElementList(list);
        timer.stop();

        System.out.println("ArrayList (get LastElement): " + (timer.getNanoTime() / 1000));
    }

    @Test
    public void loadTest_GetLastElement_LinkedList() {
        LinkedList<Integer> list = new LinkedList<>();
        fillList(list);

        StopWatch timer = new StopWatch();
        timer.start();
        getLastElementList(list);
        timer.stop();

        System.out.println("Linked (get LastElement): " + (timer.getNanoTime() / 1000));
    }

    @Test
    public void loadTest_GetLastElement_Vector() {
        Vector<Integer> list = new Vector<>();
        fillList(list);

        StopWatch timer = new StopWatch();
        timer.start();
        getLastElementList(list);
        timer.stop();

        System.out.println("Vector (get LastElement): " + (timer.getNanoTime() / 1000));
    }

    private void getLastElementList(List<Integer> list) {

        int last = list.size()-1;
        for (int i = 0; i < 1000; i++) {
            list.get(last);
        }
    }


    private void getMiddleElementList(List<Integer> list) {

        int middle = list.size()/2;
        for (int i = 0; i < 1000; i++) {
            list.get(middle);
        }
    }

    private void getFirstElementList(List<Integer> list) {
        for (int i = 0; i < 1000; i++) {
            list.get(0);
        }
    }

    private void fillList(List<Integer> list) {
        Random random = new Random();
        for (int i = 0; i < SIZE; i++) {
            list.add(random.nextInt());
        }
    }


}
