package org.geogebra.common.kernel.interval;

import static java.lang.Double.POSITIVE_INFINITY;
import static java.lang.Math.PI;
import static org.geogebra.common.kernel.interval.IntervalTest.interval;
import static org.geogebra.common.kernel.interval.IntervalTest.shouldEqual;

import org.geogebra.common.BaseUnitTest;
import org.geogebra.common.plugin.Operation;
import org.junit.Test;

public class IntervalEvaluateTest extends BaseUnitTest {
	@Test
	public void testEvaluateOperand() throws Exception {
		shouldEqual(interval(0, 0),
				interval(0, 0).evaluate(Operation.SIN));
		shouldEqual(interval(0, 1),
				interval(0, PI / 2).evaluate(Operation.SIN));
		shouldEqual(interval(-1, 1),
				interval(0, 3 * PI / 2).evaluate(Operation.SIN));
		shouldEqual(interval(-1, 0),
				interval(PI, 3 * PI / 2).evaluate(Operation.SIN));
		shouldEqual(interval(0, 0),
				interval(-PI, -PI).evaluate(Operation.SIN));
		shouldEqual(interval(1, 1),
				interval(PI / 2, PI / 2).evaluate(Operation.SIN));
		shouldEqual(interval(-1, -1),
				interval(-PI / 2, -PI / 2).evaluate(Operation.SIN));
		shouldEqual(interval(-1, 0),
				interval(-PI, 0).evaluate(Operation.SIN));
		shouldEqual(interval(0, 1),
				interval(-2 * PI, -3 * PI / 2).evaluate(Operation.SIN));
		double p = 2 * PI;
		shouldEqual(interval(0, 1), interval(-5 * p - 2 * PI,
				-5 * p - (3 * PI) / 2).evaluate(Operation.SIN));
		shouldEqual(interval(0.16767801556, 0.18877817478),
				interval(-2.975460122699386, -2.955010224948875)
						.evaluate(Operation.TAN));

	}

	@Test
	public void testAdd() throws Exception {
		Interval i1 = interval(-2, 2);
		shouldEqual(i1,
				interval(-1, 1).evaluate(Operation.PLUS, interval(-1, 1)));
		Interval i2 = interval(-1, POSITIVE_INFINITY);
		shouldEqual(i2,
				interval(-1, POSITIVE_INFINITY)
						.evaluate(Operation.PLUS, interval(0, 1)));
	}

	@Test
	public void testMultipleAdd() throws Exception {
		shouldEqual(interval(2, 3), interval(0, 0)
			.evaluate(Operation.PLUS, interval(0, 1))
			.evaluate(Operation.PLUS, interval(2, 2))
		);

	}

	@Test
	public void testAddAndSinSeparate() {
		Interval result = interval(0, PI / 2).add(interval(PI, PI));
		shouldEqual(interval(PI, 3 * PI / 2), result);
		shouldEqual(interval(-1, 0), result.sin());
	}

	@Test
	public void testAddAndSinChained() {
		Interval result = interval(PI, PI).add(interval(0, PI / 2))
				.sin();
		shouldEqual(interval(-1, 0), result);
	}

	@Test
	public void testAddAndSinEvaluate() throws Exception {
		shouldEqual(interval(PI, 3 * PI / 2),
				interval(PI, PI).evaluate(Operation.PLUS, interval(0, PI / 2)));

		shouldEqual(interval(1, 3),
				interval(PI, PI).evaluate(Operation.PLUS, interval(0, PI / 2))
					.evaluate(Operation.SIN)
					.evaluate(Operation.PLUS, interval(2, 3)));

	}
}
