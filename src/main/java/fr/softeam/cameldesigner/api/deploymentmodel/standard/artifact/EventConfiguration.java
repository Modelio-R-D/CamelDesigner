/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: CamelDesigner v1.0.06

 * This file was generated on 2/15/22 11:06 PM by Modelio Studio.
 */
package fr.softeam.cameldesigner.api.deploymentmodel.standard.artifact;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import fr.softeam.cameldesigner.api.CamelDesignerProxyFactory;
import fr.softeam.cameldesigner.api.ICamelDesignerPeerModule;
import fr.softeam.cameldesigner.api.camelcore.infrastructure.modelelement.CamelElement;
import fr.softeam.cameldesigner.api.camelcore.standard.artifact.FeatureArtifact;
import fr.softeam.cameldesigner.impl.CamelDesignerModule;
import org.modelio.api.modelio.model.IModelingSession;
import org.modelio.api.modelio.model.PropertyConverter;
import org.modelio.api.module.context.IModuleContext;
import org.modelio.metamodel.mmextensions.infrastructure.ExtensionNotFoundException;
import org.modelio.metamodel.uml.infrastructure.Dependency;
import org.modelio.metamodel.uml.infrastructure.ModelElement;
import org.modelio.metamodel.uml.infrastructure.Stereotype;
import org.modelio.metamodel.uml.infrastructure.TagType;
import org.modelio.metamodel.uml.infrastructure.properties.PropertyDefinition;
import org.modelio.metamodel.uml.infrastructure.properties.PropertyTableDefinition;
import org.modelio.metamodel.uml.statik.Artifact;
import org.modelio.vcore.smkernel.mapi.MObject;

/**
 * Proxy class to handle a {@link Artifact} with << EventConfiguration >> stereotype.
 * <p>Stereotype description:
 * <br/><i>null</i></p>
 */
@objid ("f7162d5d-ed91-4ada-8780-ceae18efea97")
public class EventConfiguration extends FeatureArtifact {
    @objid ("5f5767a3-c404-4c1d-8b86-f8dd0840dc51")
    public static final String STEREOTYPE_NAME = "EventConfiguration";

    @objid ("5d55cc58-5dfa-4d39-b0ff-ab15005c1c81")
    public static final String HTTPMETHODNAME_TAGTYPE = "httpMethodName";

    @objid ("2b1230eb-ff26-4bed-ac20-f6973adce63c")
    public static final String HTTPMETHODTYPE_TAGTYPE = "httpMethodType";

    /**
     * Tells whether a {@link EventConfiguration proxy} can be instantiated from a {@link MObject} checking it is a {@link Artifact} stereotyped << EventConfiguration >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("9d9c2e1d-9161-4ab6-be14-ea4a7050199e")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Artifact) && ((Artifact) elt).isStereotyped(ICamelDesignerPeerModule.MODULE_NAME, EventConfiguration.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Artifact} stereotyped << EventConfiguration >> then instantiate a {@link EventConfiguration} proxy.
     * 
     * @return a {@link EventConfiguration} proxy on the created {@link Artifact}.
     */
    @objid ("d04bf619-9d57-402c-bd3c-a7a113a7723a")
    public static EventConfiguration create() {
        ModelElement e = (ModelElement)CamelDesignerModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Standard.Artifact");
        e.addStereotype(ICamelDesignerPeerModule.MODULE_NAME, EventConfiguration.STEREOTYPE_NAME);
        return EventConfiguration.instantiate((Artifact)e);
    }

    /**
     * Tries to instantiate a {@link EventConfiguration} proxy from a {@link Artifact} stereotyped << EventConfiguration >> checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Artifact
     * @return a {@link EventConfiguration} proxy or <i>null</i>.
     */
    @objid ("cc29ce70-e80a-4d15-af24-af2484db39f5")
    public static EventConfiguration instantiate(final Artifact obj) {
        return EventConfiguration.canInstantiate(obj) ? new EventConfiguration(obj) : null;
    }

    /**
     * Tries to instantiate a {@link EventConfiguration} proxy from a {@link Artifact} stereotyped << EventConfiguration >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link Artifact}
     * @return a {@link EventConfiguration} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    @objid ("3ed2dd08-e6b5-4c8b-98db-21f906e57d77")
    public static EventConfiguration safeInstantiate(final Artifact obj) throws IllegalArgumentException {
        if (EventConfiguration.canInstantiate(obj))
        	return new EventConfiguration(obj);
        else
        	throw new IllegalArgumentException("EventConfiguration: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("3333bdb3-e51d-438e-95c3-70f7d9031fbe")
    @Override
    public boolean equals(final Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        EventConfiguration other = (EventConfiguration) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link Artifact}. 
     * @return the Artifact represented by this proxy, never null.
     */
    @objid ("cb6f9c12-4b7b-4618-b453-041b5b782dd7")
    @Override
    public Artifact getElement() {
        return (Artifact)super.getElement();
    }

    /**
     * Getter for string property 'httpMethodName'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("ea91a5c4-8706-489e-b348-03a534897f7c")
    public String getHttpMethodName() {
        return this.elt.getTagValue(EventConfiguration.MdaTypes.HTTPMETHODNAME_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'httpMethodType'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("94c6b744-cedb-4a64-a5e2-0442ee228beb")
    public String getHttpMethodType() {
        return this.elt.getTagValue(EventConfiguration.MdaTypes.HTTPMETHODTYPE_TAGTYPE_ELT);
    }

    @objid ("dfe65e89-5753-4630-b7a2-1daa20530a1c")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Setter for string property 'httpMethodName'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("9f0ed9f6-0ef9-4360-9a0b-d5318e3cffb8")
    public void setHttpMethodName(final String value) {
        this.elt.putTagValue(EventConfiguration.MdaTypes.HTTPMETHODNAME_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'httpMethodType'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("f3709ed1-02b0-4ae2-b832-8c5e65787130")
    public void setHttpMethodType(final String value) {
        this.elt.putTagValue(EventConfiguration.MdaTypes.HTTPMETHODTYPE_TAGTYPE_ELT, value);
    }

    @objid ("daa204fc-3327-454f-ae82-5500f1a86f8e")
    @Override
    public List<CamelElement> getChilds() {
        List<CamelElement> result = new ArrayList<>();
        result.addAll(super.getChilds());
        return result;
    }

    @objid ("50114007-8f52-4f76-8f31-d823b99f0cc4")
    protected EventConfiguration(final Artifact elt) {
        super(elt);
    }

    @objid ("daa7f0bf-b9d3-467f-a096-f7cf1f5b5ad2")
    public static final class MdaTypes {
        @objid ("a217031f-74c0-4f55-84cc-4bd4c4de8cbb")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("a46831d5-8e94-402e-8032-4aed8aa261ed")
        public static TagType HTTPMETHODNAME_TAGTYPE_ELT;

        @objid ("7b46c291-ffb7-4aff-ae79-0699867137ea")
        public static TagType HTTPMETHODTYPE_TAGTYPE_ELT;

        @objid ("b3874090-7373-44c0-824b-548d30800c37")
        private static Stereotype MDAASSOCDEP;

        @objid ("94b13f43-da46-46e2-92d5-25e405691eeb")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("a5d7edc1-7365-4a5e-8110-aa2833f8f039")
        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "5138fe5c-0bae-4c49-9442-c6ac48dd09d8");
            HTTPMETHODNAME_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "06feb07e-1378-4f53-8ae2-7ba21ca97283");
            HTTPMETHODTYPE_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "b6e019c4-7a53-4b8f-8ce5-bc2c0bf22328");
            MDAASSOCDEP = ctx.getModelingSession().findElementById(Stereotype.class, "94b7efa5-f94c-4d1d-896f-f103e56a8e2e");
            MDAASSOCDEP_ROLE = ctx.getModelingSession().findElementById(TagType.class, "7637f2fd-b750-43c1-a15c-5d0b084ca1cd");
        }


	static {
		if(CamelDesignerModule.getInstance() != null) {
			init(CamelDesignerModule.getInstance().getModuleContext());
		}
	}
    }

}
