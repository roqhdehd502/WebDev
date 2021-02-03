package edu.bit.ex.database;

import static org.junit.Assert.assertNotNull;

import javax.inject.Inject;
import javax.sql.DataSource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

import lombok.extern.log4j.Log4j;

@RunWith(SpringRunner.class)
@ContextConfiguration("file:src/main/webapp/WEB-INF/spring/root-context.xml")
@Log4j

// DB 커넥션 JUnit 테스트
public class ConnectionTest {
	@Inject // @Autowired
	DataSource dataSource;

	@Test
	public void testDataSource() {
		log.info("Datasource: " + dataSource);
		assertNotNull(dataSource);
	}
}