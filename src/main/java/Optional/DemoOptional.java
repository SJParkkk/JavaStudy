package Optional;
/**Optional interface
 * 비어있을 수도 있고 값 하나만을 담고 있을 수 있는 컨테이너 인스턴스의 타입
 * 래퍼런스 타입은 기본값이 널
 * 널체크를 당연히 잊을 수 있고 , 종종 NullPointException : 해결하는 방법 1.고전적 2.
 * 자바는 에러를 찍으면 StackTrace 를 자체적으로 찍고 이 자체가 resource 를 쓰게됨
 * Null 에다 뭔가 처리를 하면 NullPointException이 남
 * Map이라는 인터패이스 가장 큰 특징: key는 널이 아니다 . Optional이다? 말도 안됨
 * 프리미티브 타입? 원시 ㅌ타입 (박싱 언박싱)발생해서 성능이 안좋음
 * OptionalInt.of(10) 권장
 * Container 성격의 instance 는 Optional 로 감싸지 않는다
 * =====================================================================
 * Stream 에서도 Optional을 리턴하는 경우가 있는데 종료형 Operation
 * 가급적이면 get을 사용하지 않고 Optional 에 존재하는  메소드를 사용해서 명시적으로 작성해야 함
 * stream에 있는 map은 1:1 맵핑 인풋은 하나인데 아웃풋이 여러개일때 flatmap을 사용하는 거임**/
public class DemoOptional {

}
