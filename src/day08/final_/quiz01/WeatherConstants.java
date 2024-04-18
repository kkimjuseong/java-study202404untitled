package day08.final_.quiz01;
/*
클래스 WeatherConstants 생성

속성:
최고 기온 경보 기준(MAX_TEMPERATURE_ALERT, static final double) - 값을 40.0 으로 저장
최저 기온 경보 기준(MIN_TEMPERATURE_ALERT, static final double) - 값을 -10.0 으로 저장
강수량 경보 기준(PRECIPITATION_ALERT, static final double) - 값을 50.0 으로 저장
이 클래스는 상수만을 포함하며, 인스턴스화되지 않습니다. 즉, 객체 생성을 못하게 막아주세요.
 */
public class WeatherConstants {

    static final double MAX_TEMPERATURE_ALERT = 40.0;
    static final double MIN_TEMPERATURE_ALERT = -10.0;
    static final double MIN_WIND_ALERT = 50.0;

    // 객체 생성 막기
    private WeatherConstants() {

    }

}
