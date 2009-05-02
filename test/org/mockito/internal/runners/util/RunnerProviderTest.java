package org.mockito.internal.runners.util;

import org.junit.Test;
import org.mockito.internal.runners.RunnerImpl;
import org.mockitoutil.TestBase;


public class RunnerProviderTest extends TestBase {
    
    @Test
    public void shouldKnowAboutJUnit45() throws Exception {
        //given
        RunnerProvider provider = new RunnerProvider();
        //then
        assertTrue(provider.isJUnit45OrHigherAvailable());
        //I cannot test the opposite condition :(
    }
    
    @Test
    public void shouldCreateRunnerInstance() throws Throwable {
        //given
        RunnerProvider provider = new RunnerProvider();
        //when
        RunnerImpl runner = provider.newInstance("org.mockito.internal.runners.JUnit45AndUpRunnerImpl", this.getClass());
        //then
        assertNotNull(runner);
    }
}