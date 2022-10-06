import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext applicationContext =
                new AnnotationConfigApplicationContext(AppConfig.class);
        HelloWorld helloBean1 =
                (HelloWorld) applicationContext.getBean("helloworld");
        System.out.println(helloBean1.getMessage());

        HelloWorld helloBean2 = applicationContext.getBean("helloworld", HelloWorld.class);

        Cat catBean1 = applicationContext.getBean("cat", Cat.class);

        Cat catBean2 = applicationContext.getBean("cat", Cat.class);

        System.out.println(catBean1.getMessage());

        System.out.println(helloBean1 == helloBean2);
        System.out.println(catBean1 == catBean2);
    }
}