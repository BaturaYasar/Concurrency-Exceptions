package com.example.ConcurrencyExceptions;

public class Main {
    public static void main(String[] args) {
//        Thread thread = new Thread(new Runnable() {
//            @Override
//            public void run() {
//                for (int i = 0; i < 5 ; i++) {
//                    System.out.println("Printing " + i + " in a worker thread");
//                    try {
//                        Thread.sleep(1000);
//                    } catch (InterruptedException e) {
//                        e.printStackTrace();
//                    }
//                }
//            }
//        });
//        thread.start();
//        for (int i = 0; i < 5 ; i++) {
//            System.out.println("Printing " + i + " in main thread");
//            try {
//                Thread.sleep(1000);
//            } catch (InterruptedException e) {
//                e.printStackTrace();
//            }
//        }
//    }

        int a = 2;
        int b = 0;
        String name = null;

        try {
            System.out.println(a/b);
        }catch(Exception e) {
            System.out.println("B is 0!");
        }

        try{
            System.out.println(name.equals("Batu"));
        }catch(Exception e){
            e.printStackTrace();
            System.out.println("The name is null!");
        }
    }
}
