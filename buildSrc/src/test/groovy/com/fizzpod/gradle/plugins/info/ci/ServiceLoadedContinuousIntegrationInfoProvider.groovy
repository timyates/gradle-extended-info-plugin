package com.fizzpod.gradle.plugins.info.ci

import nebula.plugin.info.ci.AbstractContinuousIntegrationProvider;

import org.gradle.api.Project

class ServiceLoadedContinuousIntegrationInfoProvider extends AbstractContinuousIntegrationProvider {

	@Override
	boolean supports(Project project) {
		false;
	}

	@Override
	String calculateBuildNumber(Project project) {
		"CI_NUMBER"
	}

	@Override
	String calculateBuildId(Project project) {
		"CI_BUILD_ID_1"
	}

	@Override
	String calculateHost(Project project) {
		"CI_HOST"
	}

	@Override
	String calculateJob(Project project) {
		"CI_JOB"
	}

	protected String getEnvironmentVariable(String envKey) {
		System.getenv(envKey)
	}
}
