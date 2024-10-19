public class YandexAmountOfPeaks {
    public static void main(String[] args) {
        System.out.println(aMounts(new int[]{1,2,3,3,3,4,1,2,1,1,1,3,2,1}));
    }

    static int aMounts(int[] mas) {
        int result = 0;
        int asc = 1, desc = 0;
        int equals = 0;
        boolean ascRow = true;
        boolean singlePeak = true;
        for (int index = 1; index < mas.length; index++) {
            if (mas[index] > mas[index - 1] && ascRow) {
                asc ++;
                equals = 0;
            }
            if (mas[index] > mas[index - 1] && !ascRow) {
                ascRow = true;
                if(singlePeak) result += (asc - 1) * (desc - 1);
                asc = equals + 2;
                desc=0;
                equals =0;
            };

            if (mas[index] < mas[index - 1] && ascRow) {
                ascRow = false;
                singlePeak = equals == 0;
                desc += 1;
            };
            if (mas[index] < mas[index - 1] && !ascRow) desc ++;

            if (mas[index] == mas[index - 1] && ascRow) {
                equals+=1;
                asc+=1;
            };
            if (mas[index] == mas[index - 1] && !ascRow) {
                desc++;
                equals++;
            }
        }
        if (!ascRow && singlePeak) result += (asc -1)* (desc - 1);
        return result;
    }
}
