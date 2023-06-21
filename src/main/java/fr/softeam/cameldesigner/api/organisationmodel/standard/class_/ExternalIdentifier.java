/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: CamelDesigner v1.0.16

 * This file was generated on 3/28/23 4:09 PM by Modelio Studio.
 */
package fr.softeam.cameldesigner.api.organisationmodel.standard.class_;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import fr.softeam.cameldesigner.api.CamelDesignerProxyFactory;
import fr.softeam.cameldesigner.api.ICamelDesignerPeerModule;
import fr.softeam.cameldesigner.api.camelcore.infrastructure.modelelement.CamelElement;
import fr.softeam.cameldesigner.api.camelcore.standard.class_.FeatureClass;
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
import org.modelio.metamodel.uml.statik.Class;
import org.modelio.vcore.smkernel.mapi.MObject;

/**
 * Proxy class to handle a {@link Class} with << ExternalIdentifier >> stereotype.
 * <p>Stereotype description:
 * <br/><i>null</i></p>
 */
@objid ("facd10dc-f6ab-44d0-b526-c83be089740a")
public class ExternalIdentifier extends FeatureClass {
    @objid ("f2e83e2e-9912-4c4e-8036-72310ddab8b0")
    public static final String STEREOTYPE_NAME = "ExternalIdentifier";

    @objid ("a063b9fc-60ee-4ce9-9b95-605c619dd734")
    public static final String IDENTIFIER_TAGTYPE = "identifier";

    /**
     * Tells whether a {@link ExternalIdentifier proxy} can be instantiated from a {@link MObject} checking it is a {@link Class} stereotyped << ExternalIdentifier >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("605eb0c6-c057-4767-b62b-bcf9ad77c594")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Class) && ((Class) elt).isStereotyped(ICamelDesignerPeerModule.MODULE_NAME, ExternalIdentifier.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Class} stereotyped << ExternalIdentifier >> then instantiate a {@link ExternalIdentifier} proxy.
     * 
     * @return a {@link ExternalIdentifier} proxy on the created {@link Class}.
     */
    @objid ("a6bf0dbc-7b30-4fab-9097-5dcaa9409f66")
    public static ExternalIdentifier create() {
        ModelElement e = (ModelElement)CamelDesignerModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Standard.Class");
        e.addStereotype(ICamelDesignerPeerModule.MODULE_NAME, ExternalIdentifier.STEREOTYPE_NAME);
        return ExternalIdentifier.instantiate((Class)e);
    }

    /**
     * Tries to instantiate a {@link ExternalIdentifier} proxy from a {@link Class} stereotyped << ExternalIdentifier >> checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Class
     * @return a {@link ExternalIdentifier} proxy or <i>null</i>.
     */
    @objid ("b1ac4a10-fc61-4bc3-91f2-beca582dca4c")
    public static ExternalIdentifier instantiate(final Class obj) {
        return ExternalIdentifier.canInstantiate(obj) ? new ExternalIdentifier(obj) : null;
    }

    /**
     * Tries to instantiate a {@link ExternalIdentifier} proxy from a {@link Class} stereotyped << ExternalIdentifier >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link Class}
     * @return a {@link ExternalIdentifier} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    @objid ("2ff1149b-e909-420b-bab8-b6756563ab1d")
    public static ExternalIdentifier safeInstantiate(final Class obj) throws IllegalArgumentException {
        if (ExternalIdentifier.canInstantiate(obj))
        	return new ExternalIdentifier(obj);
        else
        	throw new IllegalArgumentException("ExternalIdentifier: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("cbd26328-ef20-440d-866d-231528493ec7")
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
        ExternalIdentifier other = (ExternalIdentifier) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link Class}. 
     * @return the Class represented by this proxy, never null.
     */
    @objid ("3ce5767d-f107-4318-8f1a-dcb8c6f9ece0")
    @Override
    public Class getElement() {
        return (Class)super.getElement();
    }

    /**
     * Getter for string property 'identifier'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("49b4bd20-7b71-4769-a985-1497eb135747")
    public String getIdentifier() {
        return this.elt.getTagValue(ExternalIdentifier.MdaTypes.IDENTIFIER_TAGTYPE_ELT);
    }

    @objid ("38b5150b-a832-4a7e-a546-abe07c4ba3e2")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Setter for string property 'identifier'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("c76ba293-086f-45af-a783-907df47fe5b5")
    public void setIdentifier(final String value) {
        this.elt.putTagValue(ExternalIdentifier.MdaTypes.IDENTIFIER_TAGTYPE_ELT, value);
    }

    @objid ("c294416b-d255-4cbe-a4d8-e075b9226e35")
    @Override
    public List<CamelElement> getChilds() {
        List<CamelElement> result = new ArrayList<>();
        result.addAll(super.getChilds());
        return result;
    }

    @objid ("6fb97838-833a-4325-898f-e87fb83312f3")
    protected ExternalIdentifier(final Class elt) {
        super(elt);
    }

    @objid ("c29cec98-a116-4fff-9165-be962105e0ad")
    public static final class MdaTypes {
        @objid ("7a1460ae-4758-4f8a-b035-7a11dc92ff18")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("096dc217-0848-4bfa-892a-4e9662b81838")
        public static TagType IDENTIFIER_TAGTYPE_ELT;

        @objid ("ed2fc48a-8cdc-4a45-8be8-6730c67785d7")
        private static Stereotype MDAASSOCDEP;

        @objid ("4956a057-36e2-4002-8e14-87bc67614e3a")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("a50ca71e-c8ef-4575-9168-4e85f80e7a0f")
        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "9e9641f0-08c0-4453-a828-314b9d3e7682");
            IDENTIFIER_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "79f66d2e-b870-4d06-81b9-8851077fb522");
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
