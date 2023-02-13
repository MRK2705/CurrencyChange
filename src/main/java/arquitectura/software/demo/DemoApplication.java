package arquitectura.software.demo;

import ch.qos.logback.classic.LoggerContext;
import ch.qos.logback.classic.joran.JoranConfigurator;
import ch.qos.logback.core.joran.spi.JoranException;
import ch.qos.logback.core.util.StatusPrinter;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication {

	private static final Logger logger = LoggerFactory.getLogger(DemoApplication.class);
	public static void main(String[] args) throws JoranException {

		SpringApplication.run(DemoApplication.class, args);

		// assume SLF4J is bound to logback in the current environment

		LoggerContext context = (LoggerContext) LoggerFactory.getILoggerFactory();

		try {
			JoranConfigurator configurator = new JoranConfigurator();
			configurator.setContext(context);
			context.reset();
			configurator.doConfigure("src/main/java/logback.xml");
		} catch (JoranException je) {
			je.printStackTrace();
		}
		StatusPrinter.printInCaseOfErrorsOrWarnings(context);
	}

}
