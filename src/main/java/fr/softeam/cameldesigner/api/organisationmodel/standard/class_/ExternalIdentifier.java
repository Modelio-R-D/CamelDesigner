/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: CamelDesigner v1.0.12

 * This file was generated on 7/21/22 2:51 PM by Modelio Studio.
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
    @objid ("bd3f83e9-b019-4f5a-9de2-f3130b6591c6")
    public static final String STEREOTYPE_NAME = "ExternalIdentifier";

    @objid ("45dc8e1f-5446-453c-8c1d-3833dc42fcbc")
    public static final String IDENTIFIER_TAGTYPE = "identifier";

    /**
     * Tells whether a {@link ExternalIdentifier proxy} can be instantiated from a {@link MObject} checking it is a {@link Class} stereotyped << ExternalIdentifier >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("7cc11ea4-530a-4140-aebd-c0f762699ca3")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Class) && ((Class) elt).isStereotyped(ICamelDesignerPeerModule.MODULE_NAME, ExternalIdentifier.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Class} stereotyped << ExternalIdentifier >> then instantiate a {@link ExternalIdentifier} proxy.
     * 
     * @return a {@link ExternalIdentifier} proxy on the created {@link Class}.
     */
    @objid ("f139b16b-d2e6-4ff6-84a8-d730690f21d6")
    public static ExternalIdentifier create() {
        ModelElement e = (ModelElement)CamelDesignerModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Standard.Class");
        e.addStereotype(ICamelDesignerPeerModule.MODULE_NAME, ExternalIdentifier.STEREOTYPE_NAME);
        return ExternalIdentifier.instantiate((Class)e);
    }

    /**
     * Tries to instantiate a {@link ExternalIdentifier} proxy from a {@link Class} stereotyped << ExternalIdentifier >> checking its metaclass and its stereotype.
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * 
     * @param obj a Class
     * @return a {@link ExternalIdentifier} proxy or <i>null</i>.
     */
    @objid ("3276b502-bd6c-4dbd-a7dd-e760cb3b1c4d")
    public static ExternalIdentifier instantiate(final Class obj) {
        return ExternalIdentifier.canInstantiate(obj) ? new ExternalIdentifier(obj) : null;
    }

    /**
     * Tries to instantiate a {@link ExternalIdentifier} proxy from a {@link Class} stereotyped << ExternalIdentifier >> checking its metaclass and its stereotype.
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * 
     * @param obj a {@link Class}
     * @return a {@link ExternalIdentifier} proxy.
     * @throws java.lang.IllegalArgumentException if the instantiation cannot be carried out.
     */
    @objid ("af9b851f-1f00-475f-8d1a-cb48fa25ed87")
    public static ExternalIdentifier safeInstantiate(final Class obj) throws IllegalArgumentException {
        if (ExternalIdentifier.canInstantiate(obj))
            return new ExternalIdentifier(obj);
        else
            throw new IllegalArgumentException("ExternalIdentifier: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("973d40c3-2aa3-45e8-9204-16abd841412a")
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
     * 
     * @return the Class represented by this proxy, never null.
     */
    @objid ("79c52ac2-fc80-4210-be14-f8617e181be6")
    @Override
    public Class getElement() {
        return (Class)super.getElement();
    }

    /**
     * Getter for string property 'identifier'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("e06c5303-31ab-49ed-b1ab-08ec42ffe9bd")
    public String getIdentifier() {
        return this.elt.getTagValue(ExternalIdentifier.MdaTypes.IDENTIFIER_TAGTYPE_ELT);
    }

    @objid ("0eddbdc3-97ed-4da4-97b8-59f9c1ad0e65")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Setter for string property 'identifier'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("3ae4b645-76b9-433d-ab9f-b768274f262d")
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

    @objid ("daa1a25c-f917-4165-8494-b5ea95dcc8a6")
    protected ExternalIdentifier(final Class elt) {
        super(elt);
    }

    @objid ("c29cec98-a116-4fff-9165-be962105e0ad")
    public static final class MdaTypes {
        @objid ("9f687928-de3e-40f8-abb6-90c19ce51669")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("345fc51a-e653-4905-821e-cb793c61598d")
        public static TagType IDENTIFIER_TAGTYPE_ELT;

        @objid ("974923ae-8df9-4ccc-8807-f7d53b35f895")
        private static Stereotype MDAASSOCDEP;

        @objid ("bdfbc974-d549-4de3-9775-492210a23003")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("1acea150-c674-4dc5-9465-da78d3b39383")
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
