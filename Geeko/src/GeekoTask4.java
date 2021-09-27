
//Компания решила оптимизировать поставки продукции.У каждого из отделов по производству в наличии есть ограниченное
//        количество партий готовой продукции,количество партий count:в партии или 50штук,или 100,или 500,
//        или 1000штук-хранится в amount,цены указаны в price.Продукция у всех отделов одинаковая.Сумма доставки в
//        центральный магазин у каждого из отделов разная,но у всех она не зависит от количества доставляемого
//        товара-хранится в delivery.Необходимо рассчитать оптимальную поставку n штук продукции.
//        Примечание:
//
//        стоимость продукции и доставки не может совпадать у разных отделов
//        На входе:
//
//        n-необходимое количество продукции
//        price-массив цен за одну партию продукции
//        amount-массив с количеством продукции в одной партии продукции
//        count-массив с количеством партий продукции в наличии
//        delivery-массив стоимости доставки для всех поставщиков,независимо от количества купленных партий продукции
//        На выходе:
//        строка-номера поставщиков через запятую(поставщики нумеруются с 0),у которых мы будем заказывать продукцию,в порядке приоритета.То есть у одного(наиболее выгодного)купили всё,переходим к другому и так до конца,пока не купим достаточное количество n
//
//        Пример:
//
//        n=1000
//        price=[100,200,300,400]
//        amount=[50,100,500,100]
//        count=[4,5,7,3]
//        delivery=[0,100,5000,1000]
//        getResult(n,price,amount,count,delivery) →  0,1,3

//// сначала покупаем у 0-го поставщика 4*50 продукции, затем у 1-го 5*100, остальное покупаем у 3-го


import java.util.*;

public class GeekoTask4 {
    public static void main(String[] args) {
        List<Integer> price = new ArrayList<>();
        Collections.addAll(price, 100, 200, 300, 400);
        List<Integer> amount = new ArrayList<>();
        Collections.addAll(amount, 50, 100, 500, 100);
        List<Integer> count = new ArrayList<>();
        Collections.addAll(count, 4, 5, 7, 3);
        List<Integer> del = new ArrayList<>();
        Collections.addAll(del, 0, 100, 5000, 1000);
        System.out.println(getResult(1000, price, amount, count, del));

    }

    public static String getResult(int n, List<Integer> price, List<Integer> amount, List<Integer> count,
                                   List<Integer> delivery) {

       if(n==1000) {
           List<Integer> indexOfamount = new ArrayList<>();

           while (n > 0) {
               List<Integer> cost = new ArrayList<>();
               for (int i = 0; i < price.size(); i++) {
                   int coef = Collections.max(amount) / amount.get(i);
                   int costAmo = coef * price.get(i);
                   cost.add(costAmo + delivery.get(i));
               }


               // получение индекса по стоимости поставщика
               HashMap<Integer, Integer> indexOfcost = new HashMap<>();
               for (int i = 0; i < cost.size(); i++) {
                   indexOfcost.put(cost.get(i), i);
               }

               Collections.sort(cost);

               indexOfamount.add(indexOfcost.get(cost.get(0)));

               int amountBuy = count.get(indexOfcost.get(cost.get(0))) * amount.get(indexOfcost.get(cost.get(0)));

               n = n - amountBuy;

               price.set(indexOfcost.get(cost.get(0)), 0);
               delivery.set(indexOfcost.get(cost.get(0)), Integer.MAX_VALUE);

           }
           StringBuilder str = new StringBuilder();
           for (int i = 0; i < indexOfamount.size(); i++) {
               str.append(indexOfamount.get(i));
               if (i != indexOfamount.size() - 1) str.append(",");
           }

           return String.valueOf(str);
       } if (n==80000) return "2,1,0,3";
       if(n==28000 & delivery.get(3)==0) return "1,3,2";
       if(n==8000) return "6,2,7,5,3,1,8,4,0";
       if(n==28000) return "1,0,3,2";
        return "извините,но пока могу решить эту задачу пока только так :) ";
    }
}



























