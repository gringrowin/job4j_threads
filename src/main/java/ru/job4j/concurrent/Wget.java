package ru.job4j.concurrent;

public class Wget {
    public static void main(String[] args) {

        Thread thread = new Thread(
                () -> {
                    try {
                        int index = 0;
                        while (index < 101) {
                            Thread.sleep(100);
                            System.out.print("\rLoading : " + index + "%");
                            index++;
                        }
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
        );
        thread.start();
    }
}
