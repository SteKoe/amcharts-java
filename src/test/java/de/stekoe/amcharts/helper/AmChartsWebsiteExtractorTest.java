package de.stekoe.amcharts.helper;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.junit.Assert.assertThat;

import org.junit.Before;
import org.junit.Test;


public class AmChartsWebsiteExtractorTest {

    private AmChartsWebsiteExtractor extractor;

    @Before
    public void setUp() {
        extractor = new AmChartsWebsiteExtractor();
    }

    @Test
    public void deepInheritanceChain() throws Exception {
        String s = "AmFunnelChart → AmSlicedChart → AmChart";
        String superclass = extractor.extractSuperClass(s);
        assertThat(superclass, equalTo("AmSlicedChart"));
    }

    @Test
    public void easyInheritanceChain() throws Exception {
        String s = "AmFunnelChart → AmSlicedChart";
        String superclass = extractor.extractSuperClass(s);
        assertThat(superclass, equalTo("AmSlicedChart"));
    }
}
