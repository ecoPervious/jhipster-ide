/*
 * generated by Xtext 2.10.0
 */
package io.github.jhipster.jdl.dsl.idea.highlighting;

import io.github.jhipster.jdl.dsl.idea.lang.JDLLanguage;
import org.eclipse.xtext.idea.highlighting.AbstractColorSettingsPage;

public class JDLBaseColorSettingsPage extends AbstractColorSettingsPage {
	
	public JDLBaseColorSettingsPage() {
		JDLLanguage.INSTANCE.injectMembers(this);
	}

	@Override
	public String getDisplayName() {
		return JDLLanguage.INSTANCE.getDisplayName();
	}
}
