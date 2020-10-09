# Spring Framework
이미 필요한 부분이 다 갖춰져있는 프레임워크 그중에서 스프링 프레임워크를 사용한다.  
모듈화가 잘되어있어서 필요한 부분만 가져다가 사용이 가능하다.

# Spring VS Spring Boot

Spring 에서는 원하는 도구를 사용하려면 dependency 가 어마어마하게 길어진다. 왜냐하면 버전까지 정확하게 지정해 주어야 하기 때문이다.
Spring Boot 는 이미 자주 사용되는 세팅에 대해서 starter 가 존재하고 코드의 길이도 짧아지고 버전관리도 권장버전으로 자동설정된다.

## Spring Boot 를 사용하면
- 간편한 설정
- 편리한 의존성 관리 & 자동 권장 버전 관리
- 내장 서버로 인한 간단한 배포 서버 구축
- 스프링 Security, Data JPA 등의 다른 스프링 프레임워크 요소를 쉽게 사용 



# Spring IOC/DI 컨테이너
## 컨테이너란?
- 컨테이너는 인스턴스의 생명주기를 관리한다.
- 생성된 인스턴스들에게 추가적인 기능을 제공한다.

## IOC 란?
Inversion of Control 의 약자로 제어의 역전이라고도한다.
- 개발자는 프로그램의 흐름을 제어하는 코드를 작성
- 이 흐름의 제어를 개발자가 하는것이 아니라 다른 프로그램이 그 흐름을 제어하는것
- 아직 무슨소린지 잘 모르겠음....

## IoC 용어 정리
### bean
스프링에서 제어권을 가지고 직접 만들어 관계를 부여하는 오브젝트

### bean factory
스프링의 IoC를 담당하는 핵심 컨테이너  
Bean 을 등록 / 생성 / 조회 / 반환 / 관리 한다. 보통 bean factory를 바로 사용하지않고 이를 확장한 application context를 이용한다.

### application context
bean factory를 확장한 IcO 컨테이너  
Bean의 등록  / 생성 / 조회 / 반환 / 관리 기능은 bean factoryㅈ와 같지만 추가적으로 spring의 각종 부가 서비스를 제공한다.  
ApplicationContext 는 application context 가 구현해야하는 interface이며, BeanFactory를 상속한다.

### configuration metadata
application context 혹은bean factory가 IoC를 적용하기 위해 사용하는 메타정보  
스프링의 설정정보는 컨테이너에 어떤 기능을 세팅하거나 조정하는 경우에도 사용하지만 주로 bean을 생성/구성하는 용도로 사용한다.

## DI
Dependency Injection 의존성 주입 이란 뜻을 갖고 있으며 클래스사이의 의존관계를 빈 설정 정보를 바탕으로 컨테이너가 자동으로 연결해주는것을 말함.


# DTO
- DTO란 Data Transfer Object의 약자이다.
- 계층간 데이터 교환을 위한 자바빈즈이다.
- 여기서의 계층이란 컨트롤러뷰, 비지니스 계층, 퍼시스턴스 계층을 의미한다.
- 일반적으로 DTO는 로직을 가지고 있지 않고 순수한 데이터 객체이다.

# DAO
- DAO 란 Data Access Object의 약자로 데이터를 조회하거나 조작하는 기능을 전담하도록 만든 객체이다.
- 보통 데이터베이스를 조작하는 기능을 전담하는 목적으로 만들어진다.

# ConnectionPool
- DB 연결은 비용이 많이든다.
- 커넥션풀은 미이 커넥션을 여러개 맺어둔다.
- 커넥션이 필요하면 커넥션 풀에게 빌려서 사용한 후 반납한다.
- 커넥션을 반납하지 않으면 어떻게 될까?