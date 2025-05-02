        Thread t = new Thread(new printStar());
        try {
            t.start();
            t.join();
        } catch (Exception e) {
            System.out.println(e);
        }