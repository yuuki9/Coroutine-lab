코루틴 빌더 (Coroutine Builders)
launch -가장 많이 사용하는 코루틴 빌더 결과를 반환하지 않으며 Job을 리턴

coroutineScope
- 자식 코루틴들이 모두 완료될 때까지 코루틴 범위 유지
- Structured Concurrency를 보장
- 내부에 정의된 모든 코루틴이 종료되어야 빠져나갈 수 있음

Coroutine Context
- 코루틴의 실행에 영향을 미치는 다양한 요소(Dispatcher, Job 등)를 담고 있는 환경 정보
- 코루틴 빌더에 의해 생성된 코루틴은 이 Context를 기반으로 동작

Suspend Function
- suspend 키워드로 정의된 중단 가능한 함수
- 일반 함수와 작성 방식은 동일하지만, 다른 suspend 함수 또는 코루틴 안에서만 호출 가능
- 예시: kotlin - suspend fun delay(timeMillis: Long)
