public class StatisticsService {


    public long SumSales(long[] sales) {
        long sam = 0;
        for (int i =0; i < sales.length; i ++) {
            sam += sales[i];
        }
        return sum;
    }

    // далее, метод подсчёта среднего. седние продажи это сумма д
    // делёная на количество набиваю ...

    public long avgSales(long[] sales) {
        return samSailes(sailes) / 12;

    }

        // следующий метод подсчт пика продаж
        // один из вариантов - подсчёт месяцев, в котороых было
        // меньше всего продаж

    public int minSales(long[] sales) {
        int minMonth = 0; // номер месяца с минимаьними продажами

            for (int i = 0; i < sales.length; i++) {
                if (sales[i] <= sales [minMonth]) { // значит, ...
                    minMonth = i;  // запомним его как минимальный
            }
        }
    return minMonth +1; // месяца нумеруются с 1-го, а не индекса
    }
        // делаю то же самое для максимальных продаж,
        // для этого копирую и переношу строки 14-24 (включительно)
        // вношу изменения, делаю то же самое, но меняю мin.на max.

    public int maxSales(long[] sales) {
            int minMonth = 0; // номер месяца с минимаьними продажами

            for (int i = 0; i < sales.length; i ++) {
                if (sales[i] <= sales [maxMonth]) { // значит, ...
                    maxMonth = i;  // запомним его как минимальный
                }
            }
            return maxMonth +1; // месяца нумеруются с 1-го, а не индекса
        }

// осталось посмотреть сколько мес. меньше и сколько мес. больше/
    // во время поворов, для каждой продажи из массивов будет
    // заново считаться средняя


    public int lessTranAvg(long[] sales) {
        int count = 0;  // счётчик
        long avg = avgSales(sales);
        for (int i = 0; i < sales.length; i++) {
           if (sales[i] < avg) { // если продажа меньше чем средняя продажа, то ...
              count++;     // ...то счётчик увеличить

            }
        }
    return count;  // возвращаем счётчик
    }

    // осталось посмотреть сколько мес. -  больше/

    public int greaterTranAvg(long[] sales) {
        int count = 0;  // счётчик
        long avg = avgSales(sales);
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] > avg) { // если продажа меньше чем средняя продажа, то ...
                count++;     // ...то счётчик увеличить

            }
        }
        return count;  // возвращаем счётчик
    }



}
