package com.fenyatlala.ehr;

import com.fenyatlala.ehr.FenyaTlalaEhrApp;
import com.fenyatlala.ehr.config.AsyncSyncConfiguration;
import com.fenyatlala.ehr.config.EmbeddedElasticsearch;
import com.fenyatlala.ehr.config.EmbeddedKafka;
import com.fenyatlala.ehr.config.EmbeddedSQL;
import com.fenyatlala.ehr.config.TestSecurityConfiguration;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.DirtiesContext;

/**
 * Base composite annotation for integration tests.
 */
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@SpringBootTest(classes = { FenyaTlalaEhrApp.class, AsyncSyncConfiguration.class, TestSecurityConfiguration.class })
@EmbeddedElasticsearch
@EmbeddedKafka
@EmbeddedSQL
@DirtiesContext(classMode = DirtiesContext.ClassMode.AFTER_CLASS)
public @interface IntegrationTest {
}
