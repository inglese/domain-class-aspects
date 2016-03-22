package email.englisch

import org.junit.Test

import static org.hamcrest.MatcherAssert.assertThat
import static org.hamcrest.Matchers.is
import static org.hamcrest.Matchers.isA
import static org.hamcrest.Matchers.equalTo

class ClassWithoutAspectsTest {
    @Test
    void test_class_creation() {
        ClassWithoutAspects cwoa = new ClassWithoutAspects(integerBean: 123, stringBean: 'a string')

        assertThat(cwoa, isA(ClassWithoutAspects))
        assertThat(cwoa.integerBean, is(equalTo(123)))
        assertThat(cwoa.stringBean, is(equalTo('a string')))
    }
}
