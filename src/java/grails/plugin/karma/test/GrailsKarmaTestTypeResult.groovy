package grails.plugin.karma.test

import groovy.lang.Binding

import java.io.File;

import org.codehaus.groovy.grails.test.GrailsTestTargetPattern;
import org.codehaus.groovy.grails.test.GrailsTestType;
import org.codehaus.groovy.grails.test.GrailsTestTypeResult;
import org.codehaus.groovy.grails.test.event.GrailsTestEventPublisher;

class GrailsKarmaTestTypeResult implements GrailsTestTypeResult {

	@Override
	public int getPassCount() {
		1
	}

	@Override
	public int getFailCount() {
		0
	}

}
