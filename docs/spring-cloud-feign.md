# Spring Cloud Feign

---

声明式服务调用

---

## 准备工作

### 依赖

```xml
<dependencies>
    <dependency>
    	<groupId>org.springframework.cloud</groupId>
    	<artifactId>spring-cloud-starter-eureka</artifactId>
    </dependency>
    <dependency>
    	<groupId>org.springframework.cloud</groupId>
    	<artifactId>spring-cloud-starter-feign</artifactId>
    </dependency>
</dependencies>
```

### 配置

注解 `@EnableFeignClients`

```java
@EnableFeignClients
@EnableDiscoveryClient
@SpringBootApplication
public class ConsumerApplication {
    public static void main(String[] args) {
        SpringApplication.run(ConsumerApplication.class, args);
    }
}
```

---

## 使用

### 接口

通过 `@FeignClient("springcloud-feign-demo-provider")` 创建 Ribbon 负载均衡器

```java
@FeignClient("springcloud-feign-demo-provider")
public interface ProviderService extends DemoService {
}
```

```java
@RequestMapping("/v1/demo")
public interface DemoService {
    @GetMapping
    String get();

    @GetMapping("/{value}")
    String getValue(@PathVariable("value") String value);
}
```

### 调用

```java
@RestController
@RequestMapping("/v1/consumer")
public class ConsumerController {
    @Autowired
    private ProviderService providerService;

    @GetMapping
    public String get() {
        return providerService.get();
    }

    @GetMapping("/{value}")
    public String getValue(@PathVariable String value) {
        return providerService.getValue(value);
    }
}
```

## 自定义配置

默认配置 `org.springframework.cloud.netflix.feign.FeignClientsConfiguration`

### 重试

默认不进行重试

```
@Bean
@ConditionalOnMissingBean
public Retryer feignRetryer() {
    return Retryer.NEVER_RETRY;
}
```

自定义

```
@Bean
public Retryer feignRetryer() {
    return new Retryer.Default(100, SECONDS.toMillis(1), 3);
}
```





