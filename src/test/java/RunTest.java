import Hooks.WebHooks;
import org.junit.Assert;

public class RunTest extends WebHooks {
    @org.junit.Test
    public void Testic() {
        String login = "nikname";
        System.out.println(login);
        Assert.assertEquals("Ошибки нет, переход к введению пароля", "nikname", login);
    }

    @org.junit.Test
    public void TestNegative() {
        String login = "nikname";
        System.out.println(login);
        Assert.assertEquals("Ошибка, данные некорректны", "2695", login);
    }

    @org.junit.Test
    public void TestPass() {
        double password = 8567;
        System.out.println(password);
        Assert.assertEquals("Вы авторизованы", 8567, 8567);

    }

    @org.junit.Test
    public void TestPassNegative() {
        double password = 8567;
        System.out.println(password);
        Assert.assertEquals("Неверный пароль", 8561, 8567);

    }
}
