public class Main {

    public static void main(String[] args) {

        Matrix m = new Matrix(4);
        int a =1;
        for (int i = 1; i < 5; i++) {
            for (int j = 1; j < 5; j++) {
                m.setIndex(i, j, a);
                a++;
            }
        }

        m.setIndex(1,1,11);
        m.setIndex(2,2,66);
        m.setIndex(4,4,0);
        m.printMatrix();

        System.out.println(m.calculateDet());






        Matrix m2 = new Matrix(2);

        m2.setIndex(1,1, 1);
        m2.setIndex(1,2, 2);
        m2.setIndex(2,1, 3);
        m2.setIndex(2,2, 4);

        m2.printMatrix();

        System.out.println(m2.calculateDet());

        //m2.printMatrix();

        Matrix m3 = new Matrix(3);

        m3.setIndex(1,1, 1);
        m3.setIndex(1,2, 2);
        m3.setIndex(1,3, 3);
        m3.setIndex(2,1, 2);
        m3.setIndex(2,2, 4);
        m3.setIndex(2,3, 6);
        m3.setIndex(3,1, 7);
        m3.setIndex(3,2, 8);
        m3.setIndex(3,3, 9);



        m3.printMatrix();

        System.out.println(m3.calculateDet());
    }
}
