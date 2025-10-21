package modules.test540Collaboration.domain;

import org.skyve.util.DataBuilder;
import org.skyve.util.test.SkyveFixture.FixtureType;
import util.AbstractDomainTest;

/**
 * Generated - local changes will be overwritten.
 * Extend {@link AbstractDomainTest} to create your own tests for this document.
 */
public class FruitTest extends AbstractDomainTest<Fruit> {

	@Override
	protected Fruit getBean() throws Exception {
		return new DataBuilder()
			.fixture(FixtureType.crud)
			.build(Fruit.MODULE_NAME, Fruit.DOCUMENT_NAME);
	}
}