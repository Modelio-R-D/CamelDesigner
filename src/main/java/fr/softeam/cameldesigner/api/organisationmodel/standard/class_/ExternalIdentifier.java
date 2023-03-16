/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: CamelDesigner v1.0.16

 * This file was generated on 3/16/23 3:21 PM by Modelio Studio.
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
    @objid ("47fa65b2-6b6b-444b-b4ce-3da21e419b50")
    public static final String STEREOTYPE_NAME = "ExternalIdentifier";

    @objid ("5a17990f-7782-45e9-967b-7f10076128fe")
    public static final String IDENTIFIER_TAGTYPE = "identifier";

    /**
     * Tells whether a {@link ExternalIdentifier proxy} can be instantiated from a {@link MObject} checking it is a {@link Class} stereotyped << ExternalIdentifier >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("5f698f8a-0219-452f-97e2-0a89808826c8")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Class) && ((Class) elt).isStereotyped(ICamelDesignerPeerModule.MODULE_NAME, ExternalIdentifier.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Class} stereotyped << ExternalIdentifier >> then instantiate a {@link ExternalIdentifier} proxy.
     * 
     * @return a {@link ExternalIdentifier} proxy on the created {@link Class}.
     */
    @objid ("e9d8e756-1c0b-4764-8916-333fab5448da")
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
    @objid ("1a567e5d-ebae-4ce4-b6e8-6c071846d51d")
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
    @objid ("21674582-5f6a-4cf6-9752-a67959018bda")
    public static ExternalIdentifier safeInstantiate(final Class obj) throws IllegalArgumentException {
        if (ExternalIdentifier.canInstantiate(obj))
        	return new ExternalIdentifier(obj);
        else
        	throw new IllegalArgumentException("ExternalIdentifier: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("2dcdde5f-9f69-4bc5-9a61-012fde36e8e8")
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
    @objid ("7adcdd51-e721-49c2-bb52-b2a3b7f707cb")
    @Override
    public Class getElement() {
        return (Class)super.getElement();
    }

    /**
     * Getter for string property 'identifier'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("c3f41b3e-9310-4b1a-939d-cc45ea8b2e5c")
    public String getIdentifier() {
        return this.elt.getTagValue(ExternalIdentifier.MdaTypes.IDENTIFIER_TAGTYPE_ELT);
    }

    @objid ("bccd5d72-846f-4ac7-929c-9820f7c9d699")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Setter for string property 'identifier'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("084dcc82-0628-4ada-844b-bcf3943cb66c")
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

    @objid ("96f687f7-9d6d-4979-a7b9-51d5fdf7505f")
    protected ExternalIdentifier(final Class elt) {
        super(elt);
    }

    @objid ("c29cec98-a116-4fff-9165-be962105e0ad")
    public static final class MdaTypes {
        @objid ("45e1abff-a388-4922-be39-0cfff37ac1bd")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("a0b5081a-aeab-44ab-addb-5116a2e26e00")
        public static TagType IDENTIFIER_TAGTYPE_ELT;

        @objid ("32f245d7-4739-41aa-937b-1e134f46d380")
        private static Stereotype MDAASSOCDEP;

        @objid ("bd2ac597-7271-4a85-9dff-031baf3307ba")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("ef60eac4-259e-4bcf-80f9-8bef3756285b")
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
