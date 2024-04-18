package day08.final_.quiz01;

/*
WeatherConstants에서 상수를 정의하고, 이를 WeatherAnalyzer에서 사용하여 날씨 조건을 분석합니다.
Main 클래스에서 WeatherAnalyzer를 사용하여 몇 가지 기상 데이터에 대한 경보를 체크하고 결과를 출력합니다.
 */
public class Main {
    public static void main(String[] args) {

        double currentTemperature = 42.5;  // 현재 기온
        double currentPrecipitation = 60.0; // 현재 강수량

        boolean temperatureAlert = WeatherAnalyzer.checkTemperatureAlert(currentTemperature);
        boolean precipitationAlert = WeatherAnalyzer.checkPrecipitationAlert(currentPrecipitation);

        System.out.println("Temperature Alert: " + temperatureAlert);  // 40도 이상이므로 true
        System.out.println("Precipitation Alert: " + precipitationAlert); // 50mm 이상이므로 true

    }
}