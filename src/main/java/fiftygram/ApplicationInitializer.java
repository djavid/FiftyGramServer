package fiftygram;

import fiftygram.config.WebConfig;
import org.springframework.web.WebApplicationInitializer;
import org.springframework.web.context.ContextLoaderListener;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
import org.springframework.web.servlet.DispatcherServlet;

import javax.servlet.ServletException;
import javax.servlet.ServletContext;
import javax.servlet.ServletRegistration;
import java.applet.AppletContext;
import java.sql.Date;

public class ApplicationInitializer implements WebApplicationInitializer {

    private final static String DISPATCHER = "dispatcher";

    public void onStartup(javax.servlet.ServletContext servletContext) throws ServletException {
        AnnotationConfigWebApplicationContext context = new AnnotationConfigWebApplicationContext();
        context.register(WebConfig.class);
        servletContext.addListener(new ContextLoaderListener(context));

        //PartyDAO partyDAO = (PartyDAO) context.getBean("partyDAO");
        //Party party = new Party(1, 1, "Party in da house!",
        //        "Best Party!", new Date(2016, 2, 17),
        //        new Date(2016, 2, 18), 10, 25.3, 27.5,
        //        "Dubki", "Private", "Party", 0);
        //partyDAO.insert(party);

        //Party party1 = partyDAO.findByPartyId(1);
        //System.out.println(party1);

        ServletRegistration.Dynamic servlet = servletContext.addServlet(DISPATCHER, new DispatcherServlet(context));
        servlet.addMapping("/");
        servlet.setLoadOnStartup(1);
    }
}
