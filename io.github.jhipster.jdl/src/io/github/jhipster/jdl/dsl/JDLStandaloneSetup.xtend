/*
 * generated by Xtext 2.10.0
 */
package io.github.jhipster.jdl.dsl


/**
 * Initialization support for running Xtext languages without Equinox extension registry.
 */
class JDLStandaloneSetup extends JDLStandaloneSetupGenerated {

	def static void doSetup() {
		new JDLStandaloneSetup().createInjectorAndDoEMFRegistration()
	}
}
