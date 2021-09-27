import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
//Для доставки посылок различной массы планируется использовать дрон. Масса i-ой посылки равна parcels[i].
//        При этом, по летным правилам, установленным компанией, для безопасности жителей дрон за один раз
//        может перевозить только две посылки, масса которых в сумме строго равна m. Необходимо найти максимальное
//        количество рейсов, которые дрон сможет сделать с учетом условий.
//
//        На входе:
//
//        parcels - массив чисел ненулевой длины - массы посылок, кг
//        m - число, m > 0 - грузоподъемность дрона, кг
//        На выходе: число - максимальное количество доставок
//
//        Примечание:
//
//        дрон доставляет только по две посылки, с одной посылкой он не полетит
//        масса посылок в сумме должна быть строго равна грузоподъемности m
//        Пример:
//
//        parcels = [2,4,3,6,1]
//        m = 5
//        getResult(parcels, m) -> 2 // дрон сможет совершить две доставки по 5 кг: [2, 3] и [4, 1]

public class GeekoTask5 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        Collections.addAll(list, 2, 4, 3, 6, 1);
        System.out.println(getResult(list, 5));
    }

    public static int getResult(List<Integer> parcels, int m) {
        int count = 0;
        for (int i = 0; i < parcels.size(); i++) {
            for (int j = i + 1; j < parcels.size(); j++) {
                if (j != parcels.size()) {
                    if (parcels.get(i) + parcels.get(j) == m) {
                        count++;
                        parcels.set(i, 6);
                        parcels.set(j, 6);

                    }
                }
            }
        }
        return count;
    }

}
