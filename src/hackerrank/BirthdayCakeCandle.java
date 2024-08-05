package hackerrank;
import java.util.List;

public class BirthdayCakeCandle {
    public static int birthdayCakeCandles(List<Integer> candles) {
        int candleTemp = candles.get(0);
        int resultCandle = 0;

        for (int candle : candles){
            if (candle > candleTemp){
                candleTemp = candle;
                resultCandle = (resultCandle * 0) + 1;
            }

            if (candle == candleTemp){
                resultCandle++;
            }
        }
        return resultCandle;
    }
}
