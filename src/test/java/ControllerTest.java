import io.jboot.Jboot;
import io.jboot.db.model.JbootModel;
import io.jboot.rpc.annotation.JbootrpcService;
import io.jboot.service.JbootService;
import io.jboot.web.controller.JbootController;
import io.jboot.web.controller.annotation.UrlMapping;

import javax.inject.Inject;
import javax.inject.Singleton;

/**
 * Created by michael on 2017/6/8.
 */
@UrlMapping(url = "/test")
public class ControllerTest extends JbootController {


    public static void main(String[] args) {
        Jboot.run(args);
    }


    @Inject
    ServiceTest serviceTest;

    @JbootrpcService
    ServiceInter serviceInter;


    public void index() {
        System.out.println("index .... ");
        renderText("hello " + serviceTest.getName());
//        renderText("hello " + serviceInter.hello());

    }


    @Singleton
    public static class ServiceTest extends JbootService {


        public String getName() {
            return "michael";
        }


        @Override
        public JbootModel findById(Object id) {
            return null;
        }

        @Override
        public boolean deleteById(Object id) {
            return false;
        }
    }


    public static interface ServiceInter {
        public String hello();
    }


}
