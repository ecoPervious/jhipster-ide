/*
 * generated by Xtext 2.10.0
 */
package io.github.jhipster.jdl.dsl.idea.highlighting;

import io.github.jhipster.jdl.dsl.idea.lang.JDLLanguage;
import org.eclipse.xtext.idea.highlighting.SemanticHighlightVisitor;

public class JDLSemanticHighlightVisitor extends SemanticHighlightVisitor {
	public JDLSemanticHighlightVisitor() {
		JDLLanguage.INSTANCE.injectMembers(this);
	}
}
