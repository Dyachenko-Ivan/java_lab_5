public class Matrix implements IMAtrix {

    public int N;
    public double[] arr;

    public Matrix(int N) {
        this.N = N;
        this.arr = new double[N * N];
    }

    @Override
    public double getIndex(int x, int y) {
        return arr[(x - 1) * N + y - 1]; //1111222233334444
        //проверки на допустимые значения
    }

    @Override
    public void setIndex(int x, int y, double value) {
        this.arr[(x - 1) * N + y - 1] = value;
        //проверки на допустимые значения
    }


    @Override
    public double calculateDet() {
        //сделать чтобы в 1-ой были все не 0, если все линейно независимы то?
        double[] newArr = new double[N * N];
        for (int i = 0; i < N * N; i++) {
            newArr[i] = arr[i];
        }


        for (int i = 0; i < N-1; i++) {
            double deduct = arr[N * i + i];
            for (int j = 1+i; j < N; j++) {//-
                double el = arr[j * N + i] / deduct;// [5]/[5] --->  el=[9]/[5]=2;
                for (int k = 0; k < N; k++) {
                    arr[j * N + k] -= arr[i * N + k] * el; //мб j*n+I+k   //[4]- [4]*-4  -->
                    printMatrix();
                }
            }
        }
        return 0;
    }

    //get set?     equals hashcode

    public int getN() {
        return this.N;
    }

    public void printMatrix() {
        for (int i = 1; i < N + 1; i++) {
            for (int j = 1; j < N + 1; j++) {
                System.out.print(getIndex(i, j) + "   ");
            }
            System.out.println();
        }
        System.out.println();
    }

}
