package day08.final_.quiz01;
/*
클래스 WeatherAnalyzer 생성

메소드:
checkTemperatureAlert(double temperature): 주어진 온도가 경보 기준을 초과하는지 확인합니다.
checkPrecipitationAlert(double precipitation): 주어진 강수량이 경보 기준을 초과하는지 확인합니다.
 */
public class WeatherAnalyzer {

    // 온도 경보 확인 메소드
    public static boolean checkTemperatureAlert(double temperature) {
        return (temperature > WeatherConstants.MAX_TEMPERATURE_ALERT.getNumericData() ||
                temperature < WeatherConstants.MIN_TEMPERATURE_ALERT.getNumericData());
    }

    // 강수량 경보 확인 메소드
    public static boolean checkPrecipitationAlert(double precipitation) {
        return precipitation > WeatherConstants.MIN_WIND_ALERT.getNumericData();
    }

}
